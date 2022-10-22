package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageInfo
  extends StObject
     with ClientValueObject {
  
  def get_bandwidth(): Double
  
  def get_discussionStorage(): Double
  
  def get_hits(): Double
  
  def get_storage(): Double
  
  def get_storagePercentageUsed(): Double
  
  def get_visits(): Double
}
object UsageInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_bandwidth: CallbackTo[Double],
    get_discussionStorage: CallbackTo[Double],
    get_hits: CallbackTo[Double],
    get_storage: CallbackTo[Double],
    get_storagePercentageUsed: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    get_visits: CallbackTo[Double],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): UsageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_bandwidth = get_bandwidth.toJsFn, get_discussionStorage = get_discussionStorage.toJsFn, get_hits = get_hits.toJsFn, get_storage = get_storage.toJsFn, get_storagePercentageUsed = get_storagePercentageUsed.toJsFn, get_typeId = get_typeId.toJsFn, get_visits = get_visits.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[UsageInfo]
  }
  
  extension [Self <: UsageInfo](x: Self) {
    
    inline def setGet_bandwidth(value: CallbackTo[Double]): Self = StObject.set(x, "get_bandwidth", value.toJsFn)
    
    inline def setGet_discussionStorage(value: CallbackTo[Double]): Self = StObject.set(x, "get_discussionStorage", value.toJsFn)
    
    inline def setGet_hits(value: CallbackTo[Double]): Self = StObject.set(x, "get_hits", value.toJsFn)
    
    inline def setGet_storage(value: CallbackTo[Double]): Self = StObject.set(x, "get_storage", value.toJsFn)
    
    inline def setGet_storagePercentageUsed(value: CallbackTo[Double]): Self = StObject.set(x, "get_storagePercentageUsed", value.toJsFn)
    
    inline def setGet_visits(value: CallbackTo[Double]): Self = StObject.set(x, "get_visits", value.toJsFn)
  }
}
