package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesFailWhaleMod.FailWhaleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FailWhale {
  
  @JSImport("wix-style-react", "FailWhale")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FailWhale.type): Default[typingsJapgolly.wixStyleReact.mod.FailWhale] = new Default[typingsJapgolly.wixStyleReact.mod.FailWhale](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FailWhaleProps): Default[typingsJapgolly.wixStyleReact.mod.FailWhale] = new Default[typingsJapgolly.wixStyleReact.mod.FailWhale](js.Array(this.component, p.asInstanceOf[js.Any]))
}
