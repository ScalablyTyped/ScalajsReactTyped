package typingsJapgolly.reactEmbedGist.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEmbedGist.mod.Props
import typingsJapgolly.reactEmbedGist.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEmbedGist {
  
  inline def apply(gist: /* template literal string: ${string}/${string} */ String): Builder = {
    val __props = js.Dynamic.literal(gist = gist.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-embed-gist", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def contentClass(value: String): this.type = set("contentClass", value.asInstanceOf[js.Any])
    
    inline def errorClass(value: String): this.type = set("errorClass", value.asInstanceOf[js.Any])
    
    inline def file(value: String): this.type = set("file", value.asInstanceOf[js.Any])
    
    inline def loadingClass(value: String): this.type = set("loadingClass", value.asInstanceOf[js.Any])
    
    inline def titleClass(value: String): this.type = set("titleClass", value.asInstanceOf[js.Any])
    
    inline def wrapperClass(value: String): this.type = set("wrapperClass", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
