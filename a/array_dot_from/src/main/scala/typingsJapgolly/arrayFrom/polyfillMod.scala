package typingsJapgolly.arrayFrom

import typingsJapgolly.arrayFrom.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillMod {
  
  /**
    * Gets the optimal `Array.from` implementation to use.
    */
  inline def apply(): FnCall = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FnCall]
  
  @JSImport("array.from/polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
