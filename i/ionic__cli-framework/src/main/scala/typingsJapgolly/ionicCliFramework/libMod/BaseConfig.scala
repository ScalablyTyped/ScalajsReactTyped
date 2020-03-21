package typingsJapgolly.ionicCliFramework.libMod

import typingsJapgolly.ionicCliFramework.configMod.BaseConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "BaseConfig")
@js.native
abstract class BaseConfig[T /* <: js.Object */] protected ()
  extends typingsJapgolly.ionicCliFramework.configMod.BaseConfig[T] {
  def this(p: String) = this()
  def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
}

