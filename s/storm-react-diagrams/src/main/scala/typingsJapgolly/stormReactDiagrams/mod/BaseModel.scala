package typingsJapgolly.stormReactDiagrams.mod

import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams", "BaseModel")
@js.native
class BaseModel[X /* <: typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity[BaseListener[_]] */, T /* <: BaseModelListener */] ()
  extends typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel[X, T] {
  def this(`type`: String) = this()
  def this(`type`: String, id: String) = this()
}

