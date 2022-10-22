package typingsJapgolly.forgeViewer.global.THREE

import typingsJapgolly.forgeViewer.THREE.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLShadowMap")
@js.native
open class WebGLShadowMap protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.WebGLShadowMap {
  def this(_renderer: Renderer, _lights: js.Array[Any], _objects: js.Array[Any], capabilities: Any) = this()
  
  /* CompleteClass */
  var autoUpdate: Boolean = js.native
  
  /**
    * @deprecated
    */
  /* CompleteClass */
  var cullFace: Any = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def render(scene: typingsJapgolly.forgeViewer.THREE.Scene, camera: typingsJapgolly.forgeViewer.THREE.Camera): Unit = js.native
  
  /* CompleteClass */
  var renderReverseSided: Boolean = js.native
  
  /* CompleteClass */
  var renderSingleSided: Boolean = js.native
  
  /* CompleteClass */
  var `type`: typingsJapgolly.forgeViewer.THREE.ShadowMapType = js.native
}
