package typingsJapgolly.storybookRouter.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookRouter.mod.MatchProps
import typingsJapgolly.storybookRouter.mod.MatchingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Match {
  
  inline def apply(children: MatchingData => Node, path: String, startsWith: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MatchProps]))
  }
  
  @JSImport("@storybook/router", "Match")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MatchProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
