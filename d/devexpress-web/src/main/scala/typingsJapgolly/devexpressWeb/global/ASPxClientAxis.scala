package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Axis class.
  */
@JSGlobal("ASPxClientAxis")
@js.native
open class ASPxClientAxis ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientAxis {
  
  /**
    * Provides access to an axis title object.
    */
  /* CompleteClass */
  var axisTitle: typingsJapgolly.devexpressWeb.ASPxClientAxisTitle = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typingsJapgolly.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Provides access to the collection of the axis constant lines.
    */
  /* CompleteClass */
  var constantLines: js.Array[typingsJapgolly.devexpressWeb.ASPxClientConstantLine] = js.native
  
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  /* CompleteClass */
  var diagram: typingsJapgolly.devexpressWeb.ASPxClientXYDiagramBase = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Provides acess to the range of the axis coordinates.
    */
  /* CompleteClass */
  var range: typingsJapgolly.devexpressWeb.ASPxClientAxisRange = js.native
  
  /**
    * Gets a value indicating whether the axis is reversed.
    */
  /* CompleteClass */
  var reverse: Boolean = js.native
  
  /**
    * Provides access to the axis strips collection.
    */
  /* CompleteClass */
  var strips: js.Array[typingsJapgolly.devexpressWeb.ASPxClientStrip] = js.native
}
