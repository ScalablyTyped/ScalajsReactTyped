package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactWidgets.anon.Action
import typingsJapgolly.reactWidgets.anon.Disabled
import typingsJapgolly.reactWidgets.anon.Group
import typingsJapgolly.reactWidgets.esmAccessorsMod.Accessors
import typingsJapgolly.reactWidgets.esmListMod.GroupBy
import typingsJapgolly.reactWidgets.esmListMod.ListHandle
import typingsJapgolly.reactWidgets.esmListMod.ListProps
import typingsJapgolly.reactWidgets.esmMessagesMod.UserProvidedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  inline def apply[TDataItem](
    accessors: Accessors,
    data: js.Array[TDataItem],
    onChange: (/* dataItem */ TDataItem | js.Array[TDataItem], /* metadata */ Action[TDataItem]) => Callback
  ): Builder[TDataItem] = {
    val __props = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: /* dataItem */ TDataItem | js.Array[TDataItem], t1: /* metadata */ Action[TDataItem]) => (onChange(t0, t1)).runNow()))
    new Builder[TDataItem](js.Array(this.component, __props.asInstanceOf[ListProps[TDataItem] & RefAttributes[ListHandle]]))
  }
  
  @JSImport("react-widgets/esm/List", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TDataItem] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[ListHandle] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean | js.Array[TDataItem]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledVarargs(value: TDataItem*): this.type = set("disabled", js.Array(value*))
    
    inline def elementRef(value: MutableRefObject[HTMLDivElement | Null]): this.type = set("elementRef", value.asInstanceOf[js.Any])
    
    inline def focusedItem(value: TDataItem): this.type = set("focusedItem", value.asInstanceOf[js.Any])
    
    inline def groupBy(value: GroupBy[TDataItem]): this.type = set("groupBy", value.asInstanceOf[js.Any])
    
    inline def groupByFunction1(value: TDataItem => Any): this.type = set("groupBy", js.Any.fromFunction1(value))
    
    inline def messages(value: UserProvidedMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def optionComponent(value: ElementType): this.type = set("optionComponent", value.asInstanceOf[js.Any])
    
    inline def renderGroup(value: Group => Node): this.type = set("renderGroup", js.Any.fromFunction1(value))
    
    inline def renderItem(value: Disabled[TDataItem] => Node): this.type = set("renderItem", js.Any.fromFunction1(value))
    
    inline def searchTerm(value: String): this.type = set("searchTerm", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[TDataItem] | TDataItem): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: TDataItem*): this.type = set("value", js.Array(value*))
  }
  
  def withProps[TDataItem](p: ListProps[TDataItem] & RefAttributes[ListHandle]): Builder[TDataItem] = new Builder[TDataItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
