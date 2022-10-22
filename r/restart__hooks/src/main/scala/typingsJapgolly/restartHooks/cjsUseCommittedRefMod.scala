package typingsJapgolly.restartHooks

import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseCommittedRefMod {
  
  @JSImport("@restart/hooks/cjs/useCommittedRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a `Ref` whose value is updated in an effect, ensuring the most recent
    * value is the one rendered with. Generally only required for Concurrent mode usage
    * where previous work in `render()` may be discarded before being used.
    *
    * This is safe to access in an event handler.
    *
    * @param value The `Ref` value
    */
  inline def default[TValue](value: TValue): MutableRefObject[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[TValue]]
}
