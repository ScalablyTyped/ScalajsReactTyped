package typingsJapgolly.reactToolbox.drawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerTheme extends js.Object {
  /**
    * Used for the root class when the drawer is active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Used for the drawer content.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Root class.
    */
  var drawer: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class when drawer is to the left.
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class when drawer is to the right.
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * A wrapper class for the top of the root.
    */
  var wrapper: js.UndefOr[String] = js.undefined
}

object DrawerTheme {
  @scala.inline
  def apply(
    active: String = null,
    content: String = null,
    drawer: String = null,
    left: String = null,
    right: String = null,
    wrapper: String = null
  ): DrawerTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (drawer != null) __obj.updateDynamic("drawer")(drawer.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerTheme]
  }
}

