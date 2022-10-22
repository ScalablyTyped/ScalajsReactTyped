package typingsJapgolly.leafletDraw.leafletMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DrawMap")
@js.native
open class DrawMap protected () extends Map_ {
  def this(element: String) = this()
  def this(element: HTMLElement) = this()
  def this(element: String, options: typingsJapgolly.leaflet.mod.MapOptions) = this()
  def this(element: HTMLElement, options: typingsJapgolly.leaflet.mod.MapOptions) = this()
  
  def addInitHook(): Unit = js.native
  
  def mergeOptions(): Unit = js.native
  def mergeOptions(options: MapOptions): Unit = js.native
}
