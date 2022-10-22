package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.anon.MaxWidth
import typingsJapgolly.mapboxGl.mapboxGlStrings.imperial
import typingsJapgolly.mapboxGl.mapboxGlStrings.metric
import typingsJapgolly.mapboxGl.mapboxGlStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ScaleControl")
@js.native
open class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  def setUnit(unit: imperial | metric | nautical): Unit = js.native
}
