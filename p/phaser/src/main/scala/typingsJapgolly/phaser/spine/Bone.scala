package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bone
  extends StObject
     with Updatable {
  
  var a: Double
  
  var active: Boolean
  
  var appliedValid: Boolean
  
  var arotation: Double
  
  var ascaleX: Double
  
  var ascaleY: Double
  
  var ashearX: Double
  
  var ashearY: Double
  
  var ax: Double
  
  var ay: Double
  
  var b: Double
  
  var c: Double
  
  var children: js.Array[Bone]
  
  var d: Double
  
  var data: BoneData
  
  def getWorldRotationX(): Double
  
  def getWorldRotationY(): Double
  
  def getWorldScaleX(): Double
  
  def getWorldScaleY(): Double
  
  def localToWorld(local: Vector2): Vector2
  
  def localToWorldRotation(localRotation: Double): Double
  
  var parent: Bone
  
  def rotateWorld(degrees: Double): Unit
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  def setToSetupPose(): Unit
  
  var shearX: Double
  
  var shearY: Double
  
  var skeleton: Skeleton
  
  var sorted: Boolean
  
  def updateAppliedTransform(): Unit
  
  def updateWorldTransform(): Unit
  
  def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit
  
  def worldToLocal(world: Vector2): Vector2
  
  def worldToLocalRotation(worldRotation: Double): Double
  
  var worldX: Double
  
  var worldY: Double
  
  var x: Double
  
  var y: Double
}
object Bone {
  
  inline def apply(
    a: Double,
    active: Boolean,
    appliedValid: Boolean,
    arotation: Double,
    ascaleX: Double,
    ascaleY: Double,
    ashearX: Double,
    ashearY: Double,
    ax: Double,
    ay: Double,
    b: Double,
    c: Double,
    children: js.Array[Bone],
    d: Double,
    data: BoneData,
    getWorldRotationX: CallbackTo[Double],
    getWorldRotationY: CallbackTo[Double],
    getWorldScaleX: CallbackTo[Double],
    getWorldScaleY: CallbackTo[Double],
    isActive: CallbackTo[Boolean],
    localToWorld: Vector2 => Vector2,
    localToWorldRotation: Double => Double,
    parent: Bone,
    rotateWorld: Double => Callback,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    setToSetupPose: Callback,
    shearX: Double,
    shearY: Double,
    skeleton: Skeleton,
    sorted: Boolean,
    update: Callback,
    updateAppliedTransform: Callback,
    updateWorldTransform: Callback,
    updateWorldTransformWith: (Double, Double, Double, Double, Double, Double, Double) => Callback,
    worldToLocal: Vector2 => Vector2,
    worldToLocalRotation: Double => Double,
    worldX: Double,
    worldY: Double,
    x: Double,
    y: Double
  ): Bone = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], appliedValid = appliedValid.asInstanceOf[js.Any], arotation = arotation.asInstanceOf[js.Any], ascaleX = ascaleX.asInstanceOf[js.Any], ascaleY = ascaleY.asInstanceOf[js.Any], ashearX = ashearX.asInstanceOf[js.Any], ashearY = ashearY.asInstanceOf[js.Any], ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getWorldRotationX = getWorldRotationX.toJsFn, getWorldRotationY = getWorldRotationY.toJsFn, getWorldScaleX = getWorldScaleX.toJsFn, getWorldScaleY = getWorldScaleY.toJsFn, isActive = isActive.toJsFn, localToWorld = js.Any.fromFunction1(localToWorld), localToWorldRotation = js.Any.fromFunction1(localToWorldRotation), parent = parent.asInstanceOf[js.Any], rotateWorld = js.Any.fromFunction1((t0: Double) => rotateWorld(t0).runNow()), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setToSetupPose = setToSetupPose.toJsFn, shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any], update = update.toJsFn, updateAppliedTransform = updateAppliedTransform.toJsFn, updateWorldTransform = updateWorldTransform.toJsFn, updateWorldTransformWith = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (updateWorldTransformWith(t0, t1, t2, t3, t4, t5, t6)).runNow()), worldToLocal = js.Any.fromFunction1(worldToLocal), worldToLocalRotation = js.Any.fromFunction1(worldToLocalRotation), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bone]
  }
  
  extension [Self <: Bone](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAppliedValid(value: Boolean): Self = StObject.set(x, "appliedValid", value.asInstanceOf[js.Any])
    
    inline def setArotation(value: Double): Self = StObject.set(x, "arotation", value.asInstanceOf[js.Any])
    
    inline def setAscaleX(value: Double): Self = StObject.set(x, "ascaleX", value.asInstanceOf[js.Any])
    
    inline def setAscaleY(value: Double): Self = StObject.set(x, "ascaleY", value.asInstanceOf[js.Any])
    
    inline def setAshearX(value: Double): Self = StObject.set(x, "ashearX", value.asInstanceOf[js.Any])
    
    inline def setAshearY(value: Double): Self = StObject.set(x, "ashearY", value.asInstanceOf[js.Any])
    
    inline def setAx(value: Double): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
    
    inline def setAy(value: Double): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[Bone]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Bone*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setData(value: BoneData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetWorldRotationX(value: CallbackTo[Double]): Self = StObject.set(x, "getWorldRotationX", value.toJsFn)
    
    inline def setGetWorldRotationY(value: CallbackTo[Double]): Self = StObject.set(x, "getWorldRotationY", value.toJsFn)
    
    inline def setGetWorldScaleX(value: CallbackTo[Double]): Self = StObject.set(x, "getWorldScaleX", value.toJsFn)
    
    inline def setGetWorldScaleY(value: CallbackTo[Double]): Self = StObject.set(x, "getWorldScaleY", value.toJsFn)
    
    inline def setLocalToWorld(value: Vector2 => Vector2): Self = StObject.set(x, "localToWorld", js.Any.fromFunction1(value))
    
    inline def setLocalToWorldRotation(value: Double => Double): Self = StObject.set(x, "localToWorldRotation", js.Any.fromFunction1(value))
    
    inline def setParent(value: Bone): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRotateWorld(value: Double => Callback): Self = StObject.set(x, "rotateWorld", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSetToSetupPose(value: Callback): Self = StObject.set(x, "setToSetupPose", value.toJsFn)
    
    inline def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    inline def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    inline def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    
    inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    inline def setUpdateAppliedTransform(value: Callback): Self = StObject.set(x, "updateAppliedTransform", value.toJsFn)
    
    inline def setUpdateWorldTransform(value: Callback): Self = StObject.set(x, "updateWorldTransform", value.toJsFn)
    
    inline def setUpdateWorldTransformWith(value: (Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "updateWorldTransformWith", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setWorldToLocal(value: Vector2 => Vector2): Self = StObject.set(x, "worldToLocal", js.Any.fromFunction1(value))
    
    inline def setWorldToLocalRotation(value: Double => Double): Self = StObject.set(x, "worldToLocalRotation", js.Any.fromFunction1(value))
    
    inline def setWorldX(value: Double): Self = StObject.set(x, "worldX", value.asInstanceOf[js.Any])
    
    inline def setWorldY(value: Double): Self = StObject.set(x, "worldY", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
