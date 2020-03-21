package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.bufferMod.Buffer
import typingsJapgolly.wonderJs.ebuffertypeMod.EBufferType
import typingsJapgolly.wonderJs.ebufferusageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/CommonBuffer", JSImport.Namespace)
@js.native
object commonBufferMod extends js.Object {
  @js.native
  abstract class CommonBuffer () extends Buffer {
    var count: Double = js.native
    var `type`: EBufferType = js.native
    var usage: EBufferUsage = js.native
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any): Unit = js.native
    /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any, offset: Double): Unit = js.native
  }
  
}

