package typingsJapgolly.officeJs.Word

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelType extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListLevelType")
@js.native
object ListLevelType extends js.Object {
  @js.native
  sealed trait bullet extends ListLevelType
  
  @js.native
  sealed trait number extends ListLevelType
  
  @js.native
  sealed trait picture extends ListLevelType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListLevelType with String] = js.native
  /* "Bullet" */ @js.native
  object bullet extends TopLevel[bullet with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "Picture" */ @js.native
  object picture extends TopLevel[picture with String]
  
}

