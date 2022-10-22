package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentation {
  
  @JSImport("vscode-languageserver", "ColorPresentation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ColorInformation literal.
    */
  inline def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation]
  inline def create(
    label: String,
    textEdit: Unit,
    additionalTextEdits: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any], additionalTextEdits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation]
  inline def create(label: String, textEdit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation]
  inline def create(
    label: String,
    textEdit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any], additionalTextEdits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation]
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean]
}
