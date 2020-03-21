package typingsJapgolly.stellarSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stellarSdk.stellarTomlResolverMod.StellarTomlResolver.StellarTomlResolveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "StellarTomlResolver")
@js.native
class StellarTomlResolver ()
  extends typingsJapgolly.stellarSdk.stellarTomlResolverMod.StellarTomlResolver

/* static members */
@JSImport("stellar-sdk", "StellarTomlResolver")
@js.native
object StellarTomlResolver extends js.Object {
  def resolve(domain: String): js.Promise[StringDictionary[_]] = js.native
  def resolve(domain: String, opts: StellarTomlResolveOptions): js.Promise[StringDictionary[_]] = js.native
}

