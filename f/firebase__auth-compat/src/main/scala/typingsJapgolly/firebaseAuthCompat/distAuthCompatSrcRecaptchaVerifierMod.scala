package typingsJapgolly.firebaseAuthCompat

import org.scalajs.dom.HTMLElement
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ApplicationVerifier
import typingsJapgolly.firebaseAuthCompat.appCompatMod.FirebaseApp
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcRecaptchaVerifierMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/recaptcha_verifier", "RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier protected ()
    extends typingsJapgolly.firebaseAuthTypes.mod.RecaptchaVerifier
       with Compat[ApplicationVerifier] {
    def this(container: String) = this()
    def this(container: HTMLElement) = this()
    def this(container: String, parameters: js.Object) = this()
    def this(container: HTMLElement, parameters: js.Object) = this()
    def this(container: String, parameters: js.Object, app: FirebaseApp) = this()
    def this(container: String, parameters: Null, app: FirebaseApp) = this()
    def this(container: String, parameters: Unit, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: js.Object, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: Null, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: Unit, app: FirebaseApp) = this()
    
    /* CompleteClass */
    var _delegate: ApplicationVerifier = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def verify(): js.Promise[String] = js.native
  }
}
