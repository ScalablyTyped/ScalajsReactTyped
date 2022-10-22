package typingsJapgolly.reactHelmetWithVisor.components

import typingsJapgolly.reactHelmetWithVisor.mod.HelmetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helmet {
  
  @JSImport("react-helmet-with-visor", "Helmet")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Helmet.type): SharedBuilder_HelmetProps_509520998[typingsJapgolly.reactHelmetWithVisor.mod.Helmet] = new SharedBuilder_HelmetProps_509520998[typingsJapgolly.reactHelmetWithVisor.mod.Helmet](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps_509520998[typingsJapgolly.reactHelmetWithVisor.mod.Helmet] = new SharedBuilder_HelmetProps_509520998[typingsJapgolly.reactHelmetWithVisor.mod.Helmet](js.Array(this.component, p.asInstanceOf[js.Any]))
}
