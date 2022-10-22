package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.DOCUMENT
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.LINES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJsoninputMod {
  
  trait JSONInput extends StObject {
    
    /**
      * <p>The type of JSON. Valid values: Document, Lines.</p>
      */
    var Type: js.UndefOr[DOCUMENT | LINES | String] = js.undefined
  }
  object JSONInput {
    
    inline def apply(): JSONInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONInput]
    }
    
    extension [Self <: JSONInput](x: Self) {
      
      inline def setType(value: DOCUMENT | LINES | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  type UnmarshalledJSONInput = JSONInput
}
