package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridFeatureChooserMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfeaturechooser#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridfeaturechooser#options:language) or [locale](ui.iggridfeaturechooser#options:locale) option setter
    */
  def changeLocale(): Unit
  
  def destroy(e: js.Object, args: js.Object): Unit
  
  /**
    * Get jQuery representation of the div holding dropdown for the specified columnKey
    *
    * @param columnKey Key of the column
    */
  def getDropDownByColumnKey(columnKey: String): Unit
  
  /**
    * Hide feature chooser dialog by column key
    *
    * @param columnKey Key of the column that should be hidden.
    */
  def hideDropDown(columnKey: String): Unit
  
  def shouldShowFeatureIcon(key: js.Object): Unit
  
  /**
    * Show feature chooser dialog by the specified column key
    *
    * @param columnKey Key of the column that should be shown.
    */
  def showDropDown(columnKey: String): Unit
  
  /**
    * Show/hide feature chooser dialog by column key
    *
    * @param columnKey Key of the column that should be shown/hidden.
    */
  def toggleDropDown(columnKey: String): Unit
}
object IgGridFeatureChooserMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    destroy: (js.Object, js.Object) => Callback,
    getDropDownByColumnKey: String => Callback,
    hideDropDown: String => Callback,
    shouldShowFeatureIcon: js.Object => Callback,
    showDropDown: String => Callback,
    toggleDropDown: String => Callback
  ): IgGridFeatureChooserMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, destroy = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (destroy(t0, t1)).runNow()), getDropDownByColumnKey = js.Any.fromFunction1((t0: String) => getDropDownByColumnKey(t0).runNow()), hideDropDown = js.Any.fromFunction1((t0: String) => hideDropDown(t0).runNow()), shouldShowFeatureIcon = js.Any.fromFunction1((t0: js.Object) => shouldShowFeatureIcon(t0).runNow()), showDropDown = js.Any.fromFunction1((t0: String) => showDropDown(t0).runNow()), toggleDropDown = js.Any.fromFunction1((t0: String) => toggleDropDown(t0).runNow()))
    __obj.asInstanceOf[IgGridFeatureChooserMethods]
  }
  
  extension [Self <: IgGridFeatureChooserMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setDestroy(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setGetDropDownByColumnKey(value: String => Callback): Self = StObject.set(x, "getDropDownByColumnKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHideDropDown(value: String => Callback): Self = StObject.set(x, "hideDropDown", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShouldShowFeatureIcon(value: js.Object => Callback): Self = StObject.set(x, "shouldShowFeatureIcon", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShowDropDown(value: String => Callback): Self = StObject.set(x, "showDropDown", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToggleDropDown(value: String => Callback): Self = StObject.set(x, "toggleDropDown", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
