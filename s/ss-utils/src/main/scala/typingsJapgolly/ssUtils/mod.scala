package typingsJapgolly.ssUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ss-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * EventSource
    */
  @js.native
  object ReadyState extends js.Object {
    /* 2 */ val CLOSED: typingsJapgolly.ssUtils.ssutils.ReadyState.CLOSED with Double = js.native
    /* 0 */ val CONNECTING: typingsJapgolly.ssUtils.ssutils.ReadyState.CONNECTING with Double = js.native
    /* 1 */ val OPEN: typingsJapgolly.ssUtils.ssutils.ReadyState.OPEN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ssUtils.ssutils.ReadyState with Double] = js.native
  }
  
}

