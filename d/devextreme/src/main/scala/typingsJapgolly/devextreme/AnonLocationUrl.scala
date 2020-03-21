package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.centerBottom
import typingsJapgolly.devextreme.devextremeStrings.centerTop
import typingsJapgolly.devextreme.devextremeStrings.full
import typingsJapgolly.devextreme.devextremeStrings.leftBottom
import typingsJapgolly.devextreme.devextremeStrings.leftCenter
import typingsJapgolly.devextreme.devextremeStrings.leftTop
import typingsJapgolly.devextreme.devextremeStrings.rightBottom
import typingsJapgolly.devextreme.devextremeStrings.rightCenter
import typingsJapgolly.devextreme.devextremeStrings.rightTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationUrl extends js.Object {
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonLocationUrl {
  @scala.inline
  def apply(
    location: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop = null,
    url: String = null
  ): AnonLocationUrl = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocationUrl]
  }
}

