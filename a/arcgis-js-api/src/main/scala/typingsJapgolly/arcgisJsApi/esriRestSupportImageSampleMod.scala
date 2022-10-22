package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ImageSample
import typingsJapgolly.arcgisJsApi.esri.ImageSampleConstructor
import typingsJapgolly.arcgisJsApi.esri.ImageSampleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportImageSampleMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageSample", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageSampleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageSample", JSImport.Namespace)
  @js.native
  /**
    * The [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) returns [ImageSampleResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html) containing array of this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html)
    */
  open class Class ()
    extends StObject
       with ImageSample {
    def this(properties: ImageSampleProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageSampleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportImageSampleMod.foo` */
  override def _to: js.Object & ImageSampleConstructor = ^
}
