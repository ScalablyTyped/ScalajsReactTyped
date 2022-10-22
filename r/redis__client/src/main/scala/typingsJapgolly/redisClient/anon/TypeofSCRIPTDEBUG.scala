package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.redisClientStrings.NO
import typingsJapgolly.redisClient.redisClientStrings.SYNC
import typingsJapgolly.redisClient.redisClientStrings.YES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSCRIPTDEBUG extends StObject {
  
  def transformArguments(mode: YES | SYNC | NO): js.Array[String]
  
  def transformReply(): String
}
object TypeofSCRIPTDEBUG {
  
  inline def apply(transformArguments: YES | SYNC | NO => js.Array[String], transformReply: CallbackTo[String]): TypeofSCRIPTDEBUG = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofSCRIPTDEBUG]
  }
  
  extension [Self <: TypeofSCRIPTDEBUG](x: Self) {
    
    inline def setTransformArguments(value: YES | SYNC | NO => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
