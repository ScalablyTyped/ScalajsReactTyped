package typingsJapgolly.reactMdUtils.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantMovementProviderMod.ActiveDescendantMovementProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActiveDescendantMovementProvider {
  
  inline def apply(activeId: String, setActiveId: SetStateAction[String] => Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1((t0: SetStateAction[String]) => setActiveId(t0).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ActiveDescendantMovementProviderProps]))
  }
  
  @JSImport("@react-md/utils", "ActiveDescendantMovementProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ActiveDescendantMovementProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
