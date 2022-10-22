package typingsJapgolly.detox.mod.global.Detox

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebElementActions extends StObject {
  
  /**
    * At the moment not working on content-editable
    */
  def clearText(): js.Promise[Unit]
  
  /**
    * Calls the focus function on the element
    */
  def focus(): js.Promise[Unit]
  
  /**
    * Gets the current page url
    */
  def getCurrentUrl(): js.Promise[String]
  
  /**
    * Gets the input content
    */
  def getText(): js.Promise[String]
  
  /**
    * Gets the current page title
    */
  def getTitle(): js.Promise[String]
  
  /**
    * Moves the input cursor / caret to the end of the content, works on ContentEditable at the moment.
    */
  def moveCursorToEnd(): js.Promise[Unit]
  
  /**
    * At the moment not working on content-editable
    * @param text to replace with the old content.
    */
  def replaceText(text: String): js.Promise[Unit]
  
  /**
    * Running a script on the element
    * @param script a method that accept the element as its first arg
    * @example function foo(element) { console.log(element); }
    */
  def runScript(script: String): js.Promise[Any]
  
  /**
    * Running a script on the element that accept args
    * @param script a method that accept few args, and the element as the last arg.
    * @param args a list of args to pass to the script
    * @example function foo(a, b, c, element) { console.log(`${a}, ${b}, ${c}, ${element}`)}
    */
  def runScriptWithArgs(script: String, args: js.Array[Any]): js.Promise[Any]
  
  /**
    * scrolling to the view, the element top position will be at the top of the screen.
    */
  def scrollToView(): js.Promise[Unit]
  
  /**
    * Selects all the input content, works on ContentEditable at the moment.
    */
  def selectAllText(): js.Promise[Unit]
  
  def tap(): js.Promise[Unit]
  
  /**
    * @param text to type
    * @param isContentEditable whether its a ContentEditable element, default is false.
    */
  def typeText(text: String, isContentEditable: Boolean): js.Promise[Unit]
}
object WebElementActions {
  
  inline def apply(
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
  ): WebElementActions = {
    val __obj = js.Dynamic.literal(clearText = clearText.toJsFn, focus = focus.toJsFn, getCurrentUrl = getCurrentUrl.toJsFn, getText = getText.toJsFn, getTitle = getTitle.toJsFn, moveCursorToEnd = moveCursorToEnd.toJsFn, replaceText = js.Any.fromFunction1(replaceText), runScript = js.Any.fromFunction1(runScript), runScriptWithArgs = js.Any.fromFunction2(runScriptWithArgs), scrollToView = scrollToView.toJsFn, selectAllText = selectAllText.toJsFn, tap = tap.toJsFn, typeText = js.Any.fromFunction2(typeText))
    __obj.asInstanceOf[WebElementActions]
  }
  
  extension [Self <: WebElementActions](x: Self) {
    
    inline def setClearText(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearText", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetCurrentUrl(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCurrentUrl", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setMoveCursorToEnd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "moveCursorToEnd", value.toJsFn)
    
    inline def setReplaceText(value: String => js.Promise[Unit]): Self = StObject.set(x, "replaceText", js.Any.fromFunction1(value))
    
    inline def setRunScript(value: String => js.Promise[Any]): Self = StObject.set(x, "runScript", js.Any.fromFunction1(value))
    
    inline def setRunScriptWithArgs(value: (String, js.Array[Any]) => js.Promise[Any]): Self = StObject.set(x, "runScriptWithArgs", js.Any.fromFunction2(value))
    
    inline def setScrollToView(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "scrollToView", value.toJsFn)
    
    inline def setSelectAllText(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "selectAllText", value.toJsFn)
    
    inline def setTap(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "tap", value.toJsFn)
    
    inline def setTypeText(value: (String, Boolean) => js.Promise[Unit]): Self = StObject.set(x, "typeText", js.Any.fromFunction2(value))
  }
}
