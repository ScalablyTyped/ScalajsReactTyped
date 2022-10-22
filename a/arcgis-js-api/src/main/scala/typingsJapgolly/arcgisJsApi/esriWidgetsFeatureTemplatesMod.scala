package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplates
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplatesConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureTemplatesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTemplatesMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTemplatesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates", JSImport.Namespace)
  @js.native
  /**
    * The FeatureTemplates widget is part of the overall editing workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html)
    */
  open class Class ()
    extends StObject
       with FeatureTemplates {
    def this(properties: FeatureTemplatesProperties) = this()
  }
  
  type _To = js.Object & FeatureTemplatesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTemplatesMod.foo` */
  override def _to: js.Object & FeatureTemplatesConstructor = ^
}
