package typingsJapgolly.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnchorSpec = typingsJapgolly.jsplumb.mod.AnchorId | (js.Tuple2[typingsJapgolly.jsplumb.mod.AnchorId, typingsJapgolly.jsplumb.mod.AnchorOptions])
  type ConnectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsplumb.jsplumbStrings.Bezier
    - typingsJapgolly.jsplumb.jsplumbStrings.StateMachine
    - typingsJapgolly.jsplumb.jsplumbStrings.Flowchart
    - typingsJapgolly.jsplumb.jsplumbStrings.Straight
    - typingsJapgolly.jsplumb.mod.UserDefinedConnectorId
  */
  type ConnectorId = typingsJapgolly.jsplumb.mod._ConnectorId | typingsJapgolly.jsplumb.mod.UserDefinedConnectorId
  type ConnectorSpec = typingsJapgolly.jsplumb.mod.ConnectorId | (js.Tuple2[
    typingsJapgolly.jsplumb.mod.ConnectorId, 
    typingsJapgolly.jsplumb.mod.ConnectorOptions
  ])
  type ElementGroupRef = typingsJapgolly.jsplumb.mod.ElementId | org.scalajs.dom.raw.Element | (js.Array[org.scalajs.dom.raw.Element | typingsJapgolly.jsplumb.mod.ElementId])
  type ElementId = java.lang.String
  type ElementRef = typingsJapgolly.jsplumb.mod.ElementId | org.scalajs.dom.raw.Element
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsplumb.jsplumbStrings.Rectangle
    - typingsJapgolly.jsplumb.jsplumbStrings.Dot
    - typingsJapgolly.jsplumb.jsplumbStrings.Blank
    - typingsJapgolly.jsplumb.mod.UserDefinedEndpointId
  */
  type EndpointId = typingsJapgolly.jsplumb.mod._EndpointId | typingsJapgolly.jsplumb.mod.UserDefinedEndpointId
  type EndpointSpec = typingsJapgolly.jsplumb.mod.EndpointId | (js.Tuple2[
    typingsJapgolly.jsplumb.mod.EndpointId, 
    typingsJapgolly.jsplumb.mod.EndpointOptions
  ])
  type OverlaySpec = typingsJapgolly.jsplumb.mod.OverlayId | (js.Tuple2[typingsJapgolly.jsplumb.mod.OverlayId, typingsJapgolly.jsplumb.mod.OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
  type UserDefinedEndpointId = java.lang.String
}
