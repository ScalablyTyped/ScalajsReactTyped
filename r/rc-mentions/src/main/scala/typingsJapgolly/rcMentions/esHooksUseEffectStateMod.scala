package typingsJapgolly.rcMentions

import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseEffectStateMod {
  
  @JSImport("rc-mentions/es/hooks/useEffectState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Trigger = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Trigger]
  
  type Trigger = js.Function1[/* callback */ js.UndefOr[VoidFunction], Unit]
}
