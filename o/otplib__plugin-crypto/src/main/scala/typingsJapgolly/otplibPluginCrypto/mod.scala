package typingsJapgolly.otplibPluginCrypto

import typingsJapgolly.otplibCore.authenticatorMod.CreateRandomBytes
import typingsJapgolly.otplibCore.utilsMod.CreateDigest
import typingsJapgolly.otplibCore.utilsMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@otplib/plugin-crypto", "createDigest")
  @js.native
  val createDigest: CreateDigest[HexString] = js.native
  
  @JSImport("@otplib/plugin-crypto", "createRandomBytes")
  @js.native
  val createRandomBytes: CreateRandomBytes[String] = js.native
}
