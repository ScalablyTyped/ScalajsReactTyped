package typingsJapgolly.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.SPClientTemplates.FieldSchema
import typingsJapgolly.sharepoint.SPClientTemplates.ListSchema
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import typingsJapgolly.sharepoint.SPMgr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPMgr")
@js.native
open class SPMgr_ ()
  extends StObject
     with SPMgr {
  
  /* CompleteClass */
  override def NewGroup(listItem: StringDictionary[Any], fieldName: String): Boolean = js.native
  
  /* CompleteClass */
  override def RenderField(
    renderCtx: RenderContext,
    field: FieldSchema,
    listItem: StringDictionary[Any],
    listSchema: ListSchema
  ): String = js.native
  
  /* CompleteClass */
  override def RenderFieldByName(
    renderCtx: RenderContext,
    fieldName: String,
    listItem: StringDictionary[Any],
    listSchema: ListSchema
  ): String = js.native
  
  /* CompleteClass */
  override def RenderHeader(renderCtx: RenderContext, field: FieldSchema): String = js.native
}
