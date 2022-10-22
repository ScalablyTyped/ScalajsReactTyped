package typingsJapgolly.detox.mod.global.Detox

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexableWebElement
  extends StObject
     with WebElementActions {
  
  /**
    * Choose from multiple elements matching the same matcher using index
    * @example await web.element(by.web.hrefContains('Details')).atIndex(2).tap();
    */
  def atIndex(index: Double): WebElement
}
object IndexableWebElement {
  
  inline def apply(
    atIndex: Double => WebElement,
    clearText: CallbackTo[js.Promise[Unit]],
    focus: CallbackTo[js.Promise[Unit]],
    getCurrentUrl: CallbackTo[js.Promise[String]],
    getText: CallbackTo[js.Promise[String]],
    getTitle: CallbackTo[js.Promise[String]],
    moveCursorToEnd: CallbackTo[js.Promise[Unit]],
    replaceText: String => js.Promise[Unit],
    runScript: String => js.Promise[Any],
    runScriptWithArgs: (String, js.Array[Any]) => js.Promise[Any],
    scrollToView: CallbackTo[js.Promise[Unit]],
    selectAllText: CallbackTo[js.Promise[Unit]],
    tap: CallbackTo[js.Promise[Unit]],
    typeText: (String, Boolean) => js.Promise[Unit]
  ): IndexableWebElement = {
    val __obj = js.Dynamic.literal(atIndex = js.Any.fromFunction1(atIndex), clearText = clearText.toJsFn, focus = focus.toJsFn, getCurrentUrl = getCurrentUrl.toJsFn, getText = getText.toJsFn, getTitle = getTitle.toJsFn, moveCursorToEnd = moveCursorToEnd.toJsFn, replaceText = js.Any.fromFunction1(replaceText), runScript = js.Any.fromFunction1(runScript), runScriptWithArgs = js.Any.fromFunction2(runScriptWithArgs), scrollToView = scrollToView.toJsFn, selectAllText = selectAllText.toJsFn, tap = tap.toJsFn, typeText = js.Any.fromFunction2(typeText))
    __obj.asInstanceOf[IndexableWebElement]
  }
  
  extension [Self <: IndexableWebElement](x: Self) {
    
    inline def setAtIndex(value: Double => WebElement): Self = StObject.set(x, "atIndex", js.Any.fromFunction1(value))
  }
}
