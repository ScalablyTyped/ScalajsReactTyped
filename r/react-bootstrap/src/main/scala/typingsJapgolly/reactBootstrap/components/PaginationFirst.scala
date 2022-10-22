package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPaginationFirstMod.PaginationFirstProps
import typingsJapgolly.reactBootstrap.libPaginationFirstMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationFirst {
  
  @JSImport("react-bootstrap/lib/PaginationFirst", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PaginationFirst.type): SharedBuilder_PaginationFirstProps_737800291[^] = new SharedBuilder_PaginationFirstProps_737800291[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationFirstProps): SharedBuilder_PaginationFirstProps_737800291[^] = new SharedBuilder_PaginationFirstProps_737800291[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
