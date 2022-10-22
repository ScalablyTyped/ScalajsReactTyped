package typingsJapgolly.rcTabs

import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-tabs/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify[K /* <: String | Double | js.Symbol */, V](obj: Map[K, V]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify[K /* <: String | Double | js.Symbol */, V](obj: Record[K, V]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
