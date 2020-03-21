package typingsJapgolly.fluentBundle

import typingsJapgolly.fluentBundle.mod.FluentBundleConstructorOptions
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/bundle/compat", JSImport.Namespace)
@js.native
object compatMod extends js.Object {
  @js.native
  class FluentBundle protected ()
    extends typingsJapgolly.fluentBundle.mod.FluentBundle {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleConstructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
  }
  
  @js.native
  class FluentDateTime protected ()
    extends typingsJapgolly.fluentBundle.mod.FluentDateTime {
    /** Options passed to Intl.DateFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class FluentNumber protected ()
    extends typingsJapgolly.fluentBundle.mod.FluentNumber {
    /** Options passed to Intl.NumberFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentResource protected ()
    extends typingsJapgolly.fluentBundle.mod.FluentResource {
    def this(source: String) = this()
  }
  
  @js.native
  class FluentType protected ()
    extends typingsJapgolly.fluentBundle.mod.FluentType {
    def this(value: js.Any) = this()
  }
  
}

