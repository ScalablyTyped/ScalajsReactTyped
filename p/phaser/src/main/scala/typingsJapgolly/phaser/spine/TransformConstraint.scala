package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformConstraint
  extends StObject
     with Updatable {
  
  var active: Boolean
  
  @JSName("apply")
  def apply(): Unit
  
  def applyAbsoluteLocal(): Unit
  
  def applyAbsoluteWorld(): Unit
  
  def applyRelativeLocal(): Unit
  
  def applyRelativeWorld(): Unit
  
  var bones: js.Array[Bone]
  
  var data: TransformConstraintData
  
  var rotateMix: Double
  
  var scaleMix: Double
  
  var shearMix: Double
  
  var target: Bone
  
  var temp: Vector2
  
  var translateMix: Double
}
object TransformConstraint {
  
  inline def apply(
    active: Boolean,
    apply: Callback,
    applyAbsoluteLocal: Callback,
    applyAbsoluteWorld: Callback,
    applyRelativeLocal: Callback,
    applyRelativeWorld: Callback,
    bones: js.Array[Bone],
    data: TransformConstraintData,
    isActive: CallbackTo[Boolean],
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    target: Bone,
    temp: Vector2,
    translateMix: Double,
    update: Callback
  ): TransformConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = apply.toJsFn, applyAbsoluteLocal = applyAbsoluteLocal.toJsFn, applyAbsoluteWorld = applyAbsoluteWorld.toJsFn, applyRelativeLocal = applyRelativeLocal.toJsFn, applyRelativeWorld = applyRelativeWorld.toJsFn, bones = bones.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = isActive.toJsFn, rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[TransformConstraint]
  }
  
  extension [Self <: TransformConstraint](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setApplyAbsoluteLocal(value: Callback): Self = StObject.set(x, "applyAbsoluteLocal", value.toJsFn)
    
    inline def setApplyAbsoluteWorld(value: Callback): Self = StObject.set(x, "applyAbsoluteWorld", value.toJsFn)
    
    inline def setApplyRelativeLocal(value: Callback): Self = StObject.set(x, "applyRelativeLocal", value.toJsFn)
    
    inline def setApplyRelativeWorld(value: Callback): Self = StObject.set(x, "applyRelativeWorld", value.toJsFn)
    
    inline def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setData(value: TransformConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    inline def setScaleMix(value: Double): Self = StObject.set(x, "scaleMix", value.asInstanceOf[js.Any])
    
    inline def setShearMix(value: Double): Self = StObject.set(x, "shearMix", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Bone): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTemp(value: Vector2): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    
    inline def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
  }
}
