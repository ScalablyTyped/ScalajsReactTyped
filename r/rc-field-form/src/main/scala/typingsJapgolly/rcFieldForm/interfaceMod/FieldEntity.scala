package typingsJapgolly.rcFieldForm.interfaceMod

import typingsJapgolly.rcFieldForm.AnonDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldEntity extends js.Object {
  var props: AnonDependencies = js.native
  def getErrors(): js.Array[String] = js.native
  def getMeta(): Meta = js.native
  def getNamePath(): InternalNamePath = js.native
  def isFieldTouched(): Boolean = js.native
  def isFieldValidating(): Boolean = js.native
  def onStoreChange(store: Store, namePathList: js.Array[InternalNamePath], info: NotifyInfo): Unit = js.native
  def onStoreChange(store: Store, namePathList: Null, info: NotifyInfo): Unit = js.native
  def validateRules(): js.Promise[js.Array[String]] = js.native
  def validateRules(options: ValidateOptions): js.Promise[js.Array[String]] = js.native
}

