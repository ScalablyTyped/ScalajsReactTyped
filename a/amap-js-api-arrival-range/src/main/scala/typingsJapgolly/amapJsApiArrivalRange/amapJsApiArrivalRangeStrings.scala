package typingsJapgolly.amapJsApiArrivalRange

import typingsJapgolly.amapJsApiArrivalRange.AMap.ArrivalRange.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiArrivalRangeStrings {
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait coverage extends StObject
  inline def coverage: coverage = "coverage".asInstanceOf[coverage]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  inline def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait polygon extends StObject
  inline def polygon: polygon = "polygon".asInstanceOf[polygon]
}
