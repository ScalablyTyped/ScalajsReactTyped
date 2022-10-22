package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeJsonrpc.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgress")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: ProgressType[Any]): /* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean]
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgress.type")
  @js.native
  val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}
