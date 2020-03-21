package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.angularCompilerStrings.desc
import typingsJapgolly.angularCompiler.angularCompilerStrings.id
import typingsJapgolly.angularCompiler.angularCompilerStrings.meaning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.angularCompilerStrings.desc
  - typingsJapgolly.angularCompiler.angularCompilerStrings.id
  - typingsJapgolly.angularCompiler.angularCompilerStrings.meaning
*/
trait JSDocTagName extends js.Object

object JSDocTagName {
  @scala.inline
  def Desc: desc = this.cast("desc")
  @scala.inline
  def Id: id = this.cast("id")
  @scala.inline
  def Meaning: meaning = this.cast("meaning")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

