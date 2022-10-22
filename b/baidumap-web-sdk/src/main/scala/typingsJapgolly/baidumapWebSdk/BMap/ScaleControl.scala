package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleControl
  extends StObject
     with Control {
  
  def getUnit(): LengthUnit
  
  def setUnit(unit: LengthUnit): Unit
}
object ScaleControl {
  
  inline def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: CallbackTo[ControlAnchor],
    getContainer: CallbackTo[js.UndefOr[HTMLElement]],
    getOffset: CallbackTo[Size],
    getUnit: CallbackTo[LengthUnit],
    hide: japgolly.scalajs.react.Callback,
    initialize: Map => HTMLElement,
    isVisible: CallbackTo[Boolean],
    setAnchor: ControlAnchor => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    setUnit: LengthUnit => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): ScaleControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getContainer = getContainer.toJsFn, getOffset = getOffset.toJsFn, getUnit = getUnit.toJsFn, hide = hide.toJsFn, initialize = js.Any.fromFunction1(initialize), isVisible = isVisible.toJsFn, setAnchor = js.Any.fromFunction1((t0: ControlAnchor) => setAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), setUnit = js.Any.fromFunction1((t0: LengthUnit) => setUnit(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[ScaleControl]
  }
  
  extension [Self <: ScaleControl](x: Self) {
    
    inline def setGetUnit(value: CallbackTo[LengthUnit]): Self = StObject.set(x, "getUnit", value.toJsFn)
    
    inline def setSetUnit(value: LengthUnit => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUnit", js.Any.fromFunction1((t0: LengthUnit) => value(t0).runNow()))
  }
}
