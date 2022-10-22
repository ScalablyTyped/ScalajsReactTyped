package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialMenuMethods extends StObject {
  
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
    * Destroys the widget.
    */
  def destroy(): Unit
  
  /**
    * Exports visual data from the radial menu to aid in unit testing
    */
  def exportVisualData(): Unit
  
  /**
    * Forces any pending deferred work to render on the radial menu before continuing
    */
  def flush(): Unit
  
  /**
    * Gets or sets the value of a property for the item created with the specified key
    *
    * @param itemKey The name of the item
    * @param key The name of the property/option
    * @param value The new value for the property or undefined to obtain the current value
    */
  def itemOption(itemKey: String, key: String, value: js.Object): js.Object
  
  /**
    * Notify the radial menu that style information used for rendering the menu may have been updated.
    */
  def styleUpdated(): Unit
}
object IgRadialMenuMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    exportVisualData: Callback,
    flush: Callback,
    itemOption: (String, String, js.Object) => js.Object,
    styleUpdated: Callback
  ): IgRadialMenuMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn, exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, itemOption = js.Any.fromFunction3(itemOption), styleUpdated = styleUpdated.toJsFn)
    __obj.asInstanceOf[IgRadialMenuMethods]
  }
  
  extension [Self <: IgRadialMenuMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExportVisualData(value: Callback): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setItemOption(value: (String, String, js.Object) => js.Object): Self = StObject.set(x, "itemOption", js.Any.fromFunction3(value))
    
    inline def setStyleUpdated(value: Callback): Self = StObject.set(x, "styleUpdated", value.toJsFn)
  }
}
