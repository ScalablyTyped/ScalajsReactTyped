package typingsJapgolly.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
open class Root ()
  extends typingsJapgolly.apolloProtobufjs.mod.Root {
  def this(options: StringDictionary[Any]) = this()
}
/* static members */
object Root {
  
  @JSImport("@apollo/protobufjs/minimal", "Root")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  inline def fromJSON(json: INamespace): typingsJapgolly.apolloProtobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]
  inline def fromJSON(json: INamespace, root: typingsJapgolly.apolloProtobufjs.mod.Root): typingsJapgolly.apolloProtobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]
}
