package typingsJapgolly.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectAlreadyInActiveTierErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectAlreadyInActiveTierErrorDetails> * / any */ trait ObjectAlreadyInActiveTierError extends StObject {
    
    var name: typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError
  }
  object ObjectAlreadyInActiveTierError {
    
    inline def apply(): ObjectAlreadyInActiveTierError = {
      val __obj = js.Dynamic.literal(name = "ObjectAlreadyInActiveTierError")
      __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
    }
    
    extension [Self <: ObjectAlreadyInActiveTierError](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectAlreadyInActiveTierErrorDetails extends StObject
}
