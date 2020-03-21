package typingsJapgolly.randomcolor

import typingsJapgolly.randomcolor.randomcolorStrings.bright
import typingsJapgolly.randomcolor.randomcolorStrings.dark
import typingsJapgolly.randomcolor.randomcolorStrings.hex
import typingsJapgolly.randomcolor.randomcolorStrings.hsl
import typingsJapgolly.randomcolor.randomcolorStrings.hslArray
import typingsJapgolly.randomcolor.randomcolorStrings.hsla
import typingsJapgolly.randomcolor.randomcolorStrings.hsvArray
import typingsJapgolly.randomcolor.randomcolorStrings.light
import typingsJapgolly.randomcolor.randomcolorStrings.random
import typingsJapgolly.randomcolor.randomcolorStrings.rgb
import typingsJapgolly.randomcolor.randomcolorStrings.rgbArray
import typingsJapgolly.randomcolor.randomcolorStrings.rgba
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomColorOptionsMultiple extends RandomColorOptionsSingle {
  var count: Double
}

object RandomColorOptionsMultiple {
  @scala.inline
  def apply(
    count: Double,
    alpha: Int | Double = null,
    format: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex = null,
    hue: Double | String = null,
    luminosity: bright | light | dark | random = null,
    seed: Double | String = null
  ): RandomColorOptionsMultiple = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsMultiple]
  }
}

