package typingsJapgolly.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LUPP extends js.Object {
  var L: SparseMatrix
  var P: Vector
  var Pinv: Vector
  var U: SparseMatrix
}

object LUPP {
  @scala.inline
  def apply(L: SparseMatrix, P: Vector, Pinv: Vector, U: SparseMatrix): LUPP = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], Pinv = Pinv.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LUPP]
  }
}

