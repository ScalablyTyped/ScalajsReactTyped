package typingsJapgolly.dialogPolyfill

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.HTMLDialogElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * If used as ESM, then we export a const of type "DialogPolyfillType" as the default.
    */
  @JSImport("dialog-polyfill", JSImport.Default)
  @js.native
  val default: DialogPolyfillType = js.native
  
  /**
    * If used as CJS, then "dialogPolyfill" is added to the global scope. Just assert it exists.
    */
  object global {
    
    @JSGlobal("dialogPolyfill")
    @js.native
    val dialogPolyfill: DialogPolyfillType = js.native
  }
  
  trait DialogPolyfillType extends StObject {
    
    def forceRegisterDialog(dialog: HTMLDialogElement): Unit
    
    def registerDialog(dialog: HTMLDialogElement): Unit
  }
  object DialogPolyfillType {
    
    inline def apply(forceRegisterDialog: HTMLDialogElement => Callback, registerDialog: HTMLDialogElement => Callback): DialogPolyfillType = {
      val __obj = js.Dynamic.literal(forceRegisterDialog = js.Any.fromFunction1((t0: HTMLDialogElement) => forceRegisterDialog(t0).runNow()), registerDialog = js.Any.fromFunction1((t0: HTMLDialogElement) => registerDialog(t0).runNow()))
      __obj.asInstanceOf[DialogPolyfillType]
    }
    
    extension [Self <: DialogPolyfillType](x: Self) {
      
      inline def setForceRegisterDialog(value: HTMLDialogElement => Callback): Self = StObject.set(x, "forceRegisterDialog", js.Any.fromFunction1((t0: HTMLDialogElement) => value(t0).runNow()))
      
      inline def setRegisterDialog(value: HTMLDialogElement => Callback): Self = StObject.set(x, "registerDialog", js.Any.fromFunction1((t0: HTMLDialogElement) => value(t0).runNow()))
    }
  }
  
  type _To = DialogPolyfillType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: DialogPolyfillType = default
}
