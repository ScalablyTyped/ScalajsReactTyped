package typingsJapgolly.slateReact.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.slateReact.distComponentsRestoreDomRestoreDomMod.RestoreDOMProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RestoreDOM {
  
  inline def apply(node: RefHandle[HTMLDivElement], receivedUserInput: RefHandle[Boolean]): Default[js.Object] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any], receivedUserInput = receivedUserInput.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RestoreDOMProps]))
  }
  
  @JSImport("slate-react/dist/components/restore-dom/restore-dom", "RestoreDOM")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RestoreDOMProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
