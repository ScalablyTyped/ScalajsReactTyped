package typingsJapgolly.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreConfig extends StObject {
  
  var Spec: js.UndefOr[DatastoreSpec] = js.undefined
}
object DatastoreConfig {
  
  inline def apply(): DatastoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreConfig]
  }
  
  extension [Self <: DatastoreConfig](x: Self) {
    
    inline def setSpec(value: DatastoreSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "Spec", js.undefined)
  }
}
