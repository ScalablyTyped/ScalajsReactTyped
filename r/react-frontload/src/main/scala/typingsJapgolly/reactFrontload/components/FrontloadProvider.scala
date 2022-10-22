package typingsJapgolly.reactFrontload.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFrontload.anon.Children
import typingsJapgolly.reactFrontload.mod.FrontloadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FrontloadProvider {
  
  inline def apply(children: Any, initialState: FrontloadState): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-frontload", "FrontloadProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
