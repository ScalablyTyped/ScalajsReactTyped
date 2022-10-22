package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookCellArrayChange {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookCellArrayChange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(start: uinteger, deleteCount: uinteger): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellArrayChange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellArrayChange]
  inline def create(
    start: uinteger,
    deleteCount: uinteger,
    cells: js.Array[
      typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
    ]
  ): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellArrayChange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], cells.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCellArrayChange]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellArrayChange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellArrayChange */ Boolean]
}
