package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Curve object represents the parts of a path that are connected by
  * two following {@link Segment} objects. The curves of a path can be accessed
  * through its {@link Path#curves} array.
  * 
  * While a segment describe the anchor point and its incoming and outgoing
  * handles, a Curve object describes the curve passing between two such
  * segments. Curves and segments represent two different ways of looking at the
  * same thing, but focusing on different aspects. Curves for example offer many
  * convenient ways to work with parts of the path, finding lengths, positions or
  * tangents at given offsets.
  */
@JSGlobal("paper.Curve")
@js.native
open class Curve protected ()
  extends StObject
     with typingsJapgolly.paper.paper.Curve {
  /** 
    * Creates a new curve object.
    */
  def this(segment1: typingsJapgolly.paper.paper.Segment, segment2: typingsJapgolly.paper.paper.Segment) = this()
  /** 
    * Creates a new curve object.
    */
  def this(
    point1: typingsJapgolly.paper.paper.Point,
    handle1: typingsJapgolly.paper.paper.Point,
    handle2: typingsJapgolly.paper.paper.Point,
    point2: typingsJapgolly.paper.paper.Point
  ) = this()
}
