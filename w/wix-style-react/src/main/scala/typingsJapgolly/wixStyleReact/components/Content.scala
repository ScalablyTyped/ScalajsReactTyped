package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.wixStyleReact.distTypesCardContentMod.ContentProps
import typingsJapgolly.wixStyleReact.distTypesCardContentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Content {
  
  @JSImport("wix-style-react/dist/types/Card/Content", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Content.type): SharedBuilder_ContentProps_1483963625[default] = new SharedBuilder_ContentProps_1483963625[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContentProps): SharedBuilder_ContentProps_1483963625[default] = new SharedBuilder_ContentProps_1483963625[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
