package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerEditingField extends StObject {
  
  var editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  
  def editorName(): String
  
  def groupID(): String
  
  def id(): String
  
  def pageIndex(): Double
  
  var readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object ASPxClientWebDocumentViewerEditingField {
  
  inline def apply(
    editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    editorName: CallbackTo[String],
    groupID: CallbackTo[String],
    id: CallbackTo[String],
    pageIndex: CallbackTo[Double],
    readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): ASPxClientWebDocumentViewerEditingField = {
    val __obj = js.Dynamic.literal(editValue = editValue.asInstanceOf[js.Any], editorName = editorName.toJsFn, groupID = groupID.toJsFn, id = id.toJsFn, pageIndex = pageIndex.toJsFn, readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingField]
  }
  
  extension [Self <: ASPxClientWebDocumentViewerEditingField](x: Self) {
    
    inline def setEditValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "editValue", value.asInstanceOf[js.Any])
    
    inline def setEditorName(value: CallbackTo[String]): Self = StObject.set(x, "editorName", value.toJsFn)
    
    inline def setGroupID(value: CallbackTo[String]): Self = StObject.set(x, "groupID", value.toJsFn)
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setPageIndex(value: CallbackTo[Double]): Self = StObject.set(x, "pageIndex", value.toJsFn)
    
    inline def setReadOnly(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
