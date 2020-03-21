package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.componentMod.Component
import typingsJapgolly.wonderJs.entityObjectMod.EntityObject
import typingsJapgolly.wonderJs.gameObjectMod.GameObject
import typingsJapgolly.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/RendererComponent", JSImport.Namespace)
@js.native
object rendererComponentMod extends js.Object {
  @js.native
  abstract class RendererComponent () extends Component {
    def render(renderer: Renderer, target: EntityObject, camera: GameObject): js.Any = js.native
  }
  
}

