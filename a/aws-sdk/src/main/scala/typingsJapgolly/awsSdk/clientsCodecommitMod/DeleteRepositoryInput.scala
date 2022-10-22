package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryInput extends StObject {
  
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName
}
object DeleteRepositoryInput {
  
  inline def apply(repositoryName: RepositoryName): DeleteRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryInput]
  }
  
  extension [Self <: DeleteRepositoryInput](x: Self) {
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
