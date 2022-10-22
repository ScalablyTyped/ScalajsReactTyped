package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSectionHelperSectionHelperDotdriverMod {
  
  trait SectionHelperDriver
    extends StObject
       with BaseDriver {
    
    def actionText(): String
    
    def clickAction(): Unit
    
    def clickClose(): Unit
    
    def isCloseButtonDisplayed(): Boolean
    
    def isDanger(): Boolean
    
    def isExperimentalDark(): Boolean
    
    def isPremium(): Boolean
    
    def isPreview(): Boolean
    
    def isStandard(): Boolean
    
    def isSuccess(): Boolean
    
    def isWarning(): Boolean
    
    def textContent(): String
    
    def titleText(): String
  }
  object SectionHelperDriver {
    
    inline def apply(
      actionText: CallbackTo[String],
      clickAction: Callback,
      clickClose: Callback,
      exists: CallbackTo[Boolean],
      isCloseButtonDisplayed: CallbackTo[Boolean],
      isDanger: CallbackTo[Boolean],
      isExperimentalDark: CallbackTo[Boolean],
      isPremium: CallbackTo[Boolean],
      isPreview: CallbackTo[Boolean],
      isStandard: CallbackTo[Boolean],
      isSuccess: CallbackTo[Boolean],
      isWarning: CallbackTo[Boolean],
      textContent: CallbackTo[String],
      titleText: CallbackTo[String]
    ): SectionHelperDriver = {
      val __obj = js.Dynamic.literal(actionText = actionText.toJsFn, clickAction = clickAction.toJsFn, clickClose = clickClose.toJsFn, exists = exists.toJsFn, isCloseButtonDisplayed = isCloseButtonDisplayed.toJsFn, isDanger = isDanger.toJsFn, isExperimentalDark = isExperimentalDark.toJsFn, isPremium = isPremium.toJsFn, isPreview = isPreview.toJsFn, isStandard = isStandard.toJsFn, isSuccess = isSuccess.toJsFn, isWarning = isWarning.toJsFn, textContent = textContent.toJsFn, titleText = titleText.toJsFn)
      __obj.asInstanceOf[SectionHelperDriver]
    }
    
    extension [Self <: SectionHelperDriver](x: Self) {
      
      inline def setActionText(value: CallbackTo[String]): Self = StObject.set(x, "actionText", value.toJsFn)
      
      inline def setClickAction(value: Callback): Self = StObject.set(x, "clickAction", value.toJsFn)
      
      inline def setClickClose(value: Callback): Self = StObject.set(x, "clickClose", value.toJsFn)
      
      inline def setIsCloseButtonDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCloseButtonDisplayed", value.toJsFn)
      
      inline def setIsDanger(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDanger", value.toJsFn)
      
      inline def setIsExperimentalDark(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExperimentalDark", value.toJsFn)
      
      inline def setIsPremium(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPremium", value.toJsFn)
      
      inline def setIsPreview(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPreview", value.toJsFn)
      
      inline def setIsStandard(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStandard", value.toJsFn)
      
      inline def setIsSuccess(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccess", value.toJsFn)
      
      inline def setIsWarning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWarning", value.toJsFn)
      
      inline def setTextContent(value: CallbackTo[String]): Self = StObject.set(x, "textContent", value.toJsFn)
      
      inline def setTitleText(value: CallbackTo[String]): Self = StObject.set(x, "titleText", value.toJsFn)
    }
  }
}
