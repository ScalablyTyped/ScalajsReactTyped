package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorExperimentalOptions extends StObject {
  
  /**
    * Configuration options for editor sticky scroll
    */
  var stickyScroll: js.UndefOr[Enabled] = js.undefined
}
object IEditorExperimentalOptions {
  
  inline def apply(): IEditorExperimentalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorExperimentalOptions]
  }
  
  extension [Self <: IEditorExperimentalOptions](x: Self) {
    
    inline def setStickyScroll(value: Enabled): Self = StObject.set(x, "stickyScroll", value.asInstanceOf[js.Any])
    
    inline def setStickyScrollUndefined: Self = StObject.set(x, "stickyScroll", js.undefined)
  }
}
