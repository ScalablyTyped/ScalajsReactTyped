package typingsJapgolly.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnObjectDefineMod {
  
  /* was `typeof core.Object.define` */
  inline def apply[T](target: T, mixin: Any): T = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("core-js/fn/object/define", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
