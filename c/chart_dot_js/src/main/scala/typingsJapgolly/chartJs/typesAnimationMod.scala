package typingsJapgolly.chartJs

import typingsJapgolly.chartJs.chartJsStrings.complete
import typingsJapgolly.chartJs.chartJsStrings.progress
import typingsJapgolly.chartJs.mod.Chart
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.DefaultDataPoint
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnimationMod {
  
  @JSImport("chart.js/types/animation", "Animation")
  @js.native
  open class Animation protected () extends StObject {
    def this(cfg: AnyObject, target: AnyObject, prop: String) = this()
    def this(cfg: AnyObject, target: AnyObject, prop: String, to: Any) = this()
    
    def active(): Boolean = js.native
    
    def cancel(): Unit = js.native
    
    def tick(date: Double): Unit = js.native
    
    def update(cfg: AnyObject, to: Any, date: Double): Unit = js.native
  }
  
  @JSImport("chart.js/types/animation", "Animations")
  @js.native
  open class Animations protected () extends StObject {
    def this(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], animations: AnyObject) = this()
    
    def configure(animations: AnyObject): Unit = js.native
    
    def update(target: AnyObject, values: AnyObject): js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("chart.js/types/animation", "Animator")
  @js.native
  open class Animator () extends StObject {
    
    def add(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], items: js.Array[Animation]): Unit = js.native
    
    def has(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
    
    def listen(
      chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
      event: complete | progress,
      cb: js.Function1[/* event */ AnimationEvent, Unit]
    ): Unit = js.native
    
    def remove(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
    
    def running(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
    
    def start(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
    
    def stop(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
  }
  
  trait AnimationEvent extends StObject {
    
    var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
    
    var currentStep: Double
    
    var initial: Boolean
    
    var numSteps: Double
  }
  object AnimationEvent {
    
    inline def apply(
      chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
      currentStep: Double,
      initial: Boolean,
      numSteps: Double
    ): AnimationEvent = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], numSteps = numSteps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationEvent]
    }
    
    extension [Self <: AnimationEvent](x: Self) {
      
      inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setNumSteps(value: Double): Self = StObject.set(x, "numSteps", value.asInstanceOf[js.Any])
    }
  }
}
