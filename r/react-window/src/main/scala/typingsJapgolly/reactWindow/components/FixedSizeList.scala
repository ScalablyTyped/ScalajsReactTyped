package typingsJapgolly.reactWindow.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactWindow.mod.CSSDirection
import typingsJapgolly.reactWindow.mod.Direction
import typingsJapgolly.reactWindow.mod.FixedSizeListProps
import typingsJapgolly.reactWindow.mod.Layout
import typingsJapgolly.reactWindow.mod.ListChildComponentProps
import typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps
import typingsJapgolly.reactWindow.mod.ListOnScrollProps
import typingsJapgolly.reactWindow.mod.ReactElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FixedSizeList {
  
  inline def apply[T](
    children: ComponentType[ListChildComponentProps[T]],
    height: Double | String,
    itemCount: Double,
    itemSize: Double,
    width: Double | String
  ): Builder[T] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[FixedSizeListProps[T]]))
  }
  
  @JSImport("react-window", "FixedSizeList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactWindow.mod.FixedSizeList[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def direction(value: CSSDirection | Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def initialScrollOffset(value: Double): this.type = set("initialScrollOffset", value.asInstanceOf[js.Any])
    
    inline def innerElementType(value: ReactElementType): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def innerTagName(value: String): this.type = set("innerTagName", value.asInstanceOf[js.Any])
    
    inline def itemData(value: T): this.type = set("itemData", value.asInstanceOf[js.Any])
    
    inline def itemKey(value: (/* index */ Double, T) => Key): this.type = set("itemKey", js.Any.fromFunction2(value))
    
    inline def layout(value: Layout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def onItemsRendered(value: /* props */ ListOnItemsRenderedProps => Any): this.type = set("onItemsRendered", js.Any.fromFunction1(value))
    
    inline def onScroll(value: /* props */ ListOnScrollProps => Any): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def outerElementType(value: ReactElementType): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    inline def outerRef(value: Ref[Any]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    inline def outerRefFunction1(value: Any | Null => Callback): this.type = set("outerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def outerRefNull: this.type = set("outerRef", null)
    
    inline def outerTagName(value: String): this.type = set("outerTagName", value.asInstanceOf[js.Any])
    
    inline def overscanCount(value: Double): this.type = set("overscanCount", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def useIsScrolling(value: Boolean): this.type = set("useIsScrolling", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: FixedSizeListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
