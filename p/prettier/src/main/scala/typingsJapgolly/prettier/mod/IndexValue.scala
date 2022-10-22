package typingsJapgolly.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Effectively performing T[P], except that it's telling TypeScript that it's
// safe to do this for tuples, arrays, or objects.
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Array<any> ? P extends number ? T[P] : never : P extends keyof T ? T[P] : never
  }}}
  */
@js.native
trait IndexValue[T, P] extends StObject
