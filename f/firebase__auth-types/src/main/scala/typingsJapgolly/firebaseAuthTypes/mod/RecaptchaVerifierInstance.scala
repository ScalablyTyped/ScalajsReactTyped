package typingsJapgolly.firebaseAuthTypes.mod

import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "RecaptchaVerifier_Instance")
@js.native
open class RecaptchaVerifierInstance protected ()
  extends StObject
     with ApplicationVerifier {
  def this(container: String) = this()
  def this(container: Any) = this()
  def this(container: String, parameters: js.Object) = this()
  def this(container: Any, parameters: js.Object) = this()
  def this(container: String, parameters: js.Object, app: FirebaseApp) = this()
  def this(container: String, parameters: Null, app: FirebaseApp) = this()
  def this(container: String, parameters: Unit, app: FirebaseApp) = this()
  def this(container: Any, parameters: js.Object, app: FirebaseApp) = this()
  def this(container: Any, parameters: Null, app: FirebaseApp) = this()
  def this(container: Any, parameters: Unit, app: FirebaseApp) = this()
  
  def clear(): Unit = js.native
  
  def render(): js.Promise[Double] = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
  
  /* CompleteClass */
  override def verify(): js.Promise[String] = js.native
}
