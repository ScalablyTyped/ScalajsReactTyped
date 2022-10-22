package typingsJapgolly.antDesignCssinjs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.client
import typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.server
import typingsJapgolly.antDesignCssinjs.esCacheMod.default
import typingsJapgolly.antDesignCssinjs.esStyleContextMod.HashPriority
import typingsJapgolly.antDesignCssinjs.esStyleContextMod.StyleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleProvider {
  
  @JSImport("@ant-design/cssinjs", "StyleProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoClear(value: Boolean): this.type = set("autoClear", value.asInstanceOf[js.Any])
    
    inline def cache(value: default): this.type = set("cache", value.asInstanceOf[js.Any])
    
    inline def defaultCache(value: Boolean): this.type = set("defaultCache", value.asInstanceOf[js.Any])
    
    inline def hashPriority(value: HashPriority): this.type = set("hashPriority", value.asInstanceOf[js.Any])
    
    inline def mock(value: server | client): this.type = set("mock", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyleProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StyleProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
