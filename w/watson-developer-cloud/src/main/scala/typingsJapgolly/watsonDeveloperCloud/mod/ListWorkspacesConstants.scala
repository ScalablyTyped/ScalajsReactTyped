package typingsJapgolly.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listWorkspaces` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListWorkspacesConstants")
@js.native
object ListWorkspacesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait NAME extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    /* "name" */ @js.native
    object NAME extends TopLevel[NAME with String]
    
    /* "updated" */ @js.native
    object UPDATED extends TopLevel[UPDATED with String]
    
  }
  
}

