package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AttachmentsViewModel
import typingsJapgolly.arcgisJsApi.esri.AttachmentsViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.AttachmentsViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttachmentsAttachmentsViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Attachments/AttachmentsViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttachmentsViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attachments/AttachmentsViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Attachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html)
    */
  open class Class ()
    extends StObject
       with AttachmentsViewModel {
    def this(properties: AttachmentsViewModelProperties) = this()
  }
  
  type _To = js.Object & AttachmentsViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsAttachmentsAttachmentsViewModelMod.foo` */
  override def _to: js.Object & AttachmentsViewModelConstructor = ^
}
