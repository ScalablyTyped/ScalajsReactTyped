package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for EditorFileScopeActionResponse objects.
  */
trait EditorFileScopeActionResponseBuilder extends StObject {
  
  /**
    * Builds the current Editor action response.
    */
  def build(): EditorFileScopeActionResponse
  
  /**
    * Requests the drive.file scope for the current active Editor document.
    */
  def requestFileScopeForActiveDocument(): EditorFileScopeActionResponseBuilder
}
object EditorFileScopeActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[EditorFileScopeActionResponse],
    requestFileScopeForActiveDocument: CallbackTo[EditorFileScopeActionResponseBuilder]
  ): EditorFileScopeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, requestFileScopeForActiveDocument = requestFileScopeForActiveDocument.toJsFn)
    __obj.asInstanceOf[EditorFileScopeActionResponseBuilder]
  }
  
  extension [Self <: EditorFileScopeActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[EditorFileScopeActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setRequestFileScopeForActiveDocument(value: CallbackTo[EditorFileScopeActionResponseBuilder]): Self = StObject.set(x, "requestFileScopeForActiveDocument", value.toJsFn)
  }
}
