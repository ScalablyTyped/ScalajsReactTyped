package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Point
import typingsJapgolly.arcgisJsApi.esri.PointConstructor
import typingsJapgolly.arcgisJsApi.esri.PointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryPointMod extends Shortcut {
  
  @JSImport("esri/geometry/Point", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Point", JSImport.Namespace)
  @js.native
  /**
    * A location defined by X, Y, and Z coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
    */
  open class Class ()
    extends StObject
       with Point {
    def this(properties: PointProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometryPointMod.foo` */
  override def _to: js.Object & PointConstructor = ^
}
