package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.anon.Dictindex
import typingsJapgolly.yandexMaps.mod.IMultiRouteModelJson
import typingsJapgolly.yandexMaps.mod.IMultiRouteParams
import typingsJapgolly.yandexMaps.mod.IMultiRouteReferencePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiRouter {
  
  @JSGlobal("ymaps.multiRouter.EditorAddon")
  @js.native
  open class EditorAddon ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.EditorAddon
  
  @JSGlobal("ymaps.multiRouter.MultiRoute")
  @js.native
  open class MultiRoute protected ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.MultiRoute {
    def this(model: IMultiRouteModelJson) = this()
    def this(model: typingsJapgolly.yandexMaps.mod.multiRouter.MultiRouteModel) = this()
    def this(model: IMultiRouteModelJson, options: Dictindex) = this()
    def this(model: typingsJapgolly.yandexMaps.mod.multiRouter.MultiRouteModel, options: Dictindex) = this()
  }
  
  @JSGlobal("ymaps.multiRouter.MultiRouteModel")
  @js.native
  open class MultiRouteModel protected ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.MultiRouteModel {
    def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
    def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
  }
  
  @JSGlobal("ymaps.multiRouter.ViaPoint")
  @js.native
  open class ViaPoint ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.ViaPoint
  
  @JSGlobal("ymaps.multiRouter.ViaPointModel")
  @js.native
  open class ViaPointModel ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.ViaPointModel
  
  @JSGlobal("ymaps.multiRouter.WayPoint")
  @js.native
  open class WayPoint ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.WayPoint
  
  @JSGlobal("ymaps.multiRouter.WayPointModel")
  @js.native
  open class WayPointModel ()
    extends typingsJapgolly.yandexMaps.mod.multiRouter.WayPointModel
  
  object driving {
    
    @JSGlobal("ymaps.multiRouter.driving.Path")
    @js.native
    open class Path ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.Path
    
    @JSGlobal("ymaps.multiRouter.driving.PathModel")
    @js.native
    open class PathModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.PathModel
    
    @JSGlobal("ymaps.multiRouter.driving.Route")
    @js.native
    open class Route ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.Route
    
    @JSGlobal("ymaps.multiRouter.driving.RouteModel")
    @js.native
    open class RouteModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.RouteModel
    
    @JSGlobal("ymaps.multiRouter.driving.Segment")
    @js.native
    open class Segment ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.Segment
    
    @JSGlobal("ymaps.multiRouter.driving.SegmentModel")
    @js.native
    open class SegmentModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.driving.SegmentModel
  }
  
  object masstransit {
    
    @JSGlobal("ymaps.multiRouter.masstransit.Path")
    @js.native
    open class Path ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.Path
    
    @JSGlobal("ymaps.multiRouter.masstransit.PathModel")
    @js.native
    open class PathModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.PathModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.Route")
    @js.native
    open class Route ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.Route
    
    @JSGlobal("ymaps.multiRouter.masstransit.RouteModel")
    @js.native
    open class RouteModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.RouteModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.StopModel")
    @js.native
    open class StopModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.StopModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransferSegment")
    @js.native
    open class TransferSegment ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.TransferSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransferSegmentModel")
    @js.native
    open class TransferSegmentModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.TransferSegmentModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransportSegment")
    @js.native
    open class TransportSegment ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.TransportSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransportSegmentModel")
    @js.native
    open class TransportSegmentModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.TransportSegmentModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.WalkSegment")
    @js.native
    open class WalkSegment ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.WalkSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.WalkSegmentModel")
    @js.native
    open class WalkSegmentModel ()
      extends typingsJapgolly.yandexMaps.mod.multiRouter.masstransit.WalkSegmentModel
  }
}
