package ac.cr.ucenfotec.workflowengine.businesslogic;

import ac.cr.ucenfotec.workflowengine.dao.FunctionalAreaDAO;
import ac.cr.ucenfotec.workflowengine.models.workflow.FunctionalArea;
import ac.cr.ucenfotec.workflowengine.validation.FunctionalAreaValidator;
import ac.cr.ucenfotec.workflowengine.validation.error.WFErrors;

public class FunctionalAreaService extends Service<FunctionalArea,FunctionalAreaDAO>{
	
	public FunctionalAreaService() {
		super(FunctionalAreaDAO::new);
	}

	@Override
	public void create(WFErrors error,FunctionalArea entity) {
		
		FunctionalAreaValidator.validate(error, entity);
		if(error.hasErrors()) {
			return;
		}
		dao.persist(entity);
	}

	@Override
	public void update(WFErrors error, FunctionalArea entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FunctionalArea get(FunctionalArea fa) {
		dao.openSession();
		fa = dao.findById(fa.getId());
		dao.closeSession();
		return fa;
	}

	@Override
	public void delete(WFErrors error, FunctionalArea entity) {
		throw new UnsupportedOperationException();
	}	
}
