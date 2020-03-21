package typingsJapgolly.execa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecaChildProcess[StdoutErrorType] = typingsJapgolly.node.childProcessMod.ChildProcess with typingsJapgolly.execa.mod.ExecaChildPromise[StdoutErrorType] with js.Promise[typingsJapgolly.execa.mod.ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = typingsJapgolly.execa.mod.ExecaReturnBase[StdoutErrorType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.execa.execaStrings.pipe
    - typingsJapgolly.execa.execaStrings.ipc
    - typingsJapgolly.execa.execaStrings.ignore
    - typingsJapgolly.execa.execaStrings.inherit
    - typingsJapgolly.node.streamMod.Stream
    - scala.Double
    - `js.undefined`
  */
  type StdioOption = js.UndefOr[
    typingsJapgolly.execa.mod._StdioOption | typingsJapgolly.node.streamMod.Stream | scala.Double
  ]
}
