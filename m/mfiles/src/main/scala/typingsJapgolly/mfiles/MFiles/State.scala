package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.ILookup
import typingsJapgolly.mfiles.IState
import typingsJapgolly.mfiles.ITypedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.State")
@js.native
class State () extends IState {
  /* CompleteClass */
  override val ID: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var Selectable: Boolean = js.native
  /* CompleteClass */
  override var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
  /* CompleteClass */
  override def GetAsLookup(): ILookup = js.native
  /* CompleteClass */
  override def GetAsTypedValue(): ITypedValue = js.native
}

@JSGlobal("MFiles.State")
@js.native
object State extends Instantiable0[IState]

