package typingsJapgolly.crocks.mod

import typingsJapgolly.crocks.identityIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Identity_ {
  
  @JSImport("crocks", "Identity.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.identityMod.default
  object default {
    
    inline def apply(`val`: scala.Any): Identity = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
    
    @JSImport("crocks", "Identity.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def of(`val`: scala.Any): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
  }
}
