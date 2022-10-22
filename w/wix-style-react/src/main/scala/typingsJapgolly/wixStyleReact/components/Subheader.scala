package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.SubheaderProps
import typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subheader {
  
  @JSImport("wix-style-react/dist/types/Card/Subheader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Subheader.type): SharedBuilder_SubheaderProps2121917547[default] = new SharedBuilder_SubheaderProps2121917547[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SubheaderProps): SharedBuilder_SubheaderProps2121917547[default] = new SharedBuilder_SubheaderProps2121917547[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
