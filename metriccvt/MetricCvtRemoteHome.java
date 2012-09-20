import javax.ejb.*;
import java.rmi.RemoteException;

public interface MetricCvtRemoteHome extends EJBHome {
  MetricCvtRemote create () throws RemoteException, CreateException;
}
