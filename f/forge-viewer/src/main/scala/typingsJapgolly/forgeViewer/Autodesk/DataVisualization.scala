package typingsJapgolly.forgeViewer.Autodesk

import japgolly.scalajs.react.Callback
import typingsJapgolly.forgeViewer.Autodesk.Viewing.Model
import typingsJapgolly.forgeViewer.THREE.Box3
import typingsJapgolly.forgeViewer.THREE.BufferGeometry
import typingsJapgolly.forgeViewer.THREE.Color
import typingsJapgolly.forgeViewer.THREE.Vector3
import typingsJapgolly.forgeViewer.anon.Alpha
import typingsJapgolly.forgeViewer.anon.Colors
import typingsJapgolly.forgeViewer.anon.Properties
import typingsJapgolly.forgeViewer.anon.Y
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataVisualization {
  
  object Core {
    
    @js.native
    sealed trait ViewableType extends StObject
    @JSGlobal("Autodesk.DataVisualization.Core.ViewableType")
    @js.native
    object ViewableType extends StObject {
      
      @js.native
      sealed trait GEOMETRY
        extends StObject
           with ViewableType
      
      @js.native
      sealed trait SPRITE
        extends StObject
           with ViewableType
    }
    
    @js.native
    trait CustomViewable extends StObject {
      
      def dbId: Double = js.native
      
      def position: Vector3 = js.native
      
      def style: ViewableStyle = js.native
    }
    
    trait LevelRoomsMap extends StObject {
      
      def addRoomToLevel(levelName: String, room: Room): Unit
      
      def getRoomsOnLevel(levelName: String, onlyRoomsWithDevices: Boolean): js.Array[Room]
    }
    object LevelRoomsMap {
      
      inline def apply(addRoomToLevel: (String, Room) => Callback, getRoomsOnLevel: (String, Boolean) => js.Array[Room]): LevelRoomsMap = {
        val __obj = js.Dynamic.literal(addRoomToLevel = js.Any.fromFunction2((t0: String, t1: Room) => (addRoomToLevel(t0, t1)).runNow()), getRoomsOnLevel = js.Any.fromFunction2(getRoomsOnLevel))
        __obj.asInstanceOf[LevelRoomsMap]
      }
      
      extension [Self <: LevelRoomsMap](x: Self) {
        
        inline def setAddRoomToLevel(value: (String, Room) => Callback): Self = StObject.set(x, "addRoomToLevel", js.Any.fromFunction2((t0: String, t1: Room) => (value(t0, t1)).runNow()))
        
        inline def setGetRoomsOnLevel(value: (String, Boolean) => js.Array[Room]): Self = StObject.set(x, "getRoomsOnLevel", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait ModelStructureInfo extends StObject {
      
      def generateSurfaceShadingData(devices: js.Array[RoomDevice]): js.Promise[SurfaceShadingData] = js.native
      def generateSurfaceShadingData(devices: js.Array[RoomDevice], levels: Unit, nodeName: String): js.Promise[SurfaceShadingData] = js.native
      def generateSurfaceShadingData(devices: js.Array[RoomDevice], levels: LevelRoomsMap): js.Promise[SurfaceShadingData] = js.native
      def generateSurfaceShadingData(devices: js.Array[RoomDevice], levels: LevelRoomsMap, nodeName: String): js.Promise[SurfaceShadingData] = js.native
      
      def getImmediateChildNodesByName(name: String): js.Array[Double] = js.native
      def getImmediateChildNodesByName(name: String, parentId: Double): js.Array[Double] = js.native
      
      def getLevel(room: Room): String = js.native
      
      def getLevelRoomsMap(): js.Promise[LevelRoomsMap] = js.native
      def getLevelRoomsMap(keepRoomDetail: Boolean): js.Promise[LevelRoomsMap] = js.native
      def getLevelRoomsMap(keepRoomDetail: Boolean, nodeName: String): js.Promise[LevelRoomsMap] = js.native
      def getLevelRoomsMap(keepRoomDetail: Unit, nodeName: String): js.Promise[LevelRoomsMap] = js.native
      
      def getRoomList(): js.Promise[js.Array[Room]] = js.native
      def getRoomList(nodeName: String): js.Promise[js.Array[Room]] = js.native
      
      var model: Model = js.native
      
      var rooms: js.Array[Room] = js.native
    }
    
    @js.native
    trait Room extends StObject {
      
      def addDevice(device: RoomDevice): Unit = js.native
      
      def bounds: Box3 = js.native
      
      def devices: js.Array[RoomDevice] = js.native
      
      def id: Double = js.native
      
      def info: Properties = js.native
      def info_=(value: Properties): Unit = js.native
      
      def name: String = js.native
    }
    
    trait RoomDevice extends StObject {
      
      var id: String
      
      var position: Y
      
      var sensorTypes: js.Array[String]
      
      var `type`: String
    }
    object RoomDevice {
      
      inline def apply(id: String, position: Y, sensorTypes: js.Array[String], `type`: String): RoomDevice = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sensorTypes = sensorTypes.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[RoomDevice]
      }
      
      extension [Self <: RoomDevice](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setSensorTypes(value: js.Array[String]): Self = StObject.set(x, "sensorTypes", value.asInstanceOf[js.Any])
        
        inline def setSensorTypesVarargs(value: String*): Self = StObject.set(x, "sensorTypes", js.Array(value*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SpriteViewable
      extends StObject
         with CustomViewable {
      
      def color: Color = js.native
      
      def highlightedColor: Color = js.native
      
      def `type`: ViewableType = js.native
    }
    
    trait StreamLine extends StObject {
      
      def advance(position: Y): Unit
      
      var geometry: BufferGeometry
    }
    object StreamLine {
      
      inline def apply(advance: Y => Callback, geometry: BufferGeometry): StreamLine = {
        val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1((t0: Y) => advance(t0).runNow()), geometry = geometry.asInstanceOf[js.Any])
        __obj.asInstanceOf[StreamLine]
      }
      
      extension [Self <: StreamLine](x: Self) {
        
        inline def setAdvance(value: Y => Callback): Self = StObject.set(x, "advance", js.Any.fromFunction1((t0: Y) => value(t0).runNow()))
        
        inline def setGeometry(value: BufferGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      }
    }
    
    trait StreamLineBuilder extends StObject {
      
      def createStreamLine(streamLineSpecs: StreamLineSpecs): StreamLine
      
      def destroyStreamLine(streamLine: StreamLine): Unit
      
      def dispose(): Unit
    }
    object StreamLineBuilder {
      
      inline def apply(
        createStreamLine: StreamLineSpecs => StreamLine,
        destroyStreamLine: StreamLine => Callback,
        dispose: Callback
      ): StreamLineBuilder = {
        val __obj = js.Dynamic.literal(createStreamLine = js.Any.fromFunction1(createStreamLine), destroyStreamLine = js.Any.fromFunction1((t0: StreamLine) => destroyStreamLine(t0).runNow()), dispose = dispose.toJsFn)
        __obj.asInstanceOf[StreamLineBuilder]
      }
      
      extension [Self <: StreamLineBuilder](x: Self) {
        
        inline def setCreateStreamLine(value: StreamLineSpecs => StreamLine): Self = StObject.set(x, "createStreamLine", js.Any.fromFunction1(value))
        
        inline def setDestroyStreamLine(value: StreamLine => Callback): Self = StObject.set(x, "destroyStreamLine", js.Any.fromFunction1((t0: StreamLine) => value(t0).runNow()))
        
        inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      }
    }
    
    trait StreamLineSpecs extends StObject {
      
      var lineColor: Color
      
      var lineData: Colors
      
      var lineWidth: Double
      
      var opacity: Double
    }
    object StreamLineSpecs {
      
      inline def apply(lineColor: Color, lineData: Colors, lineWidth: Double, opacity: Double): StreamLineSpecs = {
        val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineData = lineData.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
        __obj.asInstanceOf[StreamLineSpecs]
      }
      
      extension [Self <: StreamLineSpecs](x: Self) {
        
        inline def setLineColor(value: Color): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
        
        inline def setLineData(value: Colors): Self = StObject.set(x, "lineData", value.asInstanceOf[js.Any])
        
        inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
        
        inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SurfaceShading extends StObject {
      
      def cleanUp(): Unit = js.native
      
      def getSetting(sensorType: String): Unit = js.native
      
      def registerSensorColors(sensorType: String, colors: js.Array[Double]): Unit = js.native
      def registerSensorColors(sensorType: String, colors: js.Array[Double], alpha: Double): Unit = js.native
      
      def removeShading(): Unit = js.native
      
      def render(
        nodeId: String,
        sensorType: String,
        sensorValueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
      ): Unit = js.native
      def render(
        nodeId: String,
        sensorType: String,
        sensorValueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
        confidenceSize: Double
      ): Unit = js.native
      def render(
        nodeId: js.Array[String],
        sensorType: String,
        sensorValueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
      ): Unit = js.native
      def render(
        nodeId: js.Array[String],
        sensorType: String,
        sensorValueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
        confidenceSize: Double
      ): Unit = js.native
      
      def updateShading(
        sensorValueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
        heatmapConfig: Alpha
      ): Unit = js.native
    }
    
    @js.native
    trait SurfaceShadingData
      extends StObject
         with SurfaceShadingGroup {
      
      def initialize(model: Model): Unit = js.native
    }
    
    @js.native
    trait SurfaceShadingGroup extends StObject {
      
      def addChild(child: SurfaceShadingGroup): Unit = js.native
      def addChild(child: SurfaceShadingNode): Unit = js.native
      
      def children: js.Array[SurfaceShadingGroup | SurfaceShadingNode] = js.native
      
      def getChildLeafs(results: js.Array[SurfaceShadingNode]): Unit = js.native
      
      def getLeafsById(id: String, results: js.Array[SurfaceShadingNode]): js.Array[SurfaceShadingNode] = js.native
      
      def getNodeById(id: String): SurfaceShadingGroup | SurfaceShadingNode = js.native
      
      var id: String = js.native
      
      var isGroup: Boolean = js.native
      
      var isLeaf: Boolean = js.native
      
      var name: String = js.native
      
      def update(model: Model): Unit = js.native
    }
    
    trait SurfaceShadingNode extends StObject {
      
      def addPoint(point: SurfaceShadingPoint): Unit
      
      var bounds: Box3
      
      var dbIds: js.Array[Double]
      
      var fragIds: js.Array[Double]
      
      var id: String
      
      var isLeaf: Boolean
      
      var name: String
      
      var shadingPoints: js.Array[SurfaceShadingPoint]
      
      def update(model: Model): Unit
    }
    object SurfaceShadingNode {
      
      inline def apply(
        addPoint: SurfaceShadingPoint => Callback,
        bounds: Box3,
        dbIds: js.Array[Double],
        fragIds: js.Array[Double],
        id: String,
        isLeaf: Boolean,
        name: String,
        shadingPoints: js.Array[SurfaceShadingPoint],
        update: Model => Callback
      ): SurfaceShadingNode = {
        val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1((t0: SurfaceShadingPoint) => addPoint(t0).runNow()), bounds = bounds.asInstanceOf[js.Any], dbIds = dbIds.asInstanceOf[js.Any], fragIds = fragIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shadingPoints = shadingPoints.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Model) => update(t0).runNow()))
        __obj.asInstanceOf[SurfaceShadingNode]
      }
      
      extension [Self <: SurfaceShadingNode](x: Self) {
        
        inline def setAddPoint(value: SurfaceShadingPoint => Callback): Self = StObject.set(x, "addPoint", js.Any.fromFunction1((t0: SurfaceShadingPoint) => value(t0).runNow()))
        
        inline def setBounds(value: Box3): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setDbIds(value: js.Array[Double]): Self = StObject.set(x, "dbIds", value.asInstanceOf[js.Any])
        
        inline def setDbIdsVarargs(value: Double*): Self = StObject.set(x, "dbIds", js.Array(value*))
        
        inline def setFragIds(value: js.Array[Double]): Self = StObject.set(x, "fragIds", value.asInstanceOf[js.Any])
        
        inline def setFragIdsVarargs(value: Double*): Self = StObject.set(x, "fragIds", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setShadingPoints(value: js.Array[SurfaceShadingPoint]): Self = StObject.set(x, "shadingPoints", value.asInstanceOf[js.Any])
        
        inline def setShadingPointsVarargs(value: SurfaceShadingPoint*): Self = StObject.set(x, "shadingPoints", js.Array(value*))
        
        inline def setUpdate(value: Model => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Model) => value(t0).runNow()))
      }
    }
    
    trait SurfaceShadingPoint extends StObject {
      
      var contextData: js.Object
      
      var id: String
      
      var name: String
      
      var position: Y
      
      def positionFromDBId(model: Model, dbId: Double): Unit
      
      var types: js.Array[String]
    }
    object SurfaceShadingPoint {
      
      inline def apply(
        contextData: js.Object,
        id: String,
        name: String,
        position: Y,
        positionFromDBId: (Model, Double) => Callback,
        types: js.Array[String]
      ): SurfaceShadingPoint = {
        val __obj = js.Dynamic.literal(contextData = contextData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionFromDBId = js.Any.fromFunction2((t0: Model, t1: Double) => (positionFromDBId(t0, t1)).runNow()), types = types.asInstanceOf[js.Any])
        __obj.asInstanceOf[SurfaceShadingPoint]
      }
      
      extension [Self <: SurfaceShadingPoint](x: Self) {
        
        inline def setContextData(value: js.Object): Self = StObject.set(x, "contextData", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionFromDBId(value: (Model, Double) => Callback): Self = StObject.set(x, "positionFromDBId", js.Any.fromFunction2((t0: Model, t1: Double) => (value(t0, t1)).runNow()))
        
        inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      }
    }
    
    @js.native
    trait ViewableData extends StObject {
      
      def addViewable(viewable: CustomViewable): Unit = js.native
      
      def finish(): js.Promise[Unit] = js.native
      
      def getViewableColor(dbId: String, highlighted: Boolean): Color = js.native
      
      def getViewableUV(dbId: String, highlighted: Boolean): js.Object = js.native
      
      def spriteAtlas: Any = js.native
      
      var spriteSize: Double = js.native
      
      def viewables: js.Array[CustomViewable] = js.native
    }
    
    @js.native
    trait ViewableStyle extends StObject {
      
      var color: Color = js.native
      
      var highlightedColor: Color = js.native
      
      var highlightedUrl: String = js.native
      
      def preloadSprite(spriteUrl: String): Unit = js.native
      
      def preloadedSprites: js.Array[String] = js.native
      
      var spriteUrls: Set[String] = js.native
      
      var `type`: ViewableType = js.native
      
      var url: String = js.native
    }
  }
}
