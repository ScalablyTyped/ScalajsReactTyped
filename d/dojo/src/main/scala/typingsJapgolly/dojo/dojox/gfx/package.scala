package typingsJapgolly.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gfx {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/decompose.html
    *
    * Decompose a 2D matrix into translation, scaling, and rotation components.
    * This function decompose a matrix into four logical components:
    * translation, rotation, scaling, and one more rotation using SVD.
    * The components should be applied in following order:
    *
    * [translate, rotate(angle2), scale, rotate(angle1)]
    *
    * @param matrix a 2D matrix-like object
    */
  type decompose = js.Function1[/* matrix */ typingsJapgolly.dojo.dojox.gfx.matrix.Matrix2D, scala.Unit]
  type svgAttach = typingsJapgolly.dojo.dojox.gfx.svgAttach_
  type vmlAttach = typingsJapgolly.dojo.dojox.gfx.vmlAttach_
}
