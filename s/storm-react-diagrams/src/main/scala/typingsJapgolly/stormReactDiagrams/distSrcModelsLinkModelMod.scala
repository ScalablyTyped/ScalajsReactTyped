package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.anon.BaseEventLinkModelLinkMod
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.distSrcModelsDiagramModelMod.DiagramModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsLabelModelMod.LabelModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsPortModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsLinkModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/LinkModel", "LinkModel")
  @js.native
  open class LinkModel[T /* <: LinkModelListener */] () extends BaseModel[DiagramModel, T] {
    def this(linkType: String) = this()
    def this(linkType: String, id: String) = this()
    def this(linkType: Unit, id: String) = this()
    
    def addLabel(label: LabelModel): Unit = js.native
    
    def addPoint[P /* <: PointModel */](pointModel: P): P = js.native
    def addPoint[P /* <: PointModel */](pointModel: P, index: Double): P = js.native
    
    def doClone(lookupTable: js.Object, clone: Any): Unit = js.native
    
    def generatePoint(): PointModel = js.native
    def generatePoint(x: Double): PointModel = js.native
    def generatePoint(x: Double, y: Double): PointModel = js.native
    def generatePoint(x: Unit, y: Double): PointModel = js.native
    
    def getFirstPoint(): PointModel = js.native
    
    def getLastPoint(): PointModel = js.native
    
    def getPointForPort(port: PortModel): PointModel = js.native
    
    def getPointIndex(point: PointModel): Double = js.native
    
    def getPointModel(id: String): PointModel | Null = js.native
    
    def getPoints(): js.Array[PointModel] = js.native
    
    def getPortForPoint(point: PointModel): PortModel = js.native
    
    def getSourcePort(): PortModel = js.native
    
    def getTargetPort(): PortModel = js.native
    
    def isLastPoint(point: PointModel): Boolean = js.native
    
    var labels: js.Array[LabelModel] = js.native
    
    def point(x: Double, y: Double): PointModel = js.native
    
    var points: js.Array[PointModel] = js.native
    
    def removeMiddlePoints(): Unit = js.native
    
    def removePoint(pointModel: PointModel): Unit = js.native
    
    def removePointsAfter(pointModel: PointModel): Unit = js.native
    
    def removePointsBefore(pointModel: PointModel): Unit = js.native
    
    def setPoints(points: js.Array[PointModel]): Unit = js.native
    
    def setSourcePort(port: PortModel): Unit = js.native
    
    def setTargetPort(port: PortModel): Unit = js.native
    
    var sourcePort: PortModel | Null = js.native
    
    var targetPort: PortModel | Null = js.native
  }
  
  trait LinkModelListener
    extends StObject
       with BaseModelListener {
    
    var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
    
    var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
  }
  object LinkModelListener {
    
    inline def apply(): LinkModelListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkModelListener]
    }
    
    extension [Self <: LinkModelListener](x: Self) {
      
      inline def setSourcePortChanged(value: /* event */ BaseEventLinkModelLinkMod => Callback): Self = StObject.set(x, "sourcePortChanged", js.Any.fromFunction1((t0: /* event */ BaseEventLinkModelLinkMod) => value(t0).runNow()))
      
      inline def setSourcePortChangedUndefined: Self = StObject.set(x, "sourcePortChanged", js.undefined)
      
      inline def setTargetPortChanged(value: /* event */ BaseEventLinkModelLinkMod => Callback): Self = StObject.set(x, "targetPortChanged", js.Any.fromFunction1((t0: /* event */ BaseEventLinkModelLinkMod) => value(t0).runNow()))
      
      inline def setTargetPortChangedUndefined: Self = StObject.set(x, "targetPortChanged", js.undefined)
    }
  }
}
