package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.antd.libTypographyTextMod.TextProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Text.type): SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps & RefAttributes[HTMLSpanElement]): SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
