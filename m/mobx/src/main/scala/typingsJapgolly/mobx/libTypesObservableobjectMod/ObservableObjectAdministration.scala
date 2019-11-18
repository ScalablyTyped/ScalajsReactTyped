package typingsJapgolly.mobx.libTypesObservableobjectMod

import typingsJapgolly.mobx.libCoreAtomMod.IAtom
import typingsJapgolly.mobx.libCoreComputedvalueMod.IComputedValueOptions
import typingsJapgolly.mobx.libInternalMod.ComputedValue
import typingsJapgolly.mobx.libInternalMod.ObservableValue
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptable
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typingsJapgolly.mobx.libTypesListenDashUtilsMod.IListenable
import typingsJapgolly.mobx.libTypesModifiersMod.IEnhancer
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import typingsJapgolly.std.Map
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableobject", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends IInterceptable[IObjectWillChange]
     with IListenable {
  def this(
    target: js.Any,
    values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
    name: String,
    defaultEnhancer: IEnhancer[_]
  ) = this()
  @JSName("defaultEnhancer")
  var defaultEnhancer_Original: IEnhancer[_] = js.native
  var keysAtom: IAtom = js.native
  var name: String = js.native
  var pendingKeys: js.Any = js.native
  var proxy: js.Any = js.native
  var target: js.Any = js.native
  var values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]] = js.native
  def addComputedProp(
     // where is the property declared?
  propertyOwner: js.Any,
    propName: PropertyKey,
    options: IComputedValueOptions[_]
  ): Unit = js.native
  def addObservableProp(propName: PropertyKey, newValue: js.Any): Unit = js.native
  def addObservableProp(propName: PropertyKey, newValue: js.Any, enhancer: IEnhancer[_]): Unit = js.native
  def defaultEnhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
  def defaultEnhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
  def getKeys(): js.Array[PropertyKey] = js.native
  def has(key: PropertyKey): js.Any = js.native
  def illegalAccess(owner: js.Any, propName: js.Any): Unit = js.native
  def intercept(handler: js.Any): Lambda = js.native
  /* CompleteClass */
  override def intercept(handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def notifyPropertyAddition(key: PropertyKey, newValue: js.Any): Unit = js.native
  /**
    * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
    * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
    * for callback details
    */
  def observe(callback: js.Function1[/* changes */ IObjectDidChange, Unit]): Lambda = js.native
  def observe(callback: js.Function1[/* changes */ IObjectDidChange, Unit], fireImmediately: Boolean): Lambda = js.native
  def read(key: PropertyKey): js.Any = js.native
  def remove(key: PropertyKey): Unit = js.native
  def write(key: PropertyKey, newValue: js.Any): Unit = js.native
}

