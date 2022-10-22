package typingsJapgolly.reactMdDialog.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactMdDialog.typesNestedDialogContextMod.NestedDialogContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestedDialogContextProvider {
  
  @JSImport("@react-md/dialog", "NestedDialogContextProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NestedDialogContextProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NestedDialogContextProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
