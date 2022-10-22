package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridModalDialogMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
    */
  def changeLocale(): Unit
  
  def closeModalDialog(accepted: js.Object, e: js.Object): Unit
  
  def destroy(): Unit
  
  def getCaptionButtonContainer(): Unit
  
  def getContent(): Unit
  
  def getFooter(): Unit
  
  def openModalDialog(): Unit
}
object IgGridModalDialogMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    closeModalDialog: (js.Object, js.Object) => Callback,
    destroy: Callback,
    getCaptionButtonContainer: Callback,
    getContent: Callback,
    getFooter: Callback,
    openModalDialog: Callback
  ): IgGridModalDialogMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, closeModalDialog = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (closeModalDialog(t0, t1)).runNow()), destroy = destroy.toJsFn, getCaptionButtonContainer = getCaptionButtonContainer.toJsFn, getContent = getContent.toJsFn, getFooter = getFooter.toJsFn, openModalDialog = openModalDialog.toJsFn)
    __obj.asInstanceOf[IgGridModalDialogMethods]
  }
  
  extension [Self <: IgGridModalDialogMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setCloseModalDialog(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "closeModalDialog", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetCaptionButtonContainer(value: Callback): Self = StObject.set(x, "getCaptionButtonContainer", value.toJsFn)
    
    inline def setGetContent(value: Callback): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetFooter(value: Callback): Self = StObject.set(x, "getFooter", value.toJsFn)
    
    inline def setOpenModalDialog(value: Callback): Self = StObject.set(x, "openModalDialog", value.toJsFn)
  }
}
