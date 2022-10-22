package typingsJapgolly.secureRandom

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.secureRandom.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Buffer'}).
    * @param byteCount is the number of bytes to return.
    * @param options options to pass.
    *                Only valid value at this time type.
    *                type can be either Array, Uint8Array, or Buffer.
    *                Buffer is only valid in Node.js or Browserify environments - it will throw an error otherwise.
    */
  inline def apply[T /* <: TypeName */](byteCount: Double, options: Type[T]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].apply(byteCount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  @JSImport("secure-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Array'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomArray(byteCount: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomArray")(byteCount.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Buffer'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomBuffer(byteCount: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBuffer")(byteCount.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * Sugar for secureRandom(byteCount, {type: 'Uint8Array'}).
    * @param byteCount is the number of bytes to return.
    */
  inline def randomUint8Array(byteCount: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUint8Array")(byteCount.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 'Array' ? std.Array<number> : T extends 'Buffer' ? node.buffer.<global>.Buffer : T extends 'Uint8Array' ? std.Uint8Array : never
    }}}
    */
  @js.native
  trait ObjectType[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.secureRandom.secureRandomStrings.Array
    - typingsJapgolly.secureRandom.secureRandomStrings.Buffer
    - typingsJapgolly.secureRandom.secureRandomStrings.Uint8Array
  */
  trait TypeName extends StObject
  object TypeName {
    
    inline def Array: typingsJapgolly.secureRandom.secureRandomStrings.Array = "Array".asInstanceOf[typingsJapgolly.secureRandom.secureRandomStrings.Array]
    
    inline def Buffer: typingsJapgolly.secureRandom.secureRandomStrings.Buffer = "Buffer".asInstanceOf[typingsJapgolly.secureRandom.secureRandomStrings.Buffer]
    
    inline def Uint8Array: typingsJapgolly.secureRandom.secureRandomStrings.Uint8Array = "Uint8Array".asInstanceOf[typingsJapgolly.secureRandom.secureRandomStrings.Uint8Array]
  }
}
