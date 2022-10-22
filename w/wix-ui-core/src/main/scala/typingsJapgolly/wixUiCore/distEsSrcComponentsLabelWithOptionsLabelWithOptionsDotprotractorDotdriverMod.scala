package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiCore.distEsSrcComponentsDeprecatedLabelLabelDotprotractorDotdriverMod.LabelDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentDotprotractorDotdriverMod.DropdownContentDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownDotprotractorDotdriverMod.DropdownDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLabelWithOptionsLabelWithOptionsDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/label-with-options/LabelWithOptions.protractor.driver", "labelWithOptionsDriverFactory")
  @js.native
  val labelWithOptionsDriverFactory: DriverFactory[LabelWithOptionsDriver] = js.native
  
  trait LabelWithOptionsDriver
    extends StObject
       with LabelDriver
       with DropdownDriver {
    
    /* InferMemberOverrides */
    override def click(): js.Promise[Unit]
    
    def isCheckboxModeOn(): js.Promise[Boolean]
  }
  object LabelWithOptionsDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      dropdownContent: CallbackTo[DropdownContentDriver],
      element: CallbackTo[ElementFinder],
      getContentElement: CallbackTo[ElementFinder],
      getLabelText: CallbackTo[js.Promise[String]],
      getTargetElement: CallbackTo[ElementFinder],
      isCheckboxModeOn: CallbackTo[js.Promise[Boolean]],
      isContentElementExists: CallbackTo[js.Promise[Boolean]],
      isTargetElementExists: CallbackTo[js.Promise[Boolean]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      mouseLeave: CallbackTo[js.Promise[Unit]]
    ): LabelWithOptionsDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, dropdownContent = dropdownContent.toJsFn, element = element.toJsFn, getContentElement = getContentElement.toJsFn, getLabelText = getLabelText.toJsFn, getTargetElement = getTargetElement.toJsFn, isCheckboxModeOn = isCheckboxModeOn.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
      __obj.asInstanceOf[LabelWithOptionsDriver]
    }
    
    extension [Self <: LabelWithOptionsDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setIsCheckboxModeOn(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCheckboxModeOn", value.toJsFn)
    }
  }
}
