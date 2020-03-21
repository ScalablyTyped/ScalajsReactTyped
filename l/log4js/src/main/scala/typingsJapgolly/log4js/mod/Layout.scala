package typingsJapgolly.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.log4js.log4jsStrings.basic
import typingsJapgolly.log4js.log4jsStrings.colored
import typingsJapgolly.log4js.log4jsStrings.coloured
import typingsJapgolly.log4js.log4jsStrings.dummy
import typingsJapgolly.log4js.log4jsStrings.messagePassThrough
import typingsJapgolly.log4js.log4jsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.log4js.mod.BaseLayout
  - typingsJapgolly.log4js.mod.ColoredLayout
  - typingsJapgolly.log4js.mod.MessagePassThroughLayout
  - typingsJapgolly.log4js.mod.DummyLayout
  - typingsJapgolly.log4js.mod.PatternLayout
  - typingsJapgolly.log4js.mod.CustomLayout
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  def DummyLayout(`type`: dummy): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def PatternLayout(pattern: String, `type`: pattern, tokens: StringDictionary[Token] = null): Layout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def ColoredLayout(`type`: colored | coloured): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def CustomLayout(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def MessagePassThroughLayout(`type`: messagePassThrough): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def BaseLayout(`type`: basic): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

