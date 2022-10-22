package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls the position, rotation, and scale of a SceneObject. Every SceneObject automatically has a Transform attached.
  * Lens Studio v1.0.0+
  */
trait Transform
  extends StObject
     with ScriptObject {
  
  /** Returns the Transform’s back directional vector. */
  var back: vec3
  
  /** Returns the Transform’s down directional vector. */
  var down: vec3
  
  /** Returns the Transform’s forward directional vector. */
  var forward: vec3
  
  /** Returns the Transform’s world-to-local transformation matrix. */
  def getInvertedWorldTransform(): mat4
  
  /** Returns the Transform’s position relative to its parent. */
  def getLocalPosition(): vec3
  
  /** Returns the Transform’s rotation relative to its parent. */
  def getLocalRotation(): quat
  
  /** Returns the Transform’s scale relative to its parent. */
  def getLocalScale(): vec3
  
  /** Returns the SceneObject the Transform is attached to. */
  def getSceneObject(): SceneObject
  
  /** Returns the Transform’s position relative to the world. */
  def getWorldPosition(): vec3
  
  /** Returns the Transform’s rotation relative to the world. */
  def getWorldRotation(): quat
  
  /** Returns the Transform’s scale relative to the world. */
  def getWorldScale(): vec3
  
  /** Returns the Transform’s local-to-world transformation matrix. */
  def getWorldTransform(): mat4
  
  /** Returns the Transform’s left directional vector. */
  var left: vec3
  
  /** Returns the Transform’s right directional vector. */
  var right: vec3
  
  /** Sets the Transform’s position relative to its parent. */
  def setLocalPosition(pos: vec3): Unit
  
  /** Sets the Transform’s rotation relative to its parent. */
  def setLocalRotation(rotation: quat): Unit
  
  /** Sets the Transform’s scale relative to its parent. */
  def setLocalScale(scale: vec3): Unit
  
  /** Sets the Transform’s position relative to the world. */
  def setWorldPosition(pos: vec3): Unit
  
  /** Sets the Transform’s rotation relative to the world. */
  def setWorldRotation(rotation: quat): Unit
  
  /** Sets the Transform’s scale relative to the world. This may produce lossy results when parent objects are rotated, so use setLocalScale( instead: ) if possible. */
  def setWorldScale(scale: vec3): Unit
  
  /** Returns the Transform’s up directional vector. */
  var up: vec3
}
object Transform {
  
  inline def apply(
    back: vec3,
    down: vec3,
    forward: vec3,
    getInvertedWorldTransform: CallbackTo[mat4],
    getLocalPosition: CallbackTo[vec3],
    getLocalRotation: CallbackTo[quat],
    getLocalScale: CallbackTo[vec3],
    getSceneObject: CallbackTo[SceneObject],
    getTypeName: CallbackTo[String],
    getWorldPosition: CallbackTo[vec3],
    getWorldRotation: CallbackTo[quat],
    getWorldScale: CallbackTo[vec3],
    getWorldTransform: CallbackTo[mat4],
    isOfType: String => Boolean,
    left: vec3,
    right: vec3,
    setLocalPosition: vec3 => Callback,
    setLocalRotation: quat => Callback,
    setLocalScale: vec3 => Callback,
    setWorldPosition: vec3 => Callback,
    setWorldRotation: quat => Callback,
    setWorldScale: vec3 => Callback,
    up: vec3
  ): Transform = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], getInvertedWorldTransform = getInvertedWorldTransform.toJsFn, getLocalPosition = getLocalPosition.toJsFn, getLocalRotation = getLocalRotation.toJsFn, getLocalScale = getLocalScale.toJsFn, getSceneObject = getSceneObject.toJsFn, getTypeName = getTypeName.toJsFn, getWorldPosition = getWorldPosition.toJsFn, getWorldRotation = getWorldRotation.toJsFn, getWorldScale = getWorldScale.toJsFn, getWorldTransform = getWorldTransform.toJsFn, isOfType = js.Any.fromFunction1(isOfType), left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setLocalPosition = js.Any.fromFunction1((t0: vec3) => setLocalPosition(t0).runNow()), setLocalRotation = js.Any.fromFunction1((t0: quat) => setLocalRotation(t0).runNow()), setLocalScale = js.Any.fromFunction1((t0: vec3) => setLocalScale(t0).runNow()), setWorldPosition = js.Any.fromFunction1((t0: vec3) => setWorldPosition(t0).runNow()), setWorldRotation = js.Any.fromFunction1((t0: quat) => setWorldRotation(t0).runNow()), setWorldScale = js.Any.fromFunction1((t0: vec3) => setWorldScale(t0).runNow()), up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setBack(value: vec3): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setDown(value: vec3): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setForward(value: vec3): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setGetInvertedWorldTransform(value: CallbackTo[mat4]): Self = StObject.set(x, "getInvertedWorldTransform", value.toJsFn)
    
    inline def setGetLocalPosition(value: CallbackTo[vec3]): Self = StObject.set(x, "getLocalPosition", value.toJsFn)
    
    inline def setGetLocalRotation(value: CallbackTo[quat]): Self = StObject.set(x, "getLocalRotation", value.toJsFn)
    
    inline def setGetLocalScale(value: CallbackTo[vec3]): Self = StObject.set(x, "getLocalScale", value.toJsFn)
    
    inline def setGetSceneObject(value: CallbackTo[SceneObject]): Self = StObject.set(x, "getSceneObject", value.toJsFn)
    
    inline def setGetWorldPosition(value: CallbackTo[vec3]): Self = StObject.set(x, "getWorldPosition", value.toJsFn)
    
    inline def setGetWorldRotation(value: CallbackTo[quat]): Self = StObject.set(x, "getWorldRotation", value.toJsFn)
    
    inline def setGetWorldScale(value: CallbackTo[vec3]): Self = StObject.set(x, "getWorldScale", value.toJsFn)
    
    inline def setGetWorldTransform(value: CallbackTo[mat4]): Self = StObject.set(x, "getWorldTransform", value.toJsFn)
    
    inline def setLeft(value: vec3): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: vec3): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSetLocalPosition(value: vec3 => Callback): Self = StObject.set(x, "setLocalPosition", js.Any.fromFunction1((t0: vec3) => value(t0).runNow()))
    
    inline def setSetLocalRotation(value: quat => Callback): Self = StObject.set(x, "setLocalRotation", js.Any.fromFunction1((t0: quat) => value(t0).runNow()))
    
    inline def setSetLocalScale(value: vec3 => Callback): Self = StObject.set(x, "setLocalScale", js.Any.fromFunction1((t0: vec3) => value(t0).runNow()))
    
    inline def setSetWorldPosition(value: vec3 => Callback): Self = StObject.set(x, "setWorldPosition", js.Any.fromFunction1((t0: vec3) => value(t0).runNow()))
    
    inline def setSetWorldRotation(value: quat => Callback): Self = StObject.set(x, "setWorldRotation", js.Any.fromFunction1((t0: quat) => value(t0).runNow()))
    
    inline def setSetWorldScale(value: vec3 => Callback): Self = StObject.set(x, "setWorldScale", js.Any.fromFunction1((t0: vec3) => value(t0).runNow()))
    
    inline def setUp(value: vec3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
