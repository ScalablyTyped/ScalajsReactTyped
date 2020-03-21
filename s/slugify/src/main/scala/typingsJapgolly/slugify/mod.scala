package typingsJapgolly.slugify

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.slugify.mod.slugify.ExtendArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slugify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(string: String): String = js.native
    def apply(string: String, options: String): String = js.native
    def apply(string: String, options: AnonLower): String = js.native
    def extend(args: ExtendArgs): Unit = js.native
  }
  
  @js.native
  object slugify extends js.Object {
    type ExtendArgs = StringDictionary[js.Any]
  }
  
}

