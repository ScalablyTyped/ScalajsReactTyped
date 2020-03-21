package typingsJapgolly.reactToolbox.layoutNavDrawerMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactToolbox.libDrawerDrawerMod.DrawerCommonProps
import typingsJapgolly.reactToolbox.reactToolboxStrings.left
import typingsJapgolly.reactToolbox.reactToolboxStrings.lg
import typingsJapgolly.reactToolbox.reactToolboxStrings.lgTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.md
import typingsJapgolly.reactToolbox.reactToolboxStrings.right
import typingsJapgolly.reactToolbox.reactToolboxStrings.sm
import typingsJapgolly.reactToolbox.reactToolboxStrings.smTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.xl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavDrawerProps extends DrawerCommonProps {
  /**
    * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
    * @default false
    */
  var clipped: js.UndefOr[Boolean] = js.undefined
  /**
    * The breakpoint at which the drawer is automatically pinned.
    */
  var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.undefined
  /**
    * If true, the drawer will be pinned open. pinned takes precedence over active.
    * @default false
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[NavDrawerTheme] = js.undefined
}

object NavDrawerProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    clipped: js.UndefOr[Boolean] = js.undefined,
    insideTree: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    permanentAt: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    theme: NavDrawerTheme = null,
    `type`: left | right = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined
  ): NavDrawerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (permanentAt != null) __obj.updateDynamic("permanentAt")(permanentAt.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavDrawerProps]
  }
}

