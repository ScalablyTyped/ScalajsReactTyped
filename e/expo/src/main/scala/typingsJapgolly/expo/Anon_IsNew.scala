package typingsJapgolly.expo

import typingsJapgolly.expo.buildUpdatesUpdatesMod.Manifest
import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateFetchResult
import typingsJapgolly.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsNew extends UpdateFetchResult {
  var isNew: `true`
  var manifest: Manifest
}

object Anon_IsNew {
  @scala.inline
  def apply(isNew: `true`, manifest: Manifest): Anon_IsNew = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsNew]
  }
}

