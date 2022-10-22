package typingsJapgolly.emailValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateAsync(email: String, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate_async")(email.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AsyncCallback = js.Function2[/* err */ Any, /* isValideEmail */ Boolean, Any]
}
