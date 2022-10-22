package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputHooksUseRemovePasswordTimeoutMod {
  
  @JSImport("antd/lib/input/hooks/useRemovePasswordTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(inputRef: RefHandle[InputRef]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputRef.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(inputRef: RefHandle[InputRef], triggerOnMount: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputRef.asInstanceOf[js.Any], triggerOnMount.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
