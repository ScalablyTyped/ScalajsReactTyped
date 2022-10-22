package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.checked
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.hasError
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.indeterminate
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListHeaderMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TableListHeader", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TableListHeaderProps] = js.native
  
  trait PopoverPropsWithContent
    extends StObject
       with PopoverCommonProps {
    
    var content: js.UndefOr[Node] = js.undefined
  }
  object PopoverPropsWithContent {
    
    inline def apply(): PopoverPropsWithContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverPropsWithContent]
    }
    
    extension [Self <: PopoverPropsWithContent](x: Self) {
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TableListHeaderColumn extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var infoTooltipProps: js.UndefOr[PopoverPropsWithContent] = js.undefined
    
    var sortDescending: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Node] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object TableListHeaderColumn {
    
    inline def apply(): TableListHeaderColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableListHeaderColumn]
    }
    
    extension [Self <: TableListHeaderColumn](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setInfoTooltipProps(value: PopoverPropsWithContent): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TableListHeaderProps extends StObject {
    
    var checkboxState: js.UndefOr[normal | checked | indeterminate | hasError | disabled | hidden] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCheckboxChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSortChange: js.UndefOr[
        js.Function2[/* colNum */ Double, /* nativeEvent */ ReactMouseEventFrom[HTMLDivElement], Unit]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[TableListHeaderColumn]] = js.undefined
  }
  object TableListHeaderProps {
    
    inline def apply(): TableListHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableListHeaderProps]
    }
    
    extension [Self <: TableListHeaderProps](x: Self) {
      
      inline def setCheckboxState(value: normal | checked | indeterminate | hasError | disabled | hidden): Self = StObject.set(x, "checkboxState", value.asInstanceOf[js.Any])
      
      inline def setCheckboxStateUndefined: Self = StObject.set(x, "checkboxState", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCheckboxChange(value: Callback): Self = StObject.set(x, "onCheckboxChange", value.toJsFn)
      
      inline def setOnCheckboxChangeUndefined: Self = StObject.set(x, "onCheckboxChange", js.undefined)
      
      inline def setOnSortChange(value: (/* colNum */ Double, /* nativeEvent */ ReactMouseEventFrom[HTMLDivElement]) => Callback): Self = StObject.set(x, "onSortChange", js.Any.fromFunction2((t0: /* colNum */ Double, t1: /* nativeEvent */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnSortChangeUndefined: Self = StObject.set(x, "onSortChange", js.undefined)
      
      inline def setOptions(value: js.Array[TableListHeaderColumn]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: TableListHeaderColumn*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  type _To = ForwardRefExoticComponent[TableListHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTableListHeaderMod.foo` */
  override def _to: ForwardRefExoticComponent[TableListHeaderProps] = default
}
