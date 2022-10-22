package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressEditor.wordpressEditorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostPublishButton {
  
  object SubmitProps {
    
    @JSImport("@wordpress/editor", "PostPublishButton")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def focusOnMount(value: Boolean): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
      
      inline def forceIsDirty(value: Boolean): this.type = set("forceIsDirty", value.asInstanceOf[js.Any])
      
      inline def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
      
      inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
      
      inline def isToggle(value: `false`): this.type = set("isToggle", value.asInstanceOf[js.Any])
      
      inline def onSubmit(value: Callback): this.type = set("onSubmit", value.toJsFn)
    }
    
    implicit def make(companion: SubmitProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.wordpressEditor.componentsPostPublishButtonMod.PostPublishButton.SubmitProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ToggleProps {
    
    inline def apply(onToggle: Callback): Builder = {
      val __props = js.Dynamic.literal(isToggle = true, onToggle = onToggle.toJsFn)
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressEditor.componentsPostPublishButtonMod.PostPublishButton.ToggleProps]))
    }
    
    @JSImport("@wordpress/editor", "PostPublishButton")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def focusOnMount(value: Boolean): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
      
      inline def forceIsDirty(value: Boolean): this.type = set("forceIsDirty", value.asInstanceOf[js.Any])
      
      inline def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
      
      inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressEditor.componentsPostPublishButtonMod.PostPublishButton.ToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
