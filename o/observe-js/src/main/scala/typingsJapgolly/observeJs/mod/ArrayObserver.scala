package typingsJapgolly.observeJs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.observeJs.mod.observejs.ArrayObserverInstance
import typingsJapgolly.observeJs.mod.observejs.ArrayObserverStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("observe-js", "ArrayObserver")
@js.native
class ArrayObserver protected () extends ArrayObserverInstance {
  /**
  		 * Constructor
  		 * @param receiver the target for observation
  		 */
  def this(receiver: js.Array[_]) = this()
}

@JSImport("observe-js", "ArrayObserver")
@js.native
object ArrayObserver extends TopLevel[ArrayObserverStatic]

