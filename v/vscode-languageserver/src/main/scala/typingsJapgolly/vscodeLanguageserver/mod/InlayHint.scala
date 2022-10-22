package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHint {
  
  @JSImport("vscode-languageserver", "InlayHint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position, label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position,
    label: String,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHintKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position,
    label: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHintLabelPart]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position,
    label: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHintLabelPart],
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHintKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean]
}
