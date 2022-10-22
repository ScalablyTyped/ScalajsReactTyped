package typingsJapgolly.reactScrollbar.components

import typingsJapgolly.reactScrollbar.ScrollAreaProps
import typingsJapgolly.reactScrollbar.distNoCssMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoCss {
  
  @JSImport("react-scrollbar/dist/no-css", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NoCss.type): SharedBuilder_ScrollAreaProps1626082308[^] = new SharedBuilder_ScrollAreaProps1626082308[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollAreaProps): SharedBuilder_ScrollAreaProps1626082308[^] = new SharedBuilder_ScrollAreaProps1626082308[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
