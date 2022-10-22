package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScriptOutput extends StObject {
  
  /**
    * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the information that was provided in the CreateScript request; (2) If the script file was uploaded from a local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
    */
  var Script: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.Script] = js.undefined
}
object UpdateScriptOutput {
  
  inline def apply(): UpdateScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateScriptOutput]
  }
  
  extension [Self <: UpdateScriptOutput](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "Script", js.undefined)
  }
}
