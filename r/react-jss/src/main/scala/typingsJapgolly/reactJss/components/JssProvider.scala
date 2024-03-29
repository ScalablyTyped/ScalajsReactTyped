package typingsJapgolly.reactJss.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.jss.mod.CreateGenerateIdOptions
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.SheetsRegistry
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.reactJss.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JssProvider {
  
  @JSImport("react-jss", "JssProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    inline def disableStylesGeneration(value: Boolean): this.type = set("disableStylesGeneration", value.asInstanceOf[js.Any])
    
    inline def generateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): this.type = set("generateId", js.Any.fromFunction2(value))
    
    inline def id(value: CreateGenerateIdOptions): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isSSR(value: Boolean): this.type = set("isSSR", value.asInstanceOf[js.Any])
    
    inline def jss(value: Jss): this.type = set("jss", value.asInstanceOf[js.Any])
    
    inline def registry(value: SheetsRegistry): this.type = set("registry", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: JssProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
