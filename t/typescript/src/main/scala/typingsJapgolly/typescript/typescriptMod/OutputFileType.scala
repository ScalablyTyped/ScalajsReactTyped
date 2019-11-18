package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputFileType extends js.Object

@JSImport("typescript", "OutputFileType")
@js.native
object OutputFileType extends js.Object {
  @js.native
  sealed trait Declaration extends OutputFileType
  
  @js.native
  sealed trait JavaScript extends OutputFileType
  
  @js.native
  sealed trait SourceMap extends OutputFileType
  
  /* 2 */ val Declaration: typingsJapgolly.typescript.typescriptMod.OutputFileType.Declaration with Double = js.native
  /* 0 */ val JavaScript: typingsJapgolly.typescript.typescriptMod.OutputFileType.JavaScript with Double = js.native
  /* 1 */ val SourceMap: typingsJapgolly.typescript.typescriptMod.OutputFileType.SourceMap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType with Double] = js.native
}

