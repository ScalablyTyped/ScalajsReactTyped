package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/LabelModel", JSImport.Namespace)
@js.native
object labelModelMod extends js.Object {
  @js.native
  class LabelModel () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(`type`: String) = this()
    def this(`type`: String, id: String) = this()
    var offsetX: Double = js.native
    var offsetY: Double = js.native
  }
  
}

