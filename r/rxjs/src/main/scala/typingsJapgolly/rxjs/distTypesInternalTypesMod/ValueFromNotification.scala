package typingsJapgolly.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {  kind :'N' | 'E' | 'C'} ? T extends rxjs.rxjs/dist/types/internal/types.NextNotification<any> ? T extends {  value :infer V} ? V : undefined : never : never
  }}}
  */
@js.native
trait ValueFromNotification[T] extends StObject
