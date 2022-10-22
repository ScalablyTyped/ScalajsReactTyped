package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LineOfSightViewModel
import typingsJapgolly.arcgisJsApi.esri.LineOfSightViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.LineOfSightViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLineOfSightLineOfSightViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/LineOfSight/LineOfSightViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LineOfSight/LineOfSightViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [LineOfSight](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightViewModel {
    def this(properties: LineOfSightViewModelProperties) = this()
  }
  
  type _To = js.Object & LineOfSightViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLineOfSightLineOfSightViewModelMod.foo` */
  override def _to: js.Object & LineOfSightViewModelConstructor = ^
}
