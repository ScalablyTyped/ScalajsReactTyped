package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExists extends StObject {
  
  def _closeButtonExists(): Boolean
  
  def _hasClass(className: Any): Boolean
  
  def _helpButtonExists(): Boolean
  
  /** Checks that a node with the provided dataHook exists */
  def childExists(dataHook: Any): Boolean
  
  /** Click the modal close-button */
  def clickCloseButton(): Unit
  
  def clickHelpButton(): Unit
  
  def exists(): Boolean
  
  def getIllustrationSrc(): Any
  
  /** Return the secondary button driver */
  def getPrimaryButtonDriver(): Any
  
  /** Return the primary button tooltip's content */
  def getPrimaryButtonTooltipContent(): js.UndefOr[String | Null]
  
  /** Return the secondary button driver*/
  def getSecondaryButtonDriver(): Any
  
  /** Get the subtitle's text */
  def getSubtitleText(): Any
  
  /** Returns the modal theme */
  def getTheme(): Any
  
  /** Get the title's text */
  def getTitleText(): Any
}
object ChildExists {
  
  inline def apply(
    _closeButtonExists: CallbackTo[Boolean],
    _hasClass: Any => Boolean,
    _helpButtonExists: CallbackTo[Boolean],
    childExists: Any => Boolean,
    clickCloseButton: Callback,
    clickHelpButton: Callback,
    exists: CallbackTo[Boolean],
    getIllustrationSrc: CallbackTo[Any],
    getPrimaryButtonDriver: CallbackTo[Any],
    getPrimaryButtonTooltipContent: CallbackTo[js.UndefOr[String | Null]],
    getSecondaryButtonDriver: CallbackTo[Any],
    getSubtitleText: CallbackTo[Any],
    getTheme: CallbackTo[Any],
    getTitleText: CallbackTo[Any]
  ): ChildExists = {
    val __obj = js.Dynamic.literal(_closeButtonExists = _closeButtonExists.toJsFn, _hasClass = js.Any.fromFunction1(_hasClass), _helpButtonExists = _helpButtonExists.toJsFn, childExists = js.Any.fromFunction1(childExists), clickCloseButton = clickCloseButton.toJsFn, clickHelpButton = clickHelpButton.toJsFn, exists = exists.toJsFn, getIllustrationSrc = getIllustrationSrc.toJsFn, getPrimaryButtonDriver = getPrimaryButtonDriver.toJsFn, getPrimaryButtonTooltipContent = getPrimaryButtonTooltipContent.toJsFn, getSecondaryButtonDriver = getSecondaryButtonDriver.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getTheme = getTheme.toJsFn, getTitleText = getTitleText.toJsFn)
    __obj.asInstanceOf[ChildExists]
  }
  
  extension [Self <: ChildExists](x: Self) {
    
    inline def setChildExists(value: Any => Boolean): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClickCloseButton(value: Callback): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
    
    inline def setClickHelpButton(value: Callback): Self = StObject.set(x, "clickHelpButton", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetIllustrationSrc(value: CallbackTo[Any]): Self = StObject.set(x, "getIllustrationSrc", value.toJsFn)
    
    inline def setGetPrimaryButtonDriver(value: CallbackTo[Any]): Self = StObject.set(x, "getPrimaryButtonDriver", value.toJsFn)
    
    inline def setGetPrimaryButtonTooltipContent(value: CallbackTo[js.UndefOr[String | Null]]): Self = StObject.set(x, "getPrimaryButtonTooltipContent", value.toJsFn)
    
    inline def setGetSecondaryButtonDriver(value: CallbackTo[Any]): Self = StObject.set(x, "getSecondaryButtonDriver", value.toJsFn)
    
    inline def setGetSubtitleText(value: CallbackTo[Any]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
    
    inline def setGetTheme(value: CallbackTo[Any]): Self = StObject.set(x, "getTheme", value.toJsFn)
    
    inline def setGetTitleText(value: CallbackTo[Any]): Self = StObject.set(x, "getTitleText", value.toJsFn)
    
    inline def set_closeButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "_closeButtonExists", value.toJsFn)
    
    inline def set_hasClass(value: Any => Boolean): Self = StObject.set(x, "_hasClass", js.Any.fromFunction1(value))
    
    inline def set_helpButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "_helpButtonExists", value.toJsFn)
  }
}
