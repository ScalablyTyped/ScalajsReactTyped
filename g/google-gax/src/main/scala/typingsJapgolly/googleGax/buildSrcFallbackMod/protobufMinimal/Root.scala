package typingsJapgolly.googleGax.buildSrcFallbackMod.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobufMinimal.Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
open class Root ()
  extends typingsJapgolly.protobufjs.minimalMod.Root {
  def this(options: StringDictionary[Any]) = this()
}
/* static members */
object Root {
  
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.Root")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  inline def fromJSON(json: INamespace): typingsJapgolly.protobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.protobufjs.mod.Root]
  inline def fromJSON(json: INamespace, root: typingsJapgolly.protobufjs.mod.Root): typingsJapgolly.protobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.protobufjs.mod.Root]
}
