package typingsJapgolly.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.anon.Width
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.distSrcModelsDiagramModelMod.DiagramModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsPortModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsNodeModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/NodeModel", "NodeModel")
  @js.native
  open class NodeModel () extends BaseModel[DiagramModel, BaseModelListener] {
    def this(nodeType: String) = this()
    def this(nodeType: String, id: String) = this()
    def this(nodeType: Unit, id: String) = this()
    
    def addPort[T /* <: PortModel */](port: T): T = js.native
    
    def doClone(lookupTable: js.Object, clone: Any): Unit = js.native
    
    var extras: Any = js.native
    
    def getPort(name: String): PortModel | Null = js.native
    
    def getPortFromID(id: Any): PortModel | Null = js.native
    
    def getPorts(): StringDictionary[PortModel] = js.native
    
    var height: Double = js.native
    
    var ports: StringDictionary[PortModel] = js.native
    
    def removePort(port: PortModel): Unit = js.native
    
    def setPosition(x: Any, y: Any): Unit = js.native
    
    def updateDimensions(hasWidthHeight: Width): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
