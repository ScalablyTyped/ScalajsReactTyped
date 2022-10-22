package typingsJapgolly.sax

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.sax.anon.Body
import typingsJapgolly.sax.anon.Name
import typingsJapgolly.sax.anon.Prefix
import typingsJapgolly.sax.saxStrings.attribute
import typingsJapgolly.sax.saxStrings.cdata
import typingsJapgolly.sax.saxStrings.close
import typingsJapgolly.sax.saxStrings.closecdata
import typingsJapgolly.sax.saxStrings.closenamespace
import typingsJapgolly.sax.saxStrings.closetag
import typingsJapgolly.sax.saxStrings.comment
import typingsJapgolly.sax.saxStrings.data
import typingsJapgolly.sax.saxStrings.doctype
import typingsJapgolly.sax.saxStrings.drain
import typingsJapgolly.sax.saxStrings.end
import typingsJapgolly.sax.saxStrings.error
import typingsJapgolly.sax.saxStrings.finish
import typingsJapgolly.sax.saxStrings.opencdata
import typingsJapgolly.sax.saxStrings.opennamespace
import typingsJapgolly.sax.saxStrings.opentag
import typingsJapgolly.sax.saxStrings.opentagstart
import typingsJapgolly.sax.saxStrings.pipe
import typingsJapgolly.sax.saxStrings.processinginstruction
import typingsJapgolly.sax.saxStrings.readable
import typingsJapgolly.sax.saxStrings.ready
import typingsJapgolly.sax.saxStrings.script
import typingsJapgolly.sax.saxStrings.sgmldeclaration
import typingsJapgolly.sax.saxStrings.text
import typingsJapgolly.sax.saxStrings.unpipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sax", "EVENTS")
  @js.native
  val EVENTS: js.Array[String] = js.native
  
  @JSImport("sax", "SAXParser")
  @js.native
  open class SAXParser () extends StObject {
    def this(strict: Boolean) = this()
    def this(strict: Boolean, opt: SAXOptions) = this()
    def this(strict: Unit, opt: SAXOptions) = this()
    
    var ENTITIES: StringDictionary[String] = js.native
    
    def close(): SAXParser = js.native
    
    var closed: Boolean = js.native
    
    var column: Double = js.native
    
    // Methods
    def end(): Unit = js.native
    
    var error: js.Error = js.native
    
    def flush(): Unit = js.native
    
    // Members
    var line: Double = js.native
    
    def onattribute(attr: Name): Unit = js.native
    
    def oncdata(cdata: String): Unit = js.native
    
    def onclosecdata(): Unit = js.native
    
    def onclosenamespace(ns: Prefix): Unit = js.native
    
    def onclosetag(tagName: String): Unit = js.native
    
    def oncomment(comment: String): Unit = js.native
    
    def ondoctype(doctype: String): Unit = js.native
    
    def onend(): Unit = js.native
    
    // Events
    def onerror(e: js.Error): Unit = js.native
    
    def onopencdata(): Unit = js.native
    
    def onopennamespace(ns: Prefix): Unit = js.native
    
    def onopentag(tag: QualifiedTag): Unit = js.native
    def onopentag(tag: Tag): Unit = js.native
    
    def onopentagstart(tag: QualifiedTag): Unit = js.native
    def onopentagstart(tag: Tag): Unit = js.native
    
    def onprocessinginstruction(node: Body): Unit = js.native
    
    def onready(): Unit = js.native
    
    def onscript(script: String): Unit = js.native
    
    def onsgmldeclaration(sgmlDecl: String): Unit = js.native
    
    def ontext(t: String): Unit = js.native
    
    var opt: SAXOptions = js.native
    
    var position: Double = js.native
    
    def resume(): SAXParser = js.native
    
    var startTagPosition: Double = js.native
    
    var strict: Boolean = js.native
    
    var tag: Tag = js.native
    
    def write(s: String): SAXParser = js.native
  }
  
  @JSImport("sax", "SAXStream")
  @js.native
  open class SAXStream () extends Duplex {
    def this(strict: Boolean) = this()
    def this(strict: Boolean, opt: SAXOptions) = this()
    def this(strict: Unit, opt: SAXOptions) = this()
    
    var _parser: SAXParser = js.native
    
    def on(
      event: opencdata | closecdata | end | ready | close | readable | drain | finish,
      listener: js.ThisFunction0[/* this */ this.type, Unit]
    ): this.type = js.native
    def on(
      event: closenamespace | opennamespace | opentag | opentagstart | pipe | unpipe,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ns */ Prefix) | QualifiedTag | (/* src */ Readable) | Tag, 
          Unit
        ]
    ): this.type = js.native
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_attribute(event: attribute, listener: js.ThisFunction1[/* this */ this.type, /* attr */ Name, Unit]): this.type = js.native
    @JSName("on")
    def on_cdata(event: cdata, listener: js.ThisFunction1[/* this */ this.type, /* cdata */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_closetag(event: closetag, listener: js.ThisFunction1[/* this */ this.type, /* tagName */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_comment(event: comment, listener: js.ThisFunction1[/* this */ this.type, /* comment */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.ThisFunction1[/* this */ this.type, /* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_doctype(event: doctype, listener: js.ThisFunction1[/* this */ this.type, /* doctype */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_processinginstruction(
      event: processinginstruction,
      listener: js.ThisFunction1[/* this */ this.type, /* node */ Body, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_script(event: script, listener: js.ThisFunction1[/* this */ this.type, /* script */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_sgmldeclaration(
      event: sgmldeclaration,
      listener: js.ThisFunction1[/* this */ this.type, /* sgmlDecl */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_text(event: text, listener: js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]): this.type = js.native
  }
  
  inline def createStream(): SAXStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[SAXStream]
  inline def createStream(strict: Boolean): SAXStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(strict.asInstanceOf[js.Any]).asInstanceOf[SAXStream]
  inline def createStream(strict: Boolean, opt: SAXOptions): SAXStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(strict.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[SAXStream]
  inline def createStream(strict: Unit, opt: SAXOptions): SAXStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(strict.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[SAXStream]
  
  inline def parser(): SAXParser = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")().asInstanceOf[SAXParser]
  inline def parser(strict: Boolean): SAXParser = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(strict.asInstanceOf[js.Any]).asInstanceOf[SAXParser]
  inline def parser(strict: Boolean, opt: SAXOptions): SAXParser = (^.asInstanceOf[js.Dynamic].applyDynamic("parser")(strict.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[SAXParser]
  inline def parser(strict: Unit, opt: SAXOptions): SAXParser = (^.asInstanceOf[js.Dynamic].applyDynamic("parser")(strict.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[SAXParser]
  
  trait BaseTag extends StObject {
    
    var isSelfClosing: Boolean
    
    var name: String
  }
  object BaseTag {
    
    inline def apply(isSelfClosing: Boolean, name: String): BaseTag = {
      val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTag]
    }
    
    extension [Self <: BaseTag](x: Self) {
      
      inline def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QualifiedAttribute
    extends StObject
       with QualifiedName {
    
    var value: String
  }
  object QualifiedAttribute {
    
    inline def apply(local: String, name: String, prefix: String, uri: String, value: String): QualifiedAttribute = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedAttribute]
    }
    
    extension [Self <: QualifiedAttribute](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait QualifiedName extends StObject {
    
    var local: String
    
    var name: String
    
    var prefix: String
    
    var uri: String
  }
  object QualifiedName {
    
    inline def apply(local: String, name: String, prefix: String, uri: String): QualifiedName = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedName]
    }
    
    extension [Self <: QualifiedName](x: Self) {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sax.mod.BaseTag because var conflicts: name. Inlined isSelfClosing */ trait QualifiedTag
    extends StObject
       with QualifiedName {
    
    var attributes: StringDictionary[QualifiedAttribute]
    
    var isSelfClosing: Boolean
    
    var ns: StringDictionary[String]
  }
  object QualifiedTag {
    
    inline def apply(
      attributes: StringDictionary[QualifiedAttribute],
      isSelfClosing: Boolean,
      local: String,
      name: String,
      ns: StringDictionary[String],
      prefix: String,
      uri: String
    ): QualifiedTag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedTag]
    }
    
    extension [Self <: QualifiedTag](x: Self) {
      
      inline def setAttributes(value: StringDictionary[QualifiedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setNs(value: StringDictionary[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  trait SAXOptions extends StObject {
    
    var lowercase: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var noscript: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object SAXOptions {
    
    inline def apply(): SAXOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SAXOptions]
    }
    
    extension [Self <: SAXOptions](x: Self) {
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setNoscript(value: Boolean): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  trait Tag
    extends StObject
       with BaseTag {
    
    var attributes: StringDictionary[String]
  }
  object Tag {
    
    inline def apply(attributes: StringDictionary[String], isSelfClosing: Boolean, name: String): Tag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    }
  }
}
