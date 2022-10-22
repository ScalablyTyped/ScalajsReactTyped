package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsButtonBlockAppenderMod.ButtonBlockAppender.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonBlockAppender {
  
  inline def apply(rootClientId: String): Builder = {
    val __props = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "ButtonBlockAppender")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
