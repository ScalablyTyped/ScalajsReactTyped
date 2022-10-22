package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.xterm.anon.PickIDecorationOptionsove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDecoration
  extends StObject
     with IDisposableWithEvent {
  
  /**
    * The element that the decoration is rendered to. This will be undefined
    * until it is rendered for the first time by {@link IDecoration.onRender}.
    * that.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  /*
    * The marker for the decoration in the terminal.
    */
  val marker: IMarker
  
  /**
    * An event fired when the decoration
    * is rendered, returns the dom element
    * associated with the decoration.
    */
  def onRender(listener: js.Function2[/* arg1 */ HTMLElement, /* arg2 */ Unit, Any]): IDisposable
  
  /**
    * The options for the overview ruler that can be updated.
    * This will only take effect when {@link IDecorationOptions.overviewRulerOptions}
    * were provided initially.
    */
  var options: PickIDecorationOptionsove
}
object IDecoration {
  
  inline def apply(
    dispose: Callback,
    isDisposed: Boolean,
    marker: IMarker,
    onDispose: /* listener */ js.Function2[Unit, Unit, Any] => IDisposable,
    onRender: js.Function2[/* arg1 */ HTMLElement, /* arg2 */ Unit, Any] => IDisposable,
    options: PickIDecorationOptionsove
  ): IDecoration = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], onDispose = js.Any.fromFunction1(onDispose), onRender = js.Any.fromFunction1(onRender), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecoration]
  }
  
  extension [Self <: IDecoration](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setMarker(value: IMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setOnRender(value: js.Function2[/* arg1 */ HTMLElement, /* arg2 */ Unit, Any] => IDisposable): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
    
    inline def setOptions(value: PickIDecorationOptionsove): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
