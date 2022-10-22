package typingsJapgolly.catalog.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.catalog.anon.PartialTheme
import typingsJapgolly.catalog.mod.Config
import typingsJapgolly.catalog.mod.ConfigPageOrGroup
import typingsJapgolly.catalog.mod.ConfigResponsiveSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Catalog {
  
  inline def apply(pages: js.Array[ConfigPageOrGroup], title: String): Builder = {
    val __props = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Config]))
  }
  
  @JSImport("catalog", "Catalog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.catalog.mod.Catalog] {
    
    inline def basePath(value: String): this.type = set("basePath", value.asInstanceOf[js.Any])
    
    inline def logoSrc(value: String): this.type = set("logoSrc", value.asInstanceOf[js.Any])
    
    inline def responsiveSizes(value: js.Array[ConfigResponsiveSize]): this.type = set("responsiveSizes", value.asInstanceOf[js.Any])
    
    inline def responsiveSizesVarargs(value: ConfigResponsiveSize*): this.type = set("responsiveSizes", js.Array(value*))
    
    inline def scripts(value: js.Array[String]): this.type = set("scripts", value.asInstanceOf[js.Any])
    
    inline def scriptsVarargs(value: String*): this.type = set("scripts", js.Array(value*))
    
    inline def styles(value: js.Array[String]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesVarargs(value: String*): this.type = set("styles", js.Array(value*))
    
    inline def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useBrowserHistory(value: Boolean): this.type = set("useBrowserHistory", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Config): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
