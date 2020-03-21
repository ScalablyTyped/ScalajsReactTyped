package typingsJapgolly.reactNativeNavigation.layoutMod

import typingsJapgolly.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopTabs extends js.Object {
  /**
    * Set the children screens
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Set the layout's id so Navigation.mergeOptions can be used to update options
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Configure top tabs
    */
  var options: js.UndefOr[Options] = js.undefined
}

object TopTabs {
  @scala.inline
  def apply(children: js.Array[_] = null, id: String = null, options: Options = null): TopTabs = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopTabs]
  }
}

