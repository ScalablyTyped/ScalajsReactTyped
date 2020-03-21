package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customXmlPartScopedCollection.toJSON()`. */
trait CustomXmlPartScopedCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}

object CustomXmlPartScopedCollectionData {
  @scala.inline
  def apply(items: js.Array[CustomXmlPartData] = null): CustomXmlPartScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXmlPartScopedCollectionData]
  }
}

