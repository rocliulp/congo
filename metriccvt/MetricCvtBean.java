import javax.ejb.*;

public class MetricCvtBean implements SessionBean, MetricCvtConstants {
  public MetricCvtBean () {}

  public void ejbCreate () {}

  public void ejbRemove () {}
  public void ejbActivate () {}
  public void ejbPassivate () {}
  public void setSessionContext (SessionContext sc) {}

  public String Convert (String sType, double dToConvert) {
    return null;
  }
}
