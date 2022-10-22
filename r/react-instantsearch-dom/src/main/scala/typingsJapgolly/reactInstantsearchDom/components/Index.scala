package typingsJapgolly.reactInstantsearchDom.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInstantsearchCore.mod.IndexProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Index {
  
  inline def apply(indexName: String): Builder = {
    val __props = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IndexProps]))
  }
  
  @JSImport("react-instantsearch-dom", "Index")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearchDom.mod.Index] {
    
    inline def indexId(value: String): this.type = set("indexId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IndexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
