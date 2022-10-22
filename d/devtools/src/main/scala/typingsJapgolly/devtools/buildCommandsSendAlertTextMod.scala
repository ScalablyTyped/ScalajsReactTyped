package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.TextString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsSendAlertTextMod {
  
  @JSImport("devtools/build/commands/sendAlertText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasText: TextString): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
}
