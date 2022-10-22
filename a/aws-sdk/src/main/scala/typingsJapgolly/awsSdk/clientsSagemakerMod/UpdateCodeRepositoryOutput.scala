package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCodeRepositoryOutput extends StObject {
  
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typingsJapgolly.awsSdk.clientsSagemakerMod.CodeRepositoryArn
}
object UpdateCodeRepositoryOutput {
  
  inline def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
  
  extension [Self <: UpdateCodeRepositoryOutput](x: Self) {
    
    inline def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
  }
}
