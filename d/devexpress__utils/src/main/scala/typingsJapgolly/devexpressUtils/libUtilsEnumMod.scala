package typingsJapgolly.devexpressUtils

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsEnumMod {
  
  @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils")
  @js.native
  open class EnumUtils () extends StObject
  /* static members */
  object EnumUtils {
    
    @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forEach(enumObject: Record[String, Any], callback: js.Function1[/* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(enumObject.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isAnyOf(value: Double, params: Double*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyOf")(scala.List(value.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  }
}
