package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ImageSampleResult
import typingsJapgolly.arcgisJsApi.esri.ImageSampleResultConstructor
import typingsJapgolly.arcgisJsApi.esri.ImageSampleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportImageSampleResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageSampleResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageSampleResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageSampleResult", JSImport.Namespace)
  @js.native
  /**
    * The result from the [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) containing array of [ImageSample](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html)
    */
  open class Class ()
    extends StObject
       with ImageSampleResult {
    def this(properties: ImageSampleResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageSampleResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportImageSampleResultMod.foo` */
  override def _to: js.Object & ImageSampleResultConstructor = ^
}
