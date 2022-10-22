package typingsJapgolly.overlayscrollbars.anon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.overlayscrollbars.mod.BlockBehavior
import typingsJapgolly.overlayscrollbars.mod.JQuery
import typingsJapgolly.overlayscrollbars.mod.Margin
import typingsJapgolly.overlayscrollbars.mod.ScrollBehavior
import typingsJapgolly.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with _Coordinates {
  
  var block: js.UndefOr[BlockBehavior | `0` | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.undefined
  
  var el: HTMLElement | JQuery
  
  var margin: js.UndefOr[
    Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.undefined
  
  var scroll: js.UndefOr[ScrollBehavior | XY | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.undefined
}
object Block {
  
  inline def apply(el: HTMLElement | JQuery): Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: BlockBehavior | `0` | (js.Tuple2[BlockBehavior, BlockBehavior])): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setEl(value: HTMLElement | JQuery): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setScroll(value: ScrollBehavior | XY | (js.Tuple2[ScrollBehavior, ScrollBehavior])): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
