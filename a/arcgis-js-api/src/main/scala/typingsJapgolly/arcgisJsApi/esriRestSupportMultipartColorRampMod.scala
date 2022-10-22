package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.MultipartColorRamp
import typingsJapgolly.arcgisJsApi.esri.MultipartColorRampConstructor
import typingsJapgolly.arcgisJsApi.esri.MultipartColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportMultipartColorRampMod extends Shortcut {
  
  @JSImport("esri/rest/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MultipartColorRampConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  /**
    * Creates a multipart color ramp to combine multiple continuous color ramps for use in raster renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-MultipartColorRamp.html)
    */
  open class Class ()
    extends StObject
       with MultipartColorRamp {
    def this(properties: MultipartColorRampProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MultipartColorRampConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportMultipartColorRampMod.foo` */
  override def _to: js.Object & MultipartColorRampConstructor = ^
}
