package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.ClearFieldContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearFieldContext {
  
  @JSImport("@orbit-ui/react-components", "ClearFieldContext")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClearFieldContext.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClearFieldContextProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
