package typingsJapgolly.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLocation extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.S3Object] = js.undefined
}
object DocumentLocation {
  
  inline def apply(): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLocation]
  }
  
  extension [Self <: DocumentLocation](x: Self) {
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
