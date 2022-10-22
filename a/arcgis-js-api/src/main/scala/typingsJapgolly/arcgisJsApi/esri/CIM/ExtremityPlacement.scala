package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtremityPlacement extends StObject
@JSGlobal("__esri.CIM.ExtremityPlacement")
@js.native
object ExtremityPlacement extends StObject {
  
  /**
    * Both - marker is placed at the beginning and end of the line.
    */
  @js.native
  sealed trait Both
    extends StObject
       with ExtremityPlacement
  
  /**
    * JustBegin - marker is placed at the beginning of the line, determined by the direction that the line was digitized.
    */
  @js.native
  sealed trait JustBegin
    extends StObject
       with ExtremityPlacement
  
  /**
    * JustEnd - marker is placed at the end of the line, determined by the direction that the line was digitized.
    */
  @js.native
  sealed trait JustEnd
    extends StObject
       with ExtremityPlacement
  
  /**
    * None - no marker is placed at either end of the marker.
    */
  @js.native
  sealed trait None
    extends StObject
       with ExtremityPlacement
}
