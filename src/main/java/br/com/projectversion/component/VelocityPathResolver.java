package br.com.projectversion.component;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.view.DefaultPathResolver;

@Component
public class VelocityPathResolver extends DefaultPathResolver {

	public VelocityPathResolver(FormatResolver resolver) {
		super(resolver);
	}

	@Override
	protected String getPrefix() {
		return "/WEB-INF/velocity/";
	}

	@Override
	protected String getExtension() {
		return "vm";
	}

}