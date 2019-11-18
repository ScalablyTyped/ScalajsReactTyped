package typingsJapgolly.mobx.libTypesObservablevalueMod

import typingsJapgolly.mobx.libInternalMod.Atom
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptable
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typingsJapgolly.mobx.libTypesListenDashUtilsMod.IListenable
import typingsJapgolly.mobx.libTypesModifiersMod.IEnhancer
import typingsJapgolly.mobx.libUtilsComparerMod.IEqualsComparer
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablevalue", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends Atom
     with IObservableValue[T]
     with IInterceptable[IValueWillChange[T]]
     with IListenable {
  def this(value: T, enhancer: IEnhancer[T]) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
  var dehanceValue: js.Any = js.native
  var dehancer: js.Any = js.native
  @JSName("enhancer")
  var enhancer_Original: IEnhancer[T] = js.native
  @JSName("equals")
  var equals_FObservableValue: js.Any = js.native
  var hasUnreportedChange: Boolean = js.native
  var prepareNewValue: js.Any = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: js.Function0[T] = js.native
  var value: js.Any = js.native
  def enhancer(newValue: T, oldValue: T, name: String): T = js.native
  def enhancer(newValue: T, oldValue: js.UndefOr[scala.Nothing], name: String): T = js.native
  /* InferMemberOverrides */
  override def intercept(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def setNewValue(newValue: T): Unit = js.native
  def toJSON(): T = js.native
}

