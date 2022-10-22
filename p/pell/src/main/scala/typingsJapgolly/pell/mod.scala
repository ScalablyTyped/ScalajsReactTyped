package typingsJapgolly.pell

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(command: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exec(command: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init[T /* <: HTMLElement */](c: pellConfig[T]): T & PellElement = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(c.asInstanceOf[js.Any]).asInstanceOf[T & PellElement]
  
  trait PellElement extends StObject {
    
    var content: HTMLDivElement
  }
  object PellElement {
    
    inline def apply(content: HTMLDivElement): PellElement = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PellElement]
    }
    
    extension [Self <: PellElement](x: Self) {
      
      inline def setContent(value: HTMLDivElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pell.mod.pellBuiltinAction
    - typingsJapgolly.pell.mod.pellActionConfig
    - typingsJapgolly.pell.mod.pellCustomActionConfig
  */
  trait pellAction extends StObject
  
  trait pellActionConfig
    extends StObject
       with pellAction {
    
    var icon: js.UndefOr[String] = js.undefined
    
    var name: pellAction
    
    def result(): Unit
    
    var title: js.UndefOr[String] = js.undefined
  }
  object pellActionConfig {
    
    inline def apply(name: pellAction, result: Callback): pellActionConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = result.toJsFn)
      __obj.asInstanceOf[pellActionConfig]
    }
    
    extension [Self <: pellActionConfig](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setName(value: pellAction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Callback): Self = StObject.set(x, "result", value.toJsFn)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pell.pellStrings.bold
    - typingsJapgolly.pell.pellStrings.italic
    - typingsJapgolly.pell.pellStrings.underline
    - typingsJapgolly.pell.pellStrings.strikethrough
    - typingsJapgolly.pell.pellStrings.heading1
    - typingsJapgolly.pell.pellStrings.heading2
    - typingsJapgolly.pell.pellStrings.paragraph
    - typingsJapgolly.pell.pellStrings.quote
    - typingsJapgolly.pell.pellStrings.olist
    - typingsJapgolly.pell.pellStrings.ulist
    - typingsJapgolly.pell.pellStrings.code
    - typingsJapgolly.pell.pellStrings.line
    - typingsJapgolly.pell.pellStrings.link
    - typingsJapgolly.pell.pellStrings.image
  */
  trait pellBuiltinAction
    extends StObject
       with pellAction
  object pellBuiltinAction {
    
    inline def bold: typingsJapgolly.pell.pellStrings.bold = "bold".asInstanceOf[typingsJapgolly.pell.pellStrings.bold]
    
    inline def code: typingsJapgolly.pell.pellStrings.code = "code".asInstanceOf[typingsJapgolly.pell.pellStrings.code]
    
    inline def heading1: typingsJapgolly.pell.pellStrings.heading1 = "heading1".asInstanceOf[typingsJapgolly.pell.pellStrings.heading1]
    
    inline def heading2: typingsJapgolly.pell.pellStrings.heading2 = "heading2".asInstanceOf[typingsJapgolly.pell.pellStrings.heading2]
    
    inline def image: typingsJapgolly.pell.pellStrings.image = "image".asInstanceOf[typingsJapgolly.pell.pellStrings.image]
    
    inline def italic: typingsJapgolly.pell.pellStrings.italic = "italic".asInstanceOf[typingsJapgolly.pell.pellStrings.italic]
    
    inline def line: typingsJapgolly.pell.pellStrings.line = "line".asInstanceOf[typingsJapgolly.pell.pellStrings.line]
    
    inline def link: typingsJapgolly.pell.pellStrings.link = "link".asInstanceOf[typingsJapgolly.pell.pellStrings.link]
    
    inline def olist: typingsJapgolly.pell.pellStrings.olist = "olist".asInstanceOf[typingsJapgolly.pell.pellStrings.olist]
    
    inline def paragraph: typingsJapgolly.pell.pellStrings.paragraph = "paragraph".asInstanceOf[typingsJapgolly.pell.pellStrings.paragraph]
    
    inline def quote: typingsJapgolly.pell.pellStrings.quote = "quote".asInstanceOf[typingsJapgolly.pell.pellStrings.quote]
    
    inline def strikethrough: typingsJapgolly.pell.pellStrings.strikethrough = "strikethrough".asInstanceOf[typingsJapgolly.pell.pellStrings.strikethrough]
    
    inline def ulist: typingsJapgolly.pell.pellStrings.ulist = "ulist".asInstanceOf[typingsJapgolly.pell.pellStrings.ulist]
    
    inline def underline: typingsJapgolly.pell.pellStrings.underline = "underline".asInstanceOf[typingsJapgolly.pell.pellStrings.underline]
  }
  
  trait pellClasses extends StObject {
    
    var actionbar: js.UndefOr[String] = js.undefined
    
    var button: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
  }
  object pellClasses {
    
    inline def apply(): pellClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pellClasses]
    }
    
    extension [Self <: pellClasses](x: Self) {
      
      inline def setActionbar(value: String): Self = StObject.set(x, "actionbar", value.asInstanceOf[js.Any])
      
      inline def setActionbarUndefined: Self = StObject.set(x, "actionbar", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait pellConfig[T /* <: HTMLElement */] extends StObject {
    
    var actions: js.Array[pellAction]
    
    var classes: js.UndefOr[pellClasses] = js.undefined
    
    var defaultParagraphSeparator: js.UndefOr[String] = js.undefined
    
    var element: T
    
    def onChange(html: String): Unit
    
    var styleWithCSS: js.UndefOr[Boolean] = js.undefined
  }
  object pellConfig {
    
    inline def apply[T /* <: HTMLElement */](actions: js.Array[pellAction], element: T, onChange: String => Callback): pellConfig[T] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
      __obj.asInstanceOf[pellConfig[T]]
    }
    
    extension [Self <: pellConfig[?], T /* <: HTMLElement */](x: Self & pellConfig[T]) {
      
      inline def setActions(value: js.Array[pellAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: pellAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setClasses(value: pellClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDefaultParagraphSeparator(value: String): Self = StObject.set(x, "defaultParagraphSeparator", value.asInstanceOf[js.Any])
      
      inline def setDefaultParagraphSeparatorUndefined: Self = StObject.set(x, "defaultParagraphSeparator", js.undefined)
      
      inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStyleWithCSS(value: Boolean): Self = StObject.set(x, "styleWithCSS", value.asInstanceOf[js.Any])
      
      inline def setStyleWithCSSUndefined: Self = StObject.set(x, "styleWithCSS", js.undefined)
    }
  }
  
  trait pellCustomActionConfig
    extends StObject
       with pellAction {
    
    var icon: String
    
    var name: js.UndefOr[String] = js.undefined
    
    def result(): Unit
    
    var title: js.UndefOr[String] = js.undefined
  }
  object pellCustomActionConfig {
    
    inline def apply(icon: String, result: Callback): pellCustomActionConfig = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], result = result.toJsFn)
      __obj.asInstanceOf[pellCustomActionConfig]
    }
    
    extension [Self <: pellCustomActionConfig](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResult(value: Callback): Self = StObject.set(x, "result", value.toJsFn)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
