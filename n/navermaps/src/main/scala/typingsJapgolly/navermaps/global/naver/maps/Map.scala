package typingsJapgolly.navermaps.global.naver.maps

import org.scalajs.dom.HTMLElement
import typingsJapgolly.navermaps.naver.maps.MapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map
@JSGlobal("naver.maps.Map")
@js.native
open class Map protected ()
  extends StObject
     with typingsJapgolly.navermaps.naver.maps.Map {
  def this(mapDiv: String) = this()
  def this(mapDiv: HTMLElement) = this()
  def this(mapDiv: String, mapOptions: MapOptions) = this()
  def this(mapDiv: HTMLElement, mapOptions: MapOptions) = this()
}
