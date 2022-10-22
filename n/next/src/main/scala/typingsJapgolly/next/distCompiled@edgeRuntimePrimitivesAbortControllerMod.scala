package typingsJapgolly.next

import typingsJapgolly.next.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesAbortControllerMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortController")
  @js.native
  val AbortController: org.scalajs.dom.AbortController = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortSignal")
  @js.native
  open class AbortSignal ()
    extends StObject
       with Instantiable
  object AbortSignal {
    
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortSignal")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns an AbortSignal instance whose abort reason is set to reason if not undefined; otherwise to an "AbortError" DOMException. */
    inline def abort(): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[org.scalajs.dom.AbortSignal]
    inline def abort(reason: String): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(reason.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.AbortSignal]
    
    /** Returns an AbortSignal instance which will be aborted in milliseconds milliseconds. Its abort reason will be set to a "TimeoutError" DOMException. */
    inline def timeout(milliseconds: Double): org.scalajs.dom.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.AbortSignal]
  }
}
