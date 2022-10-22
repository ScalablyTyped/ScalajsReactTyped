package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.CreateWorkflowData
import typingsJapgolly.arcgisJsApi.esri.CreateWorkflowDataConstructor
import typingsJapgolly.arcgisJsApi.esri.CreateWorkflowDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorCreateWorkflowDataMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/CreateWorkflowData", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CreateWorkflowDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/CreateWorkflowData", JSImport.Namespace)
  @js.native
  /**
    * This object supports the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html)
    */
  open class Class ()
    extends StObject
       with CreateWorkflowData {
    def this(properties: CreateWorkflowDataProperties) = this()
  }
  
  type _To = js.Object & CreateWorkflowDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsEditorCreateWorkflowDataMod.foo` */
  override def _to: js.Object & CreateWorkflowDataConstructor = ^
}
