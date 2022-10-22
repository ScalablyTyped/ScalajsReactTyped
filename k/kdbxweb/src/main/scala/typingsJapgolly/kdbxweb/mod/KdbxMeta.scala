package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxMeta")
@js.native
open class KdbxMeta ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta
/* static members */
object KdbxMeta {
  
  @JSImport("kdbxweb", "KdbxMeta")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new meta
    * @returns {KdbxMeta}
    */
  inline def create(): typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta]
  
  inline def read(xmlNode: Node, ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta]
}
