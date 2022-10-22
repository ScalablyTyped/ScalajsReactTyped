package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.sharepoint.SPClientTemplates.FieldSchema
import typingsJapgolly.sharepoint.SPClientTemplates.ListSchema
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ScriptHelpers")
@js.native
open class ScriptHelpers ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ScriptHelpers
object ScriptHelpers {
  
  @JSGlobal("SP.ScriptHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def disableWebpartSelection(context: RenderContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWebpartSelection")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def getDocumentQueryPairs(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentQueryPairs")().asInstanceOf[StringDictionary[String]]
  
  /* static member */
  inline def getFieldFromSchema(schema: ListSchema, fieldName: String): FieldSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromSchema")(schema.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[FieldSchema]
  
  /* static member */
  inline def getLayoutsPageUrl(pageName: String, webServerRelativeUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutsPageUrl")(pageName.asInstanceOf[js.Any], webServerRelativeUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getListLevelPermissionMask(jsonItem: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getListLevelPermissionMask")(jsonItem.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def getTextAreaElementValue(textAreaElement: HTMLTextAreaElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextAreaElementValue")(textAreaElement.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def getUrlQueryPairs(docUrl: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlQueryPairs")(docUrl.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  /* static member */
  inline def getUserFieldProperty(item: typingsJapgolly.sharepoint.SP.ListItem[Any], fieldName: String, propertyName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserFieldProperty")(item.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def hasPermission(listPermissionMask: Double, listPermission: typingsJapgolly.sharepoint.SP.ListLevelPermissionMask): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPermission")(listPermissionMask.asInstanceOf[js.Any], listPermission.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def isNullOrEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isNullOrUndefined(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isNullOrUndefinedOrEmpty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefinedOrEmpty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isUndefined(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def newGuid(): typingsJapgolly.sharepoint.SP.Guid = ^.asInstanceOf[js.Dynamic].applyDynamic("newGuid")().asInstanceOf[typingsJapgolly.sharepoint.SP.Guid]
  
  /* static member */
  inline def removeHtml(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHtml")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def removeHtmlAndTrimStringWithEllipsis(str: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHtmlAndTrimStringWithEllipsis")(str.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def removeStyleChildren(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleChildren")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def replaceOrAddQueryString(url: String, key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrAddQueryString")(url.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def resizeImageToSquareLength(imgElement: HTMLImageElement, squareLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeImageToSquareLength")(imgElement.asInstanceOf[js.Any], squareLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def setTextAreaElementValue(textAreaElement: HTMLTextAreaElement, newValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextAreaElementValue")(textAreaElement.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def truncateToInt(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateToInt")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def urlCombine(path1: String, path2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlCombine")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[String]
}
