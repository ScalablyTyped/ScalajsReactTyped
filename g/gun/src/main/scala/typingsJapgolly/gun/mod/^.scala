package typingsJapgolly.gun.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.gun.gunStrings.pre_root
import typingsJapgolly.gun.mod.Gun.ChainReference
import typingsJapgolly.gun.mod.Gun.Constructor
import typingsJapgolly.gun.mod.Gun.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gun", JSImport.Namespace)
@js.native
class ^[DataType] ()
  extends ChainReference[DataType, js.Any, pre_root] {
  def this(options: String) = this()
  def this(options: js.Array[String]) = this()
  def this(options: ConstructorOptions) = this()
}

@JSImport("gun", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Constructor]

