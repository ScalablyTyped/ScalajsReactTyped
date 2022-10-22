package typingsJapgolly.crocks

import typingsJapgolly.crocks.writerWriterMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairWriterToPairMod {
  
  @JSImport("crocks/Pair/writerToPair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: js.Function1[/* val */ Any, Writer]): js.Function1[/* val */ Any, typingsJapgolly.crocks.pairPairMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, typingsJapgolly.crocks.pairPairMod.default]]
  /**
    * writerToPair :: Monoid m => Writer m a -> Pair m a
    * writerToPair :: Monoid m => (a -> Writer m b) -> a -> Pair m b
    */
  inline def default(`val`: Writer): typingsJapgolly.crocks.pairPairMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.pairPairMod.default]
}
