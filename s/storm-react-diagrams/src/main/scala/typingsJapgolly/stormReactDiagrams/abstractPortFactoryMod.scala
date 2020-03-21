package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsJapgolly.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractPortFactory", JSImport.Namespace)
@js.native
object abstractPortFactoryMod extends js.Object {
  @js.native
  abstract class AbstractPortFactory[T /* <: PortModel */] () extends AbstractFactory[T]
  
}

