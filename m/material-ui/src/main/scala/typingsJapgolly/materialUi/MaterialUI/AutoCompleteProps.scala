package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.materialUi.anon.Text
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteProps[DataItem]
  extends StObject
     with TextFieldProps {
  
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
  
  var dataSource: js.Array[DataItem]
  
  var dataSourceConfig: js.UndefOr[Text] = js.undefined
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[
    js.Function3[/* searchText */ String, /* key */ String, /* item */ DataItem, Boolean]
  ] = js.undefined
  
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var maxSearchResults: js.UndefOr[Double] = js.undefined
  
  var menuCloseDelay: js.UndefOr[Double] = js.undefined
  
  var menuProps: js.UndefOr[Any] = js.undefined
  
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ Double, Unit]] = js.undefined
  
  var onUpdateInput: js.UndefOr[js.Function2[/* searchText */ String, /* dataSource */ js.Array[DataItem], Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var popoverProps: js.UndefOr[PopoverProps] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var targetOrigin: js.UndefOr[origin] = js.undefined
  
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
}
object AutoCompleteProps {
  
  inline def apply[DataItem](dataSource: js.Array[DataItem]): AutoCompleteProps[DataItem] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps[DataItem]]
  }
  
  extension [Self <: AutoCompleteProps[?], DataItem](x: Self & AutoCompleteProps[DataItem]) {
    
    inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDataSource(value: js.Array[DataItem]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfig(value: Text): Self = StObject.set(x, "dataSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfigUndefined: Self = StObject.set(x, "dataSourceConfig", js.undefined)
    
    inline def setDataSourceVarargs(value: DataItem*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setFilter(value: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    inline def setMaxSearchResults(value: Double): Self = StObject.set(x, "maxSearchResults", value.asInstanceOf[js.Any])
    
    inline def setMaxSearchResultsUndefined: Self = StObject.set(x, "maxSearchResults", js.undefined)
    
    inline def setMenuCloseDelay(value: Double): Self = StObject.set(x, "menuCloseDelay", value.asInstanceOf[js.Any])
    
    inline def setMenuCloseDelayUndefined: Self = StObject.set(x, "menuCloseDelay", js.undefined)
    
    inline def setMenuProps(value: Any): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
    
    inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
    
    inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
    
    inline def setOnNewRequest(value: (/* chosenRequest */ DataItem, /* index */ Double) => Callback): Self = StObject.set(x, "onNewRequest", js.Any.fromFunction2((t0: /* chosenRequest */ DataItem, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnNewRequestUndefined: Self = StObject.set(x, "onNewRequest", js.undefined)
    
    inline def setOnUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Callback): Self = StObject.set(x, "onUpdateInput", js.Any.fromFunction2((t0: /* searchText */ String, t1: /* dataSource */ js.Array[DataItem]) => (value(t0, t1)).runNow()))
    
    inline def setOnUpdateInputUndefined: Self = StObject.set(x, "onUpdateInput", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
    
    inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPopoverProps(value: PopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
    
    inline def setTextFieldStyle(value: CSSProperties): Self = StObject.set(x, "textFieldStyle", value.asInstanceOf[js.Any])
    
    inline def setTextFieldStyleUndefined: Self = StObject.set(x, "textFieldStyle", js.undefined)
  }
}
