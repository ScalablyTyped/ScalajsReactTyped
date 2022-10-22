package typingsJapgolly.gatsbyImage.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gatsbyImage.withIEPolyfillMod.GatsbyImageWithIEPolyfillProps
import typingsJapgolly.gatsbyImage.withIEPolyfillMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object WithIEPolyfill {
  
  def apply(p: GatsbyImageWithIEPolyfillProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("gatsby-image/withIEPolyfill", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: WithIEPolyfill.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
}
