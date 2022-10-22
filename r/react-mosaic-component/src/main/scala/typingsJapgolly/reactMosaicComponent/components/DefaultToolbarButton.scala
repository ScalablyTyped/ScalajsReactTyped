package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMosaicComponent.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultToolbarButton {
  
  inline def apply(className: String, onClick: ReactMouseEventFrom[Any & Element] => Any, title: String): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
  
  @JSImport("react-mosaic-component", "DefaultToolbarButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClassName): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
