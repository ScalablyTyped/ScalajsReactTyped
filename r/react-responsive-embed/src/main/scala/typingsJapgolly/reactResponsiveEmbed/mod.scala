package typingsJapgolly.reactResponsiveEmbed

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.IframeHTMLAttributes
import typingsJapgolly.reactResponsiveEmbed.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-responsive-embed", JSImport.Namespace)
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type Props = Ratio & (DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement])
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentType[Props] = ^
}
