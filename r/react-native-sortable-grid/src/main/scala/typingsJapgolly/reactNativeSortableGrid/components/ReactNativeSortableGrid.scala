package typingsJapgolly.reactNativeSortableGrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSortableGrid.anon.Transform
import typingsJapgolly.reactNativeSortableGrid.mod.ItemOrder
import typingsJapgolly.reactNativeSortableGrid.mod.OrderedItem
import typingsJapgolly.reactNativeSortableGrid.mod.SortableGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSortableGrid {
  
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeBlockCenteringDuration(value: Double): this.type = set("activeBlockCenteringDuration", value.asInstanceOf[js.Any])
    
    inline def blockTransitionDuration(value: Double): this.type = set("blockTransitionDuration", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def doubleTapTreshold(value: Double): this.type = set("doubleTapTreshold", value.asInstanceOf[js.Any])
    
    inline def dragActivationThreshold(value: Double): this.type = set("dragActivationThreshold", value.asInstanceOf[js.Any])
    
    inline def dragStartAnimation(value: Transform): this.type = set("dragStartAnimation", value.asInstanceOf[js.Any])
    
    inline def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    inline def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    inline def itemsPerRow(value: Double): this.type = set("itemsPerRow", value.asInstanceOf[js.Any])
    
    inline def onDeleteItem(value: /* deletedItem */ OrderedItem => Callback): this.type = set("onDeleteItem", js.Any.fromFunction1((t0: /* deletedItem */ OrderedItem) => value(t0).runNow()))
    
    inline def onDragRelease(value: /* itemOrder */ ItemOrder => Callback): this.type = set("onDragRelease", js.Any.fromFunction1((t0: /* itemOrder */ ItemOrder) => value(t0).runNow()))
    
    inline def onDragStart(value: /* item */ OrderedItem => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* item */ OrderedItem) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: ReactNativeSortableGrid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SortableGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
