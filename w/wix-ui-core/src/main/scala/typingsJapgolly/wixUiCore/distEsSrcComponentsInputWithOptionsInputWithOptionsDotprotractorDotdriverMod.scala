package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentDotprotractorDotdriverMod.DropdownContentDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownDotprotractorDotdriverMod.DropdownDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputDotprotractorDotdriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputWithOptionsInputWithOptionsDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions.protractor.driver", "inputWithOptionsDriverFactory")
  @js.native
  val inputWithOptionsDriverFactory: DriverFactory[InputWithOptionsDriver] = js.native
  
  trait InputWithOptionsDriver
    extends StObject
       with InputDriver
       with DropdownDriver
  object InputWithOptionsDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      dropdownContent: CallbackTo[DropdownContentDriver],
      element: CallbackTo[ElementFinder],
      enterText: String => js.Promise[Unit],
      focus: CallbackTo[js.Promise[Unit]],
      getContentElement: CallbackTo[ElementFinder],
      getTargetElement: CallbackTo[ElementFinder],
      getText: CallbackTo[js.Promise[String]],
      isContentElementExists: CallbackTo[js.Promise[Boolean]],
      isTargetElementExists: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]],
      pressKey: String => js.Promise[Unit]
    ): InputWithOptionsDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, dropdownContent = dropdownContent.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), focus = focus.toJsFn, getContentElement = getContentElement.toJsFn, getTargetElement = getTargetElement.toJsFn, getText = getText.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, pressKey = js.Any.fromFunction1(pressKey))
      __obj.asInstanceOf[InputWithOptionsDriver]
    }
  }
}
