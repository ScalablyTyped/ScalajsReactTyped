package typingsJapgolly.otplibPluginThirtyTwo

import typingsJapgolly.otplibCore.authenticatorMod.Base32SecretKey
import typingsJapgolly.otplibCore.authenticatorMod.KeyDecoder
import typingsJapgolly.otplibCore.authenticatorMod.KeyEncoder
import typingsJapgolly.otplibCore.utilsMod.SecretKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@otplib/plugin-thirty-two", "keyDecoder")
  @js.native
  val keyDecoder: KeyDecoder[SecretKey] = js.native
  
  @JSImport("@otplib/plugin-thirty-two", "keyEncoder")
  @js.native
  val keyEncoder: KeyEncoder[Base32SecretKey] = js.native
}
