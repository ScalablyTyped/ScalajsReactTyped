package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingControl extends StObject {
  
  def getButtonState(buttonId: Double): Double
  
  def get_innerContent(): HTMLSpanElement
  
  def get_innerContentClass(): String
  
  def onNext(): Unit
  
  /**Should override*/
  def onPrev(): Unit
  
  def onWindowResized(): Unit
  
  def postRender(): Unit
  
  def render(innerContent: String): String
  
  def setButtonState(buttonId: Double, state: Double): Unit
}
object PagingControl {
  
  inline def apply(
    getButtonState: Double => Double,
    get_innerContent: CallbackTo[HTMLSpanElement],
    get_innerContentClass: CallbackTo[String],
    onNext: Callback,
    onPrev: Callback,
    onWindowResized: Callback,
    postRender: Callback,
    render: String => String,
    setButtonState: (Double, Double) => Callback
  ): PagingControl = {
    val __obj = js.Dynamic.literal(getButtonState = js.Any.fromFunction1(getButtonState), get_innerContent = get_innerContent.toJsFn, get_innerContentClass = get_innerContentClass.toJsFn, onNext = onNext.toJsFn, onPrev = onPrev.toJsFn, onWindowResized = onWindowResized.toJsFn, postRender = postRender.toJsFn, render = js.Any.fromFunction1(render), setButtonState = js.Any.fromFunction2((t0: Double, t1: Double) => (setButtonState(t0, t1)).runNow()))
    __obj.asInstanceOf[PagingControl]
  }
  
  extension [Self <: PagingControl](x: Self) {
    
    inline def setGetButtonState(value: Double => Double): Self = StObject.set(x, "getButtonState", js.Any.fromFunction1(value))
    
    inline def setGet_innerContent(value: CallbackTo[HTMLSpanElement]): Self = StObject.set(x, "get_innerContent", value.toJsFn)
    
    inline def setGet_innerContentClass(value: CallbackTo[String]): Self = StObject.set(x, "get_innerContentClass", value.toJsFn)
    
    inline def setOnNext(value: Callback): Self = StObject.set(x, "onNext", value.toJsFn)
    
    inline def setOnPrev(value: Callback): Self = StObject.set(x, "onPrev", value.toJsFn)
    
    inline def setOnWindowResized(value: Callback): Self = StObject.set(x, "onWindowResized", value.toJsFn)
    
    inline def setPostRender(value: Callback): Self = StObject.set(x, "postRender", value.toJsFn)
    
    inline def setRender(value: String => String): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setSetButtonState(value: (Double, Double) => Callback): Self = StObject.set(x, "setButtonState", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
