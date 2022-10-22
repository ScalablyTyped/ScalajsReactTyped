package typingsJapgolly.jsplumb.mod

import org.scalajs.dom.Element
import typingsJapgolly.jsplumb.anon.AnchorCount
import typingsJapgolly.jsplumb.anon.Faces
import typingsJapgolly.jsplumb.jsplumbStrings.AutoDefault
import typingsJapgolly.jsplumb.jsplumbStrings.Blank
import typingsJapgolly.jsplumb.jsplumbStrings.Dot
import typingsJapgolly.jsplumb.jsplumbStrings.Perimeter
import typingsJapgolly.jsplumb.jsplumbStrings.Rectangle
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnchorArraySpec = js.Tuple7[Double, Double, Double, Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[String]]

type AnchorContinuousSpec = AnchorContinuousId | (js.Tuple2[AnchorContinuousId, Faces])

type AnchorDynamicId = AutoDefault

type AnchorDynamicSpec = js.Array[AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsplumb.mod.AnchorStaticId
  - typingsJapgolly.jsplumb.mod.AnchorDynamicId
  - typingsJapgolly.jsplumb.mod.AnchorPerimeterId
  - typingsJapgolly.jsplumb.mod.AnchorContinuousId
*/
type AnchorId = _AnchorId | AnchorDynamicId | AnchorPerimeterId

type AnchorPerimeterId = Perimeter

type AnchorPerimeterSpec = AnchorPerimeterId | (js.Tuple2[AnchorPerimeterId, AnchorCount])

type AnchorSpec = AnchorStaticSpec | AnchorDynamicSpec | AnchorPerimeterSpec | AnchorContinuousSpec

type AnchorStaticSpec = AnchorStaticId | AnchorArraySpec

type ConnectionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsplumb.jsplumbStrings.Bezier
  - typingsJapgolly.jsplumb.jsplumbStrings.StateMachine
  - typingsJapgolly.jsplumb.jsplumbStrings.Flowchart
  - typingsJapgolly.jsplumb.jsplumbStrings.Straight
  - typingsJapgolly.jsplumb.mod.UserDefinedConnectorId
*/
type ConnectorId = _ConnectorId | UserDefinedConnectorId

type ConnectorSpec = ConnectorId | (js.Tuple2[ConnectorId, ConnectorOptions])

type ElementGroupRef = ElementId | Element | (js.Array[Element | ElementId])

type ElementId = String

type ElementRef = ElementId | Element

type EndpointBlank = Blank

type EndpointBlankOptions = js.Object

type EndpointDot = Dot

type EndpointId = EndpointRectangle | EndpointDot | EndpointBlank

type EndpointRectangle = Rectangle

/* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
type EndpointSpec = EndpointId | (js.Tuple2[
EndpointBlank | EndpointDot | EndpointRectangle, 
EndpointBlankOptions | EndpointDotOptions | EndpointRectangleOptions])

type OrphanedPositions = Record[String, Position]

type OverlaySpec = OverlayId | (js.Tuple2[OverlayId, OverlayOptions])

type Selector = String

type UUID = String

type UserDefinedConnectorId = String
