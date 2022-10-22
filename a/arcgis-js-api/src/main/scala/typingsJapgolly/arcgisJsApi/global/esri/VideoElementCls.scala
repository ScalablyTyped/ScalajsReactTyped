package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.VideoElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.VideoElement")
@js.native
/**
  * Represents a video element referenced in the MediaLayer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html)
  */
open class VideoElementCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.VideoElement {
  def this(properties: VideoElementProperties) = this()
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  /* CompleteClass */
  var georeference: typingsJapgolly.arcgisJsApi.esri.ExtentAndRotationGeoreference | typingsJapgolly.arcgisJsApi.esri.CornersGeoreference = js.native
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  /* CompleteClass */
  var opacity: Double = js.native
}
