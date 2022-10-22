package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSnapIndexesPathIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PathIndex", "PathIndex")
  @js.native
  open class PathIndex protected () extends Index {
    def this(indexPath_ : Path) = this()
    
    /* protected */ def extractChild(snap: Node): Node = js.native
    
    /* private */ var indexPath_ : Any = js.native
    
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
}
