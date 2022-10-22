package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddDisposeCallback extends StObject {
    
    def addDisposeCallback(node: org.scalajs.dom.Element, callback: js.Function): Unit
    
    def cleanNode(node: Node): org.scalajs.dom.Element
    
    def removeDisposeCallback(node: org.scalajs.dom.Element, callback: js.Function): Unit
    
    def removeNode(node: Node): Unit
  }
  object AddDisposeCallback {
    
    inline def apply(
      addDisposeCallback: (org.scalajs.dom.Element, js.Function) => Callback,
      cleanNode: Node => org.scalajs.dom.Element,
      removeDisposeCallback: (org.scalajs.dom.Element, js.Function) => Callback,
      removeNode: Node => Callback
    ): AddDisposeCallback = {
      val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (addDisposeCallback(t0, t1)).runNow()), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (removeDisposeCallback(t0, t1)).runNow()), removeNode = js.Any.fromFunction1((t0: Node) => removeNode(t0).runNow()))
      __obj.asInstanceOf[AddDisposeCallback]
    }
    
    extension [Self <: AddDisposeCallback](x: Self) {
      
      inline def setAddDisposeCallback(value: (org.scalajs.dom.Element, js.Function) => Callback): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setCleanNode(value: Node => org.scalajs.dom.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
      
      inline def setRemoveDisposeCallback(value: (org.scalajs.dom.Element, js.Function) => Callback): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setRemoveNode(value: Node => Callback): Self = StObject.set(x, "removeNode", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
    }
  }
  
  trait AddTemplate extends StObject {
    
    def addTemplate(templateName: String, templateMarkup: String): Unit
    
    def createJavaScriptEvaluatorBlock(script: String): String
    
    def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node]
  }
  object AddTemplate {
    
    inline def apply(
      addTemplate: (String, String) => Callback,
      createJavaScriptEvaluatorBlock: String => String,
      renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
    ): AddTemplate = {
      val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2((t0: String, t1: String) => (addTemplate(t0, t1)).runNow()), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
      __obj.asInstanceOf[AddTemplate]
    }
    
    extension [Self <: AddTemplate](x: Self) {
      
      inline def setAddTemplate(value: (String, String) => Callback): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
      
      inline def setRenderTemplateSource(value: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ApplyMemoizedBindingsToNextSibling extends StObject {
    
    def applyMemoizedBindingsToNextSibling(bindings: Any, nodeName: String): String = js.native
    
    def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
    def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
    
    def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): Any = js.native
  }
  
  trait BindingRewriteValidators extends StObject {
    
    var bindingRewriteValidators: Any
    
    def parseObjectLiteral(objectLiteralString: String): js.Array[Any]
  }
  object BindingRewriteValidators {
    
    inline def apply(bindingRewriteValidators: Any, parseObjectLiteral: String => js.Array[Any]): BindingRewriteValidators = {
      val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
      __obj.asInstanceOf[BindingRewriteValidators]
    }
    
    extension [Self <: BindingRewriteValidators](x: Self) {
      
      inline def setBindingRewriteValidators(value: Any): Self = StObject.set(x, "bindingRewriteValidators", value.asInstanceOf[js.Any])
      
      inline def setParseObjectLiteral(value: String => js.Array[Any]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
    }
  }
  
  trait Clear extends StObject {
    
    def clear(node: org.scalajs.dom.Element): Boolean
    
    def get(node: org.scalajs.dom.Element, key: String): Any
    
    def getAll(node: org.scalajs.dom.Element, createIfNotFound: Boolean): Any
    
    def set(node: org.scalajs.dom.Element, key: String, value: Any): Unit
  }
  object Clear {
    
    inline def apply(
      clear: org.scalajs.dom.Element => Boolean,
      get: (org.scalajs.dom.Element, String) => Any,
      getAll: (org.scalajs.dom.Element, Boolean) => Any,
      set: (org.scalajs.dom.Element, String, Any) => Callback
    ): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3((t0: org.scalajs.dom.Element, t1: String, t2: Any) => (set(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Clear]
    }
    
    extension [Self <: Clear](x: Self) {
      
      inline def setClear(value: org.scalajs.dom.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setGet(value: (org.scalajs.dom.Element, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetAll(value: (org.scalajs.dom.Element, Boolean) => Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
      
      inline def setSet(value: (org.scalajs.dom.Element, String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: org.scalajs.dom.Element, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait ControlsDescendantBindings extends StObject {
    
    var controlsDescendantBindings: Boolean
  }
  object ControlsDescendantBindings {
    
    inline def apply(controlsDescendantBindings: Boolean): ControlsDescendantBindings = {
      val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlsDescendantBindings]
    }
    
    extension [Self <: ControlsDescendantBindings](x: Self) {
      
      inline def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictindex
    extends StObject
       with /* index */ NumberDictionary[Node] {
    
    var length: Double
  }
  object Dictindex {
    
    inline def apply(length: Double): Dictindex = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    extension [Self <: Dictindex](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element extends StObject {
    
    var element: Node
  }
  object Element {
    
    inline def apply(element: Node): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance
    extends StObject
       with Instantiable0[KnockoutNativeTemplateEngine] {
    
    var instance: KnockoutNativeTemplateEngine = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* element */ org.scalajs.dom.Element, KnockoutTemplateSourcesDomElement]
  
  @js.native
  trait InstantiableInstance
    extends StObject
       with Instantiable0[KnockoutBindingProvider] {
    
    var instance: KnockoutBindingProvider = js.native
  }
  
  @js.native
  trait InstantiableKnockoutTemplateAnonymous
    extends StObject
       with Instantiable1[/* element */ org.scalajs.dom.Element, KnockoutTemplateAnonymous]
  
  @js.native
  trait InstantiableKnockoutTemplateEngine
    extends StObject
       with Instantiable0[KnockoutTemplateEngine]
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var timeout: Double
  }
  object Method {
    
    inline def apply(timeout: Double): Method = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadValue extends StObject {
    
    def readValue(element: HTMLElement): Any
    
    def writeValue(element: HTMLElement, value: Any): Unit
  }
  object ReadValue {
    
    inline def apply(readValue: HTMLElement => Any, writeValue: (HTMLElement, Any) => Callback): ReadValue = {
      val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (writeValue(t0, t1)).runNow()))
      __obj.asInstanceOf[ReadValue]
    }
    
    extension [Self <: ReadValue](x: Self) {
      
      inline def setReadValue(value: HTMLElement => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
      
      inline def setWriteValue(value: (HTMLElement, Any) => Callback): Self = StObject.set(x, "writeValue", js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
}
