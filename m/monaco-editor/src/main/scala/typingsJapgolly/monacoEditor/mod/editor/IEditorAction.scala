package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorAction extends StObject {
  
  val alias: String
  
  val id: String
  
  def isSupported(): Boolean
  
  val label: String
  
  def run(): js.Promise[Unit]
}
object IEditorAction {
  
  inline def apply(
    alias: String,
    id: String,
    isSupported: CallbackTo[Boolean],
    label: String,
    run: CallbackTo[js.Promise[Unit]]
  ): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSupported = isSupported.toJsFn, label = label.asInstanceOf[js.Any], run = run.toJsFn)
    __obj.asInstanceOf[IEditorAction]
  }
  
  extension [Self <: IEditorAction](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSupported", value.toJsFn)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRun(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "run", value.toJsFn)
  }
}
