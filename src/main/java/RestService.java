import java.time.YearMonth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;

@Path("rest")
@Produces(MediaType.APPLICATION_JSON)
@RegisterProvider(CustomParamConverterProvider.class)
public interface RestService {

	@GET
	@Path("users")
	public Response getUsers(@QueryParam("reference") YearMonth reference);
}