package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
trait TimelineWall
  extends StObject
     with Control {
  
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): Unit
}
object TimelineWall {
  
  inline def apply(
    getControlType: CallbackTo[ControlType | String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Section],
    getVisible: CallbackTo[Boolean],
    refresh: Callback,
    setLabel: String => Callback
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = getControlType.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getVisible = getVisible.toJsFn, refresh = refresh.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[TimelineWall]
  }
  
  extension [Self <: TimelineWall](x: Self) {
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
