package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInfo
  extends StObject
     with ClientValueObject {
  
  def get_errorFile(): String
  
  def get_errors(): Double
  
  def get_lastUpdated(): js.Date
  
  def get_logFile(): String
  
  def get_requestDate(): js.Date
  
  def get_retryCount(): Double
  
  def get_startTime(): js.Date
  
  def get_status(): UpgradeStatus
  
  def get_upgradeType(): UpgradeType
  
  def get_warnings(): Double
}
object UpgradeInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_errorFile: CallbackTo[String],
    get_errors: CallbackTo[Double],
    get_lastUpdated: CallbackTo[js.Date],
    get_logFile: CallbackTo[String],
    get_requestDate: CallbackTo[js.Date],
    get_retryCount: CallbackTo[Double],
    get_startTime: CallbackTo[js.Date],
    get_status: CallbackTo[UpgradeStatus],
    get_typeId: CallbackTo[String],
    get_upgradeType: CallbackTo[UpgradeType],
    get_warnings: CallbackTo[Double],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): UpgradeInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_errorFile = get_errorFile.toJsFn, get_errors = get_errors.toJsFn, get_lastUpdated = get_lastUpdated.toJsFn, get_logFile = get_logFile.toJsFn, get_requestDate = get_requestDate.toJsFn, get_retryCount = get_retryCount.toJsFn, get_startTime = get_startTime.toJsFn, get_status = get_status.toJsFn, get_typeId = get_typeId.toJsFn, get_upgradeType = get_upgradeType.toJsFn, get_warnings = get_warnings.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[UpgradeInfo]
  }
  
  extension [Self <: UpgradeInfo](x: Self) {
    
    inline def setGet_errorFile(value: CallbackTo[String]): Self = StObject.set(x, "get_errorFile", value.toJsFn)
    
    inline def setGet_errors(value: CallbackTo[Double]): Self = StObject.set(x, "get_errors", value.toJsFn)
    
    inline def setGet_lastUpdated(value: CallbackTo[js.Date]): Self = StObject.set(x, "get_lastUpdated", value.toJsFn)
    
    inline def setGet_logFile(value: CallbackTo[String]): Self = StObject.set(x, "get_logFile", value.toJsFn)
    
    inline def setGet_requestDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "get_requestDate", value.toJsFn)
    
    inline def setGet_retryCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_retryCount", value.toJsFn)
    
    inline def setGet_startTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "get_startTime", value.toJsFn)
    
    inline def setGet_status(value: CallbackTo[UpgradeStatus]): Self = StObject.set(x, "get_status", value.toJsFn)
    
    inline def setGet_upgradeType(value: CallbackTo[UpgradeType]): Self = StObject.set(x, "get_upgradeType", value.toJsFn)
    
    inline def setGet_warnings(value: CallbackTo[Double]): Self = StObject.set(x, "get_warnings", value.toJsFn)
  }
}
