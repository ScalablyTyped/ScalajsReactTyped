package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter_ extends FontawesomeObject {
  val `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.counter
}

object Counter_ {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.counter
  ): Counter_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter_]
  }
}

