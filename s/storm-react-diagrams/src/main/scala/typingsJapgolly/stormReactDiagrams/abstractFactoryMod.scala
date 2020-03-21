package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", JSImport.Namespace)
@js.native
object abstractFactoryMod extends js.Object {
  @js.native
  abstract class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] */] protected () extends js.Object {
    def this(name: String) = this()
    var `type`: String = js.native
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: js.Any): T = js.native
    def getType(): String = js.native
  }
  
}

