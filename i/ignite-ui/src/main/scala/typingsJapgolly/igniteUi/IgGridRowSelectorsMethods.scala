package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridRowSelectorsMethods extends StObject {
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit
  
  def destroy(): Unit
  
  def rsRenderColgroup(): Unit
}
object IgGridRowSelectorsMethods {
  
  inline def apply(changeLocale: Callback, destroy: Callback, rsRenderColgroup: Callback): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeLocale = changeLocale.toJsFn, destroy = destroy.toJsFn, rsRenderColgroup = rsRenderColgroup.toJsFn)
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
  
  extension [Self <: IgGridRowSelectorsMethods](x: Self) {
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setRsRenderColgroup(value: Callback): Self = StObject.set(x, "rsRenderColgroup", value.toJsFn)
  }
}
