package typingsJapgolly.antdMobile.portalMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  def getContainer(): Element
}

object PortalProps {
  @scala.inline
  def apply(getContainer: CallbackTo[Element]): PortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.asInstanceOf[PortalProps]
  }
}

