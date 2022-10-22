package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Effect")
@js.native
/* private */ open class Effect ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Effect {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Behaviors: typingsJapgolly.activexPowerpoint.PowerPoint.AnimationBehaviors = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val EffectInformation: typingsJapgolly.activexPowerpoint.PowerPoint.EffectInformation = js.native
  
  /* CompleteClass */
  override val EffectParameters: typingsJapgolly.activexPowerpoint.PowerPoint.EffectParameters = js.native
  
  /* CompleteClass */
  var EffectType: MsoAnimEffect = js.native
  
  /* CompleteClass */
  var Exit: MsoTriState = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MoveAfter(Effect: typingsJapgolly.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  
  /* CompleteClass */
  override def MoveBefore(Effect: typingsJapgolly.activexPowerpoint.PowerPoint.Effect): Unit = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Paragraph: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Effect = js.native
  
  /* CompleteClass */
  var Shape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape = js.native
  
  /* CompleteClass */
  override val TextRangeLength: Double = js.native
  
  /* CompleteClass */
  override val TextRangeStart: Double = js.native
  
  /* CompleteClass */
  override val Timing: typingsJapgolly.activexPowerpoint.PowerPoint.Timing = js.native
}
