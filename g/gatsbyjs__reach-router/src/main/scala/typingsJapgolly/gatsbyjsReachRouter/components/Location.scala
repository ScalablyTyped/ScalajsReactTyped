package typingsJapgolly.gatsbyjsReachRouter.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachRouter.mod.LocationContext
import typingsJapgolly.reachRouter.mod.LocationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  inline def apply(children: /* context */ LocationContext => Node): Default[typingsJapgolly.gatsbyjsReachRouter.mod.Location] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[typingsJapgolly.gatsbyjsReachRouter.mod.Location](js.Array(this.component, __props.asInstanceOf[LocationProps]))
  }
  
  @JSImport("@gatsbyjs/reach-router", "Location")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocationProps): Default[typingsJapgolly.gatsbyjsReachRouter.mod.Location] = new Default[typingsJapgolly.gatsbyjsReachRouter.mod.Location](js.Array(this.component, p.asInstanceOf[js.Any]))
}
