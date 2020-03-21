package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer_ extends FontawesomeObject {
  val `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.layer
}

object Layer_ {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.layer
  ): Layer_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer_]
  }
}

