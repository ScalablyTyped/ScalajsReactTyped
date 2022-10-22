package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type`
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Firstnote
import typingsJapgolly.vexflow.anon.Firstx
import typingsJapgolly.vexflow.anon.Height
import typingsJapgolly.vexflow.anon.Leftshiftpx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
open class StaveHairpin protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
  
  /* CompleteClass */
  override def draw(): Boolean = js.native
  
  /* CompleteClass */
  override def renderHairpin(params: Firstx): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setNotes(notes: Firstnote): typingsJapgolly.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setPosition(position: Position): typingsJapgolly.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setRenderOptions(options: Leftshiftpx): typingsJapgolly.vexflow.Vex.Flow.StaveHairpin = js.native
}
object StaveHairpin {
  
  @JSImport("vexflow", "Flow.StaveHairpin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsJapgolly.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatByTicksAndDraw")(ctx.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typingsJapgolly.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatByTicksAndDraw")(ctx.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], position.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("vexflow", "Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type` & Double] = js.native
    
    /* 1 */ val CRESC: typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC & Double = js.native
    
    /* 0 */ val DECRESC: typingsJapgolly.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC & Double = js.native
  }
}
