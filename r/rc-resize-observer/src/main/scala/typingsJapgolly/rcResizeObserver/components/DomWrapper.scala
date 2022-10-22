package typingsJapgolly.rcResizeObserver.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcResizeObserver.esSingleObserverDomWrapperMod.DomWrapperProps
import typingsJapgolly.rcResizeObserver.esSingleObserverDomWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomWrapper {
  
  @JSImport("rc-resize-observer/es/SingleObserver/DomWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DomWrapper.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DomWrapperProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
