package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisBloom.distCommandsTopKListWITHCOUNTMod.ListWithCountRawReply
import typingsJapgolly.redisBloom.distCommandsTopKListWITHCOUNTMod.ListWithCountReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedLISTWITHC extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: String): js.Array[String]
  
  def transformReply(rawReply: ListWithCountRawReply): ListWithCountReply
}
object TypeofimportedLISTWITHC {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: String => js.Array[String],
    transformReply: ListWithCountRawReply => ListWithCountReply
  ): TypeofimportedLISTWITHC = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedLISTWITHC]
  }
  
  extension [Self <: TypeofimportedLISTWITHC](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: ListWithCountRawReply => ListWithCountReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
