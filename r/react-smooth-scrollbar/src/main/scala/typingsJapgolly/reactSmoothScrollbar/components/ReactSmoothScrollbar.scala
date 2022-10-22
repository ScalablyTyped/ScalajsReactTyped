package typingsJapgolly.reactSmoothScrollbar.components

import typingsJapgolly.reactSmoothScrollbar.mod.ScrollbarProps
import typingsJapgolly.reactSmoothScrollbar.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSmoothScrollbar {
  
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactSmoothScrollbar.type): SharedBuilder_ScrollbarProps1147487139[^] = new SharedBuilder_ScrollbarProps1147487139[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollbarProps): SharedBuilder_ScrollbarProps1147487139[^] = new SharedBuilder_ScrollbarProps1147487139[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
