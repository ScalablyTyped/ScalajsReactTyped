package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.wordpressBlockEditor.anon.OnClick
import typingsJapgolly.wordpressBlockEditor.componentsWarningMod.Warning.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Warning {
  
  @JSImport("@wordpress/block-editor", "Warning")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: ReactFragment): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def secondaryActions(value: js.Array[OnClick]): this.type = set("secondaryActions", value.asInstanceOf[js.Any])
    
    inline def secondaryActionsVarargs(value: OnClick*): this.type = set("secondaryActions", js.Array(value*))
  }
  
  implicit def make(companion: Warning.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
