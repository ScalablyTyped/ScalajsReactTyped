package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.leaflet.mod.Control_.Scale
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.GetScaleControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "ScaleControl")
@js.native
open class ScaleControl protected ()
  extends SvelteComponentTyped[GetScaleControl, scala.Nothing, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetScaleControl]) = this()
  
  def getScaleControl(): Scale = js.native
}
