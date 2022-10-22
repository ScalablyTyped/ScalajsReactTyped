package typingsJapgolly.imagekit.mod.global

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.imagekit.anon.Exif
import typingsJapgolly.imagekit.anon.Expire
import typingsJapgolly.imagekit.anon.PrivateKey
import typingsJapgolly.imagekit.imagekitStrings.Completed
import typingsJapgolly.imagekit.imagekitStrings.Pending
import typingsJapgolly.imagekit.mod.global.ImageKit.BulkDeleteFilesError
import typingsJapgolly.imagekit.mod.global.ImageKit.BulkDeleteFilesResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.Callback
import typingsJapgolly.imagekit.mod.global.ImageKit.FileDetailsOptions
import typingsJapgolly.imagekit.mod.global.ImageKit.FileDetailsResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.FileMetadataResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.ListFileOptions
import typingsJapgolly.imagekit.mod.global.ImageKit.ListFileResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.PurgeCacheResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.PurgeCacheStatusResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.UploadOptions
import typingsJapgolly.imagekit.mod.global.ImageKit.UploadResponse
import typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ImageKit")
@js.native
open class ImageKit protected () extends StObject {
  def this(options: PrivateKey) = this()
  
  /**
    * Deletes multiple files from the media library.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
    *
    * @param fileIds Each value should be a unique fileId of the uploaded file. fileId is returned in list files API and upload API
    */
  def bulkDeleteFiles(fileIds: js.Array[String]): js.Promise[BulkDeleteFilesResponse] = js.native
  /**
    * Deletes multiple files from the media library.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
    *
    * @param fileIds Each value should be a unique fileId of the uploaded file. fileId is returned in list files API and upload API
    * @param callback
    */
  def bulkDeleteFiles(fileIds: js.Array[String], callback: Callback[BulkDeleteFilesResponse, BulkDeleteFilesError]): Unit = js.native
  
  /**
    * You can programmatically delete uploaded files in media library using delete file API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-file}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API
    */
  def deleteFile(fileId: String): js.Promise[Unit] = js.native
  /**
    * You can programmatically delete uploaded files in media library using delete file API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-file}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API
    * @param callback
    */
  def deleteFile(fileId: String, callback: Callback[Unit, js.Error]): Unit = js.native
  
  /**
    * Authentication parameter generation
    *
    * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#authentication-parameter-generation}
    *
    * @param token
    * @param expire
    */
  def getAuthenticationParameters(): Expire = js.native
  def getAuthenticationParameters(token: String): Expire = js.native
  def getAuthenticationParameters(token: String, expire: Double): Expire = js.native
  def getAuthenticationParameters(token: Unit, expire: Double): Expire = js.native
  
  /**
    * Get the file details such as tags, customCoordinates, and isPrivate properties using get file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/get-file-details}
    *
    * @param fileId
    */
  def getFileDetails(fileId: String): js.Promise[FileDetailsResponse] = js.native
  /**
    * Get the file details such as tags, customCoordinates, and isPrivate properties using get file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/get-file-details}
    *
    * @param fileId
    * @param callback
    */
  def getFileDetails(fileId: String, callback: Callback[FileDetailsResponse, js.Error]): Unit = js.native
  
  /**
    * Get image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    */
  def getFileMetadata(fileId: String): js.Promise[FileMetadataResponse] = js.native
  /**
    * Get image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param callback
    */
  def getFileMetadata(fileId: String, callback: Callback[FileMetadataResponse, js.Error]): Unit = js.native
  
  /**
    * Get the status of submitted purge request.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status}
    *
    * @param cacheRequestId The requestId returned in response of purge cache API.
    */
  def getPurgeCacheStatus(cacheRequestId: String): js.Promise[PurgeCacheStatusResponse] = js.native
  /**
    * Get the status of submitted purge request.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status}
    *
    * @param cacheRequestId The requestId returned in response of purge cache API.
    * @param callback
    */
  def getPurgeCacheStatus(cacheRequestId: String, callback: Callback[PurgeCacheStatusResponse, js.Error]): Unit = js.native
  
  /**
    * This API can list all the uploaded files in your ImageKit.io media library.
    * For searching and filtering, you can use query parameters as described below.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    *
    * @param listFilesOptions
    */
  def listFiles(listFilesOptions: ListFileOptions): js.Promise[ListFileResponse] = js.native
  /**
    * This API can list all the uploaded files in your ImageKit.io media library.
    * For searching and filtering, you can use query parameters as described below.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    *
    * @param listFilesOptions
    * @param callback
    */
  def listFiles(listFilesOptions: ListFileOptions, callback: Callback[ListFileResponse, js.Error]): Unit = js.native
  
  /**
    * Perceptual Hash (pHash)
    * Distance between two pHash values can be calculated using utility function
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api#perceptual-hash-phash}
    *
    * @param hashA
    * @param hashB
    */
  def pHashDistance(hashA: String, hashB: String): Double = js.native
  
