package typingsJapgolly.firebaseStorageCompat

import typingsJapgolly.firebaseStorageCompat.distSrcReferenceMod.ReferenceCompat
import typingsJapgolly.firebaseStorageCompat.distSrcServiceMod.StorageServiceCompat
import typingsJapgolly.firebaseStorageTypes.mod.ListResult
import typingsJapgolly.firebaseStorageTypes.mod.Reference
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListMod {
  
  @JSImport("@firebase/storage-compat/dist/src/list", "ListResultCompat")
  @js.native
  open class ListResultCompat protected ()
    extends StObject
       with ListResult
       with Compat[typingsJapgolly.firebaseStorage.mod.ListResult] {
    def this(_delegate: typingsJapgolly.firebaseStorage.mod.ListResult, _service: StorageServiceCompat) = this()
    
    /* CompleteClass */
    var _delegate: typingsJapgolly.firebaseStorage.mod.ListResult = js.native
    
    /* private */ val _service: Any = js.native
    
    /* CompleteClass */
    var items: js.Array[Reference] = js.native
    @JSName("items")
    def items_MListResultCompat: js.Array[ReferenceCompat] = js.native
    
    /* CompleteClass */
    var nextPageToken: String | Null = js.native
    @JSName("nextPageToken")
    def nextPageToken_MListResultCompat: String | Null = js.native
    
    /* CompleteClass */
    var prefixes: js.Array[Reference] = js.native
    @JSName("prefixes")
    def prefixes_MListResultCompat: js.Array[ReferenceCompat] = js.native
  }
}
