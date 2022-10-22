package typingsJapgolly.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerOption extends StObject {
  
  var sdpTransform: js.UndefOr[js.Function] = js.undefined
}
object AnswerOption {
  
  inline def apply(): AnswerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOption]
  }
  
  extension [Self <: AnswerOption](x: Self) {
    
    inline def setSdpTransform(value: js.Function): Self = StObject.set(x, "sdpTransform", value.asInstanceOf[js.Any])
    
    inline def setSdpTransformUndefined: Self = StObject.set(x, "sdpTransform", js.undefined)
  }
}
