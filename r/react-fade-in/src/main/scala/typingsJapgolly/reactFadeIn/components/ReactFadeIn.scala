package typingsJapgolly.reactFadeIn.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.JSXElementConstructor
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactFadeIn.libFadeInMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFadeIn {
  
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def childClassName(value: String): this.type = set("childClassName", value.asInstanceOf[js.Any])
    
    inline def childTag(value: JSXElementConstructor[Any]): this.type = set("childTag", value.asInstanceOf[js.Any])
    
    inline def childTagFunction1(value: Any => Element | Null): this.type = set("childTag", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def onComplete(value: CallbackTo[Any]): this.type = set("onComplete", value.toJsFn)
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def wrapperTag(value: JSXElementConstructor[Any]): this.type = set("wrapperTag", value.asInstanceOf[js.Any])
    
    inline def wrapperTagFunction1(value: Any => Element | Null): this.type = set("wrapperTag", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactFadeIn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[Props]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
