package typingsJapgolly.materialUiStyles.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StylesProvider {
  
  @JSImport("@material-ui/styles", "StylesProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableGeneration(value: Boolean): this.type = set("disableGeneration", value.asInstanceOf[js.Any])
    
    inline def generateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): this.type = set("generateClassName", js.Any.fromFunction2(value))
    
    inline def injectFirst(value: Boolean): this.type = set("injectFirst", value.asInstanceOf[js.Any])
    
    inline def jss(value: Jss): this.type = set("jss", value.asInstanceOf[js.Any])
    
    inline def sheetsCache(value: js.Object): this.type = set("sheetsCache", value.asInstanceOf[js.Any])
    
    inline def sheetsManager(value: js.Object): this.type = set("sheetsManager", value.asInstanceOf[js.Any])
    
    inline def sheetsRegistry(value: js.Object): this.type = set("sheetsRegistry", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StylesProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StylesProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
