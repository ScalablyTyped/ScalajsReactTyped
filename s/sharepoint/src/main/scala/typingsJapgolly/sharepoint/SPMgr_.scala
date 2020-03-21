package typingsJapgolly.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SPClientTemplates.FieldSchema
import typingsJapgolly.sharepoint.SPClientTemplates.ListSchema
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPMgr")
@js.native
class SPMgr_ () extends js.Object {
  def NewGroup(listItem: StringDictionary[js.Any], fieldName: String): Boolean = js.native
  def RenderField(
    renderCtx: RenderContext,
    field: FieldSchema,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  def RenderFieldByName(
    renderCtx: RenderContext,
    fieldName: String,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  def RenderHeader(renderCtx: RenderContext, field: FieldSchema): String = js.native
}

