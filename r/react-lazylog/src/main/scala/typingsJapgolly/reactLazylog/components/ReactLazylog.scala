package typingsJapgolly.reactLazylog.components

import typingsJapgolly.reactLazylog.buildSearchBarMod.SearchBarProps
import typingsJapgolly.reactLazylog.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLazylog {
  
  @JSImport("react-lazylog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactLazylog.type): SharedBuilder_SearchBarProps_1864943061[default] = new SharedBuilder_SearchBarProps_1864943061[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchBarProps): SharedBuilder_SearchBarProps_1864943061[default] = new SharedBuilder_SearchBarProps_1864943061[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
