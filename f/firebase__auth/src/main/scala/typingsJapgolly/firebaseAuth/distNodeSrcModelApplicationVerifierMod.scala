package typingsJapgolly.firebaseAuth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.ApplicationVerifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcModelApplicationVerifierMod {
  
  trait ApplicationVerifierInternal
    extends StObject
       with ApplicationVerifier {
    
    /**
      * @internal
      */
    def _reset(): Unit
  }
  object ApplicationVerifierInternal {
    
    inline def apply(_reset: Callback, `type`: String, verify: CallbackTo[js.Promise[String]]): ApplicationVerifierInternal = {
      val __obj = js.Dynamic.literal(_reset = _reset.toJsFn, verify = verify.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationVerifierInternal]
    }
    
    extension [Self <: ApplicationVerifierInternal](x: Self) {
      
      inline def set_reset(value: Callback): Self = StObject.set(x, "_reset", value.toJsFn)
    }
  }
}
