package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.gestalt.anon.Data
import typingsJapgolly.gestalt.anon.From
import typingsJapgolly.gestalt.gestaltBooleans.`false`
import typingsJapgolly.gestalt.gestaltStrings.basic
import typingsJapgolly.gestalt.gestaltStrings.basicCentered
import typingsJapgolly.gestalt.gestaltStrings.flexible
import typingsJapgolly.gestalt.gestaltStrings.serverRenderedFlexible
import typingsJapgolly.gestalt.gestaltStrings.uniformRow
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasonryProps[T] extends StObject {
  
  var Item: ComponentType[Data[T]]
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var flexible: js.UndefOr[Boolean] = js.undefined
  
  var gutterWidth: js.UndefOr[Double] = js.undefined
  
  var items: js.Array[T]
  
  var layout: js.UndefOr[basic | basicCentered | flexible | serverRenderedFlexible | uniformRow] = js.undefined
  
  var loadItems: js.UndefOr[
    `false` | (js.Function1[/* _arg */ js.UndefOr[From], js.UndefOr[Boolean | js.Object]])
  ] = js.undefined
  
  var measurementStore: js.UndefOr[Any] = js.undefined
  
  var minCols: js.UndefOr[Double] = js.undefined
  
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var virtualBoundsBottom: js.UndefOr[Double] = js.undefined
  
  var virtualBoundsTop: js.UndefOr[Double] = js.undefined
  
  var virtualize: js.UndefOr[Boolean] = js.undefined
}
object MasonryProps {
  
  inline def apply[T](Item: ComponentType[Data[T]], items: js.Array[T]): MasonryProps[T] = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps[T]]
  }
  
  extension [Self <: MasonryProps[?], T](x: Self & MasonryProps[T]) {
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setFlexible(value: Boolean): Self = StObject.set(x, "flexible", value.asInstanceOf[js.Any])
    
    inline def setFlexibleUndefined: Self = StObject.set(x, "flexible", js.undefined)
    
    inline def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
    
    inline def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
    
    inline def setItem(value: ComponentType[Data[T]]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayout(value: basic | basicCentered | flexible | serverRenderedFlexible | uniformRow): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoadItems(value: `false` | (js.Function1[/* _arg */ js.UndefOr[From], js.UndefOr[Boolean | js.Object]])): Self = StObject.set(x, "loadItems", value.asInstanceOf[js.Any])
    
    inline def setLoadItemsFunction1(value: /* _arg */ js.UndefOr[From] => js.UndefOr[Boolean | js.Object]): Self = StObject.set(x, "loadItems", js.Any.fromFunction1(value))
    
    inline def setLoadItemsUndefined: Self = StObject.set(x, "loadItems", js.undefined)
    
    inline def setMeasurementStore(value: Any): Self = StObject.set(x, "measurementStore", value.asInstanceOf[js.Any])
    
    inline def setMeasurementStoreUndefined: Self = StObject.set(x, "measurementStore", js.undefined)
    
    inline def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
    
    inline def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
    
    inline def setScrollContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "scrollContainer", value.toJsFn)
    
    inline def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
    
    inline def setVirtualBoundsBottom(value: Double): Self = StObject.set(x, "virtualBoundsBottom", value.asInstanceOf[js.Any])
    
    inline def setVirtualBoundsBottomUndefined: Self = StObject.set(x, "virtualBoundsBottom", js.undefined)
    
    inline def setVirtualBoundsTop(value: Double): Self = StObject.set(x, "virtualBoundsTop", value.asInstanceOf[js.Any])
    
    inline def setVirtualBoundsTopUndefined: Self = StObject.set(x, "virtualBoundsTop", js.undefined)
    
    inline def setVirtualize(value: Boolean): Self = StObject.set(x, "virtualize", value.asInstanceOf[js.Any])
    
    inline def setVirtualizeUndefined: Self = StObject.set(x, "virtualize", js.undefined)
  }
}
