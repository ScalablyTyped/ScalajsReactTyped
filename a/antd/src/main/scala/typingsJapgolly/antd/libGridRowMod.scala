package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.anon.PartialRecordBreakpointnu
import typingsJapgolly.antd.antdStrings.`space-around`
import typingsJapgolly.antd.antdStrings.`space-between`
import typingsJapgolly.antd.antdStrings.`space-evenly`
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.end
import typingsJapgolly.antd.antdStrings.middle
import typingsJapgolly.antd.antdStrings.start
import typingsJapgolly.antd.antdStrings.stretch
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridRowMod extends Shortcut {
  
  @JSImport("antd/lib/grid/row", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]] = js.native
  
  type Gutter = js.UndefOr[Double | PartialRecordBreakpointnu]
  
  trait RowProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[top | middle | bottom | stretch] = js.undefined
    
    var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.undefined
    
    var justify: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setAlign(value: top | middle | bottom | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setJustify(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libGridRowMod.foo` */
  override def _to: ForwardRefExoticComponent[RowProps & RefAttributes[HTMLDivElement]] = default
}
