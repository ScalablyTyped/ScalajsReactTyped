package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.leaflet.mod.TileLayer_
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.GetTileLayer
import typingsJapgolly.svelteLeafletjs.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "TileLayer")
@js.native
open class TileLayer protected ()
  extends SvelteComponentTyped[GetTileLayer, TileLayerEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[Opacity]) = this()
  
  def getTileLayer(): TileLayer_ = js.native
}
