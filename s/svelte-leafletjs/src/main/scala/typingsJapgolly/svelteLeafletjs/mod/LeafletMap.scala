package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.GetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "LeafletMap")
@js.native
open class LeafletMap protected ()
  extends SvelteComponentTyped[GetMap, MapEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetMap]) = this()
  
  def getMap(): Map_ = js.native
}
