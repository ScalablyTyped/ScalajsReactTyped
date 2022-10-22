package typingsJapgolly.lezerLr

import typingsJapgolly.lezerLr.anon.Hash
import typingsJapgolly.lezerLr.distTokenMod.ExternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/lr", "ContextTracker")
  @js.native
  open class ContextTracker[T] protected ()
    extends typingsJapgolly.lezerLr.distParseMod.ContextTracker[T] {
    def this(spec: Hash[T]) = this()
  }
  
  @JSImport("@lezer/lr", "ExternalTokenizer")
  @js.native
  open class ExternalTokenizer protected ()
    extends typingsJapgolly.lezerLr.distTokenMod.ExternalTokenizer {
    def this(token: js.Function2[
            /* input */ typingsJapgolly.lezerLr.distTokenMod.InputStream, 
            /* stack */ typingsJapgolly.lezerLr.distStackMod.Stack, 
            Unit
          ]) = this()
    def this(
      token: js.Function2[
            /* input */ typingsJapgolly.lezerLr.distTokenMod.InputStream, 
            /* stack */ typingsJapgolly.lezerLr.distStackMod.Stack, 
            Unit
          ],
      options: ExternalOptions
    ) = this()
  }
  
  @JSImport("@lezer/lr", "InputStream")
  @js.native
  open class InputStream ()
    extends typingsJapgolly.lezerLr.distTokenMod.InputStream
  
  @JSImport("@lezer/lr", "LRParser")
  @js.native
  open class LRParser ()
    extends typingsJapgolly.lezerLr.distParseMod.LRParser
  /* static members */
  object LRParser {
    
    @JSImport("@lezer/lr", "LRParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(spec: Any): typingsJapgolly.lezerLr.distParseMod.LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(spec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.lezerLr.distParseMod.LRParser]
  }
  
  @JSImport("@lezer/lr", "Stack")
  @js.native
  open class Stack ()
    extends typingsJapgolly.lezerLr.distStackMod.Stack
}
