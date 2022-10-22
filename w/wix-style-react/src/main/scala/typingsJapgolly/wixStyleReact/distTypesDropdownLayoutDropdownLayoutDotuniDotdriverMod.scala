package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout.uni.driver", "dropdownLayoutDriverFactory")
  @js.native
  val dropdownLayoutDriverFactory: UniDriverFactory[DropdownLayoutUniDriver] = js.native
  
  trait DropdownLayoutOptionUniDriver extends StObject {
    
    def click(): js.Promise[Unit]
    
    def content(): js.Promise[String]
    
    def element(): UniDriver[Any]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isDivider(): js.Promise[Boolean]
    
    def isHovered(): js.Promise[Boolean]
    
    def isLink(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
    
    def mouseEnter(): js.Promise[Unit]
    
    def mouseLeave(): js.Promise[Unit]
  }
  object DropdownLayoutOptionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      content: CallbackTo[js.Promise[String]],
      element: CallbackTo[UniDriver[Any]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isDivider: CallbackTo[js.Promise[Boolean]],
      isHovered: CallbackTo[js.Promise[Boolean]],
      isLink: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]]
    ): DropdownLayoutOptionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, content = content.toJsFn, element = element.toJsFn, isDisabled = isDisabled.toJsFn, isDivider = isDivider.toJsFn, isHovered = isHovered.toJsFn, isLink = isLink.toJsFn, isSelected = isSelected.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[DropdownLayoutOptionUniDriver]
    }
    
    extension [Self <: DropdownLayoutOptionUniDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setElement(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsDivider(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDivider", value.toJsFn)
      
      inline def setIsHovered(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHovered", value.toJsFn)
      
      inline def setIsLink(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLink", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
      
      inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setMouseLeave(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    }
  }
  
  @js.native
  trait DropdownLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** @deprecated should be private */
    def classes(name: String): js.Promise[Any] = js.native
    
    def clickAtOption(index: Double): js.Promise[Unit] = js.native
    
    def clickAtOptionByDataHook(dataHook: String): js.Promise[Unit] = js.native
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit] = js.native
    
    def getListItemAttribute(position: Double, attribute: String): js.Promise[String] = js.native
    
    def getListType(dataHook: String): js.Promise[String] = js.native
    
    def getOptionsContainerRole(): js.Promise[String] = js.native
    
    def getSelectedOptionId(): js.Promise[String | Null] = js.native
    
    def hasTopArrow(): js.Promise[Boolean] = js.native
    
    def isDown(): js.Promise[Boolean] = js.native
    
    def isLinkOption(position: Double): js.Promise[Boolean] = js.native
    
    def isListItemFocused(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionADivider(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionExists(optionText: String): js.Promise[Boolean] = js.native
    
    def isOptionHeightBig(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionHeightSmall(position: Double): js.Promise[Boolean] = js.native
    
    def isOptionHovered(index: Double): js.Promise[Boolean] = js.native
    
    def isOptionSelected(index: Double): js.Promise[Boolean] = js.native
    
    def isShown(): js.Promise[Boolean] = js.native
    
    def isUp(): js.Promise[Boolean] = js.native
    
    def keyDownListItem(position: Double, key: String): js.Promise[Unit] = js.native
    
    def markedOption(): js.Promise[String | Null] = js.native
    
    def mouseClickOutside(): Boolean = js.native
    
    def mouseEnter(): js.Promise[Unit] = js.native
    
    def mouseEnterAtOption(position: Double): js.Promise[Unit] = js.native
    
    def mouseLeave(): js.Promise[Unit] = js.native
    
    def mouseLeaveAtOption(position: Double): js.Promise[Unit] = js.native
    
    /** @deprecated Use optionDriver*/
    def optionAt(): js.Promise[Any] = js.native
    
    /** @deprecated This should be a private method since the hook include internal parts ('dropdown-divider-{id}, dropdown-item-{id})') */
    def optionByHook(hook: String): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    
    def optionById(optionId: String): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    def optionById(optionId: Double): js.Promise[DropdownLayoutOptionUniDriver] = js.native
    
    def optionContentAt(position: Double): js.Promise[String] = js.native
    
    def optionDriver(option: UniDriver[Any]): DropdownLayoutOptionUniDriver = js.native
    
    def options(): js.Promise[js.Array[DropdownLayoutOptionUniDriver]] = js.native
    
    def optionsContent(): js.Promise[js.Array[String]] = js.native
    
    def optionsLength(): js.Promise[Double] = js.native
    
    /** @deprecated should be private */
    def optionsScrollTop(): js.Promise[Double] = js.native
    
    def pressDownKey(): js.Promise[Unit] = js.native
    
    def pressEnterKey(): js.Promise[Unit] = js.native
    
    def pressEscKey(): js.Promise[Unit] = js.native
    
    def pressSpaceKey(): js.Promise[Unit] = js.native
    
    def pressTabKey(): js.Promise[Unit] = js.native
    
    def pressUpKey(): js.Promise[Unit] = js.native
    
    def tabIndex(): js.Promise[Double] = js.native
  }
}
