package typingsJapgolly.reactScrollspy.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactScrollspy.mod.ScrollspyProps
import typingsJapgolly.reactScrollspy.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrollspy {
  
  inline def apply(currentClassName: String, items: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollspyProps]))
  }
  
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentTag(value: String | ComponentType[js.Object]): this.type = set("componentTag", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onUpdate(value: /* item */ HTMLElement => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* item */ HTMLElement) => value(t0).runNow()))
    
    inline def rootEl(value: String): this.type = set("rootEl", value.asInstanceOf[js.Any])
    
    inline def scrolledPastClassName(value: String): this.type = set("scrolledPastClassName", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollspyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
