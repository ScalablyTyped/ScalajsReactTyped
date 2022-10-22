package typingsJapgolly.reactResizable.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactResizable.mod.ResizableBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object ResizableBox {
  
  def apply(p: ResizableBoxProps): Default[typingsJapgolly.reactResizable.mod.ResizableBox] = new Default[typingsJapgolly.reactResizable.mod.ResizableBox](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-resizable", "ResizableBox")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ResizableBox.type): Default[typingsJapgolly.reactResizable.mod.ResizableBox] = new Default[typingsJapgolly.reactResizable.mod.ResizableBox](js.Array(this.component, js.Dictionary.empty))()
}
