package typingsJapgolly.wechatMiniprogram

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudService extends StObject {
  
  def getAPIs(): StringDictionary[IAPIFunction[Any, Any]]
  
  var name: String
}
object ICloudService {
  
  inline def apply(getAPIs: CallbackTo[StringDictionary[IAPIFunction[Any, Any]]], name: String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = getAPIs.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  
  extension [Self <: ICloudService](x: Self) {
    
    inline def setGetAPIs(value: CallbackTo[StringDictionary[IAPIFunction[Any, Any]]]): Self = StObject.set(x, "getAPIs", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
