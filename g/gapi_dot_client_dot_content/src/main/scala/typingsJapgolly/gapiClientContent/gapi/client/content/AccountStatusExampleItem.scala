package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusExampleItem extends js.Object {
  /** Unique item ID as specified in the uploaded product data. */
  var itemId: js.UndefOr[String] = js.undefined
  /** Landing page of the item. */
  var link: js.UndefOr[String] = js.undefined
  /** The item value that was submitted. */
  var submittedValue: js.UndefOr[String] = js.undefined
  /** Title of the item. */
  var title: js.UndefOr[String] = js.undefined
  /** The actual value on the landing page. */
  var valueOnLandingPage: js.UndefOr[String] = js.undefined
}

object AccountStatusExampleItem {
  @scala.inline
  def apply(
    itemId: String = null,
    link: String = null,
    submittedValue: String = null,
    title: String = null,
    valueOnLandingPage: String = null
  ): AccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusExampleItem]
  }
}

