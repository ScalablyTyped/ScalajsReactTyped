package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometricEffectOffsetMethod extends StObject
@JSGlobal("__esri.CIM.GeometricEffectOffsetMethod")
@js.native
object GeometricEffectOffsetMethod extends StObject {
  
  /**
    * Bevelled - follows the shortest straight path across a corner of the line or polygon.
    */
  @js.native
  sealed trait Bevelled
    extends StObject
       with GeometricEffectOffsetMethod
  
  /**
    * Mitered - matches the exact shape around a corner of the line or polygon.
    */
  @js.native
  sealed trait Mitered
    extends StObject
       with GeometricEffectOffsetMethod
  
  /**
    * Rounded - follows a path of equal distance around a corner of the line or polygon.
    */
  @js.native
  sealed trait Rounded
    extends StObject
       with GeometricEffectOffsetMethod
  
  /**
    * Square - follows a straight path across the corner of a line or polygon.
    */
  @js.native
  sealed trait Square
    extends StObject
       with GeometricEffectOffsetMethod
}
