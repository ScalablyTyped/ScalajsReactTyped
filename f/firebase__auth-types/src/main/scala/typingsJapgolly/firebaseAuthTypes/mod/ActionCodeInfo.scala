package typingsJapgolly.firebaseAuthTypes.mod

import typingsJapgolly.firebaseAuthTypes.anon.EMAILSIGNIN
import typingsJapgolly.firebaseAuthTypes.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "ActionCodeInfo")
@js.native
/* private */ open class ActionCodeInfo () extends StObject {
  
  var data: Email = js.native
  
  var operation: String = js.native
}
/* static members */
object ActionCodeInfo {
  
  @JSImport("@firebase/auth-types", "ActionCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "ActionCodeInfo.Operation")
  @js.native
  def Operation: EMAILSIGNIN = js.native
  inline def Operation_=(x: EMAILSIGNIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
}
