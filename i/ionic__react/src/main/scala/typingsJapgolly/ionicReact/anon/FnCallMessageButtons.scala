package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMessageButtons extends StObject {
  
  /**
    * Presents the alert
    * @param message The main message to be displayed in the alert
    * @param buttons Optional - Array of buttons to be added to the alert
    */
  def apply(message: String): js.Promise[Unit] = js.native
  def apply(
    message: String,
    buttons: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlertButton */ Any
    ]
  ): js.Promise[Unit] = js.native
  /**
    * Presents the alert
    * @param options The options to pass to the IonAlert
    */
  def apply(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlertOptions */ Any) & HookOverlayOptions
  ): js.Promise[Unit] = js.native
}
