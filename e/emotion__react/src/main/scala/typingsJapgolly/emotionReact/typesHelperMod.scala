package typingsJapgolly.emotionReact

import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelperMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, U>> : never
    }}}
    */
  @js.native
  trait DistributiveOmit[T, U] extends StObject
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.emotionReact.emotionReactStrings.a_, typingsJapgolly.emotionReact.emotionReactStrings.abbr, typingsJapgolly.emotionReact.emotionReactStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentProps[C]]
}
