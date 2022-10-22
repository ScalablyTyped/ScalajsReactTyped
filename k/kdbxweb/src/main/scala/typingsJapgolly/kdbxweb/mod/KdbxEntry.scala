package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxEntry")
@js.native
open class KdbxEntry ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry
/* static members */
object KdbxEntry {
  
  @JSImport("kdbxweb", "KdbxEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    meta: typingsJapgolly.kdbxweb.distTypesFormatKdbxMetaMod.KdbxMeta,
    parentGroup: typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
  ): typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(meta.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
  
  inline def read(xmlNode: Node, ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
  inline def read(
    xmlNode: Node,
    ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext,
    parentGroup: typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
  ): typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxEntryMod.KdbxEntry]
}
