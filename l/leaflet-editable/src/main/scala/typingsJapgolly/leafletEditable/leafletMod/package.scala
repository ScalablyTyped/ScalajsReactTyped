package typingsJapgolly.leafletEditable.leafletMod

import typingsJapgolly.leafletEditable.leafletMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Editable_=(x: EditableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editable")(x.asInstanceOf[js.Any])

type CancelableEventHandlerFn = js.Function1[/* event */ CancelableEvent, Unit]

type CancelableShapeEventHandlerFn = js.Function1[/* event */ CancelableShapeEvent, Unit]

type CancelableVertexEventHandlerFn = js.Function1[/* event */ CancelableVertexEvent, Unit]

/**
  * Editor for Circle.
  */
// tslint:disable-next-line:no-empty-interface
type CircleEditor = PathEditor

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.leafletEditable.leafletMod.MarkerEditor
  - typingsJapgolly.leafletEditable.leafletMod.PolylineEditor
  - typingsJapgolly.leafletEditable.leafletMod.PolygonEditor
  - typingsJapgolly.leafletEditable.leafletMod.RectangleEditor
  - typingsJapgolly.leafletEditable.leafletMod.CircleEditor
*/
type Editor = _Editor | MarkerEditor | RectangleEditor | CircleEditor

/**
  * Editor for Marker.
  */
// tslint:disable-next-line:no-empty-interface
type MarkerEditor = BaseEditor

/**
  * Editor for Rectangle.
  */
// tslint:disable-next-line:no-empty-interface
type RectangleEditor = PathEditor

type ShapeEventHandlerFn = js.Function1[/* event */ ShapeEvent, Unit]

/**
  * Custom event handler functions.
  */
type VertexEventHandlerFn = js.Function1[/* event */ VertexEvent, Unit]
