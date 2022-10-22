package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplatesViewModel
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplatesViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplatesViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTemplatesFeatureTemplatesViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates/FeatureTemplatesViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTemplatesViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates/FeatureTemplatesViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html)
    */
  open class Class ()
    extends StObject
       with FeatureTemplatesViewModel {
    def this(properties: FeatureTemplatesViewModelProperties) = this()
  }
  
  type _To = js.Object & FeatureTemplatesViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTemplatesFeatureTemplatesViewModelMod.foo` */
  override def _to: js.Object & FeatureTemplatesViewModelConstructor = ^
}