  /**
    * This will purge CDN and ImageKit.io internal cache.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache}
    *
    * @param fullUrl The exact URL of the file to be purged. For example - https://ik.imageki.io/your_imagekit_id/rest-of-the-file-path.jpg
    */
  def purgeCache(fullUrl: String): js.Promise[PurgeCacheResponse] = js.native
  /**
    * This will purge CDN and ImageKit.io internal cache.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache}
    *
    * @param fullUrl The exact URL of the file to be purged. For example - https://ik.imageki.io/your_imagekit_id/rest-of-the-file-path.jpg
    * @param callback
    */
  def purgeCache(fullUrl: String, callback: Callback[PurgeCacheResponse, js.Error]): Unit = js.native
  
  /**
    * Update file details such as tags and customCoordinates attribute using update file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param optionsFileDetails
    */
  def updateFileDetails(fileId: String, optionsFileDetails: FileDetailsOptions): js.Promise[FileDetailsResponse] = js.native
  /**
    * Update file details such as tags and customCoordinates attribute using update file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
    *
    * @param fileId The unique fileId of the uploaded file. fileId is returned in list files API and upload API.
    * @param optionsFileDetails
    * @param callback
    */
  def updateFileDetails(
    fileId: String,
    optionsFileDetails: FileDetailsOptions,
    callback: Callback[FileDetailsResponse, js.Error]
  ): Unit = js.native
  
  /**
    * You can upload files to ImageKit.io media library from your server-side using private API key authentication.
    *
    * File size limit
    * The maximum upload file size is limited to 25MB.
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload}
    *
    * @param uploadOptions
    */
  def upload(uploadOptions: UploadOptions): js.Promise[UploadResponse] = js.native
  /**
    * You can upload files to ImageKit.io media library from your server-side using private API key authentication.
    *
    * File size limit
    * The maximum upload file size is limited to 25MB.
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload}
    *
    * @param uploadOptions
    * @param callback
    */
  def upload(uploadOptions: UploadOptions, callback: Callback[UploadResponse, js.Error]): Unit = js.native
  
  /**
    * You can add multiple origins in the same ImageKit.io account.
    * URL endpoints allow you to configure which origins are accessible through your account and set their preference order as well.
    *
    * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#url-generation}
    * @see {@link https://docs.imagekit.io/integration/url-endpoints}
    *
    * @param urlOptions
    */
  def url(urlOptions: UrlOptions): String = js.native
}
object ImageKit {
  
  trait BulkDeleteFilesError
    extends StObject
       with Error {
    
    var help: String
    
    var missingFileIds: js.Array[String]
  }
  object BulkDeleteFilesError {
    
