package typingsJapgolly.gatsbyjsReachRouter.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachRouter.mod.MatchProps
import typingsJapgolly.reachRouter.mod.MatchRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Match {
  
  inline def apply[TParams](children: /* props */ MatchRenderProps[TParams] => Node, path: String): Builder[TParams] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    new Builder[TParams](js.Array(this.component, __props.asInstanceOf[MatchProps[TParams]]))
  }
  
  @JSImport("@gatsbyjs/reach-router", "Match")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TParams] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.gatsbyjsReachRouter.mod.Match[TParams]]
  
  def withProps[TParams](p: MatchProps[TParams]): Builder[TParams] = new Builder[TParams](js.Array(this.component, p.asInstanceOf[js.Any]))
}
