package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Story
  extends StObject
     with Sheet {
  
  /** Activates the next story point if there is one. If the current story point is the last one, then is stays active. */
  def activateNextStoryPointAsync(): js.Promise[StoryPoint]
  
  /** Activates the previous story point if there is one. If the current story point is the first one, then it stays active. */
  def activatePreviousStoryPointAsync(): js.Promise[StoryPoint]
  
  /**
    * Activates the story point at the specified index and returns a promise of the activated StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  def activateStoryPointAsync(index: Double): js.Promise[StoryPoint]
  
  /** Gets the currently active story point. */
  def getActiveStoryPoint(): StoryPoint
  
  /**
    * Gets an array (not a collection) of StoryPointInfo objects.
    * Note that this is not a collection, since we don’t have a unique string key for a story point.
    * We only need ordinal access to the story points (by index).
    */
  def getStoryPointsInfo(): js.Array[StoryPointInfo]
  
  /**
    * Reverts the story point at the specified index and returns a promise of the reverted StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  def revertStoryPointAsync(index: Double): js.Promise[StoryPoint]
}
object Story {
  
  inline def apply(
    activateNextStoryPointAsync: CallbackTo[js.Promise[StoryPoint]],
    activatePreviousStoryPointAsync: CallbackTo[js.Promise[StoryPoint]],
    activateStoryPointAsync: Double => js.Promise[StoryPoint],
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getActiveStoryPoint: CallbackTo[StoryPoint],
    getIndex: CallbackTo[Double],
    getIsActive: CallbackTo[Boolean],
    getIsHidden: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getSheetType: CallbackTo[SheetType],
    getSize: CallbackTo[SheetSizeOptions],
    getStoryPointsInfo: CallbackTo[js.Array[StoryPointInfo]],
    getUrl: CallbackTo[String],
    getWorkbook: CallbackTo[Workbook],
    revertStoryPointAsync: Double => js.Promise[StoryPoint]
  ): Story = {
    val __obj = js.Dynamic.literal(activateNextStoryPointAsync = activateNextStoryPointAsync.toJsFn, activatePreviousStoryPointAsync = activatePreviousStoryPointAsync.toJsFn, activateStoryPointAsync = js.Any.fromFunction1(activateStoryPointAsync), changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getActiveStoryPoint = getActiveStoryPoint.toJsFn, getIndex = getIndex.toJsFn, getIsActive = getIsActive.toJsFn, getIsHidden = getIsHidden.toJsFn, getName = getName.toJsFn, getSheetType = getSheetType.toJsFn, getSize = getSize.toJsFn, getStoryPointsInfo = getStoryPointsInfo.toJsFn, getUrl = getUrl.toJsFn, getWorkbook = getWorkbook.toJsFn, revertStoryPointAsync = js.Any.fromFunction1(revertStoryPointAsync))
    __obj.asInstanceOf[Story]
  }
  
  extension [Self <: Story](x: Self) {
    
    inline def setActivateNextStoryPointAsync(value: CallbackTo[js.Promise[StoryPoint]]): Self = StObject.set(x, "activateNextStoryPointAsync", value.toJsFn)
    
    inline def setActivatePreviousStoryPointAsync(value: CallbackTo[js.Promise[StoryPoint]]): Self = StObject.set(x, "activatePreviousStoryPointAsync", value.toJsFn)
    
    inline def setActivateStoryPointAsync(value: Double => js.Promise[StoryPoint]): Self = StObject.set(x, "activateStoryPointAsync", js.Any.fromFunction1(value))
    
    inline def setGetActiveStoryPoint(value: CallbackTo[StoryPoint]): Self = StObject.set(x, "getActiveStoryPoint", value.toJsFn)
    
    inline def setGetStoryPointsInfo(value: CallbackTo[js.Array[StoryPointInfo]]): Self = StObject.set(x, "getStoryPointsInfo", value.toJsFn)
    
    inline def setRevertStoryPointAsync(value: Double => js.Promise[StoryPoint]): Self = StObject.set(x, "revertStoryPointAsync", js.Any.fromFunction1(value))
  }
}
