package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSplitterMethods extends StObject {
  
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
    * Collapse the specified panel.
    *
    * @param index Specifies the index of the panel to collapse.
    */
  def collapseAt(index: js.Object): Unit
  
  /**
    * Destroys the igSplitter widget
    */
  def destroy(): Unit
  
  /**
    * Expand the specified panel by index.
    *
    * @param index Specifies the index of the panel to expand.
    */
  def expandAt(index: js.Object): Unit
  
  /**
    * Retrieves the jQuery element of the first panel.
    */
  def firstPanel(): js.Object
  
  /**
    * Refresh splitter layout, use this method to re-render the splitter if some changes to the layout are applied.
    */
  def refreshLayout(): Unit
  
  /**
    * Retrieves the jQuery element of the second panel.
    */
  def secondPanel(): js.Object
  
  /**
    * You can set new size of the first panel after the splitter is rendered.
    *
    * @param size Specifies the new size of the first panel.
    */
  def setFirstPanelSize(size: js.Object): Unit
  
  /**
    * You can set new size of the second panel after the splitter is rendered.
    *
    * @param size Specifies the new size of the second panel.
    */
  def setSecondPanelSize(size: js.Object): Unit
  
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object
}
object IgSplitterMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    collapseAt: js.Object => Callback,
    destroy: Callback,
    expandAt: js.Object => Callback,
    firstPanel: CallbackTo[js.Object],
    refreshLayout: Callback,
    secondPanel: CallbackTo[js.Object],
    setFirstPanelSize: js.Object => Callback,
    setSecondPanelSize: js.Object => Callback,
    widget: CallbackTo[js.Object]
  ): IgSplitterMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), collapseAt = js.Any.fromFunction1((t0: js.Object) => collapseAt(t0).runNow()), destroy = destroy.toJsFn, expandAt = js.Any.fromFunction1((t0: js.Object) => expandAt(t0).runNow()), firstPanel = firstPanel.toJsFn, refreshLayout = refreshLayout.toJsFn, secondPanel = secondPanel.toJsFn, setFirstPanelSize = js.Any.fromFunction1((t0: js.Object) => setFirstPanelSize(t0).runNow()), setSecondPanelSize = js.Any.fromFunction1((t0: js.Object) => setSecondPanelSize(t0).runNow()), widget = widget.toJsFn)
    __obj.asInstanceOf[IgSplitterMethods]
  }
  
  extension [Self <: IgSplitterMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setCollapseAt(value: js.Object => Callback): Self = StObject.set(x, "collapseAt", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExpandAt(value: js.Object => Callback): Self = StObject.set(x, "expandAt", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setFirstPanel(value: CallbackTo[js.Object]): Self = StObject.set(x, "firstPanel", value.toJsFn)
    
    inline def setRefreshLayout(value: Callback): Self = StObject.set(x, "refreshLayout", value.toJsFn)
    
    inline def setSecondPanel(value: CallbackTo[js.Object]): Self = StObject.set(x, "secondPanel", value.toJsFn)
    
    inline def setSetFirstPanelSize(value: js.Object => Callback): Self = StObject.set(x, "setFirstPanelSize", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetSecondPanelSize(value: js.Object => Callback): Self = StObject.set(x, "setSecondPanelSize", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setWidget(value: CallbackTo[js.Object]): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
