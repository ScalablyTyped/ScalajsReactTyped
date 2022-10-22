package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDirectoriesResponse extends StObject {
  
  /**
    * Lists all directories that are associated with your account in pagination fashion.
    */
  var Directories: DirectoryList
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListDirectoriesResponse {
  
  inline def apply(Directories: DirectoryList): ListDirectoriesResponse = {
    val __obj = js.Dynamic.literal(Directories = Directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesResponse]
  }
  
  extension [Self <: ListDirectoriesResponse](x: Self) {
    
    inline def setDirectories(value: DirectoryList): Self = StObject.set(x, "Directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesVarargs(value: Directory*): Self = StObject.set(x, "Directories", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
