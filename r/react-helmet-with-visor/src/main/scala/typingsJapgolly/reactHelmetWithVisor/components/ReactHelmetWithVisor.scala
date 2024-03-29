package typingsJapgolly.reactHelmetWithVisor.components

import typingsJapgolly.reactHelmetWithVisor.mod.HelmetProps
import typingsJapgolly.reactHelmetWithVisor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHelmetWithVisor {
  
  @JSImport("react-helmet-with-visor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactHelmetWithVisor.type): SharedBuilder_HelmetProps_509520998[default] = new SharedBuilder_HelmetProps_509520998[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps_509520998[default] = new SharedBuilder_HelmetProps_509520998[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
