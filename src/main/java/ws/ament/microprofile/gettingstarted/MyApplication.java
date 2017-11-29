package ws.ament.microprofile.gettingstarted;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

import ws.ament.microprofile.gettingstarted.rest.BookPublishController;

@ApplicationPath("/schedule")
public class MyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> resources = new HashSet<>();

		resources.add(BookPublishController.class);
		// resources.add(CORSFilter.class);
		return resources;
	}
}
