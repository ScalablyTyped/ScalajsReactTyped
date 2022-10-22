package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcFactoriesAbstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractNodeFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", "AbstractNodeFactory")
  @js.native
  open class AbstractNodeFactory[T /* <: NodeModel */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
}
