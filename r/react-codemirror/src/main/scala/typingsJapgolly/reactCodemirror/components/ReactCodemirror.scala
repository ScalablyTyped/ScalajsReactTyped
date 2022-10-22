package typingsJapgolly.reactCodemirror.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import typingsJapgolly.reactCodemirror.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCodemirror {
  
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: Boolean): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def codeMirrorInstance(
      value: (/* host */ Any, /* options */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
        ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ Any
    ): this.type = set("codeMirrorInstance", js.Any.fromFunction2(value))
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* newValue */ String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorChange */ /* change */ Any) => Any
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    inline def onCursorActivity(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.Editor */ /* codemirror */ Any => Any
    ): this.type = set("onCursorActivity", js.Any.fromFunction1(value))
    
    inline def onFocusChange(value: /* focused */ Boolean => Any): this.type = set("onFocusChange", js.Any.fromFunction1(value))
    
    inline def onScroll(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.ScrollInfo */ /* scrollInfo */ Any => Any
    ): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    inline def options(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodeMirror.EditorConfiguration */ Any
    ): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def preserveScrollPosition(value: Boolean): this.type = set("preserveScrollPosition", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCodemirror.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactCodeMirrorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
