package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.ILookup
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IWorkflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Workflow")
@js.native
class Workflow () extends IWorkflow {
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
  /* CompleteClass */
  override def Clone(): IWorkflow = js.native
  /* CompleteClass */
  override def GetAsLookup(): ILookup = js.native
  /* CompleteClass */
  override def GetAsTypedValue(): ITypedValue = js.native
}

@JSGlobal("MFiles.Workflow")
@js.native
object Workflow extends Instantiable0[IWorkflow]

