package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  std.Array<Type> extends T ? Value : T extends keyof Map ? Map[T] : {[ P in keyof T ]: T[P] extends Type? frida-gum.GetValue<Map, Value, Type, T[P]> : never}
  }}}
  */
@js.native
trait GetValue[Map, Value, Type, T /* <: Type */] extends StObject
