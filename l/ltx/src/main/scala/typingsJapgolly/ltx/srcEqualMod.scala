package typingsJapgolly.ltx

import typingsJapgolly.ltx.srcElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEqualMod {
  
  @JSImport("ltx/src/equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: typingsJapgolly.ltx.srcElementMod.default, b: typingsJapgolly.ltx.srcElementMod.default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def attrsEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("attrsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def childrenEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nameEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nameEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
