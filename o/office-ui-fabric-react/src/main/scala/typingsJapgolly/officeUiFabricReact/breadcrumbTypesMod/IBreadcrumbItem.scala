package typingsJapgolly.officeUiFabricReact.breadcrumbTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h1
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h2
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h3
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h4
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h5
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.h6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbItem extends js.Object {
  /**
    * Optional prop to render the item as a heading of your choice.
    *
    * You can also use this to force items to render as links instead of buttons (by default,
    * any item with a `href` renders as a link, and any item without a `href` renders as a button).
    * This is not generally recommended because it may prevent activating the link using the keyboard.
    */
  var as: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | a] = js.undefined
  /**
    * Url to navigate to when this breadcrumb item is clicked.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Whether this is the breadcrumb item the user is currently navigated to.
    * If true, `aria-current="page"` will be applied to this breadcrumb item.
    */
  var isCurrentItem: js.UndefOr[Boolean] = js.undefined
  /**
    * Arbitrary unique string associated with the breadcrumb item.
    */
  var key: String
  /**
    * Callback issued when the breadcrumb item is selected.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      /* item */ js.UndefOr[IBreadcrumbItem], 
      Unit
    ]
  ] = js.undefined
  /**
    * Text to display to the user for the breadcrumb item.
    */
  var text: String
}

object IBreadcrumbItem {
  @scala.inline
  def apply(
    key: String,
    text: String,
    as: h1 | h2 | h3 | h4 | h5 | h6 | a = null,
    href: String = null,
    isCurrentItem: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[IBreadcrumbItem]) => Callback = null
  ): IBreadcrumbItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurrentItem)) __obj.updateDynamic("isCurrentItem")(isCurrentItem.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbItem]) => onClick(t0, t1).runNow()))
    __obj.asInstanceOf[IBreadcrumbItem]
  }
}

