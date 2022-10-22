package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentQuery
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The file format that is supported by query attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#attachmentTypes)
    */
  var attachmentTypes: js.Array[String] = js.native
  
  /**
    * The where clause to be applied to attachment queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#attachmentsWhere)
    */
  var attachmentsWhere: String = js.native
  
  /**
    * Indicates if the service should cache the attachment query results.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#cacheHint)
    */
  var cacheHint: Boolean = js.native
  
  /**
    * An array of globalIds for the features in the layer being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#globalIds)
    */
  var globalIds: js.Array[Double] = js.native
  
  /**
    * Used to query for attachments that match the provided `keywords`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#keywords)
    */
  var keywords: js.Array[String] = js.native
  
  /**
    * Used to query for attachments that match this `name`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#name)
    */
  var name: String = js.native
  
  /**
    * The number of features to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#num)
    */
  var num: Double = js.native
  
  /**
    * An array of objectIds of the features to be queried for attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#objectIds)
    */
  var objectIds: js.Array[Double] = js.native
  
  /**
    * If `true`, the [Exchangeable image file format](https://en.wikipedia.org/wiki/Exif) for the attachment will be included in [attachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#exifInfo).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#returnMetadata)
    */
  var returnMetadata: Boolean = js.native
  
  /**
    * The file size of the attachment is specified in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#size)
    */
  var size: js.Array[Double] = js.native
  
  /**
    * This option fetches query results by skipping a specified number of records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#start)
    */
  var start: Double = js.native
  
  /**
    * The `where` clause to be applied to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#where)
    */
  var where: String = js.native
}
