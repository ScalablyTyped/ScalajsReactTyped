package typingsJapgolly.coreJs

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectDeletePropertyMod {
  
  /* was `typeof core.Reflect.deleteProperty` */
  inline def apply(target: Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/fn/reflect/delete-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
