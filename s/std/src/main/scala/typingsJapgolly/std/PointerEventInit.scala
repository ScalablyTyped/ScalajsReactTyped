package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEventInit extends MouseEventInit {
  var height: js.UndefOr[Double] = js.undefined
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var pointerId: js.UndefOr[Double] = js.undefined
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
  var pressure: js.UndefOr[Double] = js.undefined
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  var tiltX: js.UndefOr[Double] = js.undefined
  var tiltY: js.UndefOr[Double] = js.undefined
  var twist: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PointerEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: Int | Double = null,
    buttons: Int | Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
    height: Int | Double = null,
    isPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    modifierAltGraph: js.UndefOr[scala.Boolean] = js.undefined,
    modifierCapsLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFn: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFnLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierHyper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierNumLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierScrollLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSuper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbol: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbolLock: js.UndefOr[scala.Boolean] = js.undefined,
    movementX: Int | Double = null,
    movementY: Int | Double = null,
    pointerId: Int | Double = null,
    pointerType: java.lang.String = null,
    pressure: Int | Double = null,
    relatedTarget: org.scalajs.dom.raw.EventTarget = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    tangentialPressure: Int | Double = null,
    tiltX: Int | Double = null,
    tiltY: Int | Double = null,
    twist: Int | Double = null,
    view: org.scalajs.dom.raw.Window = null,
    width: Int | Double = null
  ): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierAltGraph)) __obj.updateDynamic("modifierAltGraph")(modifierAltGraph.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierCapsLock)) __obj.updateDynamic("modifierCapsLock")(modifierCapsLock.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierFn)) __obj.updateDynamic("modifierFn")(modifierFn.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierFnLock)) __obj.updateDynamic("modifierFnLock")(modifierFnLock.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierHyper)) __obj.updateDynamic("modifierHyper")(modifierHyper.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierNumLock)) __obj.updateDynamic("modifierNumLock")(modifierNumLock.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierScrollLock)) __obj.updateDynamic("modifierScrollLock")(modifierScrollLock.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSuper)) __obj.updateDynamic("modifierSuper")(modifierSuper.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSymbol)) __obj.updateDynamic("modifierSymbol")(modifierSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSymbolLock)) __obj.updateDynamic("modifierSymbolLock")(modifierSymbolLock.asInstanceOf[js.Any])
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (pressure != null) __obj.updateDynamic("pressure")(pressure.asInstanceOf[js.Any])
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.asInstanceOf[js.Any])
    if (tangentialPressure != null) __obj.updateDynamic("tangentialPressure")(tangentialPressure.asInstanceOf[js.Any])
    if (tiltX != null) __obj.updateDynamic("tiltX")(tiltX.asInstanceOf[js.Any])
    if (tiltY != null) __obj.updateDynamic("tiltY")(tiltY.asInstanceOf[js.Any])
    if (twist != null) __obj.updateDynamic("twist")(twist.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEventInit]
  }
}

