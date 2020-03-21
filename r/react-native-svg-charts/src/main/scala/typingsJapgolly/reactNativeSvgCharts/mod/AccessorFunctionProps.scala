package typingsJapgolly.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessorFunctionProps[T] extends js.Object {
  var index: Double
  var item: T
}

object AccessorFunctionProps {
  @scala.inline
  def apply[T](index: Double, item: T): AccessorFunctionProps[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessorFunctionProps[T]]
  }
}

