package typingsJapgolly.vexflow.mod.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.Leftshift
import typingsJapgolly.vexflow.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Bend")
@js.native
open class Bend protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
  def this(text: String, release: Unit, phrase: js.Array[Text]) = this()
  
  /* CompleteClass */
  override def alignSubNotesWithNote(
    subNotes: js.Array[typingsJapgolly.vexflow.Vex.Flow.Note],
    note: typingsJapgolly.vexflow.Vex.Flow.Note
  ): Unit = js.native
  
  //inconsistent type: void -> Modifier
  /* CompleteClass */
  override def draw(): Unit = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def getIndex(): Double = js.native
  
  /* CompleteClass */
  override def getModifierContext(): typingsJapgolly.vexflow.Vex.Flow.ModifierContext = js.native
  
  /* CompleteClass */
  override def getNote(): typingsJapgolly.vexflow.Vex.Flow.Note = js.native
  
  /* CompleteClass */
  override def getPosition(): Position = js.native
  
  // (Modifier extends Element in vexflow, but not in these definitions, probably because of some typing problem)
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setFont(font: String): typingsJapgolly.vexflow.Vex.Flow.Bend = js.native
  
  /* CompleteClass */
  override def setIndex(index: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setModifierContext(c: typingsJapgolly.vexflow.Vex.Flow.ModifierContext): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setNote(note: typingsJapgolly.vexflow.Vex.Flow.Note): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setPosition(position: Position): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setTextLine(line: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setWidth(width: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  
  /* CompleteClass */
  override def setYShift(y: Double): typingsJapgolly.vexflow.Vex.Flow.Modifier = js.native
  
  /* CompleteClass */
  override def updateWidth(): typingsJapgolly.vexflow.Vex.Flow.Bend = js.native
}
object Bend {
  
  @JSImport("vexflow", "Flow.Bend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Bend.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Bend.DOWN")
  @js.native
  def DOWN: Double = js.native
  inline def DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.Bend.UP")
  @js.native
  def UP: Double = js.native
  inline def UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(bends: js.Array[typingsJapgolly.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(bends.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
