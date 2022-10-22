package typingsJapgolly.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTree extends StObject {
  
  var commitIndex: Double
  
  var commitTree: typingsJapgolly.reactDevtoolsInline.commonsMod.CommitTree
  
  var rootID: Double
}
object CommitTree {
  
  inline def apply(
    commitIndex: Double,
    commitTree: typingsJapgolly.reactDevtoolsInline.commonsMod.CommitTree,
    rootID: Double
  ): CommitTree = {
    val __obj = js.Dynamic.literal(commitIndex = commitIndex.asInstanceOf[js.Any], commitTree = commitTree.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTree]
  }
  
  extension [Self <: CommitTree](x: Self) {
    
    inline def setCommitIndex(value: Double): Self = StObject.set(x, "commitIndex", value.asInstanceOf[js.Any])
    
    inline def setCommitTree(value: typingsJapgolly.reactDevtoolsInline.commonsMod.CommitTree): Self = StObject.set(x, "commitTree", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
