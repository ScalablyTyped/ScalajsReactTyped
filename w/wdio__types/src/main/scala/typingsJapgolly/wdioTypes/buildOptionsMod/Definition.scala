package typingsJapgolly.wdioTypes.buildOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ k in keyof T ]: {  type :'string' | 'number' | 'object' | 'boolean' | 'function',   default :T[k] | undefined,   required :boolean | undefined,   validate :(option : T[k]): void | undefined,   match :std.RegExp | undefined}}
  }}}
  */
@js.native
trait Definition[T] extends StObject
