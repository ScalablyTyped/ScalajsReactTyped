package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownLayoutDropdownLayoutDotdriverMod {
  
  @js.native
  trait DropdownLayoutDriver
    extends StObject
       with BaseDriver {
    
    def classes(): String = js.native
    
    def clickAtOption(position: Double): Unit = js.native
    
    def clickAtOptionWithValue(value: String): Unit = js.native
    
    def getListItemAttribute(position: Double, attribute: String): String = js.native
    
    def getListType(dataHook: String): String = js.native
    
    def getOptionsContainerRole(): String = js.native
    
    def getSelectedOptionId(): String | Null = js.native
    
    def hasTopArrow(): Boolean = js.native
    
    def isDown(): Boolean = js.native
    
    def isLinkOption(position: Double): Boolean = js.native
    
    def isListItemFocused(position: Double): Boolean = js.native
    
    def isOptionADivider(position: Double): Boolean = js.native
    
    def isOptionExists(optionText: String): Boolean = js.native
    
    def isOptionHeightBig(position: Double): Boolean = js.native
    
    def isOptionHeightSmall(position: Double): Boolean = js.native
    
    def isOptionHovered(position: Double): Boolean = js.native
    
    def isOptionSelected(position: Double): Boolean = js.native
    
    def isShown(): Boolean = js.native
    
    def isUp(): Boolean = js.native
    
    def keyDownListItem(position: Double, key: String): Unit = js.native
    
    def markedOption(): String | Null = js.native
    
    def mouseClickOutside(): Unit = js.native
    
    def mouseEnter(): Unit = js.native
    
    def mouseEnterAtOption(position: Double): Unit = js.native
    
    def mouseLeave(): Unit = js.native
    
    def mouseLeaveAtOption(position: Double): Unit = js.native
    
    /** @deprecated Use optionDriver*/
    def optionAt(position: Double): Node = js.native
    
    /** @deprecated This should be a private method since the hook include internal parts ('dropdown-divider-{id}, dropdown-item-{id})') */
    def optionByHook(hook: String): DropdownLayoutOptionDriver = js.native
    
    def optionById(optionId: String): DropdownLayoutOptionDriver = js.native
    def optionById(optionId: Double): DropdownLayoutOptionDriver = js.native
    
    def optionContentAt(position: Double): String = js.native
    
    def optionDriver(option: HTMLElement): DropdownLayoutOptionDriver = js.native
    
    def options(): js.Array[DropdownLayoutOptionDriver] = js.native
    
    def optionsContent(): js.Array[String] = js.native
    
    def optionsLength(): Double = js.native
    
    /** @deprecated should be private */
    def optionsScrollTop(): Double = js.native
    
    def pressDownKey(): Unit = js.native
    
    def pressEnterKey(): Unit = js.native
    
    def pressEscKey(): Unit = js.native
    
    def pressSpaceKey(): Unit = js.native
    
    def pressTabKey(): Unit = js.native
    
    def pressUpKey(): Unit = js.native
    
    def tabIndex(): Double = js.native
  }
  
  trait DropdownLayoutOptionDriver extends StObject {
    
    def click(): Unit
    
    def content(): String
    
    def element(): HTMLElement
    
    def isDisabled(): Boolean
    
    def isDivider(): Boolean
    
    def isHovered(): Boolean
    
    def isLink(): Boolean
    
    def isSelected(): Boolean
    
    def mouseEnter(): Unit
    
    def mouseLeave(): Unit
  }
  object DropdownLayoutOptionDriver {
    
    inline def apply(
      click: Callback,
      content: CallbackTo[String],
      element: CallbackTo[HTMLElement],
      isDisabled: CallbackTo[Boolean],
      isDivider: CallbackTo[Boolean],
      isHovered: CallbackTo[Boolean],
      isLink: CallbackTo[Boolean],
      isSelected: CallbackTo[Boolean],
      mouseEnter: Callback,
      mouseLeave: Callback
    ): DropdownLayoutOptionDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, content = content.toJsFn, element = element.toJsFn, isDisabled = isDisabled.toJsFn, isDivider = isDivider.toJsFn, isHovered = isHovered.toJsFn, isLink = isLink.toJsFn, isSelected = isSelected.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[DropdownLayoutOptionDriver]
    }
    
    extension [Self <: DropdownLayoutOptionDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setContent(value: CallbackTo[String]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsDivider(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDivider", value.toJsFn)
      
      inline def setIsHovered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHovered", value.toJsFn)
      
      inline def setIsLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLink", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelected", value.toJsFn)
      
      inline def setMouseEnter(value: Callback): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setMouseLeave(value: Callback): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    }
  }
}
