package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingRule Class */
trait FaxOutboundRoutingRule extends StObject {
  
  /** Area code */
  val AreaCode: Double
  
  /** Country code */
  val CountryCode: Double
  
  /** Destination device */
  var DeviceId: Double
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: FaxOutboundRoutingRule
  
  /** Group name */
  var GroupName: String
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
  
  /** Status */
  val Status: FAX_RULE_STATUS_ENUM
  
  /** Uses single device or group */
  var UseDevice: Boolean
}
object FaxOutboundRoutingRule {
  
  inline def apply(
    AreaCode: Double,
    CountryCode: Double,
    DeviceId: Double,
    FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: FaxOutboundRoutingRule,
    GroupName: String,
    Refresh: Callback,
    Save: Callback,
    Status: FAX_RULE_STATUS_ENUM,
    UseDevice: Boolean
  ): FaxOutboundRoutingRule = {
    val __obj = js.Dynamic.literal(AreaCode = AreaCode.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Save = Save.toJsFn, Status = Status.asInstanceOf[js.Any], UseDevice = UseDevice.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")(FAXCOMEXLibDotFaxOutboundRoutingRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRoutingRule]
  }
  
  extension [Self <: FaxOutboundRoutingRule](x: Self) {
    
    inline def setAreaCode(value: Double): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: Double): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxOutboundRoutingRule_typekey(value: FaxOutboundRoutingRule): Self = StObject.set(x, "FAXCOMEXLib.FaxOutboundRoutingRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setStatus(value: FAX_RULE_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUseDevice(value: Boolean): Self = StObject.set(x, "UseDevice", value.asInstanceOf[js.Any])
  }
}
