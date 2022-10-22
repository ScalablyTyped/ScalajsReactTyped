package typingsJapgolly.reactWindow.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactWindow.anon.ColumnIndex
import typingsJapgolly.reactWindow.mod.CSSDirection
import typingsJapgolly.reactWindow.mod.GridChildComponentProps
import typingsJapgolly.reactWindow.mod.GridOnItemsRenderedProps
import typingsJapgolly.reactWindow.mod.GridOnScrollProps
import typingsJapgolly.reactWindow.mod.ReactElementType
import typingsJapgolly.reactWindow.mod.VariableSizeGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VariableSizeGrid {
  
  inline def apply[T](
    children: ComponentType[GridChildComponentProps[T]],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double
  ): Builder[T] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[VariableSizeGridProps[T]]))
  }
  
  @JSImport("react-window", "VariableSizeGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactWindow.mod.VariableSizeGrid[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def direction(value: CSSDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def estimatedColumnWidth(value: Double): this.type = set("estimatedColumnWidth", value.asInstanceOf[js.Any])
    
    inline def estimatedRowHeight(value: Double): this.type = set("estimatedRowHeight", value.asInstanceOf[js.Any])
    
    inline def initialScrollLeft(value: Double): this.type = set("initialScrollLeft", value.asInstanceOf[js.Any])
    
    inline def initialScrollTop(value: Double): this.type = set("initialScrollTop", value.asInstanceOf[js.Any])
    
    inline def innerElementType(value: ReactElementType): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def innerTagName(value: String): this.type = set("innerTagName", value.asInstanceOf[js.Any])
    
    inline def itemData(value: T): this.type = set("itemData", value.asInstanceOf[js.Any])
    
    inline def itemKey(value: /* params */ ColumnIndex[T] => Key): this.type = set("itemKey", js.Any.fromFunction1(value))
    
    inline def onItemsRendered(value: /* props */ GridOnItemsRenderedProps => Any): this.type = set("onItemsRendered", js.Any.fromFunction1(value))
    
    inline def onScroll(value: /* props */ GridOnScrollProps => Any): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def outerElementType(value: ReactElementType): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    inline def outerRef(value: Ref[Any]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    inline def outerRefFunction1(value: Any | Null => Callback): this.type = set("outerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def outerRefNull: this.type = set("outerRef", null)
    
    inline def outerTagName(value: String): this.type = set("outerTagName", value.asInstanceOf[js.Any])
    
    inline def overscanColumnCount(value: Double): this.type = set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    inline def overscanColumnsCount(value: Double): this.type = set("overscanColumnsCount", value.asInstanceOf[js.Any])
    
    inline def overscanCount(value: Double): this.type = set("overscanCount", value.asInstanceOf[js.Any])
    
    inline def overscanRowCount(value: Double): this.type = set("overscanRowCount", value.asInstanceOf[js.Any])
    
    inline def overscanRowsCount(value: Double): this.type = set("overscanRowsCount", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def useIsScrolling(value: Boolean): this.type = set("useIsScrolling", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: VariableSizeGridProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
