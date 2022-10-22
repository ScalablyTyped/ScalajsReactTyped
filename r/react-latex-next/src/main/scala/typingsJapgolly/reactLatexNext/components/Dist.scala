package typingsJapgolly.reactLatexNext.components

import typingsJapgolly.reactLatexNext.distLatexMod.LatexProps
import typingsJapgolly.reactLatexNext.distMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dist {
  
  inline def apply(children: String): SharedBuilder_LatexProps_1159972252[default] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_LatexProps_1159972252[default](js.Array(this.component, __props.asInstanceOf[LatexProps]))
  }
  
  @JSImport("react-latex-next/dist", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LatexProps): SharedBuilder_LatexProps_1159972252[default] = new SharedBuilder_LatexProps_1159972252[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
