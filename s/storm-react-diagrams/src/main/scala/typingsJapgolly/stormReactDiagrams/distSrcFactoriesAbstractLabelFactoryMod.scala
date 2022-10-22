package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.distSrcModelsLabelModelMod.LabelModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractLabelFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractLabelFactory", "AbstractLabelFactory")
  @js.native
  open class AbstractLabelFactory[T /* <: LabelModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
}
