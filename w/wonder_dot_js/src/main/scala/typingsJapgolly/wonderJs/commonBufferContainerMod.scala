package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.basicGeometryDataMod.BasicGeometryData
import typingsJapgolly.wonderJs.bufferContainerMod.BufferContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/CommonBufferContainer", JSImport.Namespace)
@js.native
object commonBufferContainerMod extends js.Object {
  @js.native
  abstract class CommonBufferContainer () extends BufferContainer {
    @JSName("geometryData")
    var geometryData_CommonBufferContainer: BasicGeometryData = js.native
  }
  
}

