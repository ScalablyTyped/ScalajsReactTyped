package typingsJapgolly.reactNativeSortableList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSortableList.mod.DataByNumber
import typingsJapgolly.reactNativeSortableList.mod.DataByString
import typingsJapgolly.reactNativeSortableList.mod.RowProps
import typingsJapgolly.reactNativeSortableList.mod.SortableListProps
import typingsJapgolly.reactNativeSortableList.mod.default
import typingsJapgolly.reactNativeSortableList.reactNativeSortableListStrings.always
import typingsJapgolly.reactNativeSortableList.reactNativeSortableListStrings.handled
import typingsJapgolly.reactNativeSortableList.reactNativeSortableListStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSortableList {
  
  inline def apply[T, K](data: DataByNumber[T] | DataByString[T], renderRow: RowProps[T, K] => Element | Null): Builder[T, K] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    new Builder[T, K](js.Array(this.component, __props.asInstanceOf[SortableListProps[T, K]]))
  }
  
  @JSImport("react-native-sortable-list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T, K] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T, K]] {
    
    inline def autoscrollAreaSize(value: Double): this.type = set("autoscrollAreaSize", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def innerContainerStyle(value: StyleProp[ViewStyle]): this.type = set("innerContainerStyle", value.asInstanceOf[js.Any])
    
    inline def innerContainerStyleNull: this.type = set("innerContainerStyle", null)
    
    inline def keyboardShouldPersistTaps(value: never | always | handled): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def manuallyActivateRows(value: Boolean): this.type = set("manuallyActivateRows", value.asInstanceOf[js.Any])
    
    inline def onActivateRow(value: K => Callback): this.type = set("onActivateRow", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def onChangeOrder(value: /* nextOrder */ js.Array[K] => Callback): this.type = set("onChangeOrder", js.Any.fromFunction1((t0: /* nextOrder */ js.Array[K]) => value(t0).runNow()))
    
    inline def onPressRow(value: K => Callback): this.type = set("onPressRow", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def onReleaseRow(value: (K, /* currentOrder */ js.Array[K]) => Callback): this.type = set("onReleaseRow", js.Any.fromFunction2((t0: K, t1: /* currentOrder */ js.Array[K]) => (value(t0, t1)).runNow()))
    
    inline def order(value: js.Array[K]): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def orderVarargs(value: K*): this.type = set("order", js.Array(value*))
    
    inline def refreshControl(value: VdomElement): this.type = set("refreshControl", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderFooter(value: CallbackTo[Element]): this.type = set("renderFooter", value.toJsFn)
    
    inline def renderHeader(value: CallbackTo[Element]): this.type = set("renderHeader", value.toJsFn)
    
    inline def rowActivationTime(value: Double): this.type = set("rowActivationTime", value.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def showsVerticalScrollIndicator(value: Boolean): this.type = set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def sortingEnabled(value: Boolean): this.type = set("sortingEnabled", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps[T, K](p: SortableListProps[T, K]): Builder[T, K] = new Builder[T, K](js.Array(this.component, p.asInstanceOf[js.Any]))
}
