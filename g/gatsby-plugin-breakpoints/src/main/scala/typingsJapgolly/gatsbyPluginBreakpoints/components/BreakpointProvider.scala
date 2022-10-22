package typingsJapgolly.gatsbyPluginBreakpoints.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gatsbyPluginBreakpoints.mod.BreakpointProviderProps
import typingsJapgolly.gatsbyPluginBreakpoints.mod.QueriesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreakpointProvider {
  
  inline def apply(queries: QueriesObject): Default[js.Object] = {
    val __props = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BreakpointProviderProps]))
  }
  
  @JSImport("gatsby-plugin-breakpoints", "BreakpointProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BreakpointProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
