package typingsJapgolly.googlePicker

import typingsJapgolly.googlePicker.google.picker.ViewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object picker {
      
      @JSGlobal("google.picker.Action")
      @js.native
      object Action extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Action & String] = js.native
        
        /* "cancel" */ val CANCEL: typingsJapgolly.googlePicker.google.picker.Action.CANCEL & String = js.native
        
        /* "picked" */ val PICKED: typingsJapgolly.googlePicker.google.picker.Action.PICKED & String = js.native
      }
      
      @JSGlobal("google.picker.DocsUploadView")
      @js.native
      open class DocsUploadView ()
        extends StObject
           with typingsJapgolly.googlePicker.google.picker.DocsUploadView {
        
        // Allows the user to select a folder in Google Drive to upload to.
        /* CompleteClass */
        override def setIncludeFolders(included: Boolean): typingsJapgolly.googlePicker.google.picker.DocsUploadView = js.native
        
        // Sets the upload destination to the specified folder. This overrides `.setIncludeFolders` to false.
        /* CompleteClass */
        override def setParent(parentId: String): typingsJapgolly.googlePicker.google.picker.DocsUploadView = js.native
      }
      
      @JSGlobal("google.picker.DocsView")
      @js.native
      // Constructor. The ViewId must be one of the Google Drive views. Default is ViewId.DOCS.
      open class DocsView ()
        extends StObject
           with typingsJapgolly.googlePicker.google.picker.DocsView {
        def this(viewId: ViewId) = this()
      }
      
      @JSGlobal("google.picker.DocsViewMode")
      @js.native
      object DocsViewMode extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.DocsViewMode & String] = js.native
        
        /* "grid" */ val GRID: typingsJapgolly.googlePicker.google.picker.DocsViewMode.GRID & String = js.native
        
        /* "list" */ val LIST: typingsJapgolly.googlePicker.google.picker.DocsViewMode.LIST & String = js.native
      }
      
      @JSGlobal("google.picker.Document")
      @js.native
      object Document extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Document & String] = js.native
        
        /* "addressLines" */ val ADDRESS_LINES: typingsJapgolly.googlePicker.google.picker.Document.ADDRESS_LINES & String = js.native
        
        /* "audience" */ val AUDIENCE: typingsJapgolly.googlePicker.google.picker.Document.AUDIENCE & String = js.native
        
        /* "description" */ val DESCRIPTION: typingsJapgolly.googlePicker.google.picker.Document.DESCRIPTION & String = js.native
        
        /* "duration" */ val DURATION: typingsJapgolly.googlePicker.google.picker.Document.DURATION & String = js.native
        
        /* "embedUrl" */ val EMBEDDABLE_URL: typingsJapgolly.googlePicker.google.picker.Document.EMBEDDABLE_URL & String = js.native
        
        /* "iconUrl" */ val ICON_URL: typingsJapgolly.googlePicker.google.picker.Document.ICON_URL & String = js.native
        
        /* "id" */ val ID: typingsJapgolly.googlePicker.google.picker.Document.ID & String = js.native
        
        /* "isNew" */ val IS_NEW: typingsJapgolly.googlePicker.google.picker.Document.IS_NEW & String = js.native
        
        /* "lastEditedUtc" */ val LAST_EDITED_UTC: typingsJapgolly.googlePicker.google.picker.Document.LAST_EDITED_UTC & String = js.native
        
        /* "latitude" */ val LATITUDE: typingsJapgolly.googlePicker.google.picker.Document.LATITUDE & String = js.native
        
        /* "longitude" */ val LONGITUDE: typingsJapgolly.googlePicker.google.picker.Document.LONGITUDE & String = js.native
        
        /* "mimeType" */ val MIME_TYPE: typingsJapgolly.googlePicker.google.picker.Document.MIME_TYPE & String = js.native
        
        /* "name" */ val NAME: typingsJapgolly.googlePicker.google.picker.Document.NAME & String = js.native
        
        /* "numChildren" */ val NUM_CHILDREN: typingsJapgolly.googlePicker.google.picker.Document.NUM_CHILDREN & String = js.native
        
        /* "parentId" */ val PARENT_ID: typingsJapgolly.googlePicker.google.picker.Document.PARENT_ID & String = js.native
        
        /* "phoneNumbers" */ val PHONE_NUMBERS: typingsJapgolly.googlePicker.google.picker.Document.PHONE_NUMBERS & String = js.native
        
        /* "serviceId" */ val SERVICE_ID: typingsJapgolly.googlePicker.google.picker.Document.SERVICE_ID & String = js.native
        
        /* "thumbnails" */ val THUMBNAILS: typingsJapgolly.googlePicker.google.picker.Document.THUMBNAILS & String = js.native
        
        /* "type" */ val TYPE: typingsJapgolly.googlePicker.google.picker.Document.TYPE & String = js.native
        
        /* "url" */ val URL: typingsJapgolly.googlePicker.google.picker.Document.URL & String = js.native
      }
      
      @JSGlobal("google.picker.Feature")
      @js.native
      object Feature extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Feature & String] = js.native
        
        /* "mineOnly" */ val MINE_ONLY: typingsJapgolly.googlePicker.google.picker.Feature.MINE_ONLY & String = js.native
        
        /* "multiselectEnabled" */ val MULTISELECT_ENABLED: typingsJapgolly.googlePicker.google.picker.Feature.MULTISELECT_ENABLED & String = js.native
        
        /* "navHidden" */ val NAV_HIDDEN: typingsJapgolly.googlePicker.google.picker.Feature.NAV_HIDDEN & String = js.native
        
        /* "simpleUploadEnabled" */ val SIMPLE_UPLOAD_ENABLED: typingsJapgolly.googlePicker.google.picker.Feature.SIMPLE_UPLOAD_ENABLED & String = js.native
        
        /* "sdr" */ val SUPPORT_DRIVES: typingsJapgolly.googlePicker.google.picker.Feature.SUPPORT_DRIVES & String = js.native
        
        /* "std" */ val SUPPORT_TEAM_DRIVES: typingsJapgolly.googlePicker.google.picker.Feature.SUPPORT_TEAM_DRIVES & String = js.native
      }
      
      @JSGlobal("google.picker.PickerBuilder")
      @js.native
      open class PickerBuilder ()
        extends StObject
           with typingsJapgolly.googlePicker.google.picker.PickerBuilder
      
      @JSGlobal("google.picker.Response")
      @js.native
      object Response extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Response & String] = js.native
        
        /* "action" */ val ACTION: typingsJapgolly.googlePicker.google.picker.Response.ACTION & String = js.native
        
        /* "docs" */ val DOCUMENTS: typingsJapgolly.googlePicker.google.picker.Response.DOCUMENTS & String = js.native
        
        /* "parents" */ val PARENTS: typingsJapgolly.googlePicker.google.picker.Response.PARENTS & String = js.native
        
        /* "viewToken" */ val VIEW: typingsJapgolly.googlePicker.google.picker.Response.VIEW & String = js.native
      }
      
      @JSGlobal("google.picker.ServiceId")
      @js.native
      object ServiceId extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.ServiceId & String] = js.native
        
        /* "docs" */ val DOCS: typingsJapgolly.googlePicker.google.picker.ServiceId.DOCS & String = js.native
        
        /* "maps" */ val MAPS: typingsJapgolly.googlePicker.google.picker.ServiceId.MAPS & String = js.native
        
        /* "picasa" */ val PHOTOS: typingsJapgolly.googlePicker.google.picker.ServiceId.PHOTOS & String = js.native
        
        /* "search-api" */ val SEARCH_API: typingsJapgolly.googlePicker.google.picker.ServiceId.SEARCH_API & String = js.native
        
        /* "url" */ val URL: typingsJapgolly.googlePicker.google.picker.ServiceId.URL & String = js.native
        
        /* "youtube" */ val YOUTUBE: typingsJapgolly.googlePicker.google.picker.ServiceId.YOUTUBE & String = js.native
      }
      
      @JSGlobal("google.picker.Thumbnail")
      @js.native
      object Thumbnail extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Thumbnail & String] = js.native
        
        /* "height" */ val HEIGHT: typingsJapgolly.googlePicker.google.picker.Thumbnail.HEIGHT & String = js.native
        
        /* "url" */ val URL: typingsJapgolly.googlePicker.google.picker.Thumbnail.URL & String = js.native
        
        /* "width" */ val WIDTH: typingsJapgolly.googlePicker.google.picker.Thumbnail.WIDTH & String = js.native
      }
      
      @JSGlobal("google.picker.Type")
      @js.native
      object Type extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.Type & String] = js.native
        
        /* "album" */ val ALBUM: typingsJapgolly.googlePicker.google.picker.Type.ALBUM & String = js.native
        
        /* "document" */ val DOCUMENT: typingsJapgolly.googlePicker.google.picker.Type.DOCUMENT & String = js.native
        
        /* "location" */ val LOCATION: typingsJapgolly.googlePicker.google.picker.Type.LOCATION & String = js.native
        
        /* "photo" */ val PHOTO: typingsJapgolly.googlePicker.google.picker.Type.PHOTO & String = js.native
        
        /* "url" */ val URL: typingsJapgolly.googlePicker.google.picker.Type.URL & String = js.native
        
        /* "video" */ val VIDEO: typingsJapgolly.googlePicker.google.picker.Type.VIDEO & String = js.native
      }
      
      @JSGlobal("google.picker.ViewGroup")
      @js.native
      open class ViewGroup protected ()
        extends StObject
           with typingsJapgolly.googlePicker.google.picker.ViewGroup {
        // Constructor. A ViewGroup is a visual grouping of Views in the navigation pane. The root item of the ViewGroup itself must be View.
        def this(viewOrId: typingsJapgolly.googlePicker.google.picker.DocsView) = this()
        def this(viewOrId: ViewId) = this()
      }
      
      @JSGlobal("google.picker.ViewId")
      @js.native
      object ViewId extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.googlePicker.google.picker.ViewId & String] = js.native
        
        /* "all" */ val DOCS: typingsJapgolly.googlePicker.google.picker.ViewId.DOCS & String = js.native
        
        /* "docs-images" */ val DOCS_IMAGES: typingsJapgolly.googlePicker.google.picker.ViewId.DOCS_IMAGES & String = js.native
        
        /* "docs-images-and-videos" */ val DOCS_IMAGES_AND_VIDEOS: typingsJapgolly.googlePicker.google.picker.ViewId.DOCS_IMAGES_AND_VIDEOS & String = js.native
        
        /* "docs-videos" */ val DOCS_VIDEOS: typingsJapgolly.googlePicker.google.picker.ViewId.DOCS_VIDEOS & String = js.native
        
        /* "documents" */ val DOCUMENTS: typingsJapgolly.googlePicker.google.picker.ViewId.DOCUMENTS & String = js.native
        
        /* "drawings" */ val DRAWINGS: typingsJapgolly.googlePicker.google.picker.ViewId.DRAWINGS & String = js.native
        
        /* "folders" */ val FOLDERS: typingsJapgolly.googlePicker.google.picker.ViewId.FOLDERS & String = js.native
        
        /* "forms" */ val FORMS: typingsJapgolly.googlePicker.google.picker.ViewId.FORMS & String = js.native
        
        /* "image-search" */ val IMAGE_SEARCH: typingsJapgolly.googlePicker.google.picker.ViewId.IMAGE_SEARCH & String = js.native
        
        /* "pdfs" */ val PDFS: typingsJapgolly.googlePicker.google.picker.ViewId.PDFS & String = js.native
        
        /* "photos" */ val PHOTOS: typingsJapgolly.googlePicker.google.picker.ViewId.PHOTOS & String = js.native
        
        /* "photo-albums" */ val PHOTO_ALBUMS: typingsJapgolly.googlePicker.google.picker.ViewId.PHOTO_ALBUMS & String = js.native
        
        /* "photo-upload" */ val PHOTO_UPLOAD: typingsJapgolly.googlePicker.google.picker.ViewId.PHOTO_UPLOAD & String = js.native
        
        /* "presentations" */ val PRESENTATIONS: typingsJapgolly.googlePicker.google.picker.ViewId.PRESENTATIONS & String = js.native
        
        /* "recently-picked" */ val RECENTLY_PICKED: typingsJapgolly.googlePicker.google.picker.ViewId.RECENTLY_PICKED & String = js.native
        
        /* "spreadsheets" */ val SPREADSHEETS: typingsJapgolly.googlePicker.google.picker.ViewId.SPREADSHEETS & String = js.native
        
        /* "video-search" */ val VIDEO_SEARCH: typingsJapgolly.googlePicker.google.picker.ViewId.VIDEO_SEARCH & String = js.native
        
        /* "webcam" */ val WEBCAM: typingsJapgolly.googlePicker.google.picker.ViewId.WEBCAM & String = js.native
        
        /* "youtube" */ val YOUTUBE: typingsJapgolly.googlePicker.google.picker.ViewId.YOUTUBE & String = js.native
      }
    }
  }
}
