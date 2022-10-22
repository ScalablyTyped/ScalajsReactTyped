package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomView extends StObject {
  
  /** Indicates whether the custom view is public or private. */
  def getAdvertised(): Boolean
  
  /** Gets or sets whether this is the default custom view. */
  def getDefault(): Boolean
  
  /** User-friendly name for the custom view */
  def getName(): String
  
  /** Gets the user that created the custom view. */
  def getOwnerName(): String
  
  /** Unique URL to load this view again. */
  def getUrl(): String
  
  /** Gets the Workbook to which this CustomView belongs. */
  def getWorkbook(): Workbook
  
  /** After saveAsync() is called, the result of the getUrl method is no longer blank. */
  def saveAsync(): js.Promise[CustomView]
  
  /** Indicates whether the custom view is public or private. */
  def setAdvertised(bool: Boolean): Boolean
  
  /** User-friendly name for the custom view */
  def setName(name: String): String
}
object CustomView {
  
  inline def apply(
    getAdvertised: CallbackTo[Boolean],
    getDefault: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getOwnerName: CallbackTo[String],
    getUrl: CallbackTo[String],
    getWorkbook: CallbackTo[Workbook],
    saveAsync: CallbackTo[js.Promise[CustomView]],
    setAdvertised: Boolean => Boolean,
    setName: String => String
  ): CustomView = {
    val __obj = js.Dynamic.literal(getAdvertised = getAdvertised.toJsFn, getDefault = getDefault.toJsFn, getName = getName.toJsFn, getOwnerName = getOwnerName.toJsFn, getUrl = getUrl.toJsFn, getWorkbook = getWorkbook.toJsFn, saveAsync = saveAsync.toJsFn, setAdvertised = js.Any.fromFunction1(setAdvertised), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[CustomView]
  }
  
  extension [Self <: CustomView](x: Self) {
    
    inline def setGetAdvertised(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAdvertised", value.toJsFn)
    
    inline def setGetDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDefault", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetOwnerName(value: CallbackTo[String]): Self = StObject.set(x, "getOwnerName", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setGetWorkbook(value: CallbackTo[Workbook]): Self = StObject.set(x, "getWorkbook", value.toJsFn)
    
    inline def setSaveAsync(value: CallbackTo[js.Promise[CustomView]]): Self = StObject.set(x, "saveAsync", value.toJsFn)
    
    inline def setSetAdvertised(value: Boolean => Boolean): Self = StObject.set(x, "setAdvertised", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => String): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
