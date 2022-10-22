package typingsJapgolly.draftJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "ContentState")
@js.native
open class ContentState ()
  extends StObject
     with typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState
object ContentState {
  
  @JSImport("draft-js", "ContentState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createFromBlockArray(blocks: js.Array[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  inline def createFromBlockArray(
    blocks: js.Array[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock],
    entityMap: Any
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any], entityMap.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  
  /* static member */
  inline def createFromText(text: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  inline def createFromText(text: String, delimiter: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState]
}
