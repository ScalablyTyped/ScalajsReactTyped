package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureFormViewModel
import typingsJapgolly.arcgisJsApi.esri.FeatureFormViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureFormViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormFeatureFormViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FeatureFormViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureFormViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FeatureFormViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html)
    */
  open class Class ()
    extends StObject
       with FeatureFormViewModel {
    def this(properties: FeatureFormViewModelProperties) = this()
  }
  
  type _To = js.Object & FeatureFormViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureFormFeatureFormViewModelMod.foo` */
  override def _to: js.Object & FeatureFormViewModelConstructor = ^
}
