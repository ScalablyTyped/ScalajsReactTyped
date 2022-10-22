package typingsJapgolly.ionicReact.anon

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.IonLifeCycleContextInterface
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidUpdate extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Any, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Any, /* nextState */ Any, /* nextContext */ Any, Unit]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  def componentDidMount(): Unit = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ Any, /* prevState */ Any, /* snapshot */ js.UndefOr[Any], Unit]
  ] = js.native
  
  var componentRef: RefHandle[Any] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Any, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Any, /* nextState */ Any, /* nextContext */ Any, Unit]
  ] = js.native
  
  var context: ContextType[Context[IonLifeCycleContextInterface]] = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ Any, /* prevState */ Any, Any]] = js.native
  
  val props: Any & ReadonlychildrenReactNode = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Any, /* nextState */ Any, /* nextContext */ Any, Boolean]
  ] = js.native
  
  var state: Any = js.native
}
