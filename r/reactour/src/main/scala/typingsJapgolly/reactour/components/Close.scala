package typingsJapgolly.reactour.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactour.mod.CloseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Close {
  
  inline def apply(onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseProps]))
  }
  
  @JSImport("reactour", "Close")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
