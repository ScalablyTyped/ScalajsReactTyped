package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxGroup")
@js.native
open class KdbxGroup ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
/* static members */
object KdbxGroup {
  
  @JSImport("kdbxweb", "KdbxGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(name: String): typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup]
  inline def create(name: String, parentGroup: typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup): typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup]
  
  /**
    * Finds a best place to insert new item into collection
    */
  @JSImport("kdbxweb", "KdbxGroup.findInsertIx")
  @js.native
  def findInsertIx: Any = js.native
  inline def findInsertIx_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findInsertIx")(x.asInstanceOf[js.Any])
  
  inline def read(xmlNode: Node, ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup]
  inline def read(
    xmlNode: Node,
    ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext,
    parentGroup: typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup
  ): typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxGroupMod.KdbxGroup]
}
