package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  var defaultAnchor: ControlAnchor
  
  var defaultOffset: Size
  
  def getAnchor(): ControlAnchor
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  def getContainer(): js.UndefOr[HTMLElement]
  
  def getOffset(): Size
  
  def hide(): Unit
  
  def initialize(map: Map): HTMLElement
  
  def isVisible(): Boolean
  
  def setAnchor(anchor: ControlAnchor): Unit
  
  def setOffset(offset: Size): Unit
  
  def show(): Unit
}
object Control {
  
  inline def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: CallbackTo[ControlAnchor],
    getContainer: CallbackTo[js.UndefOr[HTMLElement]],
    getOffset: CallbackTo[Size],
    hide: japgolly.scalajs.react.Callback,
    initialize: Map => HTMLElement,
    isVisible: CallbackTo[Boolean],
    setAnchor: ControlAnchor => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): Control = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getContainer = getContainer.toJsFn, getOffset = getOffset.toJsFn, hide = hide.toJsFn, initialize = js.Any.fromFunction1(initialize), isVisible = isVisible.toJsFn, setAnchor = js.Any.fromFunction1((t0: ControlAnchor) => setAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setDefaultAnchor(value: ControlAnchor): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
    
    inline def setDefaultOffset(value: Size): Self = StObject.set(x, "defaultOffset", value.asInstanceOf[js.Any])
    
    inline def setGetAnchor(value: CallbackTo[ControlAnchor]): Self = StObject.set(x, "getAnchor", value.toJsFn)
    
    inline def setGetContainer(value: CallbackTo[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "getContainer", value.toJsFn)
    
    inline def setGetOffset(value: CallbackTo[Size]): Self = StObject.set(x, "getOffset", value.toJsFn)
    
    inline def setHide(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInitialize(value: Map => HTMLElement): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setSetAnchor(value: ControlAnchor => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1((t0: ControlAnchor) => value(t0).runNow()))
    
    inline def setSetOffset(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setOffset", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setShow(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
