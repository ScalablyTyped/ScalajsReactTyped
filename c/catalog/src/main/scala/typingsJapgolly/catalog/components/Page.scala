package typingsJapgolly.catalog.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("catalog", "Page")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Page.type): Default[typingsJapgolly.catalog.mod.Page] = new Default[typingsJapgolly.catalog.mod.Page](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[typingsJapgolly.catalog.mod.Page] = new Default[typingsJapgolly.catalog.mod.Page](js.Array(this.component, p.asInstanceOf[js.Any]))
}
