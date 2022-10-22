package typingsJapgolly.reactNativeCommunityCameraroll

import typingsJapgolly.reactNativeCommunityCameraroll.anon.Endcursor
import typingsJapgolly.reactNativeCommunityCameraroll.anon.Groupname
import typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.auto
import typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.photo
import typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cameraroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Delete a photo from the camera roll or media library. photoUris is an array of photo uri's.
    */
  inline def deletePhotos(photoUris: js.Array[String]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deletePhotos")(photoUris.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getAlbums(params: GetAlbumsParams): js.Promise[js.Array[Album]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlbums")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Album]]]
  
  /**
    * Returns a Promise with photo identifier objects from the local camera
    * roll of the device matching shape defined by `getPhotosReturnChecker`.
    */
  inline def getPhotos(params: GetPhotosParams): js.Promise[PhotoIdentifiersPage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhotos")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PhotoIdentifiersPage]]
  
  /**
    * Saves the photo or video to the camera roll or photo library.
    */
  inline def save(tag: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def save(tag: String, options: SaveToCameraRollOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * `CameraRoll.saveImageWithTag()` is deprecated. Use `CameraRoll.saveToCameraRoll()` instead.
    */
  inline def saveImageWithTag(tag: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveImageWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Saves the photo or video to the camera roll or photo library.
    */
  inline def saveToCameraRoll(tag: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveToCameraRoll")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def saveToCameraRoll(tag: String, `type`: photo | video): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToCameraRoll")(tag.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait Album extends StObject {
    
    var count: Double
    
    var title: String
  }
  object Album {
    
    inline def apply(count: Double, title: String): Album = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Album]
    }
    
    extension [Self <: Album](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos
  */
  trait AssetType extends StObject
  object AssetType {
    
    inline def All: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All = "All".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All]
    
    inline def Photos: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos = "Photos".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos]
    
    inline def Videos: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos = "Videos".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos]
  }
  
  trait GetAlbumsParams extends StObject {
    
    var assetType: js.UndefOr[AssetType] = js.undefined
  }
  object GetAlbumsParams {
    
    inline def apply(): GetAlbumsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAlbumsParams]
    }
    
    extension [Self <: GetAlbumsParams](x: Self) {
      
      inline def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    }
  }
  
  /**
    * Shape of the param arg for the `getPhotosFast` function.
    */
  trait GetPhotosParams extends StObject {
    
    /**
      * A cursor that matches `page_info { end_cursor }` returned from a previous
      * call to `getPhotos`. Note that using this will reduce performance
      * slightly on iOS. An alternative is just using the `fromTime` and `toTime`
      * filters, which have no such impact.
      */
    var after: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies filter on asset type
      */
    var assetType: js.UndefOr[AssetType] = js.undefined
    
    /**
      * The number of photos wanted in reverse order of the photo application
      * (i.e. most recent first).
      */
    var first: Double
    
    /**
      * Filter by creation time with a timestamp in milliseconds. This time is
      * exclusive, so we'll select all photos with `timestamp > fromTime`.
      */
    var fromTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies filter on group names, like 'Recent Photos' or custom album
      * titles.
      */
    var groupName: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies which group types to filter the results to.
      */
    var groupTypes: js.UndefOr[GroupType] = js.undefined
    
    /**
      * Specific fields in the output that we want to include, even though they
      * might have some performance impact.
      */
    var include: js.UndefOr[js.Array[Include]] = js.undefined
    
    /**
      * Filter by mimetype (e.g. image/jpeg). Note that using this will reduce
      * performance slightly on iOS.
      */
    var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Filter by creation time with a timestamp in milliseconds. This time is
      * inclusive, so we'll select all photos with `timestamp <= toTime`.
      */
    var toTime: js.UndefOr[Double] = js.undefined
  }
  object GetPhotosParams {
    
    inline def apply(first: Double): GetPhotosParams = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPhotosParams]
    }
    
    extension [Self <: GetPhotosParams](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFromTime(value: Double): Self = StObject.set(x, "fromTime", value.asInstanceOf[js.Any])
      
      inline def setFromTimeUndefined: Self = StObject.set(x, "fromTime", js.undefined)
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      inline def setGroupTypes(value: GroupType): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
      
      inline def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
      
      inline def setInclude(value: js.Array[Include]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Include*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
      inline def setToTime(value: Double): Self = StObject.set(x, "toTime", value.asInstanceOf[js.Any])
      
      inline def setToTimeUndefined: Self = StObject.set(x, "toTime", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos
  */
  trait GroupType extends StObject
  object GroupType {
    
    inline def Album: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album = "Album".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album]
    
    inline def All: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All = "All".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All]
    
    inline def Event: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event = "Event".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event]
    
    inline def Faces: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces = "Faces".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces]
    
    inline def Library: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library = "Library".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library]
    
    inline def PhotoStream: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream = "PhotoStream".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream]
    
    inline def SavedPhotos: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos = "SavedPhotos".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize
    - typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration
  */
  trait Include extends StObject
  object Include {
    
    inline def fileSize: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize = "fileSize".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize]
    
    inline def filename: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename = "filename".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename]
    
    inline def imageSize: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize = "imageSize".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize]
    
    inline def location: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location = "location".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location]
    
    inline def playableDuration: typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration = "playableDuration".asInstanceOf[typingsJapgolly.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration]
  }
  
  trait PhotoIdentifier extends StObject {
    
    var node: Groupname
  }
  object PhotoIdentifier {
    
    inline def apply(node: Groupname): PhotoIdentifier = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoIdentifier]
    }
    
    extension [Self <: PhotoIdentifier](x: Self) {
      
      inline def setNode(value: Groupname): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhotoIdentifiersPage extends StObject {
    
    var edges: js.Array[PhotoIdentifier]
    
    var page_info: Endcursor
  }
  object PhotoIdentifiersPage {
    
    inline def apply(edges: js.Array[PhotoIdentifier], page_info: Endcursor): PhotoIdentifiersPage = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoIdentifiersPage]
    }
    
    extension [Self <: PhotoIdentifiersPage](x: Self) {
      
      inline def setEdges(value: js.Array[PhotoIdentifier]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: PhotoIdentifier*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setPage_info(value: Endcursor): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    }
  }
  
  trait SaveToCameraRollOptions extends StObject {
    
    var album: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[photo | video | auto] = js.undefined
  }
  object SaveToCameraRollOptions {
    
    inline def apply(): SaveToCameraRollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveToCameraRollOptions]
    }
    
    extension [Self <: SaveToCameraRollOptions](x: Self) {
      
      inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
      
      inline def setType(value: photo | video | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
