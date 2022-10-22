package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Alignrests
import typingsJapgolly.vexflow.anon.MaxIterations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Formatter")
@js.native
open class Formatter ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Formatter {
  def this(options: MaxIterations) = this()
}
object Formatter {
  
  @JSImport("vexflow", "Flow.Formatter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def AlignRestsToNotes(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]): typingsJapgolly.vexflow.Vex.Flow.Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Formatter]
  inline def AlignRestsToNotes(notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typingsJapgolly.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Formatter]
  inline def AlignRestsToNotes(
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    align_all_notes: Boolean,
    align_tuplets: Boolean
  ): typingsJapgolly.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any], align_tuplets.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Formatter]
  inline def AlignRestsToNotes(
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    align_all_notes: Unit,
    align_tuplets: Boolean
  ): typingsJapgolly.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any], align_tuplets.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Formatter]
  
  /* static member */
  @JSImport("vexflow", "Flow.Formatter.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.BoundingBox]
  inline def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    params: Boolean
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.BoundingBox]
  inline def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    params: Alignrests
  ): typingsJapgolly.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.BoundingBox]
  
  /* static member */
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Alignrests
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Unit,
    params: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsJapgolly.vexflow.Vex.Flow.TabStave,
    stave: typingsJapgolly.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    autobeam: Unit,
    params: Alignrests
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
