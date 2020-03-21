package typingsJapgolly.rcFieldForm

import typingsJapgolly.rcFieldForm.interfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath
import typingsJapgolly.rcFieldForm.interfaceMod.NamePath
import typingsJapgolly.rcFieldForm.interfaceMod.Store
import typingsJapgolly.rcFieldForm.interfaceMod.StoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form/lib/utils/valueUtil", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  def cloneByNamePathList(store: Store, namePathList: js.Array[InternalNamePath]): Store = js.native
  def containsNamePath(namePathList: js.Array[InternalNamePath], namePath: InternalNamePath): Boolean = js.native
  def defaultGetValueFromEvent(
    valuePropName: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs is not an array type */ args: EventArgs
  ): js.Any = js.native
  def getNamePath(): InternalNamePath = js.native
  def getNamePath(path: NamePath): InternalNamePath = js.native
  def getValue(store: Store, namePath: InternalNamePath): js.Any = js.native
  def isSimilar(source: SimilarObject, target: SimilarObject): Boolean = js.native
  def matchNamePath(namePath: InternalNamePath): Boolean = js.native
  def matchNamePath(namePath: InternalNamePath, changedNamePath: InternalNamePath): Boolean = js.native
  def move[T](array: js.Array[T], moveIndex: Double, toIndex: Double): js.Array[T] = js.native
  def setValue(store: Store, namePath: InternalNamePath, value: StoreValue): Store = js.native
  def setValues[T](store: T, restValues: T*): T = js.native
  type SimilarObject = String | Double | js.Object
}

