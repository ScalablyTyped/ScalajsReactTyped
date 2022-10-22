package typingsJapgolly.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The valid transit route type that can be specified in a <i><code><a
  * href="#TransitOptions">TransitOptions</a></code></i>. Specify these by
  * value, or by using the constant&#39;s name. For example,
  * <code>'LESS_WALKING'</code> or
  * <code>google.maps.TransitRoutePreference.LESS_WALKING</code>.
  */
@JSGlobal("google.maps.TransitRoutePreference")
@js.native
object TransitRoutePreference extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.TransitRoutePreference & String] = js.native
  
  /* "FEWER_TRANSFERS" */ val FEWER_TRANSFERS: typingsJapgolly.googleMaps.google.maps.TransitRoutePreference.FEWER_TRANSFERS & String = js.native
  
  /* "LESS_WALKING" */ val LESS_WALKING: typingsJapgolly.googleMaps.google.maps.TransitRoutePreference.LESS_WALKING & String = js.native
}
