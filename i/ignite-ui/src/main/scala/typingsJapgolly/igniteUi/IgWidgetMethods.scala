package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgWidgetMethods extends StObject {
  
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
    * Destroy is part of the jQuery UI widget API and does the following:
    * 1. Remove custom CSS classes that were added.
    * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
    * 3. Unbind all events that were bound.
    */
  def destroy(): Unit
}
object IgWidgetMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback
  ): IgWidgetMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn)
    __obj.asInstanceOf[IgWidgetMethods]
  }
  
  extension [Self <: IgWidgetMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
