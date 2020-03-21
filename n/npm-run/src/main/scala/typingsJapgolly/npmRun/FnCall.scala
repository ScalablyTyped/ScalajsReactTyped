package typingsJapgolly.npmRun

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.childProcessMod.ExecSyncOptions
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
}

