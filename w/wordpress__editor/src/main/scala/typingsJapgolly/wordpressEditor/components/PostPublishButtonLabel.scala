package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressEditor.componentsPostPublishButtonLabelMod.PostPublishButtonLabel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostPublishButtonLabel {
  
  @JSImport("@wordpress/editor", "PostPublishButtonLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PostPublishButtonLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
