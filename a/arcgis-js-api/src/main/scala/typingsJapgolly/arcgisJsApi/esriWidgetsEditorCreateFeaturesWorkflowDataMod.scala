package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.CreateFeaturesWorkflowData
import typingsJapgolly.arcgisJsApi.esri.CreateFeaturesWorkflowDataConstructor
import typingsJapgolly.arcgisJsApi.esri.CreateFeaturesWorkflowDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorCreateFeaturesWorkflowDataMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/CreateFeaturesWorkflowData", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CreateFeaturesWorkflowDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/CreateFeaturesWorkflowData", JSImport.Namespace)
  @js.native
  /**
    * This object supports the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html)
    */
  open class Class ()
    extends StObject
       with CreateFeaturesWorkflowData {
    def this(properties: CreateFeaturesWorkflowDataProperties) = this()
  }
  
  type _To = js.Object & CreateFeaturesWorkflowDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsEditorCreateFeaturesWorkflowDataMod.foo` */
  override def _to: js.Object & CreateFeaturesWorkflowDataConstructor = ^
}
