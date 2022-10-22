package typingsJapgolly.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyListEntryMod {
  
  trait KeyListEntry extends StObject {
    
    /**
      * <p>ARN of the key.</p>
      */
    var KeyArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Unique identifier of the key.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
  }
  object KeyListEntry {
    
    inline def apply(): KeyListEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyListEntry]
    }
    
    extension [Self <: KeyListEntry](x: Self) {
      
      inline def setKeyArn(value: String): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
      
      inline def setKeyArnUndefined: Self = StObject.set(x, "KeyArn", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    }
  }
  
  type UnmarshalledKeyListEntry = KeyListEntry
}
