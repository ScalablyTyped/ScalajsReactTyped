package typingsJapgolly.codeflask

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.prismjs.mod.Languages_
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("codeflask", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CodeFlask {
    def this(selectorOrElement: String, opts: options) = this()
    def this(selectorOrElement: HTMLElement, opts: options) = this()
    
    /* CompleteClass */
    override def addLanguage(name: String, options: Languages_): Unit = js.native
    
    /* CompleteClass */
    override def getCode(): String = js.native
    
    /* CompleteClass */
    override def onUpdate(callback: js.Function1[/* code */ String, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def updateCode(newCode: String): Unit = js.native
  }
  
  trait CodeFlask extends StObject {
    
    def addLanguage(name: String, options: Languages_): Unit
    
    def getCode(): String
    
    def onUpdate(callback: js.Function1[/* code */ String, Unit]): Unit
    
    def updateCode(newCode: String): Unit
  }
  object CodeFlask {
    
    inline def apply(
      addLanguage: (String, Languages_) => Callback,
      getCode: CallbackTo[String],
      onUpdate: js.Function1[/* code */ String, Unit] => Callback,
      updateCode: String => Callback
    ): CodeFlask = {
      val __obj = js.Dynamic.literal(addLanguage = js.Any.fromFunction2((t0: String, t1: Languages_) => (addLanguage(t0, t1)).runNow()), getCode = getCode.toJsFn, onUpdate = js.Any.fromFunction1((t0: js.Function1[/* code */ String, Unit]) => onUpdate(t0).runNow()), updateCode = js.Any.fromFunction1((t0: String) => updateCode(t0).runNow()))
      __obj.asInstanceOf[CodeFlask]
    }
    
    extension [Self <: CodeFlask](x: Self) {
      
      inline def setAddLanguage(value: (String, Languages_) => Callback): Self = StObject.set(x, "addLanguage", js.Any.fromFunction2((t0: String, t1: Languages_) => (value(t0, t1)).runNow()))
      
      inline def setGetCode(value: CallbackTo[String]): Self = StObject.set(x, "getCode", value.toJsFn)
      
      inline def setOnUpdate(value: js.Function1[/* code */ String, Unit] => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: js.Function1[/* code */ String, Unit]) => value(t0).runNow()))
      
      inline def setUpdateCode(value: String => Callback): Self = StObject.set(x, "updateCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait options extends StObject {
    
    var areaId: js.UndefOr[String] = js.undefined
    
    var ariaLabelledby: js.UndefOr[String] = js.undefined
    
    var defaultTheme: js.UndefOr[Boolean] = js.undefined
    
    var enableAutocorrect: js.UndefOr[Boolean] = js.undefined
    
    var handleNewLineIndentation: js.UndefOr[Boolean] = js.undefined
    
    var handleSelfClosingCharacters: js.UndefOr[Boolean] = js.undefined
    
    var handleTabs: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var styleParent: js.UndefOr[ShadowRoot] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setAreaId(value: String): Self = StObject.set(x, "areaId", value.asInstanceOf[js.Any])
      
      inline def setAreaIdUndefined: Self = StObject.set(x, "areaId", js.undefined)
      
      inline def setAriaLabelledby(value: String): Self = StObject.set(x, "ariaLabelledby", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledbyUndefined: Self = StObject.set(x, "ariaLabelledby", js.undefined)
      
      inline def setDefaultTheme(value: Boolean): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
      
      inline def setEnableAutocorrect(value: Boolean): Self = StObject.set(x, "enableAutocorrect", value.asInstanceOf[js.Any])
      
      inline def setEnableAutocorrectUndefined: Self = StObject.set(x, "enableAutocorrect", js.undefined)
      
      inline def setHandleNewLineIndentation(value: Boolean): Self = StObject.set(x, "handleNewLineIndentation", value.asInstanceOf[js.Any])
      
      inline def setHandleNewLineIndentationUndefined: Self = StObject.set(x, "handleNewLineIndentation", js.undefined)
      
      inline def setHandleSelfClosingCharacters(value: Boolean): Self = StObject.set(x, "handleSelfClosingCharacters", value.asInstanceOf[js.Any])
      
      inline def setHandleSelfClosingCharactersUndefined: Self = StObject.set(x, "handleSelfClosingCharacters", js.undefined)
      
      inline def setHandleTabs(value: Boolean): Self = StObject.set(x, "handleTabs", value.asInstanceOf[js.Any])
      
      inline def setHandleTabsUndefined: Self = StObject.set(x, "handleTabs", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setStyleParent(value: ShadowRoot): Self = StObject.set(x, "styleParent", value.asInstanceOf[js.Any])
      
      inline def setStyleParentUndefined: Self = StObject.set(x, "styleParent", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    }
  }
}
