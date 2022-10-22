package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.libListItemMod.ListItemMetaProps
import typingsJapgolly.antd.libListItemMod.ListItemProps
import typingsJapgolly.antd.libListMod.ListGridType
import typingsJapgolly.antd.libListMod.ListItemLayout
import typingsJapgolly.antd.libListMod.ListLocale
import typingsJapgolly.antd.libListMod.ListProps
import typingsJapgolly.antd.libListMod.ListSize
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ListProps[T]]))
  }
  
  object Item {
    
    object Meta {
      
      @JSImport("antd", "List.Item.Meta")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps1032327803 = new SharedBuilder_ListItemMetaProps1032327803(js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps1032327803 = new SharedBuilder_ListItemMetaProps1032327803(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "List.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemProps & RefAttributes[HTMLElement]): SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes_1011249451[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    inline def dataSourceVarargs(value: T*): this.type = set("dataSource", js.Array(value*))
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def grid(value: ListGridType): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def header(value: VdomNode): this.type = set("header", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def itemLayout(value: ListItemLayout): this.type = set("itemLayout", value.asInstanceOf[js.Any])
    
    inline def loadMore(value: VdomNode): this.type = set("loadMore", value.rawNode.asInstanceOf[js.Any])
    
    inline def loadMoreNull: this.type = set("loadMore", null)
    
    inline def loadMoreVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("loadMore", js.Array(value*))
    
    inline def loadMoreVdomElement(value: VdomElement): this.type = set("loadMore", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def locale(value: ListLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def pagination(value: PaginationConfig | `false`): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def renderItem(value: (T, /* index */ Double) => japgolly.scalajs.react.facade.React.Node): this.type = set("renderItem", js.Any.fromFunction2(value))
    
    inline def rowKey(value: (js.Function1[T, Key]) | (/* keyof T */ String)): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    inline def rowKeyFunction1(value: T => Key): this.type = set("rowKey", js.Any.fromFunction1(value))
    
    inline def size(value: ListSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def split(value: Boolean): this.type = set("split", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: ListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
