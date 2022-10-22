package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPoint extends StObject {
  
  /** Gets the content of the textual description for this story point. */
  def getCaption(): String
  
  /** Gets the sheet that this story point contains. This will be null if the story point does not have a contained sheet. */
  def getContainedSheet(): Sheet
  
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  def getIndex(): Double
  
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  def getIsActive(): Boolean
  
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  def getIsUpdated(): Boolean
  
  /** Gets the Story object that contains the story point. */
  def getParentStory(): Story
}
object StoryPoint {
  
  inline def apply(
    getCaption: CallbackTo[String],
    getContainedSheet: CallbackTo[Sheet],
    getIndex: CallbackTo[Double],
    getIsActive: CallbackTo[Boolean],
    getIsUpdated: CallbackTo[Boolean],
    getParentStory: CallbackTo[Story]
  ): StoryPoint = {
    val __obj = js.Dynamic.literal(getCaption = getCaption.toJsFn, getContainedSheet = getContainedSheet.toJsFn, getIndex = getIndex.toJsFn, getIsActive = getIsActive.toJsFn, getIsUpdated = getIsUpdated.toJsFn, getParentStory = getParentStory.toJsFn)
    __obj.asInstanceOf[StoryPoint]
  }
  
  extension [Self <: StoryPoint](x: Self) {
    
    inline def setGetCaption(value: CallbackTo[String]): Self = StObject.set(x, "getCaption", value.toJsFn)
    
    inline def setGetContainedSheet(value: CallbackTo[Sheet]): Self = StObject.set(x, "getContainedSheet", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsActive", value.toJsFn)
    
    inline def setGetIsUpdated(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsUpdated", value.toJsFn)
    
    inline def setGetParentStory(value: CallbackTo[Story]): Self = StObject.set(x, "getParentStory", value.toJsFn)
  }
}
