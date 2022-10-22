package typingsJapgolly.cloudinaryUploadwidgetBrowser

import japgolly.scalajs.react.Callback
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.auto
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.image
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.raw
import typingsJapgolly.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.video
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadParameters extends StObject {
  
  var context: js.UndefOr[Record[String, Any]] = js.undefined
  
  var folder: js.UndefOr[String | Null] = js.undefined
  
  var publicId: js.UndefOr[String | Null] = js.undefined
  
  var resourceType: js.UndefOr[auto | image | video | raw] = js.undefined
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var uploadSignature: js.UndefOr[
    String | (js.Function2[
      /* callback */ js.Function1[/* result */ String, Unit], 
      /* params */ CloudinaryUploadWidgetOptions, 
      Unit
    ])
  ] = js.undefined
  
  var uploadSignatureTimestamp: js.UndefOr[Double] = js.undefined
}
object UploadParameters {
  
  inline def apply(): UploadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadParameters]
  }
  
  extension [Self <: UploadParameters](x: Self) {
    
    inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderNull: Self = StObject.set(x, "folder", null)
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setResourceType(value: auto | image | video | raw): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUploadSignature(
      value: String | (js.Function2[
          /* callback */ js.Function1[/* result */ String, Unit], 
          /* params */ CloudinaryUploadWidgetOptions, 
          Unit
        ])
    ): Self = StObject.set(x, "uploadSignature", value.asInstanceOf[js.Any])
    
    inline def setUploadSignatureFunction2(
      value: (/* callback */ js.Function1[/* result */ String, Unit], /* params */ CloudinaryUploadWidgetOptions) => Callback
    ): Self = StObject.set(x, "uploadSignature", js.Any.fromFunction2((t0: /* callback */ js.Function1[/* result */ String, Unit], t1: /* params */ CloudinaryUploadWidgetOptions) => (value(t0, t1)).runNow()))
    
    inline def setUploadSignatureTimestamp(value: Double): Self = StObject.set(x, "uploadSignatureTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUploadSignatureTimestampUndefined: Self = StObject.set(x, "uploadSignatureTimestamp", js.undefined)
    
    inline def setUploadSignatureUndefined: Self = StObject.set(x, "uploadSignature", js.undefined)
  }
}
