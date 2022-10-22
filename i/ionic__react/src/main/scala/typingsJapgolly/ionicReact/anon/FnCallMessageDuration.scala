package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMessageDuration extends StObject {
  
  /**
    * Presents the toast
    * @param message Message to be shown in the toast.
    * @param duration Optional - How many milliseconds to wait before hiding the toast. By default, it will show until dismissToast() is called.
    */
  def apply(message: String): js.Promise[Unit] = js.native
  def apply(message: String, duration: Double): js.Promise[Unit] = js.native
  /**
    * Presents the Toast
    * @param options The options to pass to the IonToast.
    */
  def apply(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToastOptions */ Any) & HookOverlayOptions
  ): js.Promise[Unit] = js.native
}
