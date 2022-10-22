package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.bmapgl.anon.IsOpen
import typingsJapgolly.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverviewMapControl
  extends StObject
     with Control {
  
  def changeView(): Unit
  
  def getSize(): Size
  
  def onviewchanged(event: IsOpen): Unit
  
  def onviewchanging(event: Target): Unit
  
  def setSize(size: Size): Unit
}
object OverviewMapControl {
  
  inline def apply(
    changeView: japgolly.scalajs.react.Callback,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: CallbackTo[ControlAnchor],
    getContainer: CallbackTo[js.UndefOr[HTMLElement]],
    getOffset: CallbackTo[Size],
    getSize: CallbackTo[Size],
    hide: japgolly.scalajs.react.Callback,
    initialize: Map => HTMLElement,
    isVisible: CallbackTo[Boolean],
    onviewchanged: IsOpen => japgolly.scalajs.react.Callback,
    onviewchanging: Target => japgolly.scalajs.react.Callback,
    setAnchor: ControlAnchor => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    setSize: Size => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): OverviewMapControl = {
    val __obj = js.Dynamic.literal(changeView = changeView.toJsFn, defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getContainer = getContainer.toJsFn, getOffset = getOffset.toJsFn, getSize = getSize.toJsFn, hide = hide.toJsFn, initialize = js.Any.fromFunction1(initialize), isVisible = isVisible.toJsFn, onviewchanged = js.Any.fromFunction1((t0: IsOpen) => onviewchanged(t0).runNow()), onviewchanging = js.Any.fromFunction1((t0: Target) => onviewchanging(t0).runNow()), setAnchor = js.Any.fromFunction1((t0: ControlAnchor) => setAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[OverviewMapControl]
  }
  
  extension [Self <: OverviewMapControl](x: Self) {
    
    inline def setChangeView(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "changeView", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setOnviewchanged(value: IsOpen => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onviewchanged", js.Any.fromFunction1((t0: IsOpen) => value(t0).runNow()))
    
    inline def setOnviewchanging(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onviewchanging", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setSetSize(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
  }
}
