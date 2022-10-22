package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthPeelingSceneComponent
  extends StObject
     with ISceneComponent
object DepthPeelingSceneComponent {
  
  inline def apply(dispose: Callback, name: String, rebuild: Callback, register: Callback, scene: Scene): DepthPeelingSceneComponent = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthPeelingSceneComponent]
  }
}
