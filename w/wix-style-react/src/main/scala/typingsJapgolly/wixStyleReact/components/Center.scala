package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.wixStyleReact.distTypesPageFooterCenterMod.CenterProps
import typingsJapgolly.wixStyleReact.distTypesPageFooterCenterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Center {
  
  @JSImport("wix-style-react/dist/types/PageFooter/Center", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Center.type): SharedBuilder_CenterProps_227782348[default] = new SharedBuilder_CenterProps_227782348[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CenterProps): SharedBuilder_CenterProps_227782348[default] = new SharedBuilder_CenterProps_227782348[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
