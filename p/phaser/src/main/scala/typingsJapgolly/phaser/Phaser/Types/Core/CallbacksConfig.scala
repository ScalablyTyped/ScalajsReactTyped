package typingsJapgolly.phaser.Phaser.Types.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksConfig extends js.Object {
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.undefined
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.undefined
}

object CallbacksConfig {
  @scala.inline
  def apply(postBoot: /* game */ Game => Callback = null, preBoot: /* game */ Game => Callback = null): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    if (postBoot != null) __obj.updateDynamic("postBoot")(js.Any.fromFunction1((t0: /* game */ typingsJapgolly.phaser.Phaser.Game) => postBoot(t0).runNow()))
    if (preBoot != null) __obj.updateDynamic("preBoot")(js.Any.fromFunction1((t0: /* game */ typingsJapgolly.phaser.Phaser.Game) => preBoot(t0).runNow()))
    __obj.asInstanceOf[CallbacksConfig]
  }
}

