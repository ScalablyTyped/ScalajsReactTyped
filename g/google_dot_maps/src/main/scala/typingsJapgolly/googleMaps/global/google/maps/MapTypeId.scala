package typingsJapgolly.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'satellite'</code> or
  * <code>google.maps.MapTypeId.SATELLITE</code>.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.MapTypeId & String] = js.native
  
  /* "hybrid" */ val HYBRID: typingsJapgolly.googleMaps.google.maps.MapTypeId.HYBRID & String = js.native
  
  /* "roadmap" */ val ROADMAP: typingsJapgolly.googleMaps.google.maps.MapTypeId.ROADMAP & String = js.native
  
  /* "satellite" */ val SATELLITE: typingsJapgolly.googleMaps.google.maps.MapTypeId.SATELLITE & String = js.native
  
  /* "terrain" */ val TERRAIN: typingsJapgolly.googleMaps.google.maps.MapTypeId.TERRAIN & String = js.native
}
