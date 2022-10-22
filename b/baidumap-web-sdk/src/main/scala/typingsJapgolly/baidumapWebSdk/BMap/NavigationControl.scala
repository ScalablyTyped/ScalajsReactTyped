package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControl
  extends StObject
     with Control {
  
  def getType(): NavigationControlOptions
  
  def setType(`type`: NavigationControlType): Unit
}
object NavigationControl {
  
  inline def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: CallbackTo[ControlAnchor],
    getContainer: CallbackTo[js.UndefOr[HTMLElement]],
    getOffset: CallbackTo[Size],
    getType: CallbackTo[NavigationControlOptions],
    hide: japgolly.scalajs.react.Callback,
    initialize: Map => HTMLElement,
    isVisible: CallbackTo[Boolean],
    setAnchor: ControlAnchor => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    setType: NavigationControlType => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): NavigationControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getContainer = getContainer.toJsFn, getOffset = getOffset.toJsFn, getType = getType.toJsFn, hide = hide.toJsFn, initialize = js.Any.fromFunction1(initialize), isVisible = isVisible.toJsFn, setAnchor = js.Any.fromFunction1((t0: ControlAnchor) => setAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), setType = js.Any.fromFunction1((t0: NavigationControlType) => setType(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[NavigationControl]
  }
  
  extension [Self <: NavigationControl](x: Self) {
    
    inline def setGetType(value: CallbackTo[NavigationControlOptions]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetType(value: NavigationControlType => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: NavigationControlType) => value(t0).runNow()))
  }
}
