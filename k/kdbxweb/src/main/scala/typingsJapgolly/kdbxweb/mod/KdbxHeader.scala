package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.kdbxwebInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxHeader")
@js.native
open class KdbxHeader ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader
/* static members */
object KdbxHeader {
  
  @JSImport("kdbxweb", "KdbxHeader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "KdbxHeader.MaxFileVersion")
  @js.native
  val MaxFileVersion: `4` = js.native
  
  inline def create(): typingsJapgolly.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader]
  
  inline def read(
    stm: typingsJapgolly.kdbxweb.distTypesUtilsBinaryStreamMod.BinaryStream,
    ctx: typingsJapgolly.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext
  ): typingsJapgolly.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxHeaderMod.KdbxHeader]
}
