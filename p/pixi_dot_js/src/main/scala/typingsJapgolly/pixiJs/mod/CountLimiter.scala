package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "CountLimiter")
@js.native
class CountLimiter protected ()
  extends typingsJapgolly.pixiJs.PIXI.CountLimiter {
  def this(maxItemsPerFrame: Double) = this()
}

