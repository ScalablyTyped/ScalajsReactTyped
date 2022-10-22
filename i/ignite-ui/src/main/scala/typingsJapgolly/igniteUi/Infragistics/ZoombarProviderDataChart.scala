package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoombarProviderDataChart extends StObject {
  
  def clean(): Unit
  
  def cleanOptsForZoom(options: js.Object): Unit
  
  def createClone(container: js.Object, options: js.Object): Unit
  
  def getBaseOpts(options: js.Object): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def syncMinWidth(minWidth: js.Object): Unit
  
  def targetObject(obj: js.Object): Unit
  
  def targetWidth(): Unit
  
  def update(a: js.Object, b: js.Object): Unit
  
  def widgetName(): Unit
}
object ZoombarProviderDataChart {
  
  inline def apply(
    clean: Callback,
    cleanOptsForZoom: js.Object => Callback,
    createClone: (js.Object, js.Object) => Callback,
    getBaseOpts: js.Object => Callback,
    setSize: (js.Object, js.Object) => Callback,
    syncMinWidth: js.Object => Callback,
    targetObject: js.Object => Callback,
    targetWidth: Callback,
    update: (js.Object, js.Object) => Callback,
    widgetName: Callback
  ): ZoombarProviderDataChart = {
    val __obj = js.Dynamic.literal(clean = clean.toJsFn, cleanOptsForZoom = js.Any.fromFunction1((t0: js.Object) => cleanOptsForZoom(t0).runNow()), createClone = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (createClone(t0, t1)).runNow()), getBaseOpts = js.Any.fromFunction1((t0: js.Object) => getBaseOpts(t0).runNow()), setSize = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setSize(t0, t1)).runNow()), syncMinWidth = js.Any.fromFunction1((t0: js.Object) => syncMinWidth(t0).runNow()), targetObject = js.Any.fromFunction1((t0: js.Object) => targetObject(t0).runNow()), targetWidth = targetWidth.toJsFn, update = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (update(t0, t1)).runNow()), widgetName = widgetName.toJsFn)
    __obj.asInstanceOf[ZoombarProviderDataChart]
  }
  
  extension [Self <: ZoombarProviderDataChart](x: Self) {
    
    inline def setClean(value: Callback): Self = StObject.set(x, "clean", value.toJsFn)
    
    inline def setCleanOptsForZoom(value: js.Object => Callback): Self = StObject.set(x, "cleanOptsForZoom", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setCreateClone(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "createClone", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setGetBaseOpts(value: js.Object => Callback): Self = StObject.set(x, "getBaseOpts", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetSize(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSyncMinWidth(value: js.Object => Callback): Self = StObject.set(x, "syncMinWidth", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setTargetObject(value: js.Object => Callback): Self = StObject.set(x, "targetObject", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setTargetWidth(value: Callback): Self = StObject.set(x, "targetWidth", value.toJsFn)
    
    inline def setUpdate(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setWidgetName(value: Callback): Self = StObject.set(x, "widgetName", value.toJsFn)
  }
}
