package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Shared Excluded Placement. */
trait SharedExcludedPlacement extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "SharedExcludedPlacement". */
  def getEntityType(): String
  
  /** Returns the ExcludedPlacementList this placement is in. */
  def getExcludedPlacementList(): ExcludedPlacementList
  
  /** Returns the URL of the excluded placement. */
  def getUrl(): String
  
  /** Removes the shared excluded placement. */
  def remove(): Unit
}
object SharedExcludedPlacement {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getExcludedPlacementList: CallbackTo[ExcludedPlacementList],
    getUrl: CallbackTo[String],
    remove: Callback
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getExcludedPlacementList = getExcludedPlacementList.toJsFn, getUrl = getUrl.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
  
  extension [Self <: SharedExcludedPlacement](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetExcludedPlacementList(value: CallbackTo[ExcludedPlacementList]): Self = StObject.set(x, "getExcludedPlacementList", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
