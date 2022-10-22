package typingsJapgolly.forgeViewer.Autodesk.Viewing

import typingsJapgolly.forgeViewer.THREE.Camera
import typingsJapgolly.forgeViewer.THREE.Matrix4
import typingsJapgolly.forgeViewer.THREE.OrthographicCamera
import typingsJapgolly.forgeViewer.THREE.PerspectiveCamera
import typingsJapgolly.forgeViewer.THREE.Vector3
import typingsJapgolly.forgeViewer.forgeViewerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnifiedCamera
  extends StObject
     with Camera {
  
  var aspect: Double = js.native
  
  var bottom: Double = js.native
  
  var clientHeight: Double = js.native
  
  var clientWidth: Double = js.native
  
  var dirty: Boolean = js.native
  
  var far: Double = js.native
  
  var fov: Double = js.native
  
  var isPerspective: Boolean = js.native
  
  var left: Double = js.native
  
  var near: Double = js.native
  
  var orthoScale: Double = js.native
  
  var orthographicCamera: OrthographicCamera = js.native
  
  var perspectiveCamera: PerspectiveCamera = js.native
  
  var pivot: Vector3 = js.native
  
  var right: Double = js.native
  
  var rotationAutoUpdate: Boolean = js.native
  
  var saveFov: Double = js.native
  
  var target: Vector3 = js.native
  
  var top: Double = js.native
  
  @JSName("visible")
  var visible_UnifiedCamera: `true` = js.native
  
  var worldUpTransform: Matrix4 = js.native
  
  var worldup: Vector3 = js.native
  
  var zoom: Double = js.native
}
