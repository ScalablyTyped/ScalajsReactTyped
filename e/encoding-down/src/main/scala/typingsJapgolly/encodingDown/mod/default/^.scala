package typingsJapgolly.encodingDown.mod.default

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.encodingDown.mod.EncodingDown
import typingsJapgolly.encodingDown.mod.EncodingDown.Constructor
import typingsJapgolly.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-down", JSImport.Default)
@js.native
class ^[K, V] protected () extends EncodingDown[K, V] {
  // tslint:disable-next-line:no-unnecessary-generics
  def this(db: AbstractLevelDOWN[_, _]) = this()
  def this(db: AbstractLevelDOWN[_, _], options: CodecOptions) = this()
}

@JSImport("encoding-down", JSImport.Default)
@js.native
object ^ extends TopLevel[Constructor]

