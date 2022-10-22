package typingsJapgolly.storybookRouter.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookRouter.mod.LocationProps
import typingsJapgolly.storybookRouter.mod.RenderData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  inline def apply(children: RenderData => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LocationProps]))
  }
  
  @JSImport("@storybook/router", "Location")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocationProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
