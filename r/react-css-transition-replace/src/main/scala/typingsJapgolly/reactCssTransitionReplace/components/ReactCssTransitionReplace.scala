package typingsJapgolly.reactCssTransitionReplace.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCssTransitionReplace.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCssTransitionReplace {
  
  object Class {
    
    @JSImport("react-css-transition-replace", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactCssTransitionReplace.mod.Class] {
      
      inline def changeWidth(value: Boolean): this.type = set("changeWidth", value.asInstanceOf[js.Any])
      
      inline def overflowHidden(value: Boolean): this.type = set("overflowHidden", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Class.type): typingsJapgolly.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder = new typingsJapgolly.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Props): typingsJapgolly.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder = new typingsJapgolly.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def changeWidth(value: Boolean): this.type = set("changeWidth", value.asInstanceOf[js.Any])
    
    inline def overflowHidden(value: Boolean): this.type = set("overflowHidden", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCssTransitionReplace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props & js.Object): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
