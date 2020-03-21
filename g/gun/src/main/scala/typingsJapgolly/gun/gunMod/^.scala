package typingsJapgolly.gun.gunMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.gun.AnonDecrypt
import typingsJapgolly.gun.AnonIfy
import typingsJapgolly.gun.gunStrings.pre_root
import typingsJapgolly.gun.mod.Gun.ChainReference
import typingsJapgolly.gun.mod.Gun.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gun/gun", JSImport.Namespace)
@js.native
class ^[DataType] ()
  extends ChainReference[DataType, js.Any, pre_root] {
  def this(options: String) = this()
  def this(options: js.Array[String]) = this()
  def this(options: ConstructorOptions) = this()
}

@JSImport("gun/gun", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable0[ChainReference[js.Object, js.Any, pre_root]]) with (Instantiable1[/* options */ String, ChainReference[js.Object, js.Any, pre_root]]) with (Instantiable1[/* options */ js.Array[String], ChainReference[js.Object, js.Any, pre_root]]) with (Instantiable1[/* options */ ConstructorOptions, ChainReference[js.Object, js.Any, pre_root]])
    ] {
  val Gun: js.Any = js.native
  /** @see https://gun.eco/docs/SEA */
  var SEA: AnonDecrypt = js.native
  var node: AnonIfy = js.native
  /**
    * @description
    * no parameters creates a local datastore using the default persistence layer, either localStorage or Radisk.
    * @param options
    * passing a URL creates the above local datastore that also tries to sync with the URL.
    *
    * or you can pass in an array of URLs to sync with multiple peers.
    */
  def apply[DataType](): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: String): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: js.Array[String]): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: ConstructorOptions): ChainReference[DataType, _, pre_root] = js.native
}

