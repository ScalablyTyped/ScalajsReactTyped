package typingsJapgolly.firebaseFirestoreTypes.mod

import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.estimate
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.none
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  extension [Self <: SnapshotOptions](x: Self) {
    
    inline def setServerTimestamps(value: estimate | previous | none): Self = StObject.set(x, "serverTimestamps", value.asInstanceOf[js.Any])
    
    inline def setServerTimestampsUndefined: Self = StObject.set(x, "serverTimestamps", js.undefined)
  }
}
