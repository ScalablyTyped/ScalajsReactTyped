package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement
  
  def addSeparator(): Unit
  
  def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): Menu
  
  def hideIcons(): Unit
  
  def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit
  
  def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit
  
  def showIcons(): Unit
}
object Menu {
  
  inline def apply(
    addMenuItem: (String, String, String, String, Double, String, String) => HTMLElement,
    addSeparator: Callback,
    addSubMenu: (String, String, String, Double, String, String) => Menu,
    hideIcons: Callback,
    show: (HTMLElement, Boolean, Boolean, Double) => Callback,
    showFilterMenu: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Callback,
    showIcons: Callback
  ): Menu = {
    val __obj = js.Dynamic.literal(addMenuItem = js.Any.fromFunction7(addMenuItem), addSeparator = addSeparator.toJsFn, addSubMenu = js.Any.fromFunction6(addSubMenu), hideIcons = hideIcons.toJsFn, show = js.Any.fromFunction4((t0: HTMLElement, t1: Boolean, t2: Boolean, t3: Double) => (show(t0, t1, t2, t3)).runNow()), showFilterMenu = js.Any.fromFunction6((t0: HTMLElement, t1: Boolean, t2: Boolean, t3: Double, t4: Boolean, t5: Boolean) => (showFilterMenu(t0, t1, t2, t3, t4, t5)).runNow()), showIcons = showIcons.toJsFn)
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setAddMenuItem(value: (String, String, String, String, Double, String, String) => HTMLElement): Self = StObject.set(x, "addMenuItem", js.Any.fromFunction7(value))
    
    inline def setAddSeparator(value: Callback): Self = StObject.set(x, "addSeparator", value.toJsFn)
    
    inline def setAddSubMenu(value: (String, String, String, Double, String, String) => Menu): Self = StObject.set(x, "addSubMenu", js.Any.fromFunction6(value))
    
    inline def setHideIcons(value: Callback): Self = StObject.set(x, "hideIcons", value.toJsFn)
    
    inline def setShow(value: (HTMLElement, Boolean, Boolean, Double) => Callback): Self = StObject.set(x, "show", js.Any.fromFunction4((t0: HTMLElement, t1: Boolean, t2: Boolean, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setShowFilterMenu(value: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Callback): Self = StObject.set(x, "showFilterMenu", js.Any.fromFunction6((t0: HTMLElement, t1: Boolean, t2: Boolean, t3: Double, t4: Boolean, t5: Boolean) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setShowIcons(value: Callback): Self = StObject.set(x, "showIcons", value.toJsFn)
  }
}
