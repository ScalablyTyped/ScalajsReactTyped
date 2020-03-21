package typingsJapgolly.mobx

import typingsJapgolly.mobx.interceptUtilsMod.IInterceptable
import typingsJapgolly.mobx.interceptUtilsMod.IInterceptor
import typingsJapgolly.mobx.listenUtilsMod.IListenable
import typingsJapgolly.mobx.modifiersMod.IEnhancer
import typingsJapgolly.mobx.utilsMod.Lambda
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableset", JSImport.Namespace)
@js.native
object observablesetMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobx.AnonNewValueObject[T]
    - typingsJapgolly.mobx.AnonObjectOldValue[T]
  */
  trait ISetDidChange[T] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobx.AnonOldValueType[T]
    - typingsJapgolly.mobx.AnonNewValueObjectType[T]
  */
  trait ISetWillChange[T] extends js.Object
  
  @js.native
  class ObservableSet[T] ()
    extends Set[T]
       with IInterceptable[ISetWillChange[js.Any]]
       with IListenable {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
    var _atom: js.Any = js.native
    var _data: js.Any = js.native
    var dehanceValue: js.Any = js.native
    var dehancer: js.Any = js.native
    var name: String = js.native
    @JSName(scala.scalajs.js.Symbol.toStringTag)
    var toStringTag_ObservableSet: typingsJapgolly.mobx.mobxStrings.Set = js.native
    def delete(value: js.Any): Boolean = js.native
    def enhancer(newV: js.Any): js.Any = js.native
    def enhancer(newV: js.Any, oldV: js.Any): js.Any = js.native
    def has(value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def intercept(handler: IInterceptor[ISetWillChange[js.Any]]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
    def toJS(): Set[T] = js.native
  }
  
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  type IObservableSetInitialValues[T] = Set[T] | js.Array[T]
}

