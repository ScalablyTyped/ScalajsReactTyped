package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.distTypesFormatKdbxCustomDataMod.KdbxCustomDataMap
import typingsJapgolly.kdbxweb.distTypesUtilsXmlUtilsMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxCustomData")
@js.native
open class KdbxCustomData ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxCustomDataMod.KdbxCustomData
/* static members */
object KdbxCustomData {
  
  @JSImport("kdbxweb", "KdbxCustomData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(node: Node): KdbxCustomDataMap = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(node.asInstanceOf[js.Any]).asInstanceOf[KdbxCustomDataMap]
  
  @JSImport("kdbxweb", "KdbxCustomData.readItem")
  @js.native
  def readItem: Any = js.native
  inline def readItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readItem")(x.asInstanceOf[js.Any])
  
  inline def write(parentNode: Node, ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    parentNode: Node,
    ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext,
    customData: KdbxCustomDataMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(parentNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], customData.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
