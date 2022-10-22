package typingsJapgolly.svelteLeafletjs.mod

import typingsJapgolly.leaflet.mod.ImageOverlay_
import typingsJapgolly.svelte.mod.SvelteComponentTyped
import typingsJapgolly.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typingsJapgolly.svelteLeafletjs.anon.Bounds
import typingsJapgolly.svelteLeafletjs.anon.GetImageOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "ImageOverlay")
@js.native
open class ImageOverlay protected ()
  extends SvelteComponentTyped[Bounds, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetImageOverlay]) = this()
  
  def getImageOverlay(): ImageOverlay_ = js.native
}
