package typingsJapgolly.kakaomaps.global.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.LatLngBounds")
@js.native
open class LatLngBounds ()
  extends StObject
     with typingsJapgolly.kakaomaps.kakao.maps.LatLngBounds {
  def this(sw: typingsJapgolly.kakaomaps.kakao.maps.LatLng) = this()
  def this(sw: Unit, ne: typingsJapgolly.kakaomaps.kakao.maps.LatLng) = this()
  def this(sw: typingsJapgolly.kakaomaps.kakao.maps.LatLng, ne: typingsJapgolly.kakaomaps.kakao.maps.LatLng) = this()
  
  /* CompleteClass */
  override def contain(latlng: typingsJapgolly.kakaomaps.kakao.maps.LatLng): Boolean = js.native
  
  /* CompleteClass */
  override def equals(latlngBounds: typingsJapgolly.kakaomaps.kakao.maps.LatLngBounds): Boolean = js.native
  
  /* CompleteClass */
  override def extend(latlng: typingsJapgolly.kakaomaps.kakao.maps.LatLng): Unit = js.native
  
  /* CompleteClass */
  override def getNorthEast(): typingsJapgolly.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def getSouthWest(): typingsJapgolly.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
}
