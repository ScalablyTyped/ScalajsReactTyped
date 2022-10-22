package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneComponent extends StObject {
  
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit
  
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: String
  
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit
  
  /**
    * Register the component to one instance of a scene.
    */
  def register(): Unit
  
  /**
    * The scene the component belongs to.
    */
  var scene: Scene
}
object ISceneComponent {
  
  inline def apply(dispose: Callback, name: String, rebuild: Callback, register: Callback, scene: Scene): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneComponent]
  }
  
  extension [Self <: ISceneComponent](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRebuild(value: Callback): Self = StObject.set(x, "rebuild", value.toJsFn)
    
    inline def setRegister(value: Callback): Self = StObject.set(x, "register", value.toJsFn)
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
