package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeId extends StObject
/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'satellite'</code> or
  * <code>google.maps.MapTypeId.SATELLITE</code>.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends StObject {
  
  /**
    * This map type displays a transparent layer of major streets on satellite
    * images.
    */
  @js.native
  sealed trait HYBRID
    extends StObject
       with MapTypeId
  
  /**
    * This map type displays a normal street map.
    */
  @js.native
  sealed trait ROADMAP
    extends StObject
       with MapTypeId
  
  /**
    * This map type displays satellite images.
    */
  @js.native
  sealed trait SATELLITE
    extends StObject
       with MapTypeId
  
  /**
    * This map type displays maps with physical features such as terrain and
    * vegetation.
    */
  @js.native
  sealed trait TERRAIN
    extends StObject
       with MapTypeId
}
