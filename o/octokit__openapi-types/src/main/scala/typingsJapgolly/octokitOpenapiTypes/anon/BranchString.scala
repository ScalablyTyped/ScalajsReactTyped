package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchString extends StObject {
  
  /** @description The name of the branch which should be updated to match upstream. */
  var branch: String
}
object BranchString {
  
  inline def apply(branch: String): BranchString = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchString]
  }
  
  extension [Self <: BranchString](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
