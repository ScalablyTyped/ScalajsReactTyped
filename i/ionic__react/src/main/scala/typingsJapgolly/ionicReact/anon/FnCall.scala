package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  /**
    * Presents the action sheet
    * @param buttons An array of buttons for the action sheet
    * @param header Optional - Title for the action sheet
    */
  def apply(
    buttons: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetButton */ Any
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    buttons: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetButton */ Any
    ],
    header: String
  ): js.Promise[Unit] = js.native
  /**
    * Presents the action sheet
    * @param options The options to pass to the IonActionSheet
    */
  def apply(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetOptions */ Any) & HookOverlayOptions
  ): js.Promise[Unit] = js.native
}
