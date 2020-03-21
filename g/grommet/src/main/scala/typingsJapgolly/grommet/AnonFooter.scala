package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.all
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFooter extends js.Object {
  var body: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var color: js.UndefOr[String | AnonLight] = js.undefined
  var footer: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var header: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide] = js.undefined
  var side: js.UndefOr[top | left | bottom | right | horizontal | vertical | all] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonFooter {
  @scala.inline
  def apply(
    body: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    color: String | AnonLight = null,
    footer: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    header: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonSide = null,
    side: top | left | bottom | right | horizontal | vertical | all = null,
    size: xsmall | small | medium | large | xlarge | String = null
  ): AnonFooter = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFooter]
  }
}

