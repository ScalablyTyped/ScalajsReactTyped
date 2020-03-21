package typingsJapgolly.emberFeatureFlags

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emberObject.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-feature-flags", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Features extends default {
    def disable(feature: String): Unit = js.native
    def enable(feature: String): Unit = js.native
    def isEnabled(feature: String): Boolean = js.native
    def setup(features: StringDictionary[Boolean]): Unit = js.native
  }
  
}

