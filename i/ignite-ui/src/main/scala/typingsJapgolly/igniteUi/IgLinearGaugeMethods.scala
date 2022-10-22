package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLinearGaugeMethods extends StObject {
  
  /**
    * Adds a new range to the linear gauge.
    *
    * @param value The range object to be added.
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
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Returns information about how the linear gauge is rendered.
    */
  def exportVisualData(): js.Object
  
  /**
    * Causes all pending changes of the linear gauge e.g. by changed property values to be rendered immediately.
    */
  def flush(): Unit
  
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
    * @param x The x coordinate of the point.
    * @param y The y coordinate of the point.
    */
  def needleContainsPoint(x: Double, y: Double): Boolean
  
  /**
    * Removes a range from the linear gauge.
    *
    * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
    */
  def removeRange(value: js.Object): Unit
  
  /**
    * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
    */
  def styleUpdated(): Unit
  
  /**
    * Updates the specified range of the linear gauge.
    *
    * @param value The range object to be updated.
    */
  def updateRange(value: js.Object): Unit
}
object IgLinearGaugeMethods {
  
  inline def apply(
    addRange: js.Object => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    exportVisualData: CallbackTo[js.Object],
    flush: Callback,
    getRangeNames: CallbackTo[String],
    getValueForPoint: (js.Object, js.Object) => Double,
    needleContainsPoint: (Double, Double) => Boolean,
    removeRange: js.Object => Callback,
    styleUpdated: Callback,
    updateRange: js.Object => Callback
  ): IgLinearGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1((t0: js.Object) => addRange(t0).runNow()), changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn, exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, getRangeNames = getRangeNames.toJsFn, getValueForPoint = js.Any.fromFunction2(getValueForPoint), needleContainsPoint = js.Any.fromFunction2(needleContainsPoint), removeRange = js.Any.fromFunction1((t0: js.Object) => removeRange(t0).runNow()), styleUpdated = styleUpdated.toJsFn, updateRange = js.Any.fromFunction1((t0: js.Object) => updateRange(t0).runNow()))
    __obj.asInstanceOf[IgLinearGaugeMethods]
  }
  
  extension [Self <: IgLinearGaugeMethods](x: Self) {
    
    inline def setAddRange(value: js.Object => Callback): Self = StObject.set(x, "addRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExportVisualData(value: CallbackTo[js.Object]): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setGetRangeNames(value: CallbackTo[String]): Self = StObject.set(x, "getRangeNames", value.toJsFn)
    
    inline def setGetValueForPoint(value: (js.Object, js.Object) => Double): Self = StObject.set(x, "getValueForPoint", js.Any.fromFunction2(value))
    
    inline def setNeedleContainsPoint(value: (Double, Double) => Boolean): Self = StObject.set(x, "needleContainsPoint", js.Any.fromFunction2(value))
    
    inline def setRemoveRange(value: js.Object => Callback): Self = StObject.set(x, "removeRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setStyleUpdated(value: Callback): Self = StObject.set(x, "styleUpdated", value.toJsFn)
    
    inline def setUpdateRange(value: js.Object => Callback): Self = StObject.set(x, "updateRange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
