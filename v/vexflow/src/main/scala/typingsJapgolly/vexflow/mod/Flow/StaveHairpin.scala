package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonFirstnote
import typingsJapgolly.vexflow.AnonLeftshiftticks
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typingsJapgolly.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: AnonFirstnote, `type`: `type`) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsJapgolly.vexflow.Vex.Flow.Formatter,
    notes: AnonFirstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsJapgolly.vexflow.Vex.Flow.Formatter,
    notes: AnonFirstnote,
    `type`: `type`,
    position: Position,
    options: AnonLeftshiftticks
  ): Unit = js.native
}

