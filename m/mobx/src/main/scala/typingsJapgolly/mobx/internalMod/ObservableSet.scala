package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.modifiersMod.IEnhancer
import typingsJapgolly.mobx.observablesetMod.IObservableSetInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends typingsJapgolly.mobx.observablesetMod.ObservableSet[T] {
  def this(initialData: IObservableSetInitialValues[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
}

