package typingsJapgolly.themeUiMdx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.themeUiMdx.distDeclarationsSrcMod.MDXProviderComponents
import typingsJapgolly.themeUiMdx.distDeclarationsSrcMod.MdxProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MDXProvider {
  
  @JSImport("@theme-ui/mdx/dist/theme-ui-mdx.cjs", "MDXProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def components(value: MDXProviderComponents): this.type = set("components", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MDXProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MdxProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
