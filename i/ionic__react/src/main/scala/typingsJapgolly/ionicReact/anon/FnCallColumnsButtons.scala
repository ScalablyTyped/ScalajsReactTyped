package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallColumnsButtons extends StObject {
  
  /**
    * Presents the picker
    * @param columns Array of columns to be displayed in the picker.
    * @param buttons Optional - Array of buttons to be displayed at the top of the picker.
    */
  def apply(
    columns: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerColumn */ Any
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    columns: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerColumn */ Any
    ],
    buttons: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerButton */ Any
    ]
  ): js.Promise[Unit] = js.native
  /**
    * Presents the picker
    * @param options The options to pass to the IonPicker
    */
  def apply(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerOptions */ Any) & HookOverlayOptions
  ): js.Promise[Unit] = js.native
}
