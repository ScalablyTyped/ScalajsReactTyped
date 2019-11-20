package typingsJapgolly.expo

import typingsJapgolly.expo.buildUpdatesUpdatesMod.Manifest
import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateCheckResult
import typingsJapgolly.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsAvailable extends UpdateCheckResult {
  var isAvailable: `true`
  var manifest: Manifest
}

object Anon_IsAvailable {
  @scala.inline
  def apply(isAvailable: `true`, manifest: Manifest): Anon_IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsAvailable]
  }
}

