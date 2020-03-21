package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    InitializeParams, 
    InitializeResult, 
    typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}

