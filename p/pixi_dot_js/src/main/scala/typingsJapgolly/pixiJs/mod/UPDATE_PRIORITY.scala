package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the update priorities used by internal PIXI classes when registered with
  * the {@link PIXI.Ticker} object. Higher priority items are updated first and lower
  * priority items, such as render, should go later.
  *
  * @static
  * @constant
  * @name UPDATE_PRIORITY
  * @memberof PIXI
  * @enum {number}
  * @property {number} INTERACTION=50 Highest priority, used for {@link PIXI.interaction.InteractionManager}
  * @property {number} HIGH=25 High priority updating, {@link PIXI.VideoBaseTexture} and {@link PIXI.AnimatedSprite}
  * @property {number} NORMAL=0 Default priority for ticker events, see {@link PIXI.Ticker#add}.
  * @property {number} LOW=-25 Low priority used for {@link PIXI.Application} rendering.
  * @property {number} UTILITY=-50 Lowest priority used for {@link PIXI.prepare.BasePrepare} utility.
  */
@JSImport("pixi.js", "UPDATE_PRIORITY")
@js.native
object UPDATE_PRIORITY extends js.Object {
  /* 1 */ val HIGH: typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY.HIGH with Double = js.native
  /* 0 */ val INTERACTION: typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY.INTERACTION with Double = js.native
  /* 3 */ val LOW: typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY.LOW with Double = js.native
  /* 2 */ val NORMAL: typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY.NORMAL with Double = js.native
  /* 4 */ val UTILITY: typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY.UTILITY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.pixiJs.PIXI.UPDATE_PRIORITY with Double] = js.native
}

