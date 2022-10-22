package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChangeAnnotation {
  
  @JSImport("vscode-languageserver", "ChangeAnnotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean): typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean, description: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Unit, description: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean]
}
