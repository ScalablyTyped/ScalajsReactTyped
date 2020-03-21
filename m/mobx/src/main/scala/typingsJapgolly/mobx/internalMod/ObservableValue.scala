package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.comparerMod.IEqualsComparer
import typingsJapgolly.mobx.modifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends typingsJapgolly.mobx.observablevalueMod.ObservableValue[T] {
  def this(value: T, enhancer: IEnhancer[T]) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
}

