package typingsJapgolly.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends rax.rax.NamedExoticComponent<rax.rax.ComponentPropsWithoutRef<T> & rax.rax.RefAttributes<infer Method>> ? Method : rax.rax.ComponentPropsWithRef<T> extends rax.rax.RefAttributes<infer Method> ? Method : never
  }}}
  */
@js.native
trait ComponentRef[T /* <: ElementType[Any] */] extends StObject
