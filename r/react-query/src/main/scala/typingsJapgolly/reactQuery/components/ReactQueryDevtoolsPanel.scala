package typingsJapgolly.reactQuery.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactQuery.typesDevtoolsDevtoolsMod.DevtoolsPanelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactQueryDevtoolsPanel {
  
  inline def apply(handleDragStart: ReactMouseEventFrom[HTMLDivElement] => Callback, setIsOpen: Boolean => Callback): Builder = {
    val __props = js.Dynamic.literal(handleDragStart = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => handleDragStart(t0).runNow()), setIsOpen = js.Any.fromFunction1((t0: Boolean) => setIsOpen(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DevtoolsPanelOptions & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("react-query/types/devtools", "ReactQueryDevtoolsPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNonce(value: String): this.type = set("styleNonce", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DevtoolsPanelOptions & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
