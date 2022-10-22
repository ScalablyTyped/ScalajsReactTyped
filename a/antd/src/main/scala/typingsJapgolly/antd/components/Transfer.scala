package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.Direction
import typingsJapgolly.antd.anon.PartialTransferLocale
import typingsJapgolly.antd.anon.SelectedCount
import typingsJapgolly.antd.libTransferInterfaceMod.PaginationType
import typingsJapgolly.antd.libTransferListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.libTransferListMod.TransferListProps
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import typingsJapgolly.antd.libTransferMod.ListStyle
import typingsJapgolly.antd.libTransferMod.RenderResult
import typingsJapgolly.antd.libTransferMod.SelectAllLabel
import typingsJapgolly.antd.libTransferMod.TransferDirection
import typingsJapgolly.antd.libTransferMod.TransferItem
import typingsJapgolly.antd.libTransferMod.TransferProps
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transfer {
  
  inline def apply[RecordType /* <: TransferItem */](dataSource: js.Array[RecordType]): Builder[RecordType] = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferProps[RecordType]]))
  }
  
  object List {
    
    inline def apply[RecordType /* <: KeyWiseTransferItem */](
      checkedKeys: js.Array[String],
      dataSource: js.Array[RecordType],
      direction: TransferDirection,
      handleClear: Callback,
      handleFilter: ReactEventFrom[HTMLInputElement] => Callback,
      itemUnit: String,
      itemsUnit: String,
      onItemSelect: (String, Boolean) => Callback,
      onItemSelectAll: (js.Array[String], Boolean) => Callback,
      onScroll: ReactUIEventFrom[HTMLUListElement] => Callback,
      prefixCls: String,
      searchPlaceholder: String
    ): typingsJapgolly.antd.components.Transfer.List.Builder[RecordType] = {
      val __props = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = handleClear.toJsFn, handleFilter = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => handleFilter(t0).runNow()), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2((t0: String, t1: Boolean) => (onItemSelect(t0, t1)).runNow()), onItemSelectAll = js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (onItemSelectAll(t0, t1)).runNow()), onScroll = js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLUListElement]) => onScroll(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any])
      new typingsJapgolly.antd.components.Transfer.List.Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferListProps[RecordType]]))
    }
    
    @JSImport("antd", "Transfer.List")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[RecordType /* <: KeyWiseTransferItem */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.antd.mod.Transfer.List[RecordType]] {
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def filterOption(value: (/* filterText */ String, RecordType) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
      
      inline def footer(
        value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction]) => japgolly.scalajs.react.facade.React.Node
      ): this.type = set("footer", js.Any.fromFunction2(value))
      
      inline def notFoundContent(
        value: japgolly.scalajs.react.facade.React.Node | js.Array[japgolly.scalajs.react.facade.React.Node]
      ): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
      
      inline def notFoundContentNull: this.type = set("notFoundContent", null)
      
      inline def notFoundContentVarargs(
        value: (japgolly.scalajs.react.facade.React.Element | japgolly.scalajs.react.facade.Empty | JsNumber | japgolly.scalajs.react.facade.React.Node | String)*
      ): this.type = set("notFoundContent", js.Array(value*))
      
      inline def notFoundContentVdomElement(value: VdomElement): this.type = set("notFoundContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def onItemRemove(value: /* keys */ js.Array[String] => Callback): this.type = set("onItemRemove", js.Any.fromFunction1((t0: /* keys */ js.Array[String]) => value(t0).runNow()))
      
      inline def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
      
      inline def remove(value: String): this.type = set("remove", value.asInstanceOf[js.Any])
      
      inline def removeAll(value: String): this.type = set("removeAll", value.asInstanceOf[js.Any])
      
      inline def removeCurrent(value: String): this.type = set("removeCurrent", value.asInstanceOf[js.Any])
      
      inline def render(value: RecordType => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
      
      inline def renderList(value: /* props */ TransferListBodyProps[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("renderList", js.Any.fromFunction1(value))
      
      inline def selectAll(value: String): this.type = set("selectAll", value.asInstanceOf[js.Any])
      
      inline def selectAllLabel(value: SelectAllLabel): this.type = set("selectAllLabel", value.asInstanceOf[js.Any])
      
      inline def selectAllLabelFunction1(value: /* info */ SelectedCount => japgolly.scalajs.react.facade.React.Node): this.type = set("selectAllLabel", js.Any.fromFunction1(value))
      
      inline def selectAllLabelNull: this.type = set("selectAllLabel", null)
      
      inline def selectAllLabelVarargs(
        value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
      ): this.type = set("selectAllLabel", js.Array(value*))
      
      inline def selectAllLabelVdomElement(value: VdomElement): this.type = set("selectAllLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def selectCurrent(value: String): this.type = set("selectCurrent", value.asInstanceOf[js.Any])
      
      inline def selectInvert(value: String): this.type = set("selectInvert", value.asInstanceOf[js.Any])
      
      inline def showRemove(value: Boolean): this.type = set("showRemove", value.asInstanceOf[js.Any])
      
      inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
      
      inline def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def titleText(value: VdomNode): this.type = set("titleText", value.rawNode.asInstanceOf[js.Any])
      
      inline def titleTextNull: this.type = set("titleText", null)
      
      inline def titleTextVarargs(
        value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
      ): this.type = set("titleText", js.Array(value*))
      
      inline def titleTextVdomElement(value: VdomElement): this.type = set("titleText", value.rawElement.asInstanceOf[js.Any])
      
      inline def titles(value: js.Array[japgolly.scalajs.react.facade.React.Node]): this.type = set("titles", value.asInstanceOf[js.Any])
      
      inline def titlesVarargs(value: japgolly.scalajs.react.facade.React.Node*): this.type = set("titles", js.Array(value*))
    }
    
    def withProps[RecordType /* <: KeyWiseTransferItem */](p: TransferListProps[RecordType]): typingsJapgolly.antd.components.Transfer.List.Builder[RecordType] = new typingsJapgolly.antd.components.Transfer.List.Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Transfer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RecordType /* <: TransferItem */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antd.mod.Transfer[RecordType]] {
    
    inline def children(value: /* props */ TransferListBodyProps[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def filterOption(value: (/* inputValue */ String, RecordType) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
    
    inline def footer(
      value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("footer", js.Any.fromFunction2(value))
    
    inline def listStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def listStyleFunction1(value: /* style */ ListStyle => CSSProperties): this.type = set("listStyle", js.Any.fromFunction1(value))
    
    inline def locale(value: PartialTransferLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* targetKeys */ js.Array[String], t1: /* direction */ TransferDirection, t2: /* moveKeys */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
    
    inline def onScroll(value: (/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLUListElement]) => Callback): this.type = set("onScroll", js.Any.fromFunction2((t0: /* direction */ TransferDirection, t1: /* e */ ReactEventFrom[HTMLUListElement]) => (value(t0, t1)).runNow()))
    
    inline def onSearch(value: (/* direction */ TransferDirection, /* value */ String) => Callback): this.type = set("onSearch", js.Any.fromFunction2((t0: /* direction */ TransferDirection, t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def onSelectChange(
      value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Callback
    ): this.type = set("onSelectChange", js.Any.fromFunction2((t0: /* sourceSelectedKeys */ js.Array[String], t1: /* targetSelectedKeys */ js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def oneWay(value: Boolean): this.type = set("oneWay", value.asInstanceOf[js.Any])
    
    inline def operationStyle(value: CSSProperties): this.type = set("operationStyle", value.asInstanceOf[js.Any])
    
    inline def operations(value: js.Array[String]): this.type = set("operations", value.asInstanceOf[js.Any])
    
    inline def operationsVarargs(value: String*): this.type = set("operations", js.Array(value*))
    
    inline def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def render(value: RecordType => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def rowKey(value: RecordType => String): this.type = set("rowKey", js.Any.fromFunction1(value))
    
    inline def selectAllLabels(value: js.Array[SelectAllLabel]): this.type = set("selectAllLabels", value.asInstanceOf[js.Any])
    
    inline def selectAllLabelsVarargs(value: SelectAllLabel*): this.type = set("selectAllLabels", js.Array(value*))
    
    inline def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    inline def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value*))
    
    inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    inline def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetKeys(value: js.Array[String]): this.type = set("targetKeys", value.asInstanceOf[js.Any])
    
    inline def targetKeysVarargs(value: String*): this.type = set("targetKeys", js.Array(value*))
    
    inline def titles(value: js.Array[japgolly.scalajs.react.facade.React.Node]): this.type = set("titles", value.asInstanceOf[js.Any])
    
    inline def titlesVarargs(value: japgolly.scalajs.react.facade.React.Node*): this.type = set("titles", js.Array(value*))
  }
  
  def withProps[RecordType /* <: TransferItem */](p: TransferProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
