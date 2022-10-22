package typingsJapgolly.readFileSafe

import typingsJapgolly.readFileSafe.readFileSafeBooleans.`false`
import typingsJapgolly.readFileSafe.readFileSafeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("read-file-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile[T /* <: Args */](
    path: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasOptions because its type T is not an array type */ hasOptions: T
  ): js.Promise[ReturnValue[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], hasOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue[T]]]
  
  inline def readFileSync[T /* <: Args */](
    path: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasOptions because its type T is not an array type */ hasOptions: T
  ): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], hasOptions.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  
  type Args = StringArgs | BufferArgs
  
  type BufferArgs = js.Array[/* options */ Options[`true`]]
  
  trait Options[T /* <: Boolean */] extends StObject {
    
    /**
      * Return content as a Buffer. Default: `false`
      */
    var buffer: js.UndefOr[T] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: Boolean */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T /* <: Boolean */](x: Self & Options[T]) {
      
      inline def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends read-file-safe.read-file-safe/build.StringArgs ? string : node.buffer.<global>.Buffer
    }}}
    */
  @js.native
  trait ReturnContent[T] extends StObject
  
  type ReturnValue[T] = js.UndefOr[ReturnContent[T]]
  
  type StringArgs = js.Array[/* options */ js.UndefOr[Options[`false`]]]
}
