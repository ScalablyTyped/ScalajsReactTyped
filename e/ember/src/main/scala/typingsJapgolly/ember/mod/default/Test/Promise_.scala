package typingsJapgolly.ember.mod.default.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Test.Promise")
@js.native
class Promise_[T] protected ()
  extends typingsJapgolly.ember.mod.Ember.Test.Promise_[T] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

