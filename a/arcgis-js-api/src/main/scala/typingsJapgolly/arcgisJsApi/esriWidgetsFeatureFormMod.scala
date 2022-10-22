package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureForm
import typingsJapgolly.arcgisJsApi.esri.FeatureFormConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureFormProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureFormConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm", JSImport.Namespace)
  @js.native
  /**
    * The FeatureForm widget displays attributes of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html)
    */
  open class Class ()
    extends StObject
       with FeatureForm {
    def this(properties: FeatureFormProperties) = this()
  }
  
  type _To = js.Object & FeatureFormConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureFormMod.foo` */
  override def _to: js.Object & FeatureFormConstructor = ^
}
