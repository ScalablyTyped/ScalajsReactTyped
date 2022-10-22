package typingsJapgolly.bingmaps.global.Microsoft.Maps

import typingsJapgolly.bingmaps.Microsoft.Maps.Directions.DirectionsManager
import typingsJapgolly.bingmaps.Microsoft.Maps.Directions.IDirectionsErrorEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.Directions.IDirectionsEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.DrawingManager
import typingsJapgolly.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import typingsJapgolly.bingmaps.Microsoft.Maps.IDrawingModeChangedData
import typingsJapgolly.bingmaps.Microsoft.Maps.IEntityCollectionChangedEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.IHandlerId
import typingsJapgolly.bingmaps.Microsoft.Maps.IInfoboxEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.IMapTypeChangeEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.IMouseEventArgs
import typingsJapgolly.bingmaps.Microsoft.Maps.IPrimitive
import typingsJapgolly.bingmaps.Microsoft.Maps.IPrimitiveChangedEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that manages events within the map SDK. */
object Events {
  
  @JSGlobal("Microsoft.Maps.Events")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHandler(target: Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  
  inline def addOne(target: Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addOne(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOne")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addThrottledHandler(
    target: Any,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[Any], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  inline def addThrottledHandler(
    target: typingsJapgolly.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = (^.asInstanceOf[js.Dynamic].applyDynamic("addThrottledHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], throttleInterval.asInstanceOf[js.Any])).asInstanceOf[IHandlerId]
  
  inline def hasHandler(target: Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasHandler")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def invoke(target: Any, evenName: String, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(target.asInstanceOf[js.Any], evenName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeHandler(handlerId: IHandlerId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(handlerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
