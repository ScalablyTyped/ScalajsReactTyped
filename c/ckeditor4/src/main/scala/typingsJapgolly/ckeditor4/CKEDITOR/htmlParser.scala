package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor4.anon.ApplyToAll
import typingsJapgolly.ckeditor4.anon.Option
import typingsJapgolly.ckeditor4.ckeditor4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParser {
  
  trait basicWriter extends StObject {
    
    def attribute(attName: String, attValue: String): Unit
    
    def closeTag(tagName: String): Unit
    
    def comment(comment: String): Unit
    
    def getHtml(reset: Boolean): String
    
    def openTag(tagName: String, attributes: StringDictionary[String]): Unit
    
    def openTagClose(tagName: String, isSelfClose: Boolean): Unit
    
    def reset(): Unit
    
    def text(text: String): Unit
    
    def write(data: String): Unit
  }
  object basicWriter {
    
    inline def apply(
      attribute: (String, String) => Callback,
      closeTag: String => Callback,
      comment: String => Callback,
      getHtml: Boolean => String,
      openTag: (String, StringDictionary[String]) => Callback,
      openTagClose: (String, Boolean) => Callback,
      reset: Callback,
      text: String => Callback,
      write: String => Callback
    ): basicWriter = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2((t0: String, t1: String) => (attribute(t0, t1)).runNow()), closeTag = js.Any.fromFunction1((t0: String) => closeTag(t0).runNow()), comment = js.Any.fromFunction1((t0: String) => comment(t0).runNow()), getHtml = js.Any.fromFunction1(getHtml), openTag = js.Any.fromFunction2((t0: String, t1: StringDictionary[String]) => (openTag(t0, t1)).runNow()), openTagClose = js.Any.fromFunction2((t0: String, t1: Boolean) => (openTagClose(t0, t1)).runNow()), reset = reset.toJsFn, text = js.Any.fromFunction1((t0: String) => text(t0).runNow()), write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[basicWriter]
    }
    
    extension [Self <: basicWriter](x: Self) {
      
      inline def setAttribute(value: (String, String) => Callback): Self = StObject.set(x, "attribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setCloseTag(value: String => Callback): Self = StObject.set(x, "closeTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setComment(value: String => Callback): Self = StObject.set(x, "comment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetHtml(value: Boolean => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction1(value))
      
      inline def setOpenTag(value: (String, StringDictionary[String]) => Callback): Self = StObject.set(x, "openTag", js.Any.fromFunction2((t0: String, t1: StringDictionary[String]) => (value(t0, t1)).runNow()))
      
      inline def setOpenTagClose(value: (String, Boolean) => Callback): Self = StObject.set(x, "openTagClose", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setText(value: String => Callback): Self = StObject.set(x, "text", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait cdata
    extends StObject
       with node {
    
    var `type`: Double = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
  }
  
  @js.native
  trait comment
    extends StObject
       with node {
    
    def filter(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    var `type`: Double = js.native
    
    var value: String = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait cssStyle extends StObject {
    
    def populate(obj: StringDictionary[Any]): Unit = js.native
    def populate(obj: typingsJapgolly.ckeditor4.CKEDITOR.dom.element): Unit = js.native
    def populate(obj: element): Unit = js.native
  }
  
  @js.native
  trait element
    extends StObject
       with node {
    
    def add(node: node): Unit = js.native
    def add(node: node, index: Double): Unit = js.native
    
    def addClass(className: String): Unit = js.native
    
    var attributes: StringDictionary[String] = js.native
    
    var children: js.Array[node] = js.native
    
    def filter(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    def filterChildren(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def find(criteria: String): js.Array[node] = js.native
    def find(criteria: String, recursive: Boolean): js.Array[node] = js.native
    def find(criteria: js.Function1[/* el */ node, Boolean]): js.Array[node] = js.native
    def find(criteria: js.Function1[/* el */ node, Boolean], recursive: Boolean): js.Array[node] = js.native
    
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Unit, skipRoot: Boolean): Unit = js.native
    
    def getFirst(condition: String): node = js.native
    def getFirst(condition: js.Function1[/* node */ node, Boolean]): node = js.native
    def getFirst(condition: StringDictionary[String]): node = js.native
    
    def getHtml(): String = js.native
    
    def getOuterHtml(): String = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    var name: String = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def replaceWithChildren(): Unit = js.native
    
    def setHtml(html: String): Unit = js.native
    
    def split(index: Double): element = js.native
    
    var `type`: Double = js.native
    
    def writeChildrenHtml(writer: basicWriter): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait filter extends StObject {
    
    def addRules(rules: filterRulesDefinition): Unit = js.native
    def addRules(rules: filterRulesDefinition, options: Double): Unit = js.native
    def addRules(rules: filterRulesDefinition, options: ApplyToAll): Unit = js.native
    
    def applyTo(node: node): Unit = js.native
    
    var attributeNameRules: filterRulesGroup = js.native
    
    var attributesRules: StringDictionary[filterRulesGroup] = js.native
    
    var commentRules: filterRulesGroup = js.native
    
    var elementNameRules: filterRulesGroup = js.native
    
    var elementsRules: StringDictionary[filterRulesGroup] = js.native
    
    var id: Double = js.native
    
    var rootRules: filterRulesGroup = js.native
    
    var textRules: filterRulesGroup = js.native
  }
  
  trait filterRulesDefinition extends StObject {
    
    var attributeNames: js.UndefOr[Any] = js.undefined
    
    var attributes: js.UndefOr[Any] = js.undefined
    
    var comment: js.UndefOr[Any] = js.undefined
    
    var elementNames: js.UndefOr[Any] = js.undefined
    
    var elements: js.UndefOr[Any] = js.undefined
    
    var root: js.UndefOr[Any] = js.undefined
    
    var text: js.UndefOr[Any] = js.undefined
  }
  object filterRulesDefinition {
    
    inline def apply(): filterRulesDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[filterRulesDefinition]
    }
    
    extension [Self <: filterRulesDefinition](x: Self) {
      
      inline def setAttributeNames(value: Any): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setElementNames(value: Any): Self = StObject.set(x, "elementNames", value.asInstanceOf[js.Any])
      
      inline def setElementNamesUndefined: Self = StObject.set(x, "elementNames", js.undefined)
      
      inline def setElements(value: Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait filterRulesGroup extends StObject {
    
    def add(rule: rule, priority: Double, options: ruleOptions): Unit = js.native
    
    def addMany(rules: js.Array[StringDictionary[Any]], priority: Double, options: ruleOptions): Unit = js.native
    
    def exec(currentValue: String): node | fragment | String = js.native
    def exec(currentValue: fragment): node | fragment | String = js.native
    def exec(currentValue: node): node | fragment | String = js.native
    
    def execOnName(currentName: String): String = js.native
    
    def findIndex(priority: Double): Double = js.native
    
    var rules: js.Array[Option] = js.native
  }
  
  @js.native
  trait fragment extends StObject {
    
    def add(node: node): Unit = js.native
    def add(node: node, index: Double): Unit = js.native
    
    var children: js.Array[node] = js.native
    
    def filter(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def filterChildren(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
    def filterChildren(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter, filterRoot: Boolean): Unit = js.native
    
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Unit, skipRoot: Boolean): Unit = js.native
    
    var parent: fragment = js.native
    
    val `type`: Double = js.native
    
    def writeChildrenHtml(writer: basicWriter): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: Unit, filterRoot: Boolean): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
    def writeChildrenHtml(
      writer: basicWriter,
      filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter,
      filterRoot: Boolean
    ): Unit = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait node extends StObject {
    
    def getAscendant(condition: String): element = js.native
    def getAscendant(condition: js.Function1[/* node */ element, Boolean]): element = js.native
    def getAscendant(condition: StringDictionary[String]): element = js.native
    
    def getIndex(): Double = js.native
    
    def insertAfter(node: node): Unit = js.native
    
    def insertBefore(node: node): Unit = js.native
    
    def remove(): node = js.native
    
    def replaceWith(node: node): Unit = js.native
    
    def wrapWith(wrapper: element): element = js.native
  }
  
  type rule = (js.Function1[/* value */ node | fragment | String, Boolean]) | (js.Tuple2[String, String])
  
  trait ruleOptions extends StObject {
    
    var applyToAll: js.UndefOr[Boolean] = js.undefined
    
    var excludeNestedEditable: js.UndefOr[Boolean] = js.undefined
  }
  object ruleOptions {
    
    inline def apply(): ruleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ruleOptions]
    }
    
    extension [Self <: ruleOptions](x: Self) {
      
      inline def setApplyToAll(value: Boolean): Self = StObject.set(x, "applyToAll", value.asInstanceOf[js.Any])
      
      inline def setApplyToAllUndefined: Self = StObject.set(x, "applyToAll", js.undefined)
      
      inline def setExcludeNestedEditable(value: Boolean): Self = StObject.set(x, "excludeNestedEditable", value.asInstanceOf[js.Any])
      
      inline def setExcludeNestedEditableUndefined: Self = StObject.set(x, "excludeNestedEditable", js.undefined)
    }
  }
  
  @js.native
  trait text
    extends StObject
       with node {
    
    def filter(filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    var `type`: Double = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.filter): Unit = js.native
  }
}
