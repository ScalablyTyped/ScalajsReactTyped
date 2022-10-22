package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMessageDurationSpinner extends StObject {
  
  /**
    * Presents the loading indicator
    * @param message Optional - Text content to display in the loading indicator, defaults to blank string
    * @param duration Optional - Number of milliseconds to wait before dismissing the loading indicator
    * @param spinner Optional - The name of the spinner to display, defaults to "lines"
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(message: String): js.Promise[Unit] = js.native
  def apply(message: String, duration: Double): js.Promise[Unit] = js.native
  def apply(
    message: String,
    duration: Double,
    spinner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpinnerTypes */ Any
  ): js.Promise[Unit] = js.native
  def apply(
    message: String,
    duration: Unit,
    spinner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpinnerTypes */ Any
  ): js.Promise[Unit] = js.native
  def apply(message: Unit, duration: Double): js.Promise[Unit] = js.native
  def apply(
    message: Unit,
    duration: Double,
    spinner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpinnerTypes */ Any
  ): js.Promise[Unit] = js.native
  def apply(
    message: Unit,
    duration: Unit,
    spinner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpinnerTypes */ Any
  ): js.Promise[Unit] = js.native
  /**
    * Presents the loading indicator
    * @param options The options to pass to the IonLoading
    */
  def apply(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadingOptions */ Any) & HookOverlayOptions
  ): js.Promise[Unit] = js.native
}
