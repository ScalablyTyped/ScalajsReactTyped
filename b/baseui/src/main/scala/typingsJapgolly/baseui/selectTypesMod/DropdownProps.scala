package typingsJapgolly.baseui.selectTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.anon.Item
import typingsJapgolly.baseui.menuTypesMod.OnItemSelectFn
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  var error: Boolean
  
  def getOptionLabel(a: typingsJapgolly.baseui.anon.Option): Node
  
  var id: js.UndefOr[String] = js.undefined
  
  var innerRef: Ref[HTMLElement]
  
  var isLoading: Boolean
  
  var keyboardControlNode: js.UndefOr[Ref[HTMLElement]] = js.undefined
  
  var labelKey: String
  
  var maxDropdownHeight: String
  
  var multi: Boolean
  
  var noResultsMsg: js.UndefOr[Node] = js.undefined
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Any]] = js.undefined
  
  var onItemSelect: OnItemSelectFn
  
  var options: Value
  
  var overrides: js.UndefOr[OverridesDropdown] = js.undefined
  
  var required: Boolean
  
  var searchable: Boolean
  
  var size: Size
  
  var `type`: Type
  
  var value: Value
  
  var valueKey: String
  
  var width: js.UndefOr[Double | Null] = js.undefined
}
object DropdownProps {
  
  inline def apply(
    error: Boolean,
    getOptionLabel: typingsJapgolly.baseui.anon.Option => Node,
    isLoading: Boolean,
    labelKey: String,
    maxDropdownHeight: String,
    multi: Boolean,
    onItemSelect: /* a */ Item => Any,
    options: Value,
    required: Boolean,
    searchable: Boolean,
    size: Size,
    `type`: Type,
    value: Value,
    valueKey: String
  ): DropdownProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), isLoading = isLoading.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any], innerRef = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
  
  extension [Self <: DropdownProps](x: Self) {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGetOptionLabel(value: typingsJapgolly.baseui.anon.Option => Node): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlNode(value: Ref[HTMLElement]): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlNodeFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "keyboardControlNode", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setKeyboardControlNodeNull: Self = StObject.set(x, "keyboardControlNode", null)
    
    inline def setKeyboardControlNodeUndefined: Self = StObject.set(x, "keyboardControlNode", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setNoResultsMsg(value: VdomNode): Self = StObject.set(x, "noResultsMsg", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNoResultsMsgNull: Self = StObject.set(x, "noResultsMsg", null)
    
    inline def setNoResultsMsgUndefined: Self = StObject.set(x, "noResultsMsg", js.undefined)
    
    inline def setNoResultsMsgVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noResultsMsg", js.Array(value*))
    
    inline def setNoResultsMsgVdomElement(value: VdomElement): Self = StObject.set(x, "noResultsMsg", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    inline def setOnItemSelect(value: /* a */ Item => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Value): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOverrides(value: OverridesDropdown): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Option*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
