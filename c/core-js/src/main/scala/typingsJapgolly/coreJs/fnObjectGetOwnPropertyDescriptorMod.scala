package typingsJapgolly.coreJs

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnObjectGetOwnPropertyDescriptorMod {
  
  /* was `typeof core.Object.getOwnPropertyDescriptor` */
  inline def apply(o: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  @JSImport("core-js/fn/object/get-own-property-descriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
