package typingsJapgolly.stropheJs.stropheMod

import typingsJapgolly.strophe.mod.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presAugmentingMod {
  
  /**
    * Function: $pres
    * Create a Strophe.Builder with a <presence/> element as the root.
    *
    * Parameters:
    *  (Object) attrs - The <presence/> element attributes in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def apply(): Builder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Builder]
  inline def apply(attrs: Any): Builder = ^.asInstanceOf[js.Dynamic].apply(attrs.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  @JSImport("$pres", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
