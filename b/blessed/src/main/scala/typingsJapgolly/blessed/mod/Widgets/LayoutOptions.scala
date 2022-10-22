package typingsJapgolly.blessed.mod.Widgets

import japgolly.scalajs.react.Callback
import typingsJapgolly.blessed.blessedStrings.`inline-block`
import typingsJapgolly.blessed.blessedStrings.`inline`
import typingsJapgolly.blessed.blessedStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutOptions
  extends StObject
     with ElementOptions {
  
  /**
    * Using the default renderer, it provides two layouts: inline, and grid. inline is the default and will render
    * akin to inline-block. grid will create an automatic grid based on element dimensions. The grid cells'
    * width and height are always determined by the largest children in the layout.
    */
  var layout: `inline` | `inline-block` | grid
  
  /**
    * A callback which is called right before the children are iterated over to be rendered. Should return an
    * iterator callback which is called on each child element: iterator(el, i).
    */
  var renderer: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object LayoutOptions {
  
  inline def apply(layout: `inline` | `inline-block` | grid): LayoutOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  
  extension [Self <: LayoutOptions](x: Self) {
    
    inline def setLayout(value: `inline` | `inline-block` | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Callback): Self = StObject.set(x, "renderer", value.toJsFn)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
