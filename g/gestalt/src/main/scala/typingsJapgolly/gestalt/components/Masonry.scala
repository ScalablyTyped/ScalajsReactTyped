package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Data
import typingsJapgolly.gestalt.anon.From
import typingsJapgolly.gestalt.gestaltBooleans.`false`
import typingsJapgolly.gestalt.gestaltStrings.basic
import typingsJapgolly.gestalt.gestaltStrings.basicCentered
import typingsJapgolly.gestalt.gestaltStrings.flexible
import typingsJapgolly.gestalt.gestaltStrings.serverRenderedFlexible
import typingsJapgolly.gestalt.gestaltStrings.uniformRow
import typingsJapgolly.gestalt.mod.MasonryProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Masonry {
  
  inline def apply(Item: ComponentType[Data[Any]], items: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MasonryProps[Any]]))
  }
  
  @JSImport("gestalt", "Masonry")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def columnWidth(value: Double): this.type = set("columnWidth", value.asInstanceOf[js.Any])
    
    inline def flexible(value: Boolean): this.type = set("flexible", value.asInstanceOf[js.Any])
    
    inline def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    inline def layout(value: basic | basicCentered | flexible | serverRenderedFlexible | uniformRow): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def loadItems(value: `false` | (js.Function1[/* _arg */ js.UndefOr[From], js.UndefOr[Boolean | js.Object]])): this.type = set("loadItems", value.asInstanceOf[js.Any])
    
    inline def loadItemsFunction1(value: /* _arg */ js.UndefOr[From] => js.UndefOr[Boolean | js.Object]): this.type = set("loadItems", js.Any.fromFunction1(value))
    
    inline def measurementStore(value: Any): this.type = set("measurementStore", value.asInstanceOf[js.Any])
    
    inline def minCols(value: Double): this.type = set("minCols", value.asInstanceOf[js.Any])
    
    inline def scrollContainer(value: CallbackTo[HTMLElement]): this.type = set("scrollContainer", value.toJsFn)
    
    inline def virtualBoundsBottom(value: Double): this.type = set("virtualBoundsBottom", value.asInstanceOf[js.Any])
    
    inline def virtualBoundsTop(value: Double): this.type = set("virtualBoundsTop", value.asInstanceOf[js.Any])
    
    inline def virtualize(value: Boolean): this.type = set("virtualize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MasonryProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
