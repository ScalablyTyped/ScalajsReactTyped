package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`right-top`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`left-top`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
  */
  trait Position extends js.Object
  
  def getPositionIgnoreAngles(position: Position): left | right | bottom | top = js.native
  def isPositionHorizontal(position: Position): Boolean = js.native
  def isPositionVertical(position: Position): Boolean = js.native
  @js.native
  object Position extends js.Object {
    var BOTTOM: bottom = js.native
    var BOTTOM_LEFT: `bottom-left` = js.native
    var BOTTOM_RIGHT: `bottom-right` = js.native
    var LEFT: left = js.native
    var LEFT_BOTTOM: `left-bottom` = js.native
    var LEFT_TOP: `left-top` = js.native
    var RIGHT: right = js.native
    var RIGHT_BOTTOM: `right-bottom` = js.native
    var RIGHT_TOP: `right-top` = js.native
    var TOP: top = js.native
    var TOP_LEFT: `top-left` = js.native
    var TOP_RIGHT: `top-right` = js.native
  }
  
}

