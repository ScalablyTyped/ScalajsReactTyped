package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionDropdownOptionMod.DropdownOptionProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownOption {
  
  inline def apply(className: String, isHovered: Boolean, isSelected: Boolean, option: Option): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownOptionProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "DropdownOption")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onClickHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClickHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMouseEnterHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseEnterHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeaveHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseLeaveHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  }
  
  def withProps(p: DropdownOptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
