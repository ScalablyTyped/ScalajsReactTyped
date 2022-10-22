package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsInfoMod.InfoRawReply
import typingsJapgolly.redisSearch.distCommandsInfoMod.InfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofINFO extends StObject {
  
  def transformArguments(index: String): js.Array[String]
  
  def transformReply(rawReply: InfoRawReply): InfoReply
}
object TypeofINFO {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: InfoRawReply => InfoReply): TypeofINFO = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofINFO]
  }
  
  extension [Self <: TypeofINFO](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: InfoRawReply => InfoReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
