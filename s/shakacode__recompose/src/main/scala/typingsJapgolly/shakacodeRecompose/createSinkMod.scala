package typingsJapgolly.shakacodeRecompose

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#createsink
object createSinkMod {
  
  @JSImport("@shakacode/recompose/createSink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
}
