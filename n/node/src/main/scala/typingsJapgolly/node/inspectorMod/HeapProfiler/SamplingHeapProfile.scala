package typingsJapgolly.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile.
  */
trait SamplingHeapProfile extends js.Object {
  var head: SamplingHeapProfileNode
}

object SamplingHeapProfile {
  @scala.inline
  def apply(head: SamplingHeapProfileNode): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SamplingHeapProfile]
  }
}

