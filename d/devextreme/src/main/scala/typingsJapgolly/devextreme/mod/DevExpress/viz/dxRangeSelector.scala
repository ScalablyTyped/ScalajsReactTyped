package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRangeSelector
  extends StObject
     with BaseWidget[dxRangeSelectorOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the currently selected range.
    */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  
  /**
    * Redraws the UI component.
    */
  def render(skipChartAnimation: Boolean): Unit = js.native
  
  /**
    * Sets the selected range.
    */
  def setValue(value: js.Array[Double | String | js.Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}
object dxRangeSelector {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.continuous
    - typingsJapgolly.devextreme.devextremeStrings.discrete
    - typingsJapgolly.devextreme.devextremeStrings.logarithmic
    - typingsJapgolly.devextreme.devextremeStrings.semidiscrete
  */
  trait AxisScale extends StObject
  object AxisScale {
    
    inline def continuous: typingsJapgolly.devextreme.devextremeStrings.continuous = "continuous".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.continuous]
    
    inline def discrete: typingsJapgolly.devextreme.devextremeStrings.discrete = "discrete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.discrete]
    
    inline def logarithmic: typingsJapgolly.devextreme.devextremeStrings.logarithmic = "logarithmic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.logarithmic]
    
    inline def semidiscrete: typingsJapgolly.devextreme.devextremeStrings.semidiscrete = "semidiscrete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.semidiscrete]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.center
    - typingsJapgolly.devextreme.devextremeStrings.centerBottom
    - typingsJapgolly.devextreme.devextremeStrings.centerTop
    - typingsJapgolly.devextreme.devextremeStrings.full
    - typingsJapgolly.devextreme.devextremeStrings.leftBottom
    - typingsJapgolly.devextreme.devextremeStrings.leftCenter
    - typingsJapgolly.devextreme.devextremeStrings.leftTop
    - typingsJapgolly.devextreme.devextremeStrings.rightBottom
    - typingsJapgolly.devextreme.devextremeStrings.rightCenter
    - typingsJapgolly.devextreme.devextremeStrings.rightTop
  */
  trait BackgroundImageLocation extends StObject
  object BackgroundImageLocation {
    
    inline def center: typingsJapgolly.devextreme.devextremeStrings.center = "center".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.center]
    
    inline def centerBottom: typingsJapgolly.devextreme.devextremeStrings.centerBottom = "centerBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.centerBottom]
    
    inline def centerTop: typingsJapgolly.devextreme.devextremeStrings.centerTop = "centerTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.centerTop]
    
    inline def full: typingsJapgolly.devextreme.devextremeStrings.full = "full".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.full]
    
    inline def leftBottom: typingsJapgolly.devextreme.devextremeStrings.leftBottom = "leftBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.leftBottom]
    
    inline def leftCenter: typingsJapgolly.devextreme.devextremeStrings.leftCenter = "leftCenter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.leftCenter]
    
    inline def leftTop: typingsJapgolly.devextreme.devextremeStrings.leftTop = "leftTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.leftTop]
    
    inline def rightBottom: typingsJapgolly.devextreme.devextremeStrings.rightBottom = "rightBottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rightBottom]
    
    inline def rightCenter: typingsJapgolly.devextreme.devextremeStrings.rightCenter = "rightCenter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rightCenter]
    
    inline def rightTop: typingsJapgolly.devextreme.devextremeStrings.rightTop = "rightTop".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.rightTop]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.continuous
    - typingsJapgolly.devextreme.devextremeStrings.logarithmic
  */
  trait ChartAxisScale extends StObject
  object ChartAxisScale {
    
    inline def continuous: typingsJapgolly.devextreme.devextremeStrings.continuous = "continuous".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.continuous]
    
    inline def logarithmic: typingsJapgolly.devextreme.devextremeStrings.logarithmic = "logarithmic".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.logarithmic]
  }
  
  type DisposingEvent = EventInfo[dxRangeSelector]
  
  type DrawnEvent = EventInfo[dxRangeSelector]
  
  type ExportedEvent = EventInfo[dxRangeSelector]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxRangeSelector]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxRangeSelector]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxRangeSelectorOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.onMoving
    - typingsJapgolly.devextreme.devextremeStrings.onMovingComplete
  */
  trait ValueChangedCallMode extends StObject
  object ValueChangedCallMode {
    
    inline def onMoving: typingsJapgolly.devextreme.devextremeStrings.onMoving = "onMoving".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.onMoving]
    
    inline def onMovingComplete: typingsJapgolly.devextreme.devextremeStrings.onMovingComplete = "onMovingComplete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.onMovingComplete]
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxRangeSelector, MouseEvent | TouchEvent] {
    
    val previousValue: js.Array[Double | String | js.Date]
    
    val value: js.Array[Double | String | js.Date]
  }
  object ValueChangedEvent {
    
    inline def apply(
      component: dxRangeSelector,
      element: DxElement_[HTMLElement],
      previousValue: js.Array[Double | String | js.Date],
      value: js.Array[Double | String | js.Date]
    ): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    extension [Self <: ValueChangedEvent](x: Self) {
      
      inline def setPreviousValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "previousValue", js.Array(value*))
      
      inline def setValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
