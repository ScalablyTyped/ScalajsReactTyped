package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PointModel", JSImport.Namespace)
@js.native
object pointModelMod extends js.Object {
  @js.native
  class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: AnonX) = this()
    var x: Double = js.native
    var y: Double = js.native
    def getLink(): LinkModel[LinkModelListener] = js.native
    def getX(): Double = js.native
    def getY(): Double = js.native
    def isConnectedToPort(): Boolean = js.native
    def updateLocation(points: AnonX): Unit = js.native
  }
  
}

