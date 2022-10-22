package typingsJapgolly.firebaseDatabase.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A cache node only stores complete children. Additionally it holds a flag whether the node can be considered fully
  * initialized in the sense that we know at one point in time this represented a valid state of the world, e.g.
  * initialized with data from the server, or a complete overwrite by the client. The filtered flag also tracks
  * whether a node potentially had children removed due to a filter.
  */
trait CacheNode extends StObject {
  
  /* private */ var filtered_ : Any
  
  /* private */ var fullyInitialized_ : Any
  
  def getNode(): Node2
  
  def isCompleteForChild(key: String): Boolean
  
  def isCompleteForPath(path: Path): Boolean
  
  /**
    * Returns whether this node is potentially missing children due to a filter applied to the node
    */
  def isFiltered(): Boolean
  
  /**
    * Returns whether this node was fully initialized with either server data or a complete overwrite by the client
    */
  def isFullyInitialized(): Boolean
  
  /* private */ var node_ : Any
}
object CacheNode {
  
  inline def apply(
    filtered_ : Any,
    fullyInitialized_ : Any,
    getNode: CallbackTo[Node2],
    isCompleteForChild: String => Boolean,
    isCompleteForPath: Path => Boolean,
    isFiltered: CallbackTo[Boolean],
    isFullyInitialized: CallbackTo[Boolean],
    node_ : Any
  ): CacheNode = {
    val __obj = js.Dynamic.literal(filtered_ = filtered_.asInstanceOf[js.Any], fullyInitialized_ = fullyInitialized_.asInstanceOf[js.Any], getNode = getNode.toJsFn, isCompleteForChild = js.Any.fromFunction1(isCompleteForChild), isCompleteForPath = js.Any.fromFunction1(isCompleteForPath), isFiltered = isFiltered.toJsFn, isFullyInitialized = isFullyInitialized.toJsFn, node_ = node_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNode]
  }
  
  extension [Self <: CacheNode](x: Self) {
    
    inline def setFiltered_(value: Any): Self = StObject.set(x, "filtered_", value.asInstanceOf[js.Any])
    
    inline def setFullyInitialized_(value: Any): Self = StObject.set(x, "fullyInitialized_", value.asInstanceOf[js.Any])
    
    inline def setGetNode(value: CallbackTo[Node2]): Self = StObject.set(x, "getNode", value.toJsFn)
    
    inline def setIsCompleteForChild(value: String => Boolean): Self = StObject.set(x, "isCompleteForChild", js.Any.fromFunction1(value))
    
    inline def setIsCompleteForPath(value: Path => Boolean): Self = StObject.set(x, "isCompleteForPath", js.Any.fromFunction1(value))
    
    inline def setIsFiltered(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFiltered", value.toJsFn)
    
    inline def setIsFullyInitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFullyInitialized", value.toJsFn)
    
    inline def setNode_(value: Any): Self = StObject.set(x, "node_", value.asInstanceOf[js.Any])
  }
}
