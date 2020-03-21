package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.labelModelMod.LabelModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLabelFactory", JSImport.Namespace)
@js.native
object abstractLabelFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLabelFactory[T /* <: LabelModel */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
  
}

