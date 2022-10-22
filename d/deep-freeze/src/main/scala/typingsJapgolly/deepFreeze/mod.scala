package typingsJapgolly.deepFreeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](a: js.Array[T]): js.Array[DeepReadonly[T]] = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[DeepReadonly[T]]]
  inline def apply[T](o: T): DeepReadonly[T] = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[DeepReadonly[T]]
  
  @JSImport("deep-freeze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : any): any ? T : {readonly [ P in keyof T ]: deep-freeze.deep-freeze.DeepReadonly<T[P]>}
    }}}
    */
  @js.native
  trait DeepReadonly[T] extends StObject
}
