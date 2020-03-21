package typingsJapgolly.hardSourceWebpackPlugin

import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.debug
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.error
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.info
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.log
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.none
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.test
import typingsJapgolly.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: debug | log | info | warn | error
  var mode: none | test
}

object AnonLevel {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

