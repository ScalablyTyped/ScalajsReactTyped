package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.button.ISplit
import typingsJapgolly.extjs.Ext.menu.ICheckItem
import typingsJapgolly.extjs.Ext.menu.IMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICycleButton
  extends StObject
     with ISplit {
  
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Gets the currently active menu item
    * @returns Ext.menu.CheckItem The active item
    */
  var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.undefined
  
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.undefined
  
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[IMenu] = js.undefined
  
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the button s active menu item
    * @param item Ext.menu.CheckItem The item to activate
    * @param suppressEvent Boolean True to prevent the button's change event from firing.
    */
  var setActiveItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ICycleButton {
  
  inline def apply(): ICycleButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICycleButton]
  }
  
  extension [Self <: ICycleButton](x: Self) {
    
    inline def setChangeHandler(value: Any): Self = StObject.set(x, "changeHandler", value.asInstanceOf[js.Any])
    
    inline def setChangeHandlerUndefined: Self = StObject.set(x, "changeHandler", js.undefined)
    
    inline def setForceGlyph(value: Any): Self = StObject.set(x, "forceGlyph", value.asInstanceOf[js.Any])
    
    inline def setForceGlyphUndefined: Self = StObject.set(x, "forceGlyph", js.undefined)
    
    inline def setForceIcon(value: java.lang.String): Self = StObject.set(x, "forceIcon", value.asInstanceOf[js.Any])
    
    inline def setForceIconUndefined: Self = StObject.set(x, "forceIcon", js.undefined)
    
    inline def setGetActiveItem(value: CallbackTo[ICheckItem]): Self = StObject.set(x, "getActiveItem", value.toJsFn)
    
    inline def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
    
    inline def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMenu(value: IMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setPrependText(value: java.lang.String): Self = StObject.set(x, "prependText", value.asInstanceOf[js.Any])
    
    inline def setPrependTextUndefined: Self = StObject.set(x, "prependText", js.undefined)
    
    inline def setSetActiveItem(value: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction2((t0: /* item */ js.UndefOr[ICheckItem], t1: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
    
    inline def setShowText(value: Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setToggleSelected(value: Callback): Self = StObject.set(x, "toggleSelected", value.toJsFn)
    
    inline def setToggleSelectedUndefined: Self = StObject.set(x, "toggleSelected", js.undefined)
  }
}
