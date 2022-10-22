package typingsJapgolly.reactDocumentMeta.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDocumentMeta.mod.DocumentMetaProps
import typingsJapgolly.reactDocumentMeta.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDocumentMeta {
  
  @JSImport("react-document-meta", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def canonical(value: String): this.type = set("canonical", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDocumentMeta.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DocumentMetaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
