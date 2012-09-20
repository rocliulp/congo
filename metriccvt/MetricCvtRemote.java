import java.rmi.RemoteException;
import javax.ejb.*;

public interface MetricCvtRemote extends EJBObject, MetricCvtConstants {
  public String Convert (String sType, double dToConvert)
    throws RemoteException;
}
