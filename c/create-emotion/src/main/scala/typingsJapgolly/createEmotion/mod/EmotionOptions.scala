package typingsJapgolly.createEmotion.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.createEmotion.createEmotionNumbers.`1`
import typingsJapgolly.createEmotion.createEmotionNumbers.`2`
import typingsJapgolly.createEmotion.createEmotionNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
  ] = js.undefined
  var stylisPlugins: js.UndefOr[StylisPlugins] = js.undefined
}

object EmotionOptions {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    key: String = null,
    nonce: String = null,
    prefix: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean]) = null,
    stylisPlugins: StylisPlugins = null
  ): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionOptions]
  }
}

