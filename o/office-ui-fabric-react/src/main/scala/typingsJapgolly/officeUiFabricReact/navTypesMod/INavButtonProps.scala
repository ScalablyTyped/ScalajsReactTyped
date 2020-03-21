package typingsJapgolly.officeUiFabricReact.navTypesMod

import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavButtonProps extends IButtonProps {
  /**
    * (Optional) Link to be rendered.
    */
  var link: js.UndefOr[INavLink] = js.undefined
}

object INavButtonProps {
  @scala.inline
  def apply(IButtonProps: IButtonProps = null, link: INavLink = null): INavButtonProps = {
    val __obj = js.Dynamic.literal()
    if (IButtonProps != null) js.Dynamic.global.Object.assign(__obj, IButtonProps)
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavButtonProps]
  }
}

