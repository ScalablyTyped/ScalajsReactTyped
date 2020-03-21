package typingsJapgolly.childProcessPromise.mod

import typingsJapgolly.childProcessPromise.ReadonlyOptionsExecOption
import typingsJapgolly.childProcessPromise.ReadonlyOptionsencodingBu_
import typingsJapgolly.childProcessPromise.ReadonlyOptionsencodingbu
import typingsJapgolly.childProcessPromise.ReadonlyOptionsencodingst
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsExecOption): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingBu_): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingbu): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingst): ChildProcessPromise[PromiseResult[String | Buffer]] = js.native
}

