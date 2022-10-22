package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.Polyline_
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.PathOptionslatLngsArrayLaAttribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "Polyline")
@js.native
open class Polyline protected ()
  extends SvelteComponentTyped[PathOptionslatLngsArrayLaAttribution, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[PathOptionslatLngsArrayLaAttribution]) = this()
  
  def getPolyline(): Polyline_[LineString | MultiLineString, Any] = js.native
}
