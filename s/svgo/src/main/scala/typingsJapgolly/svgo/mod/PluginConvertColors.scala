package typingsJapgolly.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertColors extends PluginConfig {
  var convertColors: Boolean | js.Object
}

object PluginConvertColors {
  @scala.inline
  def apply(convertColors: Boolean | js.Object): PluginConvertColors = {
    val __obj = js.Dynamic.literal(convertColors = convertColors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginConvertColors]
  }
}

