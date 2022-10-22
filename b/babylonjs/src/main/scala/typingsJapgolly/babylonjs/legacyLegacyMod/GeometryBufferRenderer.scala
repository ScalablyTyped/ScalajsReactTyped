package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer")
@js.native
open class GeometryBufferRenderer protected ()
  extends typingsJapgolly.babylonjs.indexMod.GeometryBufferRenderer {
  /**
    * Creates a new G Buffer for the scene
    * @param scene The scene the buffer belongs to
    * @param ratio How big is the buffer related to the main canvas (default: 1)
    * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
    */
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene, ratio: Double) = this()
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene, ratio: Double, depthFormat: Double) = this()
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene, ratio: Unit, depthFormat: Double) = this()
}
/* static members */
object GeometryBufferRenderer {
  
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constant used to retrieve the depth texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.DEPTH_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.DEPTH_TEXTURE_TYPE")
  @js.native
  val DEPTH_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the normal texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.NORMAL_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.NORMAL_TEXTURE_TYPE")
  @js.native
  val NORMAL_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the position texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.POSITION_TEXTURE_TYPE")
  @js.native
  val POSITION_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
    * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE")
  @js.native
  val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the velocity texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.VELOCITY_TEXTURE_TYPE")
  @js.native
  val VELOCITY_TEXTURE_TYPE: Double = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
