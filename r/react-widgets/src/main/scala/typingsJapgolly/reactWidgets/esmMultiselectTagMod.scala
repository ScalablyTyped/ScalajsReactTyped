package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.esmTypesMod.DataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMultiselectTagMod {
  
  @JSImport("react-widgets/esm/MultiselectTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameChildrenStyleLabelDisabledReadOnlyOnRemoveClearTagIconDataItem: MultiselectTagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameChildrenStyleLabelDisabledReadOnlyOnRemoveClearTagIconDataItem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MultiselectTagProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearTagIcon: Node
    
    var dataItem: DataItem
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    def onRemove(dataItem: DataItem, event: ReactMouseEventFrom[HTMLButtonElement]): Unit
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object MultiselectTagProps {
    
    inline def apply(dataItem: DataItem, onRemove: (DataItem, ReactMouseEventFrom[HTMLButtonElement]) => Callback): MultiselectTagProps = {
      val __obj = js.Dynamic.literal(dataItem = dataItem.asInstanceOf[js.Any], onRemove = js.Any.fromFunction2((t0: DataItem, t1: ReactMouseEventFrom[HTMLButtonElement]) => (onRemove(t0, t1)).runNow()), children = null, clearTagIcon = null)
      __obj.asInstanceOf[MultiselectTagProps]
    }
    
    extension [Self <: MultiselectTagProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearTagIcon(value: VdomNode): Self = StObject.set(x, "clearTagIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearTagIconNull: Self = StObject.set(x, "clearTagIcon", null)
      
      inline def setClearTagIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "clearTagIcon", js.Array(value*))
      
      inline def setClearTagIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearTagIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataItem(value: DataItem): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnRemove(value: (DataItem, ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction2((t0: DataItem, t1: ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
