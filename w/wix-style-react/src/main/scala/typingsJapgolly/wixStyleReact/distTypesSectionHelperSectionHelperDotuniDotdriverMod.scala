package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSectionHelperSectionHelperDotuniDotdriverMod {
  
  trait SectionHelperUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionText(): js.Promise[String]
    
    def clickAction(): js.Promise[Unit]
    
    def clickClose(): js.Promise[Unit]
    
    def isCloseButtonDisplayed(): js.Promise[Boolean]
    
    def isDanger(): js.Promise[Boolean]
    
    def isExperimentalDark(): js.Promise[Boolean]
    
    def isPremium(): js.Promise[Boolean]
    
    def isPreview(): js.Promise[Boolean]
    
    def isStandard(): js.Promise[Boolean]
    
    def isSuccess(): js.Promise[Boolean]
    
    def isWarning(): js.Promise[Boolean]
    
    def textContent(): js.Promise[String]
    
    def titleText(): js.Promise[String]
  }
  object SectionHelperUniDriver {
    
    inline def apply(
      actionText: CallbackTo[js.Promise[String]],
      click: CallbackTo[js.Promise[Unit]],
      clickAction: CallbackTo[js.Promise[Unit]],
      clickClose: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isCloseButtonDisplayed: CallbackTo[js.Promise[Boolean]],
      isDanger: CallbackTo[js.Promise[Boolean]],
      isExperimentalDark: CallbackTo[js.Promise[Boolean]],
      isPremium: CallbackTo[js.Promise[Boolean]],
      isPreview: CallbackTo[js.Promise[Boolean]],
      isStandard: CallbackTo[js.Promise[Boolean]],
      isSuccess: CallbackTo[js.Promise[Boolean]],
      isWarning: CallbackTo[js.Promise[Boolean]],
      textContent: CallbackTo[js.Promise[String]],
      titleText: CallbackTo[js.Promise[String]]
    ): SectionHelperUniDriver = {
      val __obj = js.Dynamic.literal(actionText = actionText.toJsFn, click = click.toJsFn, clickAction = clickAction.toJsFn, clickClose = clickClose.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isCloseButtonDisplayed = isCloseButtonDisplayed.toJsFn, isDanger = isDanger.toJsFn, isExperimentalDark = isExperimentalDark.toJsFn, isPremium = isPremium.toJsFn, isPreview = isPreview.toJsFn, isStandard = isStandard.toJsFn, isSuccess = isSuccess.toJsFn, isWarning = isWarning.toJsFn, textContent = textContent.toJsFn, titleText = titleText.toJsFn)
      __obj.asInstanceOf[SectionHelperUniDriver]
    }
    
    extension [Self <: SectionHelperUniDriver](x: Self) {
      
      inline def setActionText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "actionText", value.toJsFn)
      
      inline def setClickAction(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickAction", value.toJsFn)
      
      inline def setClickClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickClose", value.toJsFn)
      
      inline def setIsCloseButtonDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCloseButtonDisplayed", value.toJsFn)
      
      inline def setIsDanger(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDanger", value.toJsFn)
      
      inline def setIsExperimentalDark(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isExperimentalDark", value.toJsFn)
      
      inline def setIsPremium(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPremium", value.toJsFn)
      
      inline def setIsPreview(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPreview", value.toJsFn)
      
      inline def setIsStandard(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isStandard", value.toJsFn)
      
      inline def setIsSuccess(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccess", value.toJsFn)
      
      inline def setIsWarning(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isWarning", value.toJsFn)
      
      inline def setTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "textContent", value.toJsFn)
      
      inline def setTitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "titleText", value.toJsFn)
    }
  }
}
