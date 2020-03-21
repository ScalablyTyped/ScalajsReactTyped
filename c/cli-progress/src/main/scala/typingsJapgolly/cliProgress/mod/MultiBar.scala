package typingsJapgolly.cliProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-progress", "MultiBar")
@js.native
class MultiBar protected () extends js.Object {
  def this(opt: Options) = this()
  def this(opt: Options, preset: Preset) = this()
  def create(total: Double, startValue: Double, payload: js.Any): SingleBar = js.native
  def remove(bar: SingleBar): Boolean = js.native
  def stop(): Unit = js.native
}

