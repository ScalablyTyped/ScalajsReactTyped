package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
@JSGlobal("ASPxClientDiagramCoordinates")
@js.native
open class ASPxClientDiagramCoordinates ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramCoordinates {
  
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  /* CompleteClass */
  override def GetAxisValue(axis: typingsJapgolly.devexpressWeb.ASPxClientAxisBase): typingsJapgolly.devexpressWeb.ASPxClientAxisValue = js.native
  
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  /* CompleteClass */
  override def IsEmpty(): Boolean = js.native
  
  /**
    * Gets the type of the argument scale.
    */
  /* CompleteClass */
  var argumentScaleType: String = js.native
  
  /**
    * Gets the X-axis of the diagram point.
    */
  /* CompleteClass */
  var axisX: typingsJapgolly.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the Y-axis of the diagram point.
    */
  /* CompleteClass */
  var axisY: typingsJapgolly.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the date-time representation of the data point's argument.
    */
  /* CompleteClass */
  var dateTimeArgument: js.Date = js.native
  
  /**
    * Gets the date-time representation of the data point's value.
    */
  /* CompleteClass */
  var dateTimeValue: js.Date = js.native
  
  /**
    * Gets the numerical representation of the data point's argument.
    */
  /* CompleteClass */
  var numericalArgument: Double = js.native
  
  /**
    * Gets the numerical representation of the data point's value.
    */
  /* CompleteClass */
  var numericalValue: Double = js.native
  
  /**
    * Gets the pane of the diagram point.
    */
  /* CompleteClass */
  var pane: typingsJapgolly.devexpressWeb.ASPxClientXYDiagramPane = js.native
  
  /**
    * Gets the argument of the data point as a text string.
    */
  /* CompleteClass */
  var qualitativeArgument: String = js.native
  
  /* CompleteClass */
  var timeSpanArgument: Any = js.native
  
  /* CompleteClass */
  var timeSpanValue: Any = js.native
  
  /**
    * Gets the type of the value scale.
    */
  /* CompleteClass */
  var valueScaleType: String = js.native
}
