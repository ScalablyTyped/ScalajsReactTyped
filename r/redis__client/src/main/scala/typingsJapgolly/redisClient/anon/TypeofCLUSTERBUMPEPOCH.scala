package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.redisClientStrings.BUMPED
import typingsJapgolly.redisClient.redisClientStrings.STILL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERBUMPEPOCH extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): BUMPED | STILL
}
object TypeofCLUSTERBUMPEPOCH {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: CallbackTo[BUMPED | STILL]): TypeofCLUSTERBUMPEPOCH = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLUSTERBUMPEPOCH]
  }
  
  extension [Self <: TypeofCLUSTERBUMPEPOCH](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[BUMPED | STILL]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
