package typingsJapgolly.blueprintjsCore.portalMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalProps extends IProps {
  /**
    * The HTML element that children will be mounted to.
    * @default document.body
    */
  var container: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Callback invoked when the children of this `Portal` have been added to the DOM.
    */
  var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IPortalProps {
  @scala.inline
  def apply(
    className: String = null,
    container: HTMLElement = null,
    onChildrenMount: js.UndefOr[Callback] = js.undefined
  ): IPortalProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    onChildrenMount.foreach(p => __obj.updateDynamic("onChildrenMount")(p.toJsFn))
    __obj.asInstanceOf[IPortalProps]
  }
}

