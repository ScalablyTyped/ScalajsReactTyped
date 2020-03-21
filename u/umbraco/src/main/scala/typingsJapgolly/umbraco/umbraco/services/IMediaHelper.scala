package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.mediaHelper
  * @description A helper object used for dealing with media items
  */
trait IMediaHelper extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#detectIfImageByExtension
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns true/false, indicating if the given path has an allowed image extension
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def detectIfImageByExtension(imagePath: String): Boolean
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#formatFileTypes
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns a string with correctly formated file types for ng-file-upload
    *
    * @param {string} file types, ex: jpg,png,tiff
    */
  def formatFileTypes(file: String): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getImagePropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the actual image path associated with the image property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getImagePropertyValue(options: IMediaOptions): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getMediaPropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the file path associated with the media property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.mediaModel The media object to retrieve the image path from
    * @param {object} options.imageOnly Optional, if true then will only return a path if the media item is an image
    */
  def getMediaPropertyValue(options: IMediaOptions): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnail
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * formats the display model used to display the content to the model used to save the content
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getThumbnail(options: IMediaOptions): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnailFromPath
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the path to the thumbnail version of a given media library image path
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def getThumbnailFromPath(imagePath: String): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFile
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media object returned with the mediaResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFile(mediaItem: IMediaEntity, thumbnail: Boolean): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFileFromEntity
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media entity returned with the entityResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFileFromEntity(mediaEntity: IMediaEntity, thumbnail: Boolean): String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#scaleToMaxSize
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Finds the corrct max width and max height, given maximum dimensions and keeping aspect ratios
    *
    * @param {number} maxSize Maximum width & height
    * @param {number} width Current width
    * @param {number} height Current height
    */
  def scaleToMaxSize(maxSize: Double, width: Double, height: Double): js.Any
}

object IMediaHelper {
  @scala.inline
  def apply(
    detectIfImageByExtension: String => CallbackTo[Boolean],
    formatFileTypes: String => CallbackTo[String],
    getImagePropertyValue: IMediaOptions => CallbackTo[String],
    getMediaPropertyValue: IMediaOptions => CallbackTo[String],
    getThumbnail: IMediaOptions => CallbackTo[String],
    getThumbnailFromPath: String => CallbackTo[String],
    resolveFile: (IMediaEntity, Boolean) => CallbackTo[String],
    resolveFileFromEntity: (IMediaEntity, Boolean) => CallbackTo[String],
    scaleToMaxSize: (Double, Double, Double) => CallbackTo[js.Any]
  ): IMediaHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectIfImageByExtension")(js.Any.fromFunction1((t0: java.lang.String) => detectIfImageByExtension(t0).runNow()))
    __obj.updateDynamic("formatFileTypes")(js.Any.fromFunction1((t0: java.lang.String) => formatFileTypes(t0).runNow()))
    __obj.updateDynamic("getImagePropertyValue")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMediaOptions) => getImagePropertyValue(t0).runNow()))
    __obj.updateDynamic("getMediaPropertyValue")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMediaOptions) => getMediaPropertyValue(t0).runNow()))
    __obj.updateDynamic("getThumbnail")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMediaOptions) => getThumbnail(t0).runNow()))
    __obj.updateDynamic("getThumbnailFromPath")(js.Any.fromFunction1((t0: java.lang.String) => getThumbnailFromPath(t0).runNow()))
    __obj.updateDynamic("resolveFile")(js.Any.fromFunction2((t0: typingsJapgolly.umbraco.umbraco.services.IMediaEntity, t1: scala.Boolean) => resolveFile(t0, t1).runNow()))
    __obj.updateDynamic("resolveFileFromEntity")(js.Any.fromFunction2((t0: typingsJapgolly.umbraco.umbraco.services.IMediaEntity, t1: scala.Boolean) => resolveFileFromEntity(t0, t1).runNow()))
    __obj.updateDynamic("scaleToMaxSize")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => scaleToMaxSize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IMediaHelper]
  }
}

