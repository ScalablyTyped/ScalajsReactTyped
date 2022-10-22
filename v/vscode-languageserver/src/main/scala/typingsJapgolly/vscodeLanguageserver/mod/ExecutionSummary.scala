package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExecutionSummary {
  
  @JSImport("vscode-languageserver", "ExecutionSummary")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(executionOrder: Double): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(executionOrder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary]
  inline def create(executionOrder: Double, success: Boolean): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(executionOrder.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary]
  
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(
    one: Unit,
    other: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(one: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(
    one: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary,
    other: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.ExecutionSummary
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.ExecutionSummary */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.ExecutionSummary */ Boolean]
}
