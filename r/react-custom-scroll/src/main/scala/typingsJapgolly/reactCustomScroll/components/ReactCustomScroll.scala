package typingsJapgolly.reactCustomScroll.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCustomScroll.mod.CustomScrollProps
import typingsJapgolly.reactCustomScroll.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCustomScroll {
  
  @JSImport("react-custom-scroll", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def addScrolledClass(value: Boolean): this.type = set("addScrolledClass", value.asInstanceOf[js.Any])
    
    inline def allowOuterScroll(value: Boolean): this.type = set("allowOuterScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flex(value: Double | String): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def freezePosition(value: Boolean): this.type = set("freezePosition", value.asInstanceOf[js.Any])
    
    inline def heightRelativeToParent(value: String): this.type = set("heightRelativeToParent", value.asInstanceOf[js.Any])
    
    inline def keepAtBottom(value: Boolean): this.type = set("keepAtBottom", value.asInstanceOf[js.Any])
    
    inline def minScrollHandleHeight(value: Double): this.type = set("minScrollHandleHeight", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: /* e */ js.UndefOr[Any] => Any): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def scrollTo(value: Double): this.type = set("scrollTo", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCustomScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CustomScrollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
