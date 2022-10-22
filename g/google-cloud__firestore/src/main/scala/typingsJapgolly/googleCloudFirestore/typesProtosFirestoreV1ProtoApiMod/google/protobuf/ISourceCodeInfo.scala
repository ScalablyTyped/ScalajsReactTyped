package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.SourceCodeInfo.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourceCodeInfo. */
trait ISourceCodeInfo extends StObject {
  
  /** SourceCodeInfo location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
}
object ISourceCodeInfo {
  
  inline def apply(): ISourceCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceCodeInfo]
  }
  
  extension [Self <: ISourceCodeInfo](x: Self) {
    
    inline def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
