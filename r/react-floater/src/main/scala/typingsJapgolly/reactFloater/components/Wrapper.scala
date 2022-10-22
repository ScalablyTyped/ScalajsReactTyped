package typingsJapgolly.reactFloater.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactFloater.libComponentsWrapperMod.Props
import typingsJapgolly.reactFloater.libTypesMod.Statuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wrapper {
  
  inline def apply(
    childRef: RefHandle[HTMLElement],
    id: String,
    isControlled: Boolean,
    onClick: /* event */ ReactEventFrom[HTMLSpanElement & Element] => Callback,
    onMouseEnter: /* event */ ReactEventFrom[HTMLSpanElement & Element] => Callback,
    onMouseLeave: /* event */ ReactEventFrom[HTMLSpanElement & Element] => Callback,
    status: Statuses,
    styles: CSSProperties,
    wrapperRef: RefHandle[HTMLElement]
  ): Builder = {
    val __props = js.Dynamic.literal(childRef = childRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & Element]) => onClick(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & Element]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & Element]) => onMouseLeave(t0).runNow()), status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], wrapperRef = wrapperRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ Props]))
  }
  
  @JSImport("react-floater/lib/components/Wrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
