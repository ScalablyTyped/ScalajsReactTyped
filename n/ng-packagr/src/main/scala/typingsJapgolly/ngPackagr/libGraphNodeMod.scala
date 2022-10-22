package typingsJapgolly.ngPackagr

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphNodeMod {
  
  @JSImport("ng-packagr/lib/graph/node", "Node")
  @js.native
  open class Node protected () extends StObject {
    def this(url: String) = this()
    
    /* private */ var _dependees: Any = js.native
    
    /* private */ var _dependents: Any = js.native
    
    var data: Any = js.native
    
    def dependees: Set[Node] = js.native
    
    def dependents: Set[Node] = js.native
    
    def dependsOn(dependent: js.Array[Node]): Unit = js.native
    def dependsOn(dependent: Node): Unit = js.native
    
    def filter(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): js.Array[Node] = js.native
    
    def find(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): js.UndefOr[Node] = js.native
    
    def some(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): Boolean = js.native
    
    var state: NodeState = js.native
    
    var `type`: String = js.native
    
    val url: String = js.native
  }
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_DIRTY")
  @js.native
  val STATE_DIRTY: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_DONE")
  @js.native
  val STATE_DONE: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_IN_PROGRESS")
  @js.native
  val STATE_IN_PROGRESS: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_PENDING")
  @js.native
  val STATE_PENDING: NodeState = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ngPackagr.ngPackagrStrings._empty
    - typingsJapgolly.ngPackagr.ngPackagrStrings.dirty
    - typingsJapgolly.ngPackagr.ngPackagrStrings.`in-progress`
    - typingsJapgolly.ngPackagr.ngPackagrStrings.pending
    - typingsJapgolly.ngPackagr.ngPackagrStrings.done
  */
  trait NodeState extends StObject
  object NodeState {
    
    inline def _empty: typingsJapgolly.ngPackagr.ngPackagrStrings._empty = "".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings._empty]
    
    inline def dirty: typingsJapgolly.ngPackagr.ngPackagrStrings.dirty = "dirty".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.dirty]
    
    inline def done: typingsJapgolly.ngPackagr.ngPackagrStrings.done = "done".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.done]
    
    inline def `in-progress`: typingsJapgolly.ngPackagr.ngPackagrStrings.`in-progress` = "in-progress".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.`in-progress`]
    
    inline def pending: typingsJapgolly.ngPackagr.ngPackagrStrings.pending = "pending".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.pending]
  }
}
