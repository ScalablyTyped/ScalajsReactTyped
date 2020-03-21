package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType with Double] = js.native
  /* 2 */ @js.native
  object Declaration
    extends TopLevel[typingsJapgolly.typescript.mod.OutputFileType.Declaration with Double]
  
  /* 0 */ @js.native
  object JavaScript extends TopLevel[JavaScript with Double]
  
  /* 1 */ @js.native
  object SourceMap extends TopLevel[SourceMap with Double]
  
}

