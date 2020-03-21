package typingsJapgolly.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vnodeMod {
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, typingsJapgolly.vue.vnodeMod.ScopedSlotChildren]
  type ScopedSlot = js.Function1[/* props */ js.Any, typingsJapgolly.vue.vnodeMod.ScopedSlotReturnValue]
  type ScopedSlotChildren = js.UndefOr[js.Array[typingsJapgolly.vue.vnodeMod.VNode]]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vue.vnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - `js.undefined`
    - typingsJapgolly.vue.vnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[
    typingsJapgolly.vue.vnodeMod._ScopedSlotReturnValue | java.lang.String | scala.Boolean | scala.Null
  ]
  type VNodeChildren = js.UndefOr[
    typingsJapgolly.vue.vnodeMod.VNodeChildrenArrayContents | js.Array[typingsJapgolly.vue.vnodeMod.ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}
