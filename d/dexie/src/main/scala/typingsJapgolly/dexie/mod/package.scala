package typingsJapgolly.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dexie = typingsJapgolly.dexie.mod.Dexie_
  type IndexableType = typingsJapgolly.dexie.mod.IndexableTypePart | typingsJapgolly.dexie.mod.IndexableTypeArrayReadonly
  type IndexableTypeArray = js.Array[typingsJapgolly.dexie.mod.IndexableTypePart]
  type IndexableTypeArrayReadonly = js.Array[typingsJapgolly.dexie.mod.IndexableTypePart]
  type IndexableTypePart = java.lang.String | scala.Double | js.Date | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | scala.scalajs.js.typedarray.DataView | js.Array[js.Array[scala.Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  type default = typingsJapgolly.dexie.mod.default_
}
