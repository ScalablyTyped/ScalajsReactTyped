package typingsJapgolly.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TEvent extends 'xfbl.render' ? (): void : (response : facebook-js-sdk.facebook.StatusResponse): void
  }}}
  */
@js.native
trait FacebookEventCallback[TEvent /* <: FacebookEventType */] extends StObject
