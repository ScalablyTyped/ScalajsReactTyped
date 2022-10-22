package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRange {
  
  @JSImport("vscode-languageserver-protocol", "SelectionRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    parent: typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean]
}
