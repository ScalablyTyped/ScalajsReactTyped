package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the RadarAxis class.
  */
@JSGlobal("ASPxClientRadarAxis")
@js.native
open class ASPxClientRadarAxis ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientAxisBase {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typingsJapgolly.devexpressWeb.ASPxClientWebChart = js.native
  
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
}
