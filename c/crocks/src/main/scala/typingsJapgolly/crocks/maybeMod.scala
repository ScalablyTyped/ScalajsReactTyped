package typingsJapgolly.crocks

import typingsJapgolly.crocks.maybeMaybeMod.Just
import typingsJapgolly.crocks.maybeMaybeMod.Maybe
import typingsJapgolly.crocks.maybeMaybeMod.Nothing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeMod {
  
  @JSImport("crocks/Maybe", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.maybeMaybeMod.default
  object default {
    
    inline def apply(`val`: Any): Maybe = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Maybe]
    
    @JSImport("crocks/Maybe", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("crocks/Maybe", "default.Just")
    @js.native
    def Just: js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.Just] = js.native
    inline def Just_=(x: js.Function1[/* val */ Any, Just]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Just")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("crocks/Maybe", "default.Nothing")
    @js.native
    def Nothing: js.Function1[/* val */ Any, typingsJapgolly.crocks.maybeMaybeMod.Nothing] = js.native
    inline def Nothing_=(x: js.Function1[/* val */ Any, Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nothing")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def of(`val`: Any): Just = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Just]
    
    /* static member */
    inline def zero(): Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Nothing]
  }
}
