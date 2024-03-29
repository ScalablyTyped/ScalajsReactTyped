package typingsJapgolly.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  O extends {  xmlns :true} ? saxes.saxes.SaxesStartTagNS : O extends {  xmlns :false | undefined} ? saxes.saxes.SaxesStartTagPlain : saxes.saxes.SaxesStartTag
  }}}
  */
@js.native
trait StartTagForOptions[O /* <: SaxesOptions */] extends StObject
