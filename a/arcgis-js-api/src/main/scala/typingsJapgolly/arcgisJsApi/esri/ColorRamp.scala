package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.algorithmic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorRamp
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ColorRamp.html#type)
    */
  val `type`: algorithmic | multipart = js.native
}
