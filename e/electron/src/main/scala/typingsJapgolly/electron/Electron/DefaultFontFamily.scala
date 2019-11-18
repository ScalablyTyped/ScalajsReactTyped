package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFontFamily extends js.Object {
  /**
    * Defaults to Script.
    */
  var cursive: js.UndefOr[String] = js.undefined
  /**
    * Defaults to Impact.
    */
  var fantasy: js.UndefOr[String] = js.undefined
  /**
    * Defaults to Courier New.
    */
  var monospace: js.UndefOr[String] = js.undefined
  /**
    * Defaults to Arial.
    */
  var sansSerif: js.UndefOr[String] = js.undefined
  /**
    * Defaults to Times New Roman.
    */
  var serif: js.UndefOr[String] = js.undefined
  /**
    * Defaults to Times New Roman.
    */
  var standard: js.UndefOr[String] = js.undefined
}

object DefaultFontFamily {
  @scala.inline
  def apply(
    cursive: String = null,
    fantasy: String = null,
    monospace: String = null,
    sansSerif: String = null,
    serif: String = null,
    standard: String = null
  ): DefaultFontFamily = {
    val __obj = js.Dynamic.literal()
    if (cursive != null) __obj.updateDynamic("cursive")(cursive.asInstanceOf[js.Any])
    if (fantasy != null) __obj.updateDynamic("fantasy")(fantasy.asInstanceOf[js.Any])
    if (monospace != null) __obj.updateDynamic("monospace")(monospace.asInstanceOf[js.Any])
    if (sansSerif != null) __obj.updateDynamic("sansSerif")(sansSerif.asInstanceOf[js.Any])
    if (serif != null) __obj.updateDynamic("serif")(serif.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFontFamily]
  }
}

