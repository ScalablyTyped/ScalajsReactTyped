package typingsJapgolly.phaser.Phaser.Types.GameObjects.Text

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.TextStyleWordWrapCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Word Wrap configuration object as used by the Text Style configuration.
  */
trait TextWordWrap extends js.Object {
  /**
    * Provide a custom callback when word wrapping is enabled.
    */
  var callback: js.UndefOr[TextStyleWordWrapCallback] = js.undefined
  /**
    * The context in which the word wrap callback is invoked.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Use basic or advanced word wrapping?
    */
  var useAdvancedWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * The width at which text should be considered for word-wrapping.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TextWordWrap {
  @scala.inline
  def apply(
    callback: (/* text */ String, /* textObject */ typingsJapgolly.phaser.Phaser.GameObjects.Text) => Callback = null,
    callbackScope: js.Any = null,
    useAdvancedWrap: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): TextWordWrap = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* textObject */ typingsJapgolly.phaser.Phaser.GameObjects.Text) => callback(t0, t1).runNow()))
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdvancedWrap)) __obj.updateDynamic("useAdvancedWrap")(useAdvancedWrap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWordWrap]
  }
}

