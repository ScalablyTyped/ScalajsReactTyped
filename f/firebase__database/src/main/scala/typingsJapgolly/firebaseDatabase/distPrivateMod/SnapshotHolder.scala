package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mutable object which basically just stores a reference to the "latest" immutable snapshot.
  */
trait SnapshotHolder extends StObject {
  
  def getNode(path: Path): Node2
  
  /* private */ var rootNode_ : Any
  
  def updateSnapshot(path: Path, newSnapshotNode: Node2): Unit
}
object SnapshotHolder {
  
  inline def apply(getNode: Path => Node2, rootNode_ : Any, updateSnapshot: (Path, Node2) => Callback): SnapshotHolder = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), rootNode_ = rootNode_.asInstanceOf[js.Any], updateSnapshot = js.Any.fromFunction2((t0: Path, t1: Node2) => (updateSnapshot(t0, t1)).runNow()))
    __obj.asInstanceOf[SnapshotHolder]
  }
  
  extension [Self <: SnapshotHolder](x: Self) {
    
    inline def setGetNode(value: Path => Node2): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
    
    inline def setRootNode_(value: Any): Self = StObject.set(x, "rootNode_", value.asInstanceOf[js.Any])
    
    inline def setUpdateSnapshot(value: (Path, Node2) => Callback): Self = StObject.set(x, "updateSnapshot", js.Any.fromFunction2((t0: Path, t1: Node2) => (value(t0, t1)).runNow()))
  }
}
