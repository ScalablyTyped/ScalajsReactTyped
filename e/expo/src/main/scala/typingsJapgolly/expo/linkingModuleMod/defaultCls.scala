package typingsJapgolly.expo.linkingModuleMod

import typingsJapgolly.reactNative.mod.EventEmitter
import typingsJapgolly.reactNative.mod.EventSubscriptionVendor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Linking/LinkingModule", JSImport.Default)
@js.native
/**
  *
  * @param subscriber - Optional subscriber instance
  *   to use. If omitted, a new subscriber will be created for the emitter.
  */
class defaultCls () extends EventEmitter {
  def this(subscriber: EventSubscriptionVendor) = this()
}

