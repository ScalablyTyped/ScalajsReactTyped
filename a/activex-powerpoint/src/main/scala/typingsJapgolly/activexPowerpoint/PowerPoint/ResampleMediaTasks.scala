package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResampleMediaTasks extends StObject {
  
  def Cancel(): Unit
  
  val Count: Double
  
  def Item(Index: Double): ResampleMediaTask
  
  def Pause(): Unit
  
  val PercentComplete: Double
  
  /* private */ @JSName("PowerPoint.ResampleMediaTasks_typekey")
  var PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks
  
  def Resume(): Unit
}
object ResampleMediaTasks {
  
  inline def apply(
    Cancel: Callback,
    Count: Double,
    Item: Double => ResampleMediaTask,
    Pause: Callback,
    PercentComplete: Double,
    PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks,
    Resume: Callback
  ): ResampleMediaTasks = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Pause = Pause.toJsFn, PercentComplete = PercentComplete.asInstanceOf[js.Any], Resume = Resume.toJsFn)
    __obj.updateDynamic("PowerPoint.ResampleMediaTasks_typekey")(PowerPointDotResampleMediaTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTasks]
  }
  
  extension [Self <: ResampleMediaTasks](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "Cancel", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ResampleMediaTask): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "Pause", value.toJsFn)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "PercentComplete", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotResampleMediaTasks_typekey(value: ResampleMediaTasks): Self = StObject.set(x, "PowerPoint.ResampleMediaTasks_typekey", value.asInstanceOf[js.Any])
    
    inline def setResume(value: Callback): Self = StObject.set(x, "Resume", value.toJsFn)
  }
}
