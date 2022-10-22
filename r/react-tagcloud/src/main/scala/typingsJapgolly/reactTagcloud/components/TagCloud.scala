package typingsJapgolly.reactTagcloud.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagCloud {
  
  inline def apply(maxSize: Double, minSize: Double, tags: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagCloudProps]))
  }
  
  @JSImport("react-tagcloud", "TagCloud")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTagcloud.mod.TagCloud] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colorOptions(value: js.Object): this.type = set("colorOptions", value.asInstanceOf[js.Any])
    
    inline def disableRandomColor(value: Boolean): this.type = set("disableRandomColor", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def renderer(value: js.Function): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def shuffle(value: Boolean): this.type = set("shuffle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagCloudProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
