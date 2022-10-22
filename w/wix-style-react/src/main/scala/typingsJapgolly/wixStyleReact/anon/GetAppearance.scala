package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppearance extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /** Get tagName */
  def getAppearance(): js.Promise[Any]
  
  /** Get short version of text */
  def getShortText(): js.Promise[Any]
  
  /** Get long version of text */
  def getText(): js.Promise[Any]
}
object GetAppearance {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getAppearance: CallbackTo[js.Promise[Any]],
    getShortText: CallbackTo[js.Promise[Any]],
    getText: CallbackTo[js.Promise[Any]]
  ): GetAppearance = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAppearance = getAppearance.toJsFn, getShortText = getShortText.toJsFn, getText = getText.toJsFn)
    __obj.asInstanceOf[GetAppearance]
  }
  
  extension [Self <: GetAppearance](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetAppearance(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getAppearance", value.toJsFn)
    
    inline def setGetShortText(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getShortText", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getText", value.toJsFn)
  }
}
