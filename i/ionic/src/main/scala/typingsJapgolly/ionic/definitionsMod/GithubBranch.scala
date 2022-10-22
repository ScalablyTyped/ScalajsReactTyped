package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GithubBranch extends StObject {
  
  var name: String
}
object GithubBranch {
  
  inline def apply(name: String): GithubBranch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubBranch]
  }
  
  extension [Self <: GithubBranch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
