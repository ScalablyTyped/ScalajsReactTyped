package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDropdownOptionDropdownOptionMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/dropdown-option/DropdownOption", "DropdownOption")
  @js.native
  val DropdownOption: DropdownOptionType = js.native
  
  trait DropdownOptionProps extends StObject {
    
    var className: String
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isHovered: Boolean
    
    var isSelected: Boolean
    
    var onClickHandler: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnterHandler: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeaveHandler: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var option: Option
  }
  object DropdownOptionProps {
    
    inline def apply(className: String, isHovered: Boolean, isSelected: Boolean, option: Option): DropdownOptionProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownOptionProps]
    }
    
    extension [Self <: DropdownOptionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setOnClickHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickHandlerUndefined: Self = StObject.set(x, "onClickHandler", js.undefined)
      
      inline def setOnMouseEnterHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseEnterHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterHandlerUndefined: Self = StObject.set(x, "onMouseEnterHandler", js.undefined)
      
      inline def setOnMouseLeaveHandler(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseLeaveHandler", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveHandlerUndefined: Self = StObject.set(x, "onMouseLeaveHandler", js.undefined)
      
      inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
  
  type DropdownOptionType = FunctionComponent[DropdownOptionProps]
}
