package typingsJapgolly.firebase.compatMod.firebase.auth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  * @hidden
  */
trait RecaptchaVerifierInstance
  extends StObject
     with ApplicationVerifier {
  
  /**
    * Clears the reCAPTCHA widget from the page and destroys the current instance.
    */
  def clear(): Unit
  
  /**
    * Renders the reCAPTCHA widget on the page.
    * @return A Promise that resolves with the
    *     reCAPTCHA widget ID.
    */
  def render(): js.Promise[Double]
}
object RecaptchaVerifierInstance {
  
  inline def apply(
    clear: Callback,
    render: CallbackTo[js.Promise[Double]],
    `type`: String,
    verify: CallbackTo[js.Promise[String]]
  ): RecaptchaVerifierInstance = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, render = render.toJsFn, verify = verify.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaVerifierInstance]
  }
  
  extension [Self <: RecaptchaVerifierInstance](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setRender(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "render", value.toJsFn)
  }
}
