package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Dequeue
import typingsJapgolly.baseui.snackbarTypesMod.Duration
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarElementProps
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarProviderProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarSnackbarContextMod {
  
  @JSImport("baseui/snackbar/snackbar-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenOverridesPlacementDefaultDuration: SnackbarProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenOverridesPlacementDefaultDuration.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/snackbar/snackbar-context", "SnackbarContext")
  @js.native
  val SnackbarContext: typingsJapgolly.react.mod.Context[Context] = js.native
  
  inline def useSnackbar(): Dequeue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSnackbar")().asInstanceOf[Dequeue]
  
  @js.native
  trait Context extends StObject {
    
    def dequeue(): Unit = js.native
    
    def enqueue(elementProps: SnackbarElementProps): Unit = js.native
    def enqueue(elementProps: SnackbarElementProps, duration: Duration): Unit = js.native
  }
}
