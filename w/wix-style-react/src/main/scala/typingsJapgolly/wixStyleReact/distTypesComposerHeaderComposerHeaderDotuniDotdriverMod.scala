package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerHeaderComposerHeaderDotuniDotdriverMod {
  
  trait ComposerHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionsExists(dataHook: String): js.Promise[Boolean]
    
    def backButtonExists(): js.Promise[Boolean]
    
    def clickBack(): js.Promise[Unit]
    
    def getBackButtonText(): js.Promise[String]
    
    def getSaveStatusValue(dataHook: String): js.Promise[String]
    
    def mainActionsExists(dataHook: String): js.Promise[Boolean]
    
    def saveStatusExists(dataHook: String): js.Promise[Boolean]
  }
  object ComposerHeaderUniDriver {
    
    inline def apply(
      actionsExists: String => js.Promise[Boolean],
      backButtonExists: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      clickBack: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getBackButtonText: CallbackTo[js.Promise[String]],
      getSaveStatusValue: String => js.Promise[String],
      mainActionsExists: String => js.Promise[Boolean],
      saveStatusExists: String => js.Promise[Boolean]
    ): ComposerHeaderUniDriver = {
      val __obj = js.Dynamic.literal(actionsExists = js.Any.fromFunction1(actionsExists), backButtonExists = backButtonExists.toJsFn, click = click.toJsFn, clickBack = clickBack.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getBackButtonText = getBackButtonText.toJsFn, getSaveStatusValue = js.Any.fromFunction1(getSaveStatusValue), mainActionsExists = js.Any.fromFunction1(mainActionsExists), saveStatusExists = js.Any.fromFunction1(saveStatusExists))
      __obj.asInstanceOf[ComposerHeaderUniDriver]
    }
    
    extension [Self <: ComposerHeaderUniDriver](x: Self) {
      
      inline def setActionsExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "actionsExists", js.Any.fromFunction1(value))
      
      inline def setBackButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "backButtonExists", value.toJsFn)
      
      inline def setClickBack(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickBack", value.toJsFn)
      
      inline def setGetBackButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getBackButtonText", value.toJsFn)
      
      inline def setGetSaveStatusValue(value: String => js.Promise[String]): Self = StObject.set(x, "getSaveStatusValue", js.Any.fromFunction1(value))
      
      inline def setMainActionsExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "mainActionsExists", js.Any.fromFunction1(value))
      
      inline def setSaveStatusExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "saveStatusExists", js.Any.fromFunction1(value))
    }
  }
}
