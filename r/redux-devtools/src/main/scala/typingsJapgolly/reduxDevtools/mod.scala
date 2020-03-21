package typingsJapgolly.reduxDevtools

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod._Global_.JSX.ElementClass
import typingsJapgolly.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IDevTools extends Instantiable0[ElementClass] {
    def instrument(): StoreEnhancer[js.Object, js.Object] = js.native
  }
  
  def createDevTools(el: Element): IDevTools = js.native
  def persistState(debugSessionKey: String): StoreEnhancer[js.Object, js.Object] = js.native
  @js.native
  object default extends js.Object {
    def instrument(): js.Function1[/* opts */ js.Any, _] = js.native
  }
  
}

