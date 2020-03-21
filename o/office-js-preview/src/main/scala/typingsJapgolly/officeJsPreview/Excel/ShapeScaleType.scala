package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeScaleType extends js.Object

/**
  *
  * Specifies whether the shape is scaled relative to its original or current size.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleType")
@js.native
object ShapeScaleType extends js.Object {
  @js.native
  sealed trait currentSize extends ShapeScaleType
  
  @js.native
  sealed trait originalSize extends ShapeScaleType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeScaleType with String] = js.native
  /* "CurrentSize" */ @js.native
  object currentSize extends TopLevel[currentSize with String]
  
  /* "OriginalSize" */ @js.native
  object originalSize extends TopLevel[originalSize with String]
  
}

