package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Behaviors: AnimationBehaviors
  
  def Delete(): Unit
  
  val DisplayName: String
  
  val EffectInformation: typingsJapgolly.activexPowerpoint.PowerPoint.EffectInformation
  
  val EffectParameters: typingsJapgolly.activexPowerpoint.PowerPoint.EffectParameters
  
  var EffectType: MsoAnimEffect
  
  var Exit: MsoTriState
  
  val Index: Double
  
  def MoveAfter(Effect: Effect): Unit
  
  def MoveBefore(Effect: Effect): Unit
  
  def MoveTo(toPos: Double): Unit
  
  var Paragraph: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect
  
  var Shape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape
  
  val TextRangeLength: Double
  
  val TextRangeStart: Double
  
  val Timing: typingsJapgolly.activexPowerpoint.PowerPoint.Timing
}
object Effect {
  
  inline def apply(
    Application: Application,
    Behaviors: AnimationBehaviors,
    Delete: Callback,
    DisplayName: String,
    EffectInformation: EffectInformation,
    EffectParameters: EffectParameters,
    EffectType: MsoAnimEffect,
    Exit: MsoTriState,
    Index: Double,
    MoveAfter: Effect => Callback,
    MoveBefore: Effect => Callback,
    MoveTo: Double => Callback,
    Paragraph: Double,
    Parent: Any,
    PowerPointDotEffect_typekey: Effect,
    Shape: Shape,
    TextRangeLength: Double,
    TextRangeStart: Double,
    Timing: Timing
  ): Effect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Behaviors = Behaviors.asInstanceOf[js.Any], Delete = Delete.toJsFn, DisplayName = DisplayName.asInstanceOf[js.Any], EffectInformation = EffectInformation.asInstanceOf[js.Any], EffectParameters = EffectParameters.asInstanceOf[js.Any], EffectType = EffectType.asInstanceOf[js.Any], Exit = Exit.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveAfter = js.Any.fromFunction1((t0: Effect) => MoveAfter(t0).runNow()), MoveBefore = js.Any.fromFunction1((t0: Effect) => MoveBefore(t0).runNow()), MoveTo = js.Any.fromFunction1((t0: Double) => MoveTo(t0).runNow()), Paragraph = Paragraph.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], TextRangeLength = TextRangeLength.asInstanceOf[js.Any], TextRangeStart = TextRangeStart.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Effect_typekey")(PowerPointDotEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  extension [Self <: Effect](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBehaviors(value: AnimationBehaviors): Self = StObject.set(x, "Behaviors", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setEffectInformation(value: EffectInformation): Self = StObject.set(x, "EffectInformation", value.asInstanceOf[js.Any])
    
    inline def setEffectParameters(value: EffectParameters): Self = StObject.set(x, "EffectParameters", value.asInstanceOf[js.Any])
    
    inline def setEffectType(value: MsoAnimEffect): Self = StObject.set(x, "EffectType", value.asInstanceOf[js.Any])
    
    inline def setExit(value: MsoTriState): Self = StObject.set(x, "Exit", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMoveAfter(value: Effect => Callback): Self = StObject.set(x, "MoveAfter", js.Any.fromFunction1((t0: Effect) => value(t0).runNow()))
    
    inline def setMoveBefore(value: Effect => Callback): Self = StObject.set(x, "MoveBefore", js.Any.fromFunction1((t0: Effect) => value(t0).runNow()))
    
    inline def setMoveTo(value: Double => Callback): Self = StObject.set(x, "MoveTo", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setParagraph(value: Double): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotEffect_typekey(value: Effect): Self = StObject.set(x, "PowerPoint.Effect_typekey", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setTextRangeLength(value: Double): Self = StObject.set(x, "TextRangeLength", value.asInstanceOf[js.Any])
    
    inline def setTextRangeStart(value: Double): Self = StObject.set(x, "TextRangeStart", value.asInstanceOf[js.Any])
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
  }
}
