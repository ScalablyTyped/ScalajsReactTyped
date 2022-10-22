package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libTypographyLinkMod.LinkProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("antd/lib/typography/Link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinkProps & RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
