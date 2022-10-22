package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgQRCodeBarcodeMethods extends StObject {
  
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
    * Returns information about how the barcode is rendered.
    */
  def exportVisualData(): js.Object
  
  /**
    * Causes all pending changes of the barcode e.g. by changed property values to be rendered immediately.
    */
  def flush(): Unit
  
  /**
    * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
    */
  def styleUpdated(): Unit
}
object IgQRCodeBarcodeMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    exportVisualData: CallbackTo[js.Object],
    flush: Callback,
    styleUpdated: Callback
  ): IgQRCodeBarcodeMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn, exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, styleUpdated = styleUpdated.toJsFn)
    __obj.asInstanceOf[IgQRCodeBarcodeMethods]
  }
  
  extension [Self <: IgQRCodeBarcodeMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExportVisualData(value: CallbackTo[js.Object]): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setStyleUpdated(value: Callback): Self = StObject.set(x, "styleUpdated", value.toJsFn)
  }
}
