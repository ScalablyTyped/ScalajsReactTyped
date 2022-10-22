package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialGaugeMethods extends StObject {
  
  /**
    * Adds a new range to the radial gauge.
    *
    * @param value
    */
  def addRange(value: js.Object): Unit
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit
  
  /**
    * Clears the ranges in the radial gauge.
    */
  def clearRanges(): Unit
  
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Exports the visual data for the radial gauge.
    */
  def exportVisualData(): Unit
  
  /**
    * Flushes the gauge.
    */
  def flush(): Unit
  
  /**
    * Gets the point on the gauge for a given scale value and extent.
    *
    * @param value
    * @param extent
    */
  def getPointForValue(value: js.Object, extent: js.Object): Unit
  
  /**
    * Returns a string containing the names of all the ranges delimited with a \n symbol.
    */
  def getRangeNames(): String
  
  /**
    * Gets the value for the main scale of the gauge for a given point within the bounds of the gauge.
    *
    * @param x
    * @param y
    */
  def getValueForPoint(x: js.Object, y: js.Object): Double
  
  /**
    * Returns true if the main gauge needle bounding box contains the point provided, otherwise false.
    *
    * @param x
    * @param y
    */
  def needleContainsPoint(x: js.Object, y: js.Object): Boolean
  
  /**
    * Removes a specified range.
    *
    * @param value
    */
  def removeRange(value: js.Object): Unit
  
  /**
    * Scales a value on the gauge's main scale to an angle around the center point of the gauge, in radians.
    *
    * @param value
    */
  def scaleValue(value: js.Object): Unit
  
  /**
    * Returns true if the style was updated for the radial gauge.
    */
  def styleUpdated(): Unit
  
  /**
    * Unscales a value from an angle in radians to the represented value along the main scale of the gauge.
    *
    * @param value
    */
  def unscaleValue(value: js.Object): Unit
  
  /**
    * Updates the range.
    *
    * @param value
    */
  def updateRange(value: js.Object): Unit
}
object IgRadialGaugeMethods {
  
  inline def apply(
    addRange: js.Object => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    clearRanges: Callback,
    destroy: Callback,
    exportVisualData: Callback,
    flush: Callback,
    getPointForValue: (js.Object, js.Object) => Callback,
    getRangeNames: CallbackTo[String],
    getValueForPoint: (js.Object, js.Object) => Double,
    needleContainsPoint: (js.Object, js.Object) => Boolean,
    removeRange: js.Object => Callback,
    scaleValue: js.Object => Callback,
    styleUpdated: Callback,
    unscaleValue: js.Object => Callback,
    updateRange: js.Object => Callback
  ): IgRadialGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1((t0: js.Object) => addRange(t0).runNow()), changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), clearRanges = clearRanges.toJsFn, destroy = destroy.toJsFn, exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, getPointForValue = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (getPointForValue(t0, t1)).runNow()), getRangeNames = getRangeNames.toJsFn, getValueForPoint = js.Any.fromFunction2(getValueForPoint), needleContainsPoint = js.Any.fromFunction2(needleContainsPoint), removeRange = js.Any.fromFunction1((t0: js.Object) => removeRange(t0).runNow()), scaleValue = js.Any.fromFunction1((t0: js.Object) => scaleValue(t0).runNow()), styleUpdated = styleUpdated.toJsFn, unscaleValue = js.Any.fromFunction1((t0: js.Object) => unscaleValue(t0).runNow()), updateRange = js.Any.fromFunction1((t0: js.Object) => updateRange(t0).runNow()))
    __obj.asInstanceOf[IgRadialGaugeMethods]
  }
  
  extension [Self <: IgRadialGaugeMethods](x: Self) {
    
    inline def setAddRange(value: js.Object => Callback): Self = StObject.set(x, "addRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setClearRanges(value: Callback): Self = StObject.set(x, "clearRanges", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExportVisualData(value: Callback): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setGetPointForValue(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "getPointForValue", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setGetRangeNames(value: CallbackTo[String]): Self = StObject.set(x, "getRangeNames", value.toJsFn)
    
    inline def setGetValueForPoint(value: (js.Object, js.Object) => Double): Self = StObject.set(x, "getValueForPoint", js.Any.fromFunction2(value))
    
    inline def setNeedleContainsPoint(value: (js.Object, js.Object) => Boolean): Self = StObject.set(x, "needleContainsPoint", js.Any.fromFunction2(value))
    
    inline def setRemoveRange(value: js.Object => Callback): Self = StObject.set(x, "removeRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setScaleValue(value: js.Object => Callback): Self = StObject.set(x, "scaleValue", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setStyleUpdated(value: Callback): Self = StObject.set(x, "styleUpdated", value.toJsFn)
    
    inline def setUnscaleValue(value: js.Object => Callback): Self = StObject.set(x, "unscaleValue", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setUpdateRange(value: js.Object => Callback): Self = StObject.set(x, "updateRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
