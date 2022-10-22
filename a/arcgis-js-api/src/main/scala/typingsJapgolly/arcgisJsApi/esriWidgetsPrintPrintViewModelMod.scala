package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PrintViewModel
import typingsJapgolly.arcgisJsApi.esri.PrintViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.PrintViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsPrintPrintViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Print/PrintViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PrintViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print/PrintViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Print](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html)
    */
  open class Class ()
    extends StObject
       with PrintViewModel {
    def this(properties: PrintViewModelProperties) = this()
  }
  
  type _To = js.Object & PrintViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsPrintPrintViewModelMod.foo` */
  override def _to: js.Object & PrintViewModelConstructor = ^
}