    inline def apply(help: String, message: String, missingFileIds: js.Array[String], name: String): BulkDeleteFilesError = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], missingFileIds = missingFileIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkDeleteFilesError]
    }
    
    extension [Self <: BulkDeleteFilesError](x: Self) {
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setMissingFileIds(value: js.Array[String]): Self = StObject.set(x, "missingFileIds", value.asInstanceOf[js.Any])
      
      inline def setMissingFileIdsVarargs(value: String*): Self = StObject.set(x, "missingFileIds", js.Array(value*))
    }
  }
  
  /**
    * Response when deleting multiple files from the media library.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/delete-files-bulk}
    */
  trait BulkDeleteFilesResponse extends StObject {
    
    /**
      * List of file ids of successfully deleted files
      */
    var successfullyDeletedFileIds: js.Array[String]
  }
  object BulkDeleteFilesResponse {
    
    inline def apply(successfullyDeletedFileIds: js.Array[String]): BulkDeleteFilesResponse = {
      val __obj = js.Dynamic.literal(successfullyDeletedFileIds = successfullyDeletedFileIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkDeleteFilesResponse]
    }
    
    extension [Self <: BulkDeleteFilesResponse](x: Self) {
      
      inline def setSuccessfullyDeletedFileIds(value: js.Array[String]): Self = StObject.set(x, "successfullyDeletedFileIds", value.asInstanceOf[js.Any])
      
      inline def setSuccessfullyDeletedFileIdsVarargs(value: String*): Self = StObject.set(x, "successfullyDeletedFileIds", js.Array(value*))
    }
  }
  
  type Callback[T, E /* <: js.Error */] = js.Function2[/* error */ js.UndefOr[E], /* response */ js.UndefOr[T], Unit]
  
  /**
    * Options when updating file details such as tags and customCoordinates attribute using update file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details}
    */
  trait FileDetailsOptions extends StObject {
    
    /**
      * Define an important area in the image.
      * Example - 50,50,500,500
      */
    var customCoordinates: js.UndefOr[String] = js.undefined
    
    /**
      * Array of tags associated with the file.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FileDetailsOptions {
    
    inline def apply(): FileDetailsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileDetailsOptions]
    }
    
    extension [Self <: FileDetailsOptions](x: Self) {
      
      inline def setCustomCoordinates(value: String): Self = StObject.set(x, "customCoordinates", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinatesUndefined: Self = StObject.set(x, "customCoordinates", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /**
    *
    * File details such as tags, customCoordinates, and isPrivate properties using get file detail API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/get-file-details}
    * @see {@link https://docs.imagekit.io/api-reference/media-api/update-file-details#understanding-response}
    */
  trait FileDetailsResponse extends StObject {
    
    /**
      * Value of custom coordinates associated with the image in format x,y,width,height.
      * If customCoordinates are not defined then it is null.
      */
    var customCoordinates: String | Null
    
    /**
      * The unique fileId of the uploaded file.
      */
    var fileId: String
    
    /**
      * The relative path of the file. In case of image, you can use this
      * path to construct different transformations.
      */
    var filePath: String
    
    /**
      * The type of file, it could be either image or non-image.
      */
    var fileType: FileType
    
    /**
      * Is the file marked as private. It can be either true or false.
      */
    var isPrivateFile: Boolean
    
    /**
      * Name of the file or folder.
      */
    var name: String
    
    /**
      * Array of tags associated with the image. If no tags are set, it will be null.
      */
    var tags: js.Array[String] | Null
    
    /**
      * In case of an image, a small thumbnail URL.
      */
    var thumbnail: String
    
    /**
      * Type of item. It can be either file or folder.
      */
    var `type`: Item
    
    /**
      * A publicly accessible URL of the file.
      */
    var url: String
  }
  object FileDetailsResponse {
    
    inline def apply(
      fileId: String,
      filePath: String,
      fileType: FileType,
      isPrivateFile: Boolean,
      name: String,
      thumbnail: String,
      `type`: Item,
      url: String
    ): FileDetailsResponse = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], isPrivateFile = isPrivateFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], customCoordinates = null, tags = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDetailsResponse]
    }
    
    extension [Self <: FileDetailsResponse](x: Self) {
      
      inline def setCustomCoordinates(value: String): Self = StObject.set(x, "customCoordinates", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinatesNull: Self = StObject.set(x, "customCoordinates", null)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setIsPrivateFile(value: Boolean): Self = StObject.set(x, "isPrivateFile", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setType(value: Item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link https://help.imagekit.io/en/articles/2434102-image-format-support-in-imagekit-for-resizing-compression-and-static-file-delivery}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imagekit.imagekitStrings.jpg
    - typingsJapgolly.imagekit.imagekitStrings.png
    - typingsJapgolly.imagekit.imagekitStrings.gif
    - typingsJapgolly.imagekit.imagekitStrings.svg
    - typingsJapgolly.imagekit.imagekitStrings.webp
    - typingsJapgolly.imagekit.imagekitStrings.pdf
    - typingsJapgolly.imagekit.imagekitStrings.js_
    - typingsJapgolly.imagekit.imagekitStrings.css
    - typingsJapgolly.imagekit.imagekitStrings.txt
    - typingsJapgolly.imagekit.imagekitStrings.mp4
    - typingsJapgolly.imagekit.imagekitStrings.webm
    - typingsJapgolly.imagekit.imagekitStrings.mov
    - typingsJapgolly.imagekit.imagekitStrings.swf
    - typingsJapgolly.imagekit.imagekitStrings.ts
    - typingsJapgolly.imagekit.imagekitStrings.m3u8
    - java.lang.String
  */
  type FileFormat = _FileFormat | String
  
  /**
    * Response when getting image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
    *
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
    */
  trait FileMetadataResponse extends StObject {
    
    var density: Double
    
    /**
      * @see {@link https://docs.imagekit.io/api-reference/metadata-api#exif}
      */
    var exif: Exif
    
    var format: FileFormat
    
    var hasColorProfile: Boolean
    
    var hasTransparency: Boolean
    
    var height: Double
    
    /**
      * @see {@link https://docs.imagekit.io/api-reference/metadata-api#perceptual-hash-phash}
      */
    var pHash: String
    
    var quality: Double
    
    var size: Double
    
    var width: Double
  }
  object FileMetadataResponse {
    
    inline def apply(
      density: Double,
      exif: Exif,
      format: FileFormat,
      hasColorProfile: Boolean,
      hasTransparency: Boolean,
      height: Double,
      pHash: String,
      quality: Double,
      size: Double,
      width: Double
    ): FileMetadataResponse = {
      val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hasColorProfile = hasColorProfile.asInstanceOf[js.Any], hasTransparency = hasTransparency.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pHash = pHash.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileMetadataResponse]
    }
    
    extension [Self <: FileMetadataResponse](x: Self) {
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setExif(value: Exif): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHasColorProfile(value: Boolean): Self = StObject.set(x, "hasColorProfile", value.asInstanceOf[js.Any])
      
      inline def setHasTransparency(value: Boolean): Self = StObject.set(x, "hasTransparency", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPHash(value: String): Self = StObject.set(x, "pHash", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type of files to include in result set. Accepts three values:
    * all - include all types of files in result set
    * image - only search in image type files
    * non-image - only search in files which are not image, e.g., JS or CSS or video files.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imagekit.imagekitStrings.all
    - typingsJapgolly.imagekit.imagekitStrings.image
    - typingsJapgolly.imagekit.imagekitStrings.`non-image`
  */
  trait FileType extends StObject
  object FileType {
    
    inline def all: typingsJapgolly.imagekit.imagekitStrings.all = "all".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.all]
    
    inline def image: typingsJapgolly.imagekit.imagekitStrings.image = "image".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.image]
    
    inline def `non-image`: typingsJapgolly.imagekit.imagekitStrings.`non-image` = "non-image".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.`non-image`]
  }
  
  /**
    * Type of returned item. It can be either file or folder.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imagekit.imagekitStrings.file
    - typingsJapgolly.imagekit.imagekitStrings.folder
  */
  trait Item extends StObject
  object Item {
    
    inline def file: typingsJapgolly.imagekit.imagekitStrings.file = "file".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.file]
    
    inline def folder: typingsJapgolly.imagekit.imagekitStrings.folder = "folder".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.folder]
  }
  
  /**
    * List and search files options
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
    */
  trait ListFileOptions extends StObject {
    
    /**
      * Type of files to include in result set. Accepts three values:
      * all - include all types of files in result set
      * image - only search in image type files
      * non-image - only search in files which are not image, e.g., JS or CSS or video files.
      */
    var fileType: js.UndefOr[FileType] = js.undefined
    
    /**
      * Whether to include folders in search results or not. By default only files are searched.
      * Accepts true and false. If this is set to true then tags and fileType parameters are ignored.
      */
    var includeFolder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of results to return in response:
      * Minimum value - 1
      * Maximum value - 1000
      * Default value - 1000
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the file or folder.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Folder path if you want to limit the search within a specific folder. For example, /sales-banner/ will only search in folder sales-banner.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The number of results to skip before returning results.
      * Minimum value - 0
      * Default value - 0
      */
    var skip: js.UndefOr[Double] = js.undefined
    
    /**
      * Comma-separated list of tags. Files matching any of the tags are included in result response. If no tag is matched, the file is not included in result set.
      */
    var tags: js.UndefOr[String] = js.undefined
  }
  object ListFileOptions {
    
    inline def apply(): ListFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListFileOptions]
    }
    
    extension [Self <: ListFileOptions](x: Self) {
      
      inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setIncludeFolder(value: Boolean): Self = StObject.set(x, "includeFolder", value.asInstanceOf[js.Any])
      
      inline def setIncludeFolderUndefined: Self = StObject.set(x, "includeFolder", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /**
    *
    * List and search response
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files#response-structure-and-status-code-application-json}
    */
  trait ListFileResponse extends StObject {
    
    /**
      * The date and time when the file was first uploaded. The format is `YYYY-MM-DDTHH:mm:ss.sssZ`.
      */
    var createdAt: String
    
    /**
      * Value of custom coordinates associated with the image in format x,y,width,height. If customCoordinates are not defined then it is null.
      */
    var customCoordinates: String | Null
    
    /**
      * The unique fileId of the uploaded file.
      */
    var fileId: String
    
    /**
      * The relative path of the file. In the case of an image, you can use this
      * path to construct different transformations.
      */
    var filePath: String
    
    /**
      * The type of file, it could be either image or non-image.
      */
    var fileType: FileType
    
    /**
      * Is the file marked as private. It can be either true or false.
      */
    var isPrivateFile: Boolean
    
    /**
      * Name of the file or folder.
      */
    var name: String
    
    /**
      * Array of tags associated with the image. If no tags are set, it will be null.
      */
    var tags: js.Array[String] | Null
    
    /**
      * In case of an image, a small thumbnail URL.
      */
    var thumbnail: String
    
    /**
      * Type of item. It can be either file or folder.
      */
    var `type`: Item
    
    /**
      * A publicly accessible URL of the file.
      */
    var url: String
  }
  object ListFileResponse {
    
    inline def apply(
      createdAt: String,
      fileId: String,
      filePath: String,
      fileType: FileType,
      isPrivateFile: Boolean,
      name: String,
      thumbnail: String,
      `type`: Item,
      url: String
    ): ListFileResponse = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], isPrivateFile = isPrivateFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], customCoordinates = null, tags = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFileResponse]
    }
    
    extension [Self <: ListFileResponse](x: Self) {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinates(value: String): Self = StObject.set(x, "customCoordinates", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinatesNull: Self = StObject.set(x, "customCoordinates", null)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setIsPrivateFile(value: Boolean): Self = StObject.set(x, "isPrivateFile", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setType(value: Item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Response when purging CDN and ImageKit.io internal cache
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache#response-structure-and-status-code}
    */
  trait PurgeCacheResponse extends StObject {
    
    /**
      * requestId can be used to fetch the status of submitted purge request.
      */
    var requestId: String
  }
  object PurgeCacheResponse {
    
    inline def apply(requestId: String): PurgeCacheResponse = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurgeCacheResponse]
    }
    
    extension [Self <: PurgeCacheResponse](x: Self) {
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Response when getting the status of submitted purge request.
    *
    * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status#understanding-response}
    */
  trait PurgeCacheStatusResponse extends StObject {
    
    /**
      * Pending - The request has been successfully submitted, and purging is in progress.
      * Complete - The purge request has been successfully completed. And now you should get a fresh object.
      * Check the Age header in response to confirm this.
      */
    var status: Pending | Completed
  }
  object PurgeCacheStatusResponse {
    
    inline def apply(status: Pending | Completed): PurgeCacheStatusResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurgeCacheStatusResponse]
    }
    
    extension [Self <: PurgeCacheStatusResponse](x: Self) {
      
      inline def setStatus(value: Pending | Completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see {@link https://docs.imagekit.io/features/image-transformations}
    */
  trait Transformation extends StObject {
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#aspect-ratio-ar}
      */
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#background-color-bg}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#blur-bl}
      */
    var blur: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#border-b}
      */
    var border: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#color-profile-cp}
      */
    var colorProfile: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#crop-crop-modes-and-focus}
      */
    var crop: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#crop-crop-modes-and-focus}
      */
    var cropMode: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#default-image-di}
      */
    var defaultImage: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#dpr-dpr}
      */
    var dpr: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/image-enhancement-and-color-manipulation#contrast-stretch-e-contrast}
      */
    var effectContrast: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#grayscale-e-grayscale}
      */
    var effectGray: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/image-enhancement-and-color-manipulation#sharpen-e-sharpen}
      */
    var effectSharpen: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/image-enhancement-and-color-manipulation#unsharp-mask-e-usm}
      */
    var effectUSM: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#focus-fo}
      */
    var focus: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#format-f}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#width-w}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#lossless-webp-and-png-lo}
      */
    var lossless: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#image-metadata-md}
      */
    var metadata: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#named-transformation-n}
      */
    var named: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#original-image-orig}
      */
    var original: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-transparency-oa}
      */
    var overlayAlpha: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-background-obg}
      */
    var overlayBackground: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-focus-ofo}
      */
    var overlayFocus: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-height-oh}
      */
    var overlayHeight: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-image-oi}
      */
    var overlayImage: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#trimming-of-the-overlay-image}
      */
    var overlayImageTrim: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-text-ot}
      */
    var overlayText: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-text-color-otc}
      */
    var overlayTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-text-size-ots}
      */
    var overlayTextFontSize: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-text-typography-ott}
      */
    var overlayTextTypography: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-width-ow}
      */
    var overlayWidth: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-x-position-ox}
      */
    var overlayX: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/overlay#overlay-y-position-oy}
      */
    var overlayY: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#progressive-image-pr}
      */
    var progressive: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#quality-q}
      */
    var quality: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#radius-r}
      */
    var radius: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#rotate-rt}
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#trim-edges-t}
      */
    var trim: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#height-h}
      */
    var width: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#examples-focus-using-cropped-image-coordinates}
      */
    var x: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://docs.imagekit.io/features/image-transformations/resize-crop-and-other-transformations#examples-focus-using-cropped-image-coordinates}
      */
    var y: js.UndefOr[String] = js.undefined
  }
  object Transformation {
    
    inline def apply(): Transformation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transformation]
    }
    
    extension [Self <: Transformation](x: Self) {
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      inline def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropMode(value: String): Self = StObject.set(x, "cropMode", value.asInstanceOf[js.Any])
      
      inline def setCropModeUndefined: Self = StObject.set(x, "cropMode", js.undefined)
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setDefaultImage(value: String): Self = StObject.set(x, "defaultImage", value.asInstanceOf[js.Any])
      
      inline def setDefaultImageUndefined: Self = StObject.set(x, "defaultImage", js.undefined)
      
      inline def setDpr(value: String): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
      
      inline def setDprUndefined: Self = StObject.set(x, "dpr", js.undefined)
      
      inline def setEffectContrast(value: String): Self = StObject.set(x, "effectContrast", value.asInstanceOf[js.Any])
      
      inline def setEffectContrastUndefined: Self = StObject.set(x, "effectContrast", js.undefined)
      
      inline def setEffectGray(value: String): Self = StObject.set(x, "effectGray", value.asInstanceOf[js.Any])
      
      inline def setEffectGrayUndefined: Self = StObject.set(x, "effectGray", js.undefined)
      
      inline def setEffectSharpen(value: String): Self = StObject.set(x, "effectSharpen", value.asInstanceOf[js.Any])
      
      inline def setEffectSharpenUndefined: Self = StObject.set(x, "effectSharpen", js.undefined)
      
      inline def setEffectUSM(value: String): Self = StObject.set(x, "effectUSM", value.asInstanceOf[js.Any])
      
      inline def setEffectUSMUndefined: Self = StObject.set(x, "effectUSM", js.undefined)
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLossless(value: String): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNamed(value: String): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setOverlayAlpha(value: String): Self = StObject.set(x, "overlayAlpha", value.asInstanceOf[js.Any])
      
      inline def setOverlayAlphaUndefined: Self = StObject.set(x, "overlayAlpha", js.undefined)
      
      inline def setOverlayBackground(value: String): Self = StObject.set(x, "overlayBackground", value.asInstanceOf[js.Any])
      
      inline def setOverlayBackgroundUndefined: Self = StObject.set(x, "overlayBackground", js.undefined)
      
      inline def setOverlayFocus(value: String): Self = StObject.set(x, "overlayFocus", value.asInstanceOf[js.Any])
      
      inline def setOverlayFocusUndefined: Self = StObject.set(x, "overlayFocus", js.undefined)
      
      inline def setOverlayHeight(value: String): Self = StObject.set(x, "overlayHeight", value.asInstanceOf[js.Any])
      
      inline def setOverlayHeightUndefined: Self = StObject.set(x, "overlayHeight", js.undefined)
      
      inline def setOverlayImage(value: String): Self = StObject.set(x, "overlayImage", value.asInstanceOf[js.Any])
      
      inline def setOverlayImageTrim(value: String): Self = StObject.set(x, "overlayImageTrim", value.asInstanceOf[js.Any])
      
      inline def setOverlayImageTrimUndefined: Self = StObject.set(x, "overlayImageTrim", js.undefined)
      
      inline def setOverlayImageUndefined: Self = StObject.set(x, "overlayImage", js.undefined)
      
      inline def setOverlayText(value: String): Self = StObject.set(x, "overlayText", value.asInstanceOf[js.Any])
      
      inline def setOverlayTextColor(value: String): Self = StObject.set(x, "overlayTextColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayTextColorUndefined: Self = StObject.set(x, "overlayTextColor", js.undefined)
      
      inline def setOverlayTextFontSize(value: String): Self = StObject.set(x, "overlayTextFontSize", value.asInstanceOf[js.Any])
      
      inline def setOverlayTextFontSizeUndefined: Self = StObject.set(x, "overlayTextFontSize", js.undefined)
      
      inline def setOverlayTextTypography(value: String): Self = StObject.set(x, "overlayTextTypography", value.asInstanceOf[js.Any])
      
      inline def setOverlayTextTypographyUndefined: Self = StObject.set(x, "overlayTextTypography", js.undefined)
      
      inline def setOverlayTextUndefined: Self = StObject.set(x, "overlayText", js.undefined)
      
      inline def setOverlayWidth(value: String): Self = StObject.set(x, "overlayWidth", value.asInstanceOf[js.Any])
      
      inline def setOverlayWidthUndefined: Self = StObject.set(x, "overlayWidth", js.undefined)
      
      inline def setOverlayX(value: String): Self = StObject.set(x, "overlayX", value.asInstanceOf[js.Any])
      
      inline def setOverlayXUndefined: Self = StObject.set(x, "overlayX", js.undefined)
      
      inline def setOverlayY(value: String): Self = StObject.set(x, "overlayY", value.asInstanceOf[js.Any])
      
      inline def setOverlayYUndefined: Self = StObject.set(x, "overlayY", js.undefined)
      
      inline def setProgressive(value: String): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setTrim(value: String): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imagekit.imagekitStrings.path
    - typingsJapgolly.imagekit.imagekitStrings.query
  */
  trait TransformationPosition extends StObject
  object TransformationPosition {
    
    inline def path: typingsJapgolly.imagekit.imagekitStrings.path = "path".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.path]
    
    inline def query: typingsJapgolly.imagekit.imagekitStrings.query = "query".asInstanceOf[typingsJapgolly.imagekit.imagekitStrings.query]
  }
  
  /**
    * Options used when uploading a file
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload#request-structure-multipart-form-data}
    */
  trait UploadOptions extends StObject {
    
    /**
      * Define an important area in the image. This is only relevant for image type files.
      * To be passed as a string with the x and y coordinates of the top-left corner, and width and height of the area of interest in format x,y,width,height. For example - 10,10,100,100
      * Can be used with fo-customtransformation.
      * If this field is not specified and the file is overwritten, then customCoordinates will be removed.
      */
    var customCoordinates: js.UndefOr[String] = js.undefined
    
    /**
      * This field accepts three kinds of values:
      * - binary - You can send the content of the file as binary. This is used when a file is being uploaded from the browser.
      * - base64 - Base64 encoded string of file content.
      * - url - URL of the file from where to download the content before uploading.
      *      Downloading file from URL might take longer, so it is recommended that you pass the binary or base64 content of the file.
      *      Pass the full URL, for example - https://www.example.com/rest-of-the-image-path.jpg.
      */
    var file: String | Buffer
    
    /**
      * The name with which the file has to be uploaded.
      * The file name can contain:
      * - Alphanumeric Characters: a-z , A-Z , 0-9
      * - Special Characters: . _ and -
      * Any other character including space will be replaced by _
      */
    var fileName: String
    
    /**
      * The folder path (e.g. /images/folder/) in which the image has to be uploaded. If the folder(s) didn't exist before, a new folder(s) is created.
      * The folder name can contain:
      * - Alphanumeric Characters: a-z , A-Z , 0-9
      * - Special Characters: / _ and -
      * - Using multiple / creates a nested folder.
      * Default value - /
      */
    var folder: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to mark the file as private or not. This is only relevant for image type files.
      * - Accepts true or false.
      * - If set true, the file is marked as private which restricts access to the original image URL and unnamed image transformations without signed URLs.
      *      Without the signed URL, only named transformations work on private images
      * Default value - false
      */
    var isPrivateFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Comma-separated values of the fields that you want ImageKit.io to return in response.
      *
      * For example, set the value of this field to tags,customCoordinates,isPrivateFile,metadata to get value of tags, customCoordinates, isPrivateFile , and metadata in the response.
      */
    var responseFields: js.UndefOr[String] = js.undefined
    
    /**
      * Set the tags while uploading the file.
      * - Comma-separated value of tags in format tag1,tag2,tag3. For example - t-shirt,round-neck,men
      * - The maximum length of all characters should not exceed 500.
      * - % is not allowed.
      * - If this field is not specified and the file is overwritten then the tags will be removed.
      */
    var tags: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to use a unique filename for this file or not.
      * - Accepts true or false.
      * - If set true, ImageKit.io will add a unique suffix to the filename parameter to get a unique filename.
      * - If set false, then the image is uploaded with the provided filename parameter and any existing file with the same name is replaced.
      * Default value - true
      */
    var useUniqueFileName: js.UndefOr[Boolean] = js.undefined
  }
  object UploadOptions {
    
    inline def apply(file: String | Buffer, fileName: String): UploadOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptions]
    }
    
    extension [Self <: UploadOptions](x: Self) {
      
      inline def setCustomCoordinates(value: String): Self = StObject.set(x, "customCoordinates", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinatesUndefined: Self = StObject.set(x, "customCoordinates", js.undefined)
      
      inline def setFile(value: String | Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setIsPrivateFile(value: Boolean): Self = StObject.set(x, "isPrivateFile", value.asInstanceOf[js.Any])
      
      inline def setIsPrivateFileUndefined: Self = StObject.set(x, "isPrivateFile", js.undefined)
      
      inline def setResponseFields(value: String): Self = StObject.set(x, "responseFields", value.asInstanceOf[js.Any])
      
      inline def setResponseFieldsUndefined: Self = StObject.set(x, "responseFields", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUseUniqueFileName(value: Boolean): Self = StObject.set(x, "useUniqueFileName", value.asInstanceOf[js.Any])
      
      inline def setUseUniqueFileNameUndefined: Self = StObject.set(x, "useUniqueFileName", js.undefined)
    }
  }
  
  /**
    * Response from uploading a file
    *
    * @see {@link https://docs.imagekit.io/api-reference/upload-file-api/server-side-file-upload#response-code-and-structure-json}
    */
  trait UploadResponse extends StObject {
    
    /**
      * Value of custom coordinates associated with the image in format x,y,width,height.
      */
    var customCoordinates: String | Null
    
    /**
      * Unique fileId. Store this fileld in your database, as this will be used to perform update action on this file.
      */
    var fileId: String
    
    /**
      * The path of the file uploaded. It includes any folder that you specified while uploading.
      */
    var filePath: String
    
    /**
      * Type of file. It can either be image or non-image.
      */
    var fileType: FileType
    
    /**
      * Height of the uploaded image file. Only applicable when file type is image.
      */
    var height: Double
    
    /**
      * Is the file marked as private. It can be either true or false.
      */
    var isPrivateFile: Boolean
    
    /**
      * The metadata of the upload file. Use responseFields property in request to get the metadata returned in response of upload API.
      */
    var metadata: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the uploaded file.
      */
    var name: String
    
    /**
      * Size of the uploaded file in bytes.
      */
    var size: Double
    
    /**
      * Array of tags associated with the image.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * In case of an image, a small thumbnail URL.
      */
    var thumbnailUrl: String
    
    /**
      * The URL of the file.
      */
    var url: String
    
    /**
      * Width of the uploaded image file. Only applicable when file type is image.
      */
    var width: Double
  }
  object UploadResponse {
    
    inline def apply(
      fileId: String,
      filePath: String,
      fileType: FileType,
      height: Double,
      isPrivateFile: Boolean,
      name: String,
      size: Double,
      thumbnailUrl: String,
      url: String,
      width: Double
    ): UploadResponse = {
      val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isPrivateFile = isPrivateFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnailUrl = thumbnailUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], customCoordinates = null)
      __obj.asInstanceOf[UploadResponse]
    }
    
    extension [Self <: UploadResponse](x: Self) {
      
      inline def setCustomCoordinates(value: String): Self = StObject.set(x, "customCoordinates", value.asInstanceOf[js.Any])
      
      inline def setCustomCoordinatesNull: Self = StObject.set(x, "customCoordinates", null)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsPrivateFile(value: Boolean): Self = StObject.set(x, "isPrivateFile", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for generating an URL
    *
    * @see {@link https://github.com/imagekit-developer/imagekit-nodejs#url-generation}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsSrc
    - typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsPath
  */
  trait UrlOptions extends StObject
  object UrlOptions {
    
    inline def UrlOptionsPath(path: String): typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsPath]
    }
    
    inline def UrlOptionsSrc(src: String): typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsSrc = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.imagekit.mod.global.ImageKit.UrlOptionsSrc]
    }
  }
  
  trait UrlOptionsBase extends StObject {
    
    /**
      * Meant to be used along with the signed parameter to specify the time in seconds from now when the URL should expire.
      * If specified, the URL contains the expiry timestamp in the URL and the image signature is modified accordingly.
      */
    var expireSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * These are the other query parameters that you want to add to the final URL.
      * These can be any query parameters and not necessarily related to ImageKit.
      * Especially useful, if you want to add some versioning parameter to your URLs.
      */
    var queryParameters: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    /**
      * Default is false. If set to true, the SDK generates a signed image URL adding the image signature to the image URL.
      * If you are creating URL using src parameter instead of path then do correct urlEndpoint for this to work.
      * Otherwise returned URL will have wrong signature.
      */
    var signed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of objects specifying the transformations to be applied in the URL.
      * The transformation name and the value should be specified as a key-value pair in each object.
      * @see {@link https://docs.imagekit.io/features/image-transformations/chained-transformations}
      */
    var transformation: js.UndefOr[js.Array[Transformation]] = js.undefined
    
    /**
      * Default value is path that places the transformation string as a path parameter in the URL.
      * Can also be specified as query which adds the transformation string as the query parameter tr in the URL.
      * If you use src parameter to create the URL, then the transformation string is always added as a query parameter.
      */
    var transformationPosition: js.UndefOr[TransformationPosition] = js.undefined
    
    /**
      * The base URL to be appended before the path of the image.
      * If not specified, the URL Endpoint specified at the time of SDK initialization is used.
      */
    var urlEndpoint: js.UndefOr[String] = js.undefined
  }
  object UrlOptionsBase {
    
    inline def apply(): UrlOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlOptionsBase]
    }
    
    extension [Self <: UrlOptionsBase](x: Self) {
      
      inline def setExpireSeconds(value: Double): Self = StObject.set(x, "expireSeconds", value.asInstanceOf[js.Any])
      
      inline def setExpireSecondsUndefined: Self = StObject.set(x, "expireSeconds", js.undefined)
      
      inline def setQueryParameters(value: StringDictionary[String | Double]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      inline def setTransformation(value: js.Array[Transformation]): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
      
      inline def setTransformationPosition(value: TransformationPosition): Self = StObject.set(x, "transformationPosition", value.asInstanceOf[js.Any])
      
      inline def setTransformationPositionUndefined: Self = StObject.set(x, "transformationPosition", js.undefined)
      
      inline def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
      
      inline def setTransformationVarargs(value: Transformation*): Self = StObject.set(x, "transformation", js.Array(value*))
      
      inline def setUrlEndpoint(value: String): Self = StObject.set(x, "urlEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUrlEndpointUndefined: Self = StObject.set(x, "urlEndpoint", js.undefined)
    }
  }
  
  trait UrlOptionsPath
    extends StObject
       with UrlOptionsBase
       with UrlOptions {
    
    /**
      * Conditional. This is the path at which the image exists.
      * For example, /path/to/image.jpg. Either the path or src parameter need to be specified for URL generation.
      */
    var path: String
    
    var src: js.UndefOr[scala.Nothing] = js.undefined
  }
  object UrlOptionsPath {
    
    inline def apply(path: String): UrlOptionsPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlOptionsPath]
    }
    
    extension [Self <: UrlOptionsPath](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlOptionsSrc
    extends StObject
       with UrlOptionsBase
       with UrlOptions {
    
    var path: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * Conditional. This is the complete URL of an image already mapped to ImageKit.
      * For example, https://ik.imagekit.io/your_imagekit_id/endpoint/path/to/image.jpg.
      * Either the path or src parameter need to be specified for URL generation.
      */
    var src: String
  }
  object UrlOptionsSrc {
    
    inline def apply(src: String): UrlOptionsSrc = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlOptionsSrc]
    }
    
    extension [Self <: UrlOptionsSrc](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FileFormat extends StObject
}
