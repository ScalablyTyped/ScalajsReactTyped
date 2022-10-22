package typingsJapgolly.rcMotion.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcMotion.esDomWrapperMod.DomWrapperProps
import typingsJapgolly.rcMotion.esDomWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomWrapper {
  
  @JSImport("rc-motion/es/DomWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DomWrapper.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DomWrapperProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
