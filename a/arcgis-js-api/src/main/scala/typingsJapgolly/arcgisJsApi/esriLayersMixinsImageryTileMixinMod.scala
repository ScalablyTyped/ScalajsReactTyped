package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ImageryTileMixin
import typingsJapgolly.arcgisJsApi.esri.ImageryTileMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsImageryTileMixinMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ImageryTileMixin", JSImport.Namespace)
  @js.native
  val ^ : ImageryTileMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ImageryTileMixin", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with ImageryTileMixin
  
  type _To = ImageryTileMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsImageryTileMixinMod.foo` */
  override def _to: ImageryTileMixinConstructor = ^
}
