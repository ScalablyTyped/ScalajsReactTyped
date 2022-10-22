package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsLabelModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/LabelModel", "LabelModel")
  @js.native
  open class LabelModel () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(`type`: String) = this()
    def this(`type`: String, id: String) = this()
    def this(`type`: Unit, id: String) = this()
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
  }
}
