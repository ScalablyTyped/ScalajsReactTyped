package typingsJapgolly.textBuffer.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextBuffer {
  /** The types usable when constructing a point via the Point::fromObject method. */
  type PointCompatible = typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  /** The types usable when constructing a range via the Range::fromObject method. */
  type RangeCompatible = typingsJapgolly.textBuffer.mod._Global_.TextBuffer.RangeLike | (js.Tuple2[
    typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
}
