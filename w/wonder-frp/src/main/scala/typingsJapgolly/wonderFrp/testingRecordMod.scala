package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.testingActionTypeMod.ActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/Record", JSImport.Namespace)
@js.native
object testingRecordMod extends js.Object {
  @js.native
  class Record protected () extends js.Object {
    def this(time: js.Any, value: js.Any, actionType: ActionType, comparer: js.Function) = this()
    var _actionType: js.Any = js.native
    var _comparer: js.Any = js.native
    var _time: js.Any = js.native
    var _value: js.Any = js.native
    var actionType: ActionType = js.native
    var time: Double = js.native
    var value: Double = js.native
    def equals(other: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Record extends js.Object {
    def create(time: Double, value: js.Any): Record = js.native
    def create(time: Double, value: js.Any, actionType: ActionType): Record = js.native
    def create(time: Double, value: js.Any, actionType: ActionType, comparer: js.Function): Record = js.native
  }
  
}

