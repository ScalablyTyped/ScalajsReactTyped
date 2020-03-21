package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/LabelCache", JSImport.Namespace)
@js.native
object labelCacheMod extends js.Object {
  @js.native
  trait LabelCache
    extends typingsJapgolly.ol.lrucacheMod.default[js.Any] {
    def release(consumer: typingsJapgolly.ol.executorMod.default): Unit = js.native
  }
  
  @js.native
  class default () extends LabelCache
  
}

