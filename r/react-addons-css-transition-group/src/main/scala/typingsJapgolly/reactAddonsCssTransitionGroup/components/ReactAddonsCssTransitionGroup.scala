package typingsJapgolly.reactAddonsCssTransitionGroup.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps
import typingsJapgolly.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupTransitionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAddonsCssTransitionGroup {
  
  inline def apply(transitionName: String | CSSTransitionGroupTransitionName): Builder = {
    val __props = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CSSTransitionGroupProps & js.Object]))
  }
  
  object Class {
    
    inline def apply(transitionName: String | CSSTransitionGroupTransitionName): typingsJapgolly.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder = {
      val __props = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
      new typingsJapgolly.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder(js.Array(this.component, __props.asInstanceOf[CSSTransitionGroupProps]))
    }
    
    @JSImport("react-addons-css-transition-group", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactAddonsCssTransitionGroup.mod.Class] {
      
      inline def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
      
      inline def transitionAppearTimeout(value: Double): this.type = set("transitionAppearTimeout", value.asInstanceOf[js.Any])
      
      inline def transitionEnter(value: Boolean): this.type = set("transitionEnter", value.asInstanceOf[js.Any])
      
      inline def transitionEnterTimeout(value: Double): this.type = set("transitionEnterTimeout", value.asInstanceOf[js.Any])
      
      inline def transitionLeave(value: Boolean): this.type = set("transitionLeave", value.asInstanceOf[js.Any])
      
      inline def transitionLeaveTimeout(value: Double): this.type = set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CSSTransitionGroupProps): typingsJapgolly.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder = new typingsJapgolly.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
    
    inline def transitionAppearTimeout(value: Double): this.type = set("transitionAppearTimeout", value.asInstanceOf[js.Any])
    
    inline def transitionEnter(value: Boolean): this.type = set("transitionEnter", value.asInstanceOf[js.Any])
    
    inline def transitionEnterTimeout(value: Double): this.type = set("transitionEnterTimeout", value.asInstanceOf[js.Any])
    
    inline def transitionLeave(value: Boolean): this.type = set("transitionLeave", value.asInstanceOf[js.Any])
    
    inline def transitionLeaveTimeout(value: Double): this.type = set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CSSTransitionGroupProps & js.Object): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
