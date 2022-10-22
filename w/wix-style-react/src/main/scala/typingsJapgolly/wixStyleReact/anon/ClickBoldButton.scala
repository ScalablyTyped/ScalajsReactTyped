package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickBoldButton extends StObject {
  
  def clickBoldButton(): Any
  
  def clickBulletedListButton(): Any
  
  def clickFormCancelButton(): Any
  
  def clickItalicButton(): Any
  
  def clickLinkButton(): Any
  
  def clickNumberedListButton(): Any
  
  def clickUnderlineButton(): Any
  
  def getBoldButton(): Any
  
  def getBulletedListButton(): Any
  
  def getButtonTypes(): Any
  
  def getItalicButton(): Any
  
  def getLinkButton(): Any
  
  def getNumberedListButton(): Any
  
  def getUnderlineButton(): Any
  
  def insertLink(text: Any, url: Any): js.Promise[Unit]
  
  def insertUrl(url: Any): Any
  
  def isActive(element: Any): js.Promise[Boolean]
  
  def isFormConfirmButtonDisabled(): js.Promise[Boolean]
  
  def isFormDisplayed(): Any
}
object ClickBoldButton {
  
  inline def apply(
    clickBoldButton: CallbackTo[Any],
    clickBulletedListButton: CallbackTo[Any],
    clickFormCancelButton: CallbackTo[Any],
    clickItalicButton: CallbackTo[Any],
    clickLinkButton: CallbackTo[Any],
    clickNumberedListButton: CallbackTo[Any],
    clickUnderlineButton: CallbackTo[Any],
    getBoldButton: CallbackTo[Any],
    getBulletedListButton: CallbackTo[Any],
    getButtonTypes: CallbackTo[Any],
    getItalicButton: CallbackTo[Any],
    getLinkButton: CallbackTo[Any],
    getNumberedListButton: CallbackTo[Any],
    getUnderlineButton: CallbackTo[Any],
    insertLink: (Any, Any) => js.Promise[Unit],
    insertUrl: Any => Any,
    isActive: Any => js.Promise[Boolean],
    isFormConfirmButtonDisabled: CallbackTo[js.Promise[Boolean]],
    isFormDisplayed: CallbackTo[Any]
  ): ClickBoldButton = {
    val __obj = js.Dynamic.literal(clickBoldButton = clickBoldButton.toJsFn, clickBulletedListButton = clickBulletedListButton.toJsFn, clickFormCancelButton = clickFormCancelButton.toJsFn, clickItalicButton = clickItalicButton.toJsFn, clickLinkButton = clickLinkButton.toJsFn, clickNumberedListButton = clickNumberedListButton.toJsFn, clickUnderlineButton = clickUnderlineButton.toJsFn, getBoldButton = getBoldButton.toJsFn, getBulletedListButton = getBulletedListButton.toJsFn, getButtonTypes = getButtonTypes.toJsFn, getItalicButton = getItalicButton.toJsFn, getLinkButton = getLinkButton.toJsFn, getNumberedListButton = getNumberedListButton.toJsFn, getUnderlineButton = getUnderlineButton.toJsFn, insertLink = js.Any.fromFunction2(insertLink), insertUrl = js.Any.fromFunction1(insertUrl), isActive = js.Any.fromFunction1(isActive), isFormConfirmButtonDisabled = isFormConfirmButtonDisabled.toJsFn, isFormDisplayed = isFormDisplayed.toJsFn)
    __obj.asInstanceOf[ClickBoldButton]
  }
  
  extension [Self <: ClickBoldButton](x: Self) {
    
    inline def setClickBoldButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickBoldButton", value.toJsFn)
    
    inline def setClickBulletedListButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickBulletedListButton", value.toJsFn)
    
    inline def setClickFormCancelButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickFormCancelButton", value.toJsFn)
    
    inline def setClickItalicButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickItalicButton", value.toJsFn)
    
    inline def setClickLinkButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickLinkButton", value.toJsFn)
    
    inline def setClickNumberedListButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickNumberedListButton", value.toJsFn)
    
    inline def setClickUnderlineButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickUnderlineButton", value.toJsFn)
    
    inline def setGetBoldButton(value: CallbackTo[Any]): Self = StObject.set(x, "getBoldButton", value.toJsFn)
    
    inline def setGetBulletedListButton(value: CallbackTo[Any]): Self = StObject.set(x, "getBulletedListButton", value.toJsFn)
    
    inline def setGetButtonTypes(value: CallbackTo[Any]): Self = StObject.set(x, "getButtonTypes", value.toJsFn)
    
    inline def setGetItalicButton(value: CallbackTo[Any]): Self = StObject.set(x, "getItalicButton", value.toJsFn)
    
    inline def setGetLinkButton(value: CallbackTo[Any]): Self = StObject.set(x, "getLinkButton", value.toJsFn)
    
    inline def setGetNumberedListButton(value: CallbackTo[Any]): Self = StObject.set(x, "getNumberedListButton", value.toJsFn)
    
    inline def setGetUnderlineButton(value: CallbackTo[Any]): Self = StObject.set(x, "getUnderlineButton", value.toJsFn)
    
    inline def setInsertLink(value: (Any, Any) => js.Promise[Unit]): Self = StObject.set(x, "insertLink", js.Any.fromFunction2(value))
    
    inline def setInsertUrl(value: Any => Any): Self = StObject.set(x, "insertUrl", js.Any.fromFunction1(value))
    
    inline def setIsActive(value: Any => js.Promise[Boolean]): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
    
    inline def setIsFormConfirmButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFormConfirmButtonDisabled", value.toJsFn)
    
    inline def setIsFormDisplayed(value: CallbackTo[Any]): Self = StObject.set(x, "isFormDisplayed", value.toJsFn)
  }
}
