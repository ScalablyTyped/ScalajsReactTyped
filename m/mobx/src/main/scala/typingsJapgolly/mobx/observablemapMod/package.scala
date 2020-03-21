package typingsJapgolly.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observablemapMod {
  type IKeyValueMap[V] = org.scalablytyped.runtime.StringDictionary[V]
  type IMapEntries[K, V] = js.Array[typingsJapgolly.mobx.observablemapMod.IMapEntry[K, V]]
  type IMapEntry[K, V] = js.Tuple2[K, V]
  type IObservableMapInitialValues[K, V] = (typingsJapgolly.mobx.observablemapMod.IMapEntries[K, V]) | typingsJapgolly.mobx.observablemapMod.IKeyValueMap[V] | (typingsJapgolly.std.Map[K, V])
}
