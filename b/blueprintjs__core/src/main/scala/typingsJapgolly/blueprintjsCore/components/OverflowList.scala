package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmComponentsOverflowListOverflowListMod.IOverflowListProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverflowList {
  
  inline def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => Node,
    visibleItemRenderer: (T, Double) => ReactChild
  ): Builder[T] = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[IOverflowListProps[T]]))
  }
  
  @JSImport("@blueprintjs/core", "OverflowList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.OverflowList[T]] {
    
    inline def alwaysRenderOverflow(value: Boolean): this.type = set("alwaysRenderOverflow", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    inline def minVisibleItems(value: Double): this.type = set("minVisibleItems", value.asInstanceOf[js.Any])
    
    inline def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
    
    inline def onOverflow(value: /* overflowItems */ js.Array[T] => Callback): this.type = set("onOverflow", js.Any.fromFunction1((t0: /* overflowItems */ js.Array[T]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
    ): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: IOverflowListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
