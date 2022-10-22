package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.VirtualLighting
import typingsJapgolly.arcgisJsApi.esri.VirtualLightingConstructor
import typingsJapgolly.arcgisJsApi.esri.VirtualLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentVirtualLightingMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/VirtualLighting", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VirtualLightingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/VirtualLighting", JSImport.Namespace)
  @js.native
  /**
    * The VirtualLighting class allows you to change the lighting in the scene to virtual light.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html)
    */
  open class Class ()
    extends StObject
       with VirtualLighting {
    def this(properties: VirtualLightingProperties) = this()
  }
  
  type _To = js.Object & VirtualLightingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dEnvironmentVirtualLightingMod.foo` */
  override def _to: js.Object & VirtualLightingConstructor = ^
}
