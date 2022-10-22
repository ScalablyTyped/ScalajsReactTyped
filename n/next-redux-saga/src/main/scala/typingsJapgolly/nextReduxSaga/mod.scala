package typingsJapgolly.nextReduxSaga

import typingsJapgolly.nextReduxSaga.anon.Async
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[P](arg: Async): js.Function1[/* BaseComponent */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].apply(arg.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* BaseComponent */ ComponentType[P], ComponentType[P]]]
  inline def apply[P](arg: ComponentType[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].apply(arg.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  @JSImport("next-redux-saga", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
