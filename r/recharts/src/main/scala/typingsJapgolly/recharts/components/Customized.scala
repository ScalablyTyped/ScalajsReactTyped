package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.CustomizedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Customized {
  
  inline def apply(component: ContentRenderer[Any] | Element): Default[typingsJapgolly.recharts.mod.Customized] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Default[typingsJapgolly.recharts.mod.Customized](js.Array(this.component, __props.asInstanceOf[CustomizedProps]))
  }
  
  @JSImport("recharts", "Customized")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CustomizedProps): Default[typingsJapgolly.recharts.mod.Customized] = new Default[typingsJapgolly.recharts.mod.Customized](js.Array(this.component, p.asInstanceOf[js.Any]))
}
