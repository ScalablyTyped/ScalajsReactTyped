package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageclient", "WorkDoneProgress")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: typingsJapgolly.vscodeJsonrpc.mod.ProgressType[Any]): /* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean]
  
  @JSImport("vscode-languageclient", "WorkDoneProgress.type")
  @js.native
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}
