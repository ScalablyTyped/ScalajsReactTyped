package typingsJapgolly.ionicCliFramework.configMod

import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/config", "BaseConfig")
@js.native
abstract class BaseConfig[T /* <: js.Object */] protected () extends js.Object {
  def this(p: String) = this()
  def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
  var _getFile: js.Any = js.native
  var _setFile: js.Any = js.native
  val p: String = js.native
  val pathPrefix: js.Array[String] = js.native
  def c(): T = js.native
  def c(value: T): js.Any = js.native
  def file(): js.Any = js.native
  def get[P /* <: String */](property: P): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = js.native
  def get[P /* <: String */](
    property: P,
    defaultValue: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  def provideDefaults(c: Partial[T]): T = js.native
  def set[P /* <: String */](
    property: P,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ): Unit = js.native
  def unset[P /* <: String */](property: P): Unit = js.native
}

