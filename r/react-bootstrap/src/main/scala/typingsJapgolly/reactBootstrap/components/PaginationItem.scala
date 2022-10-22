package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPaginationItemMod.PaginationItemProps
import typingsJapgolly.reactBootstrap.libPaginationItemMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationItem {
  
  @JSImport("react-bootstrap/lib/PaginationItem", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PaginationItem.type): SharedBuilder_PaginationItemProps1993546591[^] = new SharedBuilder_PaginationItemProps1993546591[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationItemProps): SharedBuilder_PaginationItemProps1993546591[^] = new SharedBuilder_PaginationItemProps1993546591[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
