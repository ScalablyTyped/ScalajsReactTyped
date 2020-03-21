package typingsJapgolly.waitme.WaitMe

import japgolly.scalajs.react.Callback
import typingsJapgolly.waitme.waitmeStrings.bounce
import typingsJapgolly.waitme.waitmeStrings.bouncePulse
import typingsJapgolly.waitme.waitmeStrings.facebook
import typingsJapgolly.waitme.waitmeStrings.horizontal
import typingsJapgolly.waitme.waitmeStrings.img
import typingsJapgolly.waitme.waitmeStrings.ios
import typingsJapgolly.waitme.waitmeStrings.none
import typingsJapgolly.waitme.waitmeStrings.orbit
import typingsJapgolly.waitme.waitmeStrings.progressBar
import typingsJapgolly.waitme.waitmeStrings.pulse
import typingsJapgolly.waitme.waitmeStrings.rotateplane
import typingsJapgolly.waitme.waitmeStrings.rotation
import typingsJapgolly.waitme.waitmeStrings.roundBounce
import typingsJapgolly.waitme.waitmeStrings.stretch
import typingsJapgolly.waitme.waitmeStrings.timer
import typingsJapgolly.waitme.waitmeStrings.vertical
import typingsJapgolly.waitme.waitmeStrings.win8
import typingsJapgolly.waitme.waitmeStrings.win8_linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitMeOptions extends js.Object {
  /**
    * background for container (string).
    * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
    */
  var bg: js.UndefOr[String] = js.undefined
  /**
    * color for background animation and text (string, array).
    * Use: '#000', ['','',...] - you can use multicolor for effect
    */
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * animation effect (string).
    * Use: 'bounce' - default
    *      | none
    *      | rotateplane
    *      | stretch
    *      | orbit
    *      | roundBounce
    *      | win8
    *      | win8_linear
    *      | ios
    *      | facebook
    *      | rotation
    *      | timer
    *      | pulse
    *      | progressBar
    *      | bouncePulse
    *      | img
    */
  var effect: js.UndefOr[
    none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
  ] = js.undefined
  /**
    * change font size (string).
    * Use: '18px'. By default, use empty string.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * set max size for elem animation (string).
    * Use: 40. By default, use empty string.
    */
  var maxSize: js.UndefOr[Double | String] = js.undefined
  /**
    * code execution after closed (function).
    * Use: function(){ //your code here... } or ()=>{ //your code here... }
    * @returns {void} 
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * url to image (string).
    * Use: 'url'. By default, use empty string. Use with effect: 'img'.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * place text under the effect (string).
    * Use: 'text'.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * change text position (string).
    * Use: 'vertical' - default, 'horizontal'.
    */
  var textPos: js.UndefOr[vertical | horizontal] = js.undefined
}

object WaitMeOptions {
  @scala.inline
  def apply(
    bg: String = null,
    color: String | js.Array[String] = null,
    effect: none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img = null,
    fontSize: String = null,
    maxSize: Double | String = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    source: String = null,
    text: String = null,
    textPos: vertical | horizontal = null
  ): WaitMeOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textPos != null) __obj.updateDynamic("textPos")(textPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitMeOptions]
  }
}

