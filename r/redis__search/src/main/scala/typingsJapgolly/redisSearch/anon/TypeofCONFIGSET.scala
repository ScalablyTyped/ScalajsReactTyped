package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCONFIGSET extends StObject {
  
  def transformArguments(option: String, value: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCONFIGSET {
  
  inline def apply(transformArguments: (String, String) => js.Array[String], transformReply: CallbackTo[OK]): TypeofCONFIGSET = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCONFIGSET]
  }
  
  extension [Self <: TypeofCONFIGSET](x: Self) {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
