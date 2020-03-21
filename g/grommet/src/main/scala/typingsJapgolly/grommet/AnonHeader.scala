package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var body: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom] = js.undefined
  var bottom: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var footer: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom] = js.undefined
  var header: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom] = js.undefined
  var horizontal: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var left: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var right: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var top: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var vertical: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonHeader {
  @scala.inline
  def apply(
    body: none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom = null,
    bottom: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    footer: none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom = null,
    header: none | xxsmall | xsmall | small | medium | large | xlarge | AnonBottom = null,
    horizontal: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    left: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    right: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    top: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    vertical: xxsmall | xsmall | small | medium | large | xlarge | String = null
  ): AnonHeader = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

