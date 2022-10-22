package typingsJapgolly.stylis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stylis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stylis", "CHARSET")
  @js.native
  val CHARSET: /* "@charset" */ String = js.native
  
  @JSImport("stylis", "COMMENT")
  @js.native
  val COMMENT_ : /* "comm" */ String = js.native
  
  @JSImport("stylis", "COUNTER_STYLE")
  @js.native
  val COUNTER_STYLE: /* "@counter-style" */ String = js.native
  
  @JSImport("stylis", "DECLARATION")
  @js.native
  val DECLARATION_ : /* "decl" */ String = js.native
  
  @JSImport("stylis", "DOCUMENT")
  @js.native
  val DOCUMENT: /* "@document" */ String = js.native
  
  @JSImport("stylis", "FONT_FACE")
  @js.native
  val FONT_FACE: /* "@font-face" */ String = js.native
  
  @JSImport("stylis", "FONT_FEATURE_VALUES")
  @js.native
  val FONT_FEATURE_VALUES: /* "@font-feature-values" */ String = js.native
  
  @JSImport("stylis", "IMPORT")
  @js.native
  val IMPORT: /* "@import" */ String = js.native
  
  @JSImport("stylis", "KEYFRAMES")
  @js.native
  val KEYFRAMES: /* "@keyframes" */ String = js.native
  
  @JSImport("stylis", "MEDIA")
  @js.native
  val MEDIA: /* "@media" */ String = js.native
  
  @JSImport("stylis", "MOZ")
  @js.native
  val MOZ: /* "-moz-" */ String = js.native
  
  @JSImport("stylis", "MS")
  @js.native
  val MS: /* "-ms-" */ String = js.native
  
  @JSImport("stylis", "NAMESPACE")
  @js.native
  val NAMESPACE_ : /* "@namespace" */ String = js.native
  
  @JSImport("stylis", "PAGE")
  @js.native
  val PAGE: /* "@page" */ String = js.native
  
  @JSImport("stylis", "RULESET")
  @js.native
  val RULESET_ : /* "rule" */ String = js.native
  
  @JSImport("stylis", "SUPPORTS")
  @js.native
  val SUPPORTS: /* "@supports" */ String = js.native
  
  @JSImport("stylis", "VIEWPORT")
  @js.native
  val VIEWPORT: /* "@viewport" */ String = js.native
  
  @JSImport("stylis", "WEBKIT")
  @js.native
  val WEBKIT: /* "-webkit-" */ String = js.native
  
  inline def abs(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def alloc(value: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def append[T](value: T, array: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def caret(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("caret")().asInstanceOf[Double]
  
  inline def char(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("char")().asInstanceOf[Double]
  
  @JSImport("stylis", "character")
  @js.native
  def character: Double = js.native
  inline def character_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
  
  @JSImport("stylis", "characters")
  @js.native
  def characters: String = js.native
  inline def characters_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("characters")(x.asInstanceOf[js.Any])
  
  inline def charat(value: String, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("charat")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("stylis", "column")
  @js.native
  def column: Double = js.native
  inline def column_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("column")(x.asInstanceOf[js.Any])
  
  inline def combine(array: js.Array[String], callback: ArrayMapCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def comment(value: String, root: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def comment(value: String, root: Element, parent: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def commenter(`type`: Double, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commenter")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compile(value: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def copy(value: String, root: Element, `type`: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def dealloc[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dealloc")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def declaration(value: String, root: Element, parent: Null, length: Double): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("declaration")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def declaration(value: String, root: Element, parent: Element, length: Double): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("declaration")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def delimit(`type`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("delimit")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def delimiter(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delimiter")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def from(codes: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(codes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def hash(value: String, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def identifier(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def indexof(value: String, search: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexof")(value.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("stylis", "length")
  @js.native
  def length: Double = js.native
  inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  @JSImport("stylis", "line")
  @js.native
  def line: Double = js.native
  inline def line_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("line")(x.asInstanceOf[js.Any])
  
  inline def `match`(value: String, pattern: js.RegExp): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def middleware(collection: js.Array[Middleware_]): Middleware_ = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(collection.asInstanceOf[js.Any]).asInstanceOf[Middleware_]
  
  inline def namespace(element: Element): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(element.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def next(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[Double]
  
  inline def node(
    value: String,
    root: Element,
    parent: Null,
    `type`: String,
    props: js.Array[String],
    children: js.Array[Element],
    length: Double
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def node(
    value: String,
    root: Element,
    parent: Element,
    `type`: String,
    props: js.Array[String],
    children: js.Array[Element],
    length: Double
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def parse(
    value: String,
    root: Element,
    parent: Null,
    rule: js.Array[String],
    rules: js.Array[String],
    rulesets: js.Array[Element],
    pseudo: Double,
    points: js.Array[Double],
    declarations: js.Array[String]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], rulesets.asInstanceOf[js.Any], pseudo.asInstanceOf[js.Any], points.asInstanceOf[js.Any], declarations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parse(
    value: String,
    root: Element,
    parent: Null,
    rule: Element,
    rules: js.Array[String],
    rulesets: js.Array[Element],
    pseudo: Double,
    points: js.Array[Double],
    declarations: js.Array[String]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], rulesets.asInstanceOf[js.Any], pseudo.asInstanceOf[js.Any], points.asInstanceOf[js.Any], declarations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parse(
    value: String,
    root: Element,
    parent: Element,
    rule: js.Array[String],
    rules: js.Array[String],
    rulesets: js.Array[Element],
    pseudo: Double,
    points: js.Array[Double],
    declarations: js.Array[String]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], rulesets.asInstanceOf[js.Any], pseudo.asInstanceOf[js.Any], points.asInstanceOf[js.Any], declarations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def parse(
    value: String,
    root: Element,
    parent: Element,
    rule: Element,
    rules: js.Array[String],
    rulesets: js.Array[Element],
    pseudo: Double,
    points: js.Array[Double],
    declarations: js.Array[String]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], rulesets.asInstanceOf[js.Any], pseudo.asInstanceOf[js.Any], points.asInstanceOf[js.Any], declarations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def peek(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")().asInstanceOf[Double]
  
  @JSImport("stylis", "position")
  @js.native
  def position: Double = js.native
  inline def position_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
  
  inline def prefix(value: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def prefixer(element: Element, index: Double, children: js.Array[Element], callback: Middleware_): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixer")(element.asInstanceOf[js.Any], index.asInstanceOf[js.Any], children.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  inline def replace(value: String, pattern: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(value: String, pattern: js.RegExp, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ruleset(
    value: String,
    root: Element,
    parent: Null,
    index: Double,
    offset: Double,
    rules: js.Array[String],
    points: js.Array[Double],
    `type`: String,
    props: js.Array[String],
    children: js.Array[Element],
    length: Double
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("ruleset")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], points.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def ruleset(
    value: String,
    root: Element,
    parent: Element,
    index: Double,
    offset: Double,
    rules: js.Array[String],
    points: js.Array[Double],
    `type`: String,
    props: js.Array[String],
    children: js.Array[Element],
    length: Double
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("ruleset")(value.asInstanceOf[js.Any], root.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], rules.asInstanceOf[js.Any], points.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def rulesheet(callback: js.Function1[/* ret */ String, Unit]): Middleware_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rulesheet")(callback.asInstanceOf[js.Any]).asInstanceOf[Middleware_]
  
  inline def serialize(children: js.Array[Element], callback: Middleware_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(children.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sizeof(value: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def slice(begin: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringify(element: Element, index: Double, children: js.Array[Element], callback: Middleware_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(element.asInstanceOf[js.Any], index.asInstanceOf[js.Any], children.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strlen(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strlen")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def substr(value: String, begin: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(value.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def token(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tokenize(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def tokenizer(children: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def trim(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def whitespace(`type`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("whitespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ArrayMapCallback = js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], String]
  
  trait Element extends StObject {
    
    var children: js.Array[Element] | String
    
    var column: Double
    
    var length: Double
    
    var line: Double
    
    var parent: Element | Null
    
    var props: js.Array[String] | String
    
    var `return`: String
    
    var root: Element | Null
    
    var `type`: String
    
    var value: String
  }
  object Element {
    
    inline def apply(
      children: js.Array[Element] | String,
      column: Double,
      length: Double,
      line: Double,
      props: js.Array[String] | String,
      `return`: String,
      `type`: String,
      value: String
    ): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], parent = null, root = null)
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setChildren(value: js.Array[Element] | String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setProps(value: js.Array[String] | String): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setReturn(value: String): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Middleware_ extends StObject {
    
    def apply(element: Element, index: Double, children: js.Array[Element], callback: Middleware_): String | Unit = js.native
  }
}
