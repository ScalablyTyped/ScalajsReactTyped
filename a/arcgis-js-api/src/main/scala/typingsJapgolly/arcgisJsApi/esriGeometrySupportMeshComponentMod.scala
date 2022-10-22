package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.MeshComponent
import typingsJapgolly.arcgisJsApi.esri.MeshComponentConstructor
import typingsJapgolly.arcgisJsApi.esri.MeshComponentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportMeshComponentMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeshComponentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
  @js.native
  /**
    * The MeshComponent class is used to apply one or more materials to a single [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html)
    */
  open class Class ()
    extends StObject
       with MeshComponent {
    def this(properties: MeshComponentProperties) = this()
  }
  
  type _To = js.Object & MeshComponentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometrySupportMeshComponentMod.foo` */
  override def _to: js.Object & MeshComponentConstructor = ^
}
