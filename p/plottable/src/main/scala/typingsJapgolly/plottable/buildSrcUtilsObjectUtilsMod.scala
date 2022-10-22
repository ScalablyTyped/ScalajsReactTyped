package typingsJapgolly.plottable

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsObjectUtilsMod {
  
  @JSImport("plottable/build/src/utils/objectUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign[T /* <: Record[Any, Any] */](objs: Partial[T]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
}
