package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationBehavior extends StObject {
  
  var Accumulate: MsoAnimAccumulate
  
  var Additive: MsoAnimAdditive
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val ColorEffect: typingsJapgolly.activexPowerpoint.PowerPoint.ColorEffect
  
  val CommandEffect: typingsJapgolly.activexPowerpoint.PowerPoint.CommandEffect
  
  def Delete(): Unit
  
  val FilterEffect: typingsJapgolly.activexPowerpoint.PowerPoint.FilterEffect
  
  val MotionEffect: typingsJapgolly.activexPowerpoint.PowerPoint.MotionEffect
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.AnimationBehavior_typekey")
  var PowerPointDotAnimationBehavior_typekey: AnimationBehavior
  
  val PropertyEffect: typingsJapgolly.activexPowerpoint.PowerPoint.PropertyEffect
  
  val RotationEffect: typingsJapgolly.activexPowerpoint.PowerPoint.RotationEffect
  
  val ScaleEffect: typingsJapgolly.activexPowerpoint.PowerPoint.ScaleEffect
  
  val SetEffect: typingsJapgolly.activexPowerpoint.PowerPoint.SetEffect
  
  val Timing: typingsJapgolly.activexPowerpoint.PowerPoint.Timing
  
  var Type: MsoAnimType
}
object AnimationBehavior {
  
  inline def apply(
    Accumulate: MsoAnimAccumulate,
    Additive: MsoAnimAdditive,
    Application: Application,
    ColorEffect: ColorEffect,
    CommandEffect: CommandEffect,
    Delete: Callback,
    FilterEffect: FilterEffect,
    MotionEffect: MotionEffect,
    Parent: Any,
    PowerPointDotAnimationBehavior_typekey: AnimationBehavior,
    PropertyEffect: PropertyEffect,
    RotationEffect: RotationEffect,
    ScaleEffect: ScaleEffect,
    SetEffect: SetEffect,
    Timing: Timing,
    Type: MsoAnimType
  ): AnimationBehavior = {
    val __obj = js.Dynamic.literal(Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ColorEffect = ColorEffect.asInstanceOf[js.Any], CommandEffect = CommandEffect.asInstanceOf[js.Any], Delete = Delete.toJsFn, FilterEffect = FilterEffect.asInstanceOf[js.Any], MotionEffect = MotionEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyEffect = PropertyEffect.asInstanceOf[js.Any], RotationEffect = RotationEffect.asInstanceOf[js.Any], ScaleEffect = ScaleEffect.asInstanceOf[js.Any], SetEffect = SetEffect.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationBehavior_typekey")(PowerPointDotAnimationBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBehavior]
  }
  
  extension [Self <: AnimationBehavior](x: Self) {
    
    inline def setAccumulate(value: MsoAnimAccumulate): Self = StObject.set(x, "Accumulate", value.asInstanceOf[js.Any])
    
    inline def setAdditive(value: MsoAnimAdditive): Self = StObject.set(x, "Additive", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColorEffect(value: ColorEffect): Self = StObject.set(x, "ColorEffect", value.asInstanceOf[js.Any])
    
    inline def setCommandEffect(value: CommandEffect): Self = StObject.set(x, "CommandEffect", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFilterEffect(value: FilterEffect): Self = StObject.set(x, "FilterEffect", value.asInstanceOf[js.Any])
    
    inline def setMotionEffect(value: MotionEffect): Self = StObject.set(x, "MotionEffect", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotAnimationBehavior_typekey(value: AnimationBehavior): Self = StObject.set(x, "PowerPoint.AnimationBehavior_typekey", value.asInstanceOf[js.Any])
    
    inline def setPropertyEffect(value: PropertyEffect): Self = StObject.set(x, "PropertyEffect", value.asInstanceOf[js.Any])
    
    inline def setRotationEffect(value: RotationEffect): Self = StObject.set(x, "RotationEffect", value.asInstanceOf[js.Any])
    
    inline def setScaleEffect(value: ScaleEffect): Self = StObject.set(x, "ScaleEffect", value.asInstanceOf[js.Any])
    
    inline def setSetEffect(value: SetEffect): Self = StObject.set(x, "SetEffect", value.asInstanceOf[js.Any])
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoAnimType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
