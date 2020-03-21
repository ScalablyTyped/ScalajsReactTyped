package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.gameObjectMod.GameObject
import typingsJapgolly.wonderJs.geometryMod.Geometry
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import typingsJapgolly.wonderJs.rendererComponentMod.RendererComponent
import typingsJapgolly.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", JSImport.Namespace)
@js.native
object meshRendererMod extends js.Object {
  @js.native
  class MeshRenderer () extends RendererComponent {
    @JSName("entityObject")
    var entityObject_MeshRenderer: GameObject = js.native
    /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
    def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MeshRenderer extends js.Object {
    def create(): MeshRenderer = js.native
  }
  
}

