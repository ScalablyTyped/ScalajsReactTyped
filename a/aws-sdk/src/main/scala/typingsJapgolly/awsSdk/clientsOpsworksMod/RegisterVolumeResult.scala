package typingsJapgolly.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterVolumeResult extends StObject {
  
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object RegisterVolumeResult {
  
  inline def apply(): RegisterVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterVolumeResult]
  }
  
  extension [Self <: RegisterVolumeResult](x: Self) {
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
