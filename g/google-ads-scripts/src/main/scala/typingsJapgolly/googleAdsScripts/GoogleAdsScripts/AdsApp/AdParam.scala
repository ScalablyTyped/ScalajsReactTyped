package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads ad param. */
trait AdParam extends StObject {
  
  /** Returns the ad group to which this ad param belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this ad param belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the type of this entity as a String, in this case, "AdParam". */
  def getEntityType(): String
  
  /** Returns the index of the ad param. */
  def getIndex(): Double
  
  /** Returns the insertion text of the ad param. */
  def getInsertionText(): String
  
  /** Returns the Keyword the ad param belongs to. */
  def getKeyword(): Keyword
  
  /** Removes the ad param. */
  def remove(): Unit
  
  /** Sets the insertion text of the ad param to the specified value. */
  def setInsertionText(insertionText: String): Unit
}
object AdParam {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getEntityType: CallbackTo[String],
    getIndex: CallbackTo[Double],
    getInsertionText: CallbackTo[String],
    getKeyword: CallbackTo[Keyword],
    remove: Callback,
    setInsertionText: String => Callback
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getEntityType = getEntityType.toJsFn, getIndex = getIndex.toJsFn, getInsertionText = getInsertionText.toJsFn, getKeyword = getKeyword.toJsFn, remove = remove.toJsFn, setInsertionText = js.Any.fromFunction1((t0: String) => setInsertionText(t0).runNow()))
    __obj.asInstanceOf[AdParam]
  }
  
  extension [Self <: AdParam](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetInsertionText(value: CallbackTo[String]): Self = StObject.set(x, "getInsertionText", value.toJsFn)
    
    inline def setGetKeyword(value: CallbackTo[Keyword]): Self = StObject.set(x, "getKeyword", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetInsertionText(value: String => Callback): Self = StObject.set(x, "setInsertionText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
