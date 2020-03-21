package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", JSImport.Namespace)
@js.native
object abstractLinkFactoryMod extends js.Object {
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] () extends AbstractFactory[T] {
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): Element = js.native
  }
  
}

