package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.leaflet.mod.Tooltip_
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.EventsGetTooltip
import typingsJapgolly.svelteLeafletjs.anon.GetTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "Tooltip")
@js.native
open class Tooltip protected ()
  extends SvelteComponentTyped[GetTooltip, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[EventsGetTooltip]) = this()
  
  def getTooltip(): Tooltip_ = js.native
}
