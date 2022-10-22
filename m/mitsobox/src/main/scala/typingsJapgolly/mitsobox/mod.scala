package typingsJapgolly.mitsobox

import typingsJapgolly.mitsobox.mitsoboxStrings.ABORT
import typingsJapgolly.mitsobox.mitsoboxStrings.CANCEL
import typingsJapgolly.mitsobox.mitsoboxStrings.IGNORE
import typingsJapgolly.mitsobox.mitsoboxStrings.OK
import typingsJapgolly.mitsobox.mitsoboxStrings.RETRY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mitsobox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abortRetryIgnore(title: String, message: String): js.Promise[ABORT | RETRY | IGNORE] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortRetryIgnore")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ABORT | RETRY | IGNORE]]
  
  inline def ok(title: String, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def okCancel(title: String, message: String): js.Promise[OK | CANCEL] = (^.asInstanceOf[js.Dynamic].applyDynamic("okCancel")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OK | CANCEL]]
}
