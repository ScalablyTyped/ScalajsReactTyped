package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
open class BackgroundMaterial protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.BackgroundMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object BackgroundMaterial {
  
  @JSGlobal("BABYLON.BackgroundMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  inline def Parse(source: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.BackgroundMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.BackgroundMaterial]
  
  /**
    * Standard reflectance value at parallel view angle.
    */
  @JSGlobal("BABYLON.BackgroundMaterial.StandardReflectance0")
  @js.native
  def StandardReflectance0: Double = js.native
  inline def StandardReflectance0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StandardReflectance0")(x.asInstanceOf[js.Any])
  
  /**
    * Standard reflectance value at grazing angle.
    */
  @JSGlobal("BABYLON.BackgroundMaterial.StandardReflectance90")
  @js.native
  def StandardReflectance90: Double = js.native
  inline def StandardReflectance90_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StandardReflectance90")(x.asInstanceOf[js.Any])
}
