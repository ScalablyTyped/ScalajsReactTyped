package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libTypographyBaseMod.BlockProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyParagraphMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ParagraphProps
    extends StObject
       with BlockProps {
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]], Unit]] = js.undefined
  }
  object ParagraphProps {
    
    inline def apply(): ParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParagraphProps]
    }
    
    extension [Self <: ParagraphProps](x: Self) {
      
      inline def setOnClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyParagraphMod.foo` */
  override def _to: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = default
}
