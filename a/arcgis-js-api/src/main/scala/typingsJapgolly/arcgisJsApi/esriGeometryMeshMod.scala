package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Mesh
import typingsJapgolly.arcgisJsApi.esri.MeshConstructor
import typingsJapgolly.arcgisJsApi.esri.MeshProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryMeshMod extends Shortcut {
  
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeshConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  /**
    * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
    */
  open class Class ()
    extends StObject
       with Mesh {
    def this(properties: MeshProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MeshConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometryMeshMod.foo` */
  override def _to: js.Object & MeshConstructor = ^
}
