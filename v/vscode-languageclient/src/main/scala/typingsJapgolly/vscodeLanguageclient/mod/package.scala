package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vscodeLanguageclient.mod.Executable
    - typingsJapgolly.vscodeLanguageclient.AnonDebug
    - typingsJapgolly.vscodeLanguageclient.AnonRun
    - typingsJapgolly.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  typingsJapgolly.vscodeJsonrpc.Thenable[
    typingsJapgolly.node.childProcessMod.ChildProcess | typingsJapgolly.vscodeLanguageclient.mod.StreamInfo | typingsJapgolly.vscodeLanguageclient.clientMod.MessageTransports | typingsJapgolly.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typingsJapgolly.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    typingsJapgolly.vscodeJsonrpc.Thenable[
      typingsJapgolly.node.childProcessMod.ChildProcess | typingsJapgolly.vscodeLanguageclient.mod.StreamInfo | typingsJapgolly.vscodeLanguageclient.clientMod.MessageTransports | typingsJapgolly.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
}
