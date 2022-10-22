package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Camera
import typingsJapgolly.arcgisJsApi.esri.CameraConstructor
import typingsJapgolly.arcgisJsApi.esri.CameraProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCameraMod extends Shortcut {
  
  @JSImport("esri/Camera", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CameraConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Camera", JSImport.Namespace)
  @js.native
  /**
    * The camera defines the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position), [tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt), and [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) of the point from which the [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) visible extent is observed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
    */
  open class Class ()
    extends StObject
       with Camera {
    def this(properties: CameraProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & CameraConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCameraMod.foo` */
  override def _to: js.Object & CameraConstructor = ^
}
