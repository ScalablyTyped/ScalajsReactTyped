package typingsJapgolly.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typingsJapgolly.protobufjs.mod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/light", "Root")
@js.native
object Root extends js.Object {
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: INamespace): typingsJapgolly.protobufjs.mod.Root = js.native
  def fromJSON(json: INamespace, root: typingsJapgolly.protobufjs.mod.Root): typingsJapgolly.protobufjs.mod.Root = js.native
}

