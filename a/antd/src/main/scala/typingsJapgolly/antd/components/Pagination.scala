package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationProps
import typingsJapgolly.rcPagination.mod.PaginationLocale
import typingsJapgolly.rcPagination.rcPaginationStrings.`jump-next`
import typingsJapgolly.rcPagination.rcPaginationStrings.`jump-prev`
import typingsJapgolly.rcPagination.rcPaginationStrings.next
import typingsJapgolly.rcPagination.rcPaginationStrings.page
import typingsJapgolly.rcPagination.rcPaginationStrings.prev
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("antd", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    inline def defaultCurrent(value: Double): this.type = set("defaultCurrent", value.asInstanceOf[js.Any])
    
    inline def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def hideOnSinglePage(value: Boolean): this.type = set("hideOnSinglePage", value.asInstanceOf[js.Any])
    
    inline def itemRender(
      value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ japgolly.scalajs.react.facade.React.Node) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("itemRender", js.Any.fromFunction3(value))
    
    inline def jumpNextIcon(value: ComponentType[js.Object] | japgolly.scalajs.react.facade.React.Node): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    
    inline def jumpNextIconNull: this.type = set("jumpNextIcon", null)
    
    inline def jumpNextIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("jumpNextIcon", js.Array(value*))
    
    inline def jumpNextIconVdomElement(value: VdomElement): this.type = set("jumpNextIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def jumpPrevIcon(value: ComponentType[js.Object] | japgolly.scalajs.react.facade.React.Node): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    
    inline def jumpPrevIconNull: this.type = set("jumpPrevIcon", null)
    
    inline def jumpPrevIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("jumpPrevIcon", js.Array(value*))
    
    inline def jumpPrevIconVdomElement(value: VdomElement): this.type = set("jumpPrevIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def locale(value: PaginationLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def nextIcon(value: ComponentType[js.Object] | japgolly.scalajs.react.facade.React.Node): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    
    inline def nextIconNull: this.type = set("nextIcon", null)
    
    inline def nextIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("nextIcon", js.Array(value*))
    
    inline def nextIconVdomElement(value: VdomElement): this.type = set("nextIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* page */ Double, /* pageSize */ Double) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* page */ Double, t1: /* pageSize */ Double) => (value(t0, t1)).runNow()))
    
    inline def onShowSizeChange(value: (/* current */ Double, /* size */ Double) => Callback): this.type = set("onShowSizeChange", js.Any.fromFunction2((t0: /* current */ Double, t1: /* size */ Double) => (value(t0, t1)).runNow()))
    
    inline def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    inline def pageSizeOptions(value: js.Array[Double | String]): this.type = set("pageSizeOptions", value.asInstanceOf[js.Any])
    
    inline def pageSizeOptionsVarargs(value: (Double | String)*): this.type = set("pageSizeOptions", js.Array(value*))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def prevIcon(value: ComponentType[js.Object] | japgolly.scalajs.react.facade.React.Node): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    
    inline def prevIconNull: this.type = set("prevIcon", null)
    
    inline def prevIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("prevIcon", js.Array(value*))
    
    inline def prevIconVdomElement(value: VdomElement): this.type = set("prevIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def selectComponentClass(value: ComponentType[js.Object]): this.type = set("selectComponentClass", value.asInstanceOf[js.Any])
    
    inline def selectPrefixCls(value: String): this.type = set("selectPrefixCls", value.asInstanceOf[js.Any])
    
    inline def showLessItems(value: Boolean): this.type = set("showLessItems", value.asInstanceOf[js.Any])
    
    inline def showPrevNextJumpers(value: Boolean): this.type = set("showPrevNextJumpers", value.asInstanceOf[js.Any])
    
    inline def showQuickJumper(value: Boolean | js.Object): this.type = set("showQuickJumper", value.asInstanceOf[js.Any])
    
    inline def showSizeChanger(value: Boolean): this.type = set("showSizeChanger", value.asInstanceOf[js.Any])
    
    inline def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    inline def showTotal(
      value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("showTotal", js.Any.fromFunction2(value))
    
    inline def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    inline def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
    
    inline def totalBoundaryShowSizeChanger(value: Double): this.type = set("totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pagination.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
