package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.modifiersMod.IEnhancer
import typingsJapgolly.mobx.observablemapMod.IObservableMapInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends typingsJapgolly.mobx.observablemapMod.ObservableMap[K, V] {
  def this(initialData: IObservableMapInitialValues[K, V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
}

