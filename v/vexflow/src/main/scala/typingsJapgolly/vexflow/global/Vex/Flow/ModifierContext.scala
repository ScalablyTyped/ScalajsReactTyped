package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.anon.Extraleftpx
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.ModifierContext")
@js.native
open class ModifierContext ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.ModifierContext {
  
  /* CompleteClass */
  override def addModifier(modifier: typingsJapgolly.vexflow.Vex.Flow.Modifier): typingsJapgolly.vexflow.Vex.Flow.ModifierContext = js.native
  
  /* CompleteClass */
  override def getExtraLeftPx(): Double = js.native
  
  /* CompleteClass */
  override def getExtraRightPx(): Double = js.native
  
  /* CompleteClass */
  override def getMetrics(): Extraleftpx = js.native
  
  /* CompleteClass */
  override def getModifiers(`type`: String): js.Array[typingsJapgolly.vexflow.Vex.Flow.Modifier] = js.native
  
  /* CompleteClass */
  override def getState(): Leftshift = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def postFormat(): Unit = js.native
  
  /* CompleteClass */
  override def preFormat(): Unit = js.native
}
object ModifierContext {
  
  @JSGlobal("Vex.Flow.ModifierContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.ModifierContext.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
