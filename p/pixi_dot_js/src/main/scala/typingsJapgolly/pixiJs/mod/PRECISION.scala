package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants that specify float precision in shaders.
  *
  * @name PRECISION
  * @memberof PIXI
  * @constant
  * @static
  * @enum {string}
  * @property {string} LOW='lowp'
  * @property {string} MEDIUM='mediump'
  * @property {string} HIGH='highp'
  */
@JSImport("pixi.js", "PRECISION")
@js.native
object PRECISION extends js.Object {
  /* 2 */ val HIGH: typingsJapgolly.pixiJs.PIXI.PRECISION.HIGH with Double = js.native
  /* 0 */ val LOW: typingsJapgolly.pixiJs.PIXI.PRECISION.LOW with Double = js.native
  /* 1 */ val MEDIUM: typingsJapgolly.pixiJs.PIXI.PRECISION.MEDIUM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.PRECISION with Double] = js.native
}

