package typingsJapgolly.officeUiFabricReact.calloutContentBaseMod

import org.scalajs.dom.raw.ClientRect
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutState extends js.Object {
  var calloutElementRect: js.UndefOr[ClientRect] = js.undefined
  var heightOffset: js.UndefOr[Double] = js.undefined
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.undefined
  var slideDirectionalClassName: js.UndefOr[String] = js.undefined
}

object ICalloutState {
  @scala.inline
  def apply(
    calloutElementRect: ClientRect = null,
    heightOffset: Int | Double = null,
    positions: ICalloutPositionedInfo = null,
    slideDirectionalClassName: String = null
  ): ICalloutState = {
    val __obj = js.Dynamic.literal()
    if (calloutElementRect != null) __obj.updateDynamic("calloutElementRect")(calloutElementRect.asInstanceOf[js.Any])
    if (heightOffset != null) __obj.updateDynamic("heightOffset")(heightOffset.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (slideDirectionalClassName != null) __obj.updateDynamic("slideDirectionalClassName")(slideDirectionalClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutState]
  }
}

