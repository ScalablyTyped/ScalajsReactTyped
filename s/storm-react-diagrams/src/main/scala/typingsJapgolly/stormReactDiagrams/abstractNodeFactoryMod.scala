package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractNodeFactory", JSImport.Namespace)
@js.native
object abstractNodeFactoryMod extends js.Object {
  @js.native
  abstract class AbstractNodeFactory[T /* <: NodeModel */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, node: T): Element = js.native
  }
  
}

