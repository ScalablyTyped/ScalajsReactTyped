package typingsJapgolly.tcomb

import typingsJapgolly.tcomb.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsSubsetOfMod {
  
  @JSImport("tcomb/lib/isSubsetOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(subset: Type[Any], superset: Type[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(subset.asInstanceOf[js.Any], superset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
