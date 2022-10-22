package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalLocalViewChangesMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_view_changes", "LocalViewChanges")
  @js.native
  open class LocalViewChanges protected () extends StObject {
    def this(targetId: TargetId, fromCache: Boolean, addedKeys: DocumentKeySet_, removedKeys: DocumentKeySet_) = this()
    
    val addedKeys: DocumentKeySet_ = js.native
    
    val fromCache: Boolean = js.native
    
    val removedKeys: DocumentKeySet_ = js.native
    
    val targetId: TargetId = js.native
  }
  /* static members */
  object LocalViewChanges {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_view_changes", "LocalViewChanges")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSnapshot(targetId: TargetId, viewSnapshot: ViewSnapshot): LocalViewChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSnapshot")(targetId.asInstanceOf[js.Any], viewSnapshot.asInstanceOf[js.Any])).asInstanceOf[LocalViewChanges]
  }
}
