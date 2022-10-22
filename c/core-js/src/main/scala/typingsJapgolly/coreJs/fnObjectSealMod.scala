package typingsJapgolly.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnObjectSealMod {
  
  /* was `typeof core.Object.seal` */
  inline def apply[T](o: T): T = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("core-js/fn/object/seal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
