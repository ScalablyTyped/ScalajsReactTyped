package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IkConstraint
  extends StObject
     with Updatable {
  
  var active: Boolean
  
  @JSName("apply")
  def apply(): Unit
  
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit
  
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit
  
  var bendDirection: Double
  
  var bones: js.Array[Bone]
  
  var compress: Boolean
  
  var data: IkConstraintData
  
  var mix: Double
  
  var softness: Double
  
  var stretch: Boolean
  
  var target: Bone
}
object IkConstraint {
  
  inline def apply(
    active: Boolean,
    apply: Callback,
    apply1: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Callback,
    apply2: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Callback,
    bendDirection: Double,
    bones: js.Array[Bone],
    compress: Boolean,
    data: IkConstraintData,
    isActive: CallbackTo[Boolean],
    mix: Double,
    softness: Double,
    stretch: Boolean,
    target: Bone,
    update: Callback
  ): IkConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = apply.toJsFn, apply1 = js.Any.fromFunction7((t0: Bone, t1: Double, t2: Double, t3: Boolean, t4: Boolean, t5: Boolean, t6: Double) => (apply1(t0, t1, t2, t3, t4, t5, t6)).runNow()), apply2 = js.Any.fromFunction8((t0: Bone, t1: Bone, t2: Double, t3: Double, t4: Double, t5: Boolean, t6: Double, t7: Double) => (apply2(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = isActive.toJsFn, mix = mix.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[IkConstraint]
  }
  
  extension [Self <: IkConstraint](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setApply1(value: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Callback): Self = StObject.set(x, "apply1", js.Any.fromFunction7((t0: Bone, t1: Double, t2: Double, t3: Boolean, t4: Boolean, t5: Boolean, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setApply2(value: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Callback): Self = StObject.set(x, "apply2", js.Any.fromFunction8((t0: Bone, t1: Bone, t2: Double, t3: Double, t4: Double, t5: Boolean, t6: Double, t7: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setBendDirection(value: Double): Self = StObject.set(x, "bendDirection", value.asInstanceOf[js.Any])
    
    inline def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setData(value: IkConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setSoftness(value: Double): Self = StObject.set(x, "softness", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Bone): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
