package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.StylePattern3D
import typingsJapgolly.arcgisJsApi.esri.StylePattern3DConstructor
import typingsJapgolly.arcgisJsApi.esri.StylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsPatternsStylePattern3DMod extends Shortcut {
  
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & StylePattern3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  /**
    * Renders polygons with predefined style pattern fills.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html)
    */
  open class Class ()
    extends StObject
       with StylePattern3D {
    def this(properties: StylePattern3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & StylePattern3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsPatternsStylePattern3DMod.foo` */
  override def _to: js.Object & StylePattern3DConstructor = ^
}
