package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.AnonAlignrests
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Formatter")
@js.native
class Formatter ()
  extends typingsJapgolly.vexflow.Vex.Flow.Formatter

/* static members */
@JSImport("vexflow", "Flow.Formatter")
@js.native
object Formatter extends js.Object {
  var DEBUG: Boolean = js.native
  def AlignRestsToNotes(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]): typingsJapgolly.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typingsJapgolly.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    align_all_notes: Boolean,
    align_tuplets: Boolean
  ): typingsJapgolly.vexflow.Vex.Flow.Formatter = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    params: Boolean
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    params: AnonAlignrests
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: AnonAlignrests
  ): Unit = js.native
}

