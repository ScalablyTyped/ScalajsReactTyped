package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseRefStateMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useRefState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefState[T](): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")().asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  inline def useRefState[T](initialValue: T): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
}
