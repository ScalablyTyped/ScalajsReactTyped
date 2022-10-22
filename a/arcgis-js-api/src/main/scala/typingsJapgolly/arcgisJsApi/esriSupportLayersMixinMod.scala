package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LayersMixin
import typingsJapgolly.arcgisJsApi.esri.LayersMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSupportLayersMixinMod extends Shortcut {
  
  @JSImport("esri/support/LayersMixin", JSImport.Namespace)
  @js.native
  val ^ : LayersMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/LayersMixin", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with LayersMixin
  
  type _To = LayersMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSupportLayersMixinMod.foo` */
  override def _to: LayersMixinConstructor = ^
}
