package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/**
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.ContentType")
@js.native
object ContentType extends js.Object {
  /**
    *
    * Comment content containing mentions.
    *
    */
  @js.native
  sealed trait mention extends ContentType
  
  /**
    *
    * Indicates plain format type of the comment content.
    *
    */
  @js.native
  sealed trait plain extends ContentType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  /* "Mention" */ @js.native
  object mention extends TopLevel[mention with String]
  
  /* "Plain" */ @js.native
  object plain extends TopLevel[plain with String]
  
}

