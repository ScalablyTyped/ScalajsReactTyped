package typingsJapgolly.nexpect.mod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChain extends js.Object {
  def expect(expectation: String): IChain = js.native
  def expect(expectation: RegExp): IChain = js.native
  def run(
    callback: js.Function3[/* err */ js.Error, /* output */ js.Array[String], /* exit */ String | Double, Unit]
  ): ChildProcess = js.native
  def sendEof(): IChain = js.native
  def sendline(line: String): IChain = js.native
  def wait(expectation: String): IChain = js.native
  def wait(expectation: RegExp): IChain = js.native
}

