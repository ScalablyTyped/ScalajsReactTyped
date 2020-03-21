package typingsJapgolly.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.diagramModelMod.DiagramModel
import typingsJapgolly.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/NodeModel", JSImport.Namespace)
@js.native
object nodeModelMod extends js.Object {
  @js.native
  class NodeModel () extends BaseModel[DiagramModel, BaseModelListener] {
    def this(nodeType: String) = this()
    def this(nodeType: String, id: String) = this()
    var extras: js.Any = js.native
    var height: Double = js.native
    var ports: StringDictionary[PortModel] = js.native
    var width: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    def addPort[T /* <: PortModel */](port: T): T = js.native
    def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
    def getPort(name: String): PortModel | Null = js.native
    def getPortFromID(id: js.Any): PortModel | Null = js.native
    def getPorts(): StringDictionary[PortModel] = js.native
    def removePort(port: PortModel): Unit = js.native
    def setPosition(x: js.Any, y: js.Any): Unit = js.native
    def updateDimensions(hasWidthHeight: AnonWidth): Unit = js.native
  }
  
}

