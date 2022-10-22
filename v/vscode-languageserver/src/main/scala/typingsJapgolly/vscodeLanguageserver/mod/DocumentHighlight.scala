package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlight {
  
  @JSImport("vscode-languageserver", "DocumentHighlight")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    * @param kind The highlight kind
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight]
}
