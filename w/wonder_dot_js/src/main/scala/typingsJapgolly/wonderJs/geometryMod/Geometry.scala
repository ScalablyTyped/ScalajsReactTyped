package typingsJapgolly.wonderJs.geometryMod

import typingsJapgolly.wonderJs.basicGeometryDataMod.BasicGeometryData
import typingsJapgolly.wonderJs.bufferContainerMod.BufferContainer
import typingsJapgolly.wonderJs.componentMod.Component
import typingsJapgolly.wonderJs.edrawmodeMod.EDrawMode
import typingsJapgolly.wonderJs.gameObjectMod.GameObject
import typingsJapgolly.wonderJs.geometryDataMod.GeometryData
import typingsJapgolly.wonderJs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
@js.native
abstract class Geometry () extends Component {
  var buffers: BufferContainer = js.native
  var drawMode: EDrawMode = js.native
  @JSName("entityObject")
  var entityObject_Geometry: GameObject = js.native
  val geometryData: GeometryData = js.native
  var material: Material = js.native
  def computeData(): GeometryDataType = js.native
  /* protected */ def createBasicGeometryData(computedData: GeometryDataType): BasicGeometryData = js.native
  /* protected */ def createBufferContainer(): BufferContainer = js.native
  def createBuffersFromGeometryData(): Unit = js.native
  /* protected */ def createGeometryData(computedData: GeometryDataType): GeometryData = js.native
}

