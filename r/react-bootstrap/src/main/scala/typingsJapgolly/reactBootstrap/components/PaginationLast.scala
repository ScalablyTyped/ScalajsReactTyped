package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPaginationLastMod.PaginationLastProps
import typingsJapgolly.reactBootstrap.libPaginationLastMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationLast {
  
  @JSImport("react-bootstrap/lib/PaginationLast", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PaginationLast.type): SharedBuilder_PaginationLastProps_642784307[^] = new SharedBuilder_PaginationLastProps_642784307[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationLastProps): SharedBuilder_PaginationLastProps_642784307[^] = new SharedBuilder_PaginationLastProps_642784307[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
