package typingsJapgolly.difflib

import typingsJapgolly.difflib.difflibStrings.delete
import typingsJapgolly.difflib.difflibStrings.equal
import typingsJapgolly.difflib.difflibStrings.insert
import typingsJapgolly.difflib.difflibStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("difflib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SequenceMatcher[T] protected () extends js.Object {
    def this(isjunk: js.Function0[Boolean], left: T, right: T) = this()
    def this(isjunk: Null, left: T, right: T) = this()
    def this(isjunk: js.Function0[Boolean], left: T, right: T, autojunk: Boolean) = this()
    def this(isjunk: Null, left: T, right: T, autojunk: Boolean) = this()
    def getOpcodes(): js.Array[js.Tuple5[replace | delete | insert | equal, Double, Double, Double, Double]] = js.native
  }
  
}

