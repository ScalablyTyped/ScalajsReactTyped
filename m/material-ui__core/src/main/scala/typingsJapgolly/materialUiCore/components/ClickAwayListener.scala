package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typingsJapgolly.materialUiCore.materialUiCoreBooleans.`false`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onClick
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickAwayListener {
  
  inline def apply(onClickAway: ReactMouseEventFrom[Document & Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(onClickAway = js.Any.fromFunction1((t0: ReactMouseEventFrom[Document & Element]) => onClickAway(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ClickAwayListenerProps]))
  }
  
  @JSImport("@material-ui/core", "ClickAwayListener")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableReactTree(value: Boolean): this.type = set("disableReactTree", value.asInstanceOf[js.Any])
    
    inline def mouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): this.type = set("mouseEvent", value.asInstanceOf[js.Any])
    
    inline def touchEvent(value: onTouchStart | onTouchEnd | `false`): this.type = set("touchEvent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClickAwayListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
