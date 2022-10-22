package typingsJapgolly.reactRemoveScroll.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactRemoveScroll.distEs5TypesMod.IRemoveScrollProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Combination {
  
  def apply(p: IRemoveScrollProps & RefAttributes[HTMLElement]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-remove-scroll/dist/es5/Combination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Combination.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
