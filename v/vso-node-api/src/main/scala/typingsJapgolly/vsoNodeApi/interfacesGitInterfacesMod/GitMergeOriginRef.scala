package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitMergeOriginRef extends StObject {
  
  var pullRequestId: Double
}
object GitMergeOriginRef {
  
  inline def apply(pullRequestId: Double): GitMergeOriginRef = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitMergeOriginRef]
  }
  
  extension [Self <: GitMergeOriginRef](x: Self) {
    
    inline def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
