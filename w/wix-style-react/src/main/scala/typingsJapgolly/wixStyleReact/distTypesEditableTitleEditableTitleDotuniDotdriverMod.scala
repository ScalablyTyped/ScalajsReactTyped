package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableTitleEditableTitleDotuniDotdriverMod {
  
  trait EditableTitleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickHeading(idx: Double): js.Promise[Unit]
    
    def getHeadingText(idx: Double): js.Promise[String]
    
    def getInput(): InputUniDriver
  }
  object EditableTitleUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickHeading: Double => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHeadingText: Double => js.Promise[String],
      getInput: CallbackTo[InputUniDriver]
    ): EditableTitleUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickHeading = js.Any.fromFunction1(clickHeading), element = element.toJsFn, exists = exists.toJsFn, getHeadingText = js.Any.fromFunction1(getHeadingText), getInput = getInput.toJsFn)
      __obj.asInstanceOf[EditableTitleUniDriver]
    }
    
    extension [Self <: EditableTitleUniDriver](x: Self) {
      
      inline def setClickHeading(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickHeading", js.Any.fromFunction1(value))
      
      inline def setGetHeadingText(value: Double => js.Promise[String]): Self = StObject.set(x, "getHeadingText", js.Any.fromFunction1(value))
      
      inline def setGetInput(value: CallbackTo[InputUniDriver]): Self = StObject.set(x, "getInput", value.toJsFn)
    }
  }
}
