package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPointSwitchEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the StoryPoint that is currently active. */
  def getNewStoryPoint(): StoryPoint
  
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  def getOldStoryPointInfo(): StoryPointInfo
}
object StoryPointSwitchEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getNewStoryPoint: CallbackTo[StoryPoint],
    getOldStoryPointInfo: CallbackTo[StoryPointInfo],
    getViz: CallbackTo[Viz]
  ): StoryPointSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getNewStoryPoint = getNewStoryPoint.toJsFn, getOldStoryPointInfo = getOldStoryPointInfo.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[StoryPointSwitchEvent]
  }
  
  extension [Self <: StoryPointSwitchEvent](x: Self) {
    
    inline def setGetNewStoryPoint(value: CallbackTo[StoryPoint]): Self = StObject.set(x, "getNewStoryPoint", value.toJsFn)
    
    inline def setGetOldStoryPointInfo(value: CallbackTo[StoryPointInfo]): Self = StObject.set(x, "getOldStoryPointInfo", value.toJsFn)
  }
}
