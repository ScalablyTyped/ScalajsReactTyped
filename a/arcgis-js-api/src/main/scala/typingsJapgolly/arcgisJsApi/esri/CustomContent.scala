package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.HTMLElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.custom_
import typingsJapgolly.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  def creator(graphic: Graphic): String | HTMLElement | Widget_ | js.Promise[Any] = js.native
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  @JSName("creator")
  var creator_Original: PopupTemplateContentCreator = js.native
  
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  def destroyer(graphic: Graphic): scala.Unit = js.native
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  @JSName("destroyer")
  var destroyer_Original: PopupTemplateContentDestroyer = js.native
  
  /**
    * An array of field names used in the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * The type of popup element displayed.
    *
    * @default custom
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#type)
    */
  @JSName("type")
  val type_CustomContent: custom_ = js.native
}
