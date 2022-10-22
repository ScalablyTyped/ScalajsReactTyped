package typingsJapgolly.random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random", JSImport.Default)
  @js.native
  val default: typingsJapgolly.random.distCjsRandomMod.Random = js.native
  
  /* note: abstract class */ @JSImport("random", "RNG")
  @js.native
  open class RNG ()
    extends typingsJapgolly.random.distCjsRandomMod.RNG
  
  inline def RNGFactory[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): typingsJapgolly.random.distCjsRngMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("RNGFactory")(args.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.random.distCjsRngMod.default]
  
  @JSImport("random", "Random")
  @js.native
  open class Random ()
    extends typingsJapgolly.random.distCjsRandomMod.Random {
    def this(rng: typingsJapgolly.random.distCjsRngMod.default) = this()
  }
}
