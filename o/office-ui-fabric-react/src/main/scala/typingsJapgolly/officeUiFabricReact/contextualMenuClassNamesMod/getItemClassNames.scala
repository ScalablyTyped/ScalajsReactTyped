package typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod

import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyles
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", "getItemClassNames")
@js.native
object getItemClassNames extends js.Object {
  def apply(
    theme: ITheme,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    itemClassName: js.UndefOr[String],
    dividerClassName: js.UndefOr[String],
    iconClassName: js.UndefOr[String],
    subMenuClassName: js.UndefOr[String],
    primaryDisabled: js.UndefOr[Boolean],
    className: js.UndefOr[String]
  ): IContextualMenuItemStyles = js.native
}

