package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.MouseEvent
import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomcancel
import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomend
import typingsJapgolly.mapboxGl.mapboxGlStrings.boxzoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapBoxZoomEvent extends MapboxEvent[MouseEvent] {
  
  var boxZoomBounds: LngLatBounds = js.native
  
  @JSName("type")
  var type_MapBoxZoomEvent: boxzoomstart | boxzoomend | boxzoomcancel = js.native
}
