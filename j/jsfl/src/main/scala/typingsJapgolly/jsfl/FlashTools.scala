package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashTools extends js.Object {
  var activeTool: js.Any
  var altIsDown: js.Any
  var ctlIsDown: js.Any
  var mouseIsDown: js.Any
  var penDownLoc: js.Any
  var penLoc: js.Any
  var shiftIsDown: js.Any
  var toolObjs: js.Any
  def constraintPoint(): js.Any
  def getKeyDown(): js.Any
  def setCreatingBbox(): js.Any
  def setCursor(): js.Any
  def snapPoint(): js.Any
}

object FlashTools {
  @scala.inline
  def apply(
    activeTool: js.Any,
    altIsDown: js.Any,
    constraintPoint: CallbackTo[js.Any],
    ctlIsDown: js.Any,
    getKeyDown: CallbackTo[js.Any],
    mouseIsDown: js.Any,
    penDownLoc: js.Any,
    penLoc: js.Any,
    setCreatingBbox: CallbackTo[js.Any],
    setCursor: CallbackTo[js.Any],
    shiftIsDown: js.Any,
    snapPoint: CallbackTo[js.Any],
    toolObjs: js.Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], ctlIsDown = ctlIsDown.asInstanceOf[js.Any], mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], shiftIsDown = shiftIsDown.asInstanceOf[js.Any], toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.updateDynamic("constraintPoint")(constraintPoint.toJsFn)
    __obj.updateDynamic("getKeyDown")(getKeyDown.toJsFn)
    __obj.updateDynamic("setCreatingBbox")(setCreatingBbox.toJsFn)
    __obj.updateDynamic("setCursor")(setCursor.toJsFn)
    __obj.updateDynamic("snapPoint")(snapPoint.toJsFn)
    __obj.asInstanceOf[FlashTools]
  }
}

