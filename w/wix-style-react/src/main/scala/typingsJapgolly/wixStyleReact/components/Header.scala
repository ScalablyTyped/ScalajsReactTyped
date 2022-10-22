package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.HeaderProps
import typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("wix-style-react/dist/types/Card/Header", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Header.type): SharedBuilder_HeaderProps1894569066[default] = new SharedBuilder_HeaderProps1894569066[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderProps): SharedBuilder_HeaderProps1894569066[default] = new SharedBuilder_HeaderProps1894569066[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
