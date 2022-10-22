package typingsJapgolly.enzymeRedux

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mountWithState[P](Component: Element, state: Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithState")(Component.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, js.Object, Component[js.Object, js.Object]]]
  
  inline def mountWithStore[P](Component: Element, store: Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithStore")(Component.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, js.Object, Component[js.Object, js.Object]]]
  
  inline def shallowWithState[P](Component: Element, state: Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithState")(Component.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, js.Object, Component[js.Object, js.Object]]]
  
  inline def shallowWithStore[P](Component: Element, store: Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithStore")(Component.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, js.Object, Component[js.Object, js.Object]]]
}
