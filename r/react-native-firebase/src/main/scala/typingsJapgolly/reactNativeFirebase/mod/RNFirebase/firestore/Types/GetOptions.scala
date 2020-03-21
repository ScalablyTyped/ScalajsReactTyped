package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.cache
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.default
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  var source: default | server | cache
}

object GetOptions {
  @scala.inline
  def apply(source: default | server | cache): GetOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOptions]
  }
}

