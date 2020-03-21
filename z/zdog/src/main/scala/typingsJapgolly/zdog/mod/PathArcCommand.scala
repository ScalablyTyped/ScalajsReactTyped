package typingsJapgolly.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathArcCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-arc Zdog Shape API} */
  var arc: js.Tuple2[VectorOptions, VectorOptions]
}

object PathArcCommand {
  @scala.inline
  def apply(arc: js.Tuple2[VectorOptions, VectorOptions]): PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathArcCommand]
  }
}

