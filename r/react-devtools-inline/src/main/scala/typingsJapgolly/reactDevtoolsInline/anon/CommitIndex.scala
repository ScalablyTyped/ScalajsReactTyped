package typingsJapgolly.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitIndex extends StObject {
  
  var commitIndex: Double
  
  var rootID: Double
}
object CommitIndex {
  
  inline def apply(commitIndex: Double, rootID: Double): CommitIndex = {
    val __obj = js.Dynamic.literal(commitIndex = commitIndex.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitIndex]
  }
  
  extension [Self <: CommitIndex](x: Self) {
    
    inline def setCommitIndex(value: Double): Self = StObject.set(x, "commitIndex", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
