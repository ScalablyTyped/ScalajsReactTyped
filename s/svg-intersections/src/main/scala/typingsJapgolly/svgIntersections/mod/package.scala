package typingsJapgolly.svgIntersections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PolylineProps = typingsJapgolly.svgIntersections.mod.PolygonProps
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.svgIntersections.mod.PathProps
    - typingsJapgolly.svgIntersections.mod.PolylineProps
    - typingsJapgolly.svgIntersections.mod.PolygonProps
    - typingsJapgolly.svgIntersections.mod.EllipseProps
    - typingsJapgolly.svgIntersections.mod.CircleProps
    - typingsJapgolly.svgIntersections.mod.RectProps
    - typingsJapgolly.svgIntersections.mod.LineProps
  */
  type SvgProperties[T /* <: typingsJapgolly.svgIntersections.mod.SvgElements */] = typingsJapgolly.svgIntersections.mod._SvgProperties[T] | typingsJapgolly.svgIntersections.mod.PolylineProps
}
