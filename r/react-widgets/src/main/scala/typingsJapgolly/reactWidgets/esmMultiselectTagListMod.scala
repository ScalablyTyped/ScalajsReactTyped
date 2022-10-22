package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.anon.Item
import typingsJapgolly.reactWidgets.esmAccessorsMod.TextAccessorFn
import typingsJapgolly.reactWidgets.esmMultiselectTagMod.MultiselectTagProps
import typingsJapgolly.reactWidgets.esmTypesMod.DataItem
import typingsJapgolly.reactWidgets.esmTypesMod.RenderProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMultiselectTagListMod {
  
  @JSImport("react-widgets/esm/MultiselectTagList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDataItem](
    hasIdValueTextAccessorLabelDisabledReadOnlyOnDeleteChildrenClearTagIconRenderTagValueTagOption: MultiselectTagListProps[TDataItem]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIdValueTextAccessorLabelDisabledReadOnlyOnDeleteChildrenClearTagIconRenderTagValueTagOption.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MultiselectTagListProps[TDataItem] extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var clearTagIcon: Node
    
    var disabled: js.UndefOr[js.Array[TDataItem] | Boolean] = js.undefined
    
    var focusedItem: js.UndefOr[TDataItem] = js.undefined
    
    var id: String
    
    var label: js.UndefOr[String] = js.undefined
    
    def onDelete(dataItem: TDataItem, event: ReactMouseEventFrom[HTMLButtonElement]): Unit
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderTagValue: js.UndefOr[RenderTagProp[TDataItem]] = js.undefined
    
    var tagOptionComponent: js.UndefOr[TagComponentProp] = js.undefined
    
    var textAccessor: TextAccessorFn
    
    var value: js.Array[TDataItem]
  }
  object MultiselectTagListProps {
    
    inline def apply[TDataItem](
      id: String,
      onDelete: (TDataItem, ReactMouseEventFrom[HTMLButtonElement]) => Callback,
      textAccessor: /* item */ DataItem => String,
      value: js.Array[TDataItem]
    ): MultiselectTagListProps[TDataItem] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onDelete = js.Any.fromFunction2((t0: TDataItem, t1: ReactMouseEventFrom[HTMLButtonElement]) => (onDelete(t0, t1)).runNow()), textAccessor = js.Any.fromFunction1(textAccessor), value = value.asInstanceOf[js.Any], clearTagIcon = null)
      __obj.asInstanceOf[MultiselectTagListProps[TDataItem]]
    }
    
    extension [Self <: MultiselectTagListProps[?], TDataItem](x: Self & MultiselectTagListProps[TDataItem]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClearTagIcon(value: VdomNode): Self = StObject.set(x, "clearTagIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearTagIconNull: Self = StObject.set(x, "clearTagIcon", null)
      
      inline def setClearTagIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "clearTagIcon", js.Array(value*))
      
      inline def setClearTagIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearTagIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: js.Array[TDataItem] | Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: TDataItem*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFocusedItem(value: TDataItem): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnDelete(value: (TDataItem, ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction2((t0: TDataItem, t1: ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderTagValue(value: Item[TDataItem] => Node): Self = StObject.set(x, "renderTagValue", js.Any.fromFunction1(value))
      
      inline def setRenderTagValueUndefined: Self = StObject.set(x, "renderTagValue", js.undefined)
      
      inline def setTagOptionComponent(value: TagComponentProp): Self = StObject.set(x, "tagOptionComponent", value.asInstanceOf[js.Any])
      
      inline def setTagOptionComponentUndefined: Self = StObject.set(x, "tagOptionComponent", js.undefined)
      
      inline def setTextAccessor(value: /* item */ DataItem => String): Self = StObject.set(x, "textAccessor", js.Any.fromFunction1(value))
      
      inline def setValue(value: js.Array[TDataItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: TDataItem*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type RenderTagProp[TDataItem] = RenderProp[Item[TDataItem]]
  
  type TagComponentProp = ComponentType[MultiselectTagProps]
}
