package typingsJapgolly.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeaderClickEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T]
}

object OnHeaderClickEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnHeaderClickEventArgs[T]]
  }
}

