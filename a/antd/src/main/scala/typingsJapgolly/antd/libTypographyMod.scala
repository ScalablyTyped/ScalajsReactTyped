package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.antd.libTypographyLinkMod.LinkProps
import typingsJapgolly.antd.libTypographyParagraphMod.ParagraphProps
import typingsJapgolly.antd.libTypographyTextMod.TextProps
import typingsJapgolly.antd.libTypographyTitleMod.TitleProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyMod extends Shortcut {
  
  @JSImport("antd/lib/typography", JSImport.Default)
  @js.native
  val default: TypographyProps = js.native
  
  @js.native
  trait TypographyProps
    extends StObject
       with FunctionComponent[typingsJapgolly.antd.libTypographyTypographyMod.TypographyProps] {
    
    var Link: ForwardRefExoticComponent[LinkProps & RefAttributes[HTMLElement]] = js.native
    
    var Paragraph: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = js.native
    
    var Text: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = js.native
    
    var Title: ForwardRefExoticComponent[TitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  }
  
  type _To = TypographyProps
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyMod.foo` */
  override def _to: TypographyProps = default
}
