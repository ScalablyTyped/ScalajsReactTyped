package typingsJapgolly.rfc6902

import typingsJapgolly.rfc6902.diffMod.AddOperation
import typingsJapgolly.rfc6902.diffMod.CopyOperation
import typingsJapgolly.rfc6902.diffMod.MoveOperation
import typingsJapgolly.rfc6902.diffMod.Operation
import typingsJapgolly.rfc6902.diffMod.RemoveOperation
import typingsJapgolly.rfc6902.diffMod.ReplaceOperation
import typingsJapgolly.rfc6902.diffMod.TestOperation
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/patch", JSImport.Namespace)
@js.native
object patchMod extends js.Object {
  @js.native
  class InvalidOperationError protected () extends Error {
    def this(operation: Operation) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var operation: Operation = js.native
  }
  
  @js.native
  class MissingError protected () extends Error {
    def this(path: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var path: String = js.native
  }
  
  @js.native
  class TestError protected () extends Error {
    def this(actual: js.Any, expected: js.Any) = this()
    var actual: js.Any = js.native
    var expected: js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def add(`object`: js.Any, operation: AddOperation): MissingError | Null = js.native
  @JSName("apply")
  def apply(`object`: js.Any, operation: Operation): MissingError | InvalidOperationError | TestError | Null = js.native
  def copy(`object`: js.Any, operation: CopyOperation): MissingError | Null = js.native
  def move(`object`: js.Any, operation: MoveOperation): MissingError | Null = js.native
  def remove(`object`: js.Any, operation: RemoveOperation): MissingError | Null = js.native
  def replace(`object`: js.Any, operation: ReplaceOperation): MissingError | Null = js.native
  def test(`object`: js.Any, operation: TestOperation): TestError | Null = js.native
}

