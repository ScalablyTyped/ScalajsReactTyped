package typingsJapgolly.antd

import typingsJapgolly.antd.gridRowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class Col ()
    extends typingsJapgolly.antd.gridColMod.Col
  
  @js.native
  class Row () extends default
  
  /* static members */
  @js.native
  object Row extends js.Object {
    var defaultProps: AnonGutter = js.native
  }
  
}

