package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionContext {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeActionContext literal.
    */
  inline def create(diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind],
    triggerKind: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionTriggerKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext]
  inline def create(
    diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic],
    only: Unit,
    triggerKind: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionTriggerKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(diagnostics.asInstanceOf[js.Any], only.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext]
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean]
}
