package typingsJapgolly.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "RBTree")
@js.native
open class RBTree[T] protected ()
  extends typingsJapgolly.webcola.distSrcRbtreeMod.RBTree[T] {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}
/* static members */
object RBTree {
  
  @JSImport("webcola", "RBTree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def double_rotate(root: Any, dir: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("double_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def is_red(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("is_red")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def single_rotate(root: Any, dir: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("single_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Any]
}
