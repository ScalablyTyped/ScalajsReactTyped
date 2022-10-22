package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.StringC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var author: StringC
  
  var branchName: StringC
  
  var commitSHA: StringC
}
object Author {
  
  inline def apply(author: StringC, branchName: StringC, commitSHA: StringC): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], commitSHA = commitSHA.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  extension [Self <: Author](x: Self) {
    
    inline def setAuthor(value: StringC): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: StringC): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setCommitSHA(value: StringC): Self = StObject.set(x, "commitSHA", value.asInstanceOf[js.Any])
  }
}
