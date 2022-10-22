package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.antd.anon.OmitEllipsisConfigexpanda
import typingsJapgolly.antd.libTypographyBaseMod.BlockProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyTextMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait TextProps
    extends StObject
       with BlockProps {
    
    @JSName("ellipsis")
    var ellipsis_TextProps: js.UndefOr[Boolean | OmitEllipsisConfigexpanda] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]], Unit]] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setEllipsis(value: Boolean | OmitEllipsisConfigexpanda): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyTextMod.foo` */
  override def _to: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = default
}
