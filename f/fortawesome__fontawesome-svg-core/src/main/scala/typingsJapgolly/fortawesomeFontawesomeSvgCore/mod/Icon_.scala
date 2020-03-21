package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import typingsJapgolly.fortawesomeFontawesomeCommonTypes.mod.IconDefinition
import typingsJapgolly.fortawesomeFontawesomeCommonTypes.mod.IconName
import typingsJapgolly.fortawesomeFontawesomeCommonTypes.mod.IconPathData
import typingsJapgolly.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon_
  extends IconDefinition
     with FontawesomeObject
     with IconOrText {
  val `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.icon
}

object Icon_ {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData],
    iconName: IconName,
    node: HTMLCollection,
    prefix: IconPrefix,
    `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.icon
  ): Icon_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon_]
  }
}

