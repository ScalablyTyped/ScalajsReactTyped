package typingsJapgolly.saxes

import japgolly.scalajs.react.Callback
import typingsJapgolly.saxes.mod.AttributeEventForOptions
import typingsJapgolly.saxes.mod.AttributeHandler
import typingsJapgolly.saxes.mod.CDataHandler
import typingsJapgolly.saxes.mod.CloseTagHandler
import typingsJapgolly.saxes.mod.CommentHandler
import typingsJapgolly.saxes.mod.DoctypeHandler
import typingsJapgolly.saxes.mod.EndHandler
import typingsJapgolly.saxes.mod.ErrorHandler
import typingsJapgolly.saxes.mod.OpenTagHandler
import typingsJapgolly.saxes.mod.OpenTagStartHandler
import typingsJapgolly.saxes.mod.PIHandler
import typingsJapgolly.saxes.mod.ReadyHandler
import typingsJapgolly.saxes.mod.StartTagForOptions
import typingsJapgolly.saxes.mod.TagForOptions
import typingsJapgolly.saxes.mod.TextHandler
import typingsJapgolly.saxes.mod.XMLDecl
import typingsJapgolly.saxes.mod.XMLDeclHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attribute[O] extends StObject {
    
    def attribute(attribute: AttributeEventForOptions[O]): Unit
    @JSName("attribute")
    var attribute_Original: AttributeHandler[O]
    
    def cdata(cdata: String): Unit
    @JSName("cdata")
    var cdata_Original: CDataHandler
    
    def closetag(tag: TagForOptions[O]): Unit
    @JSName("closetag")
    var closetag_Original: CloseTagHandler[O]
    
    def comment(comment: String): Unit
    @JSName("comment")
    var comment_Original: CommentHandler
    
    def doctype(doctype: String): Unit
    @JSName("doctype")
    var doctype_Original: DoctypeHandler
    
    def end(): Unit
    @JSName("end")
    var end_Original: EndHandler
    
    def error(err: js.Error): Unit
    @JSName("error")
    var error_Original: ErrorHandler
    
    def opentag(tag: TagForOptions[O]): Unit
    @JSName("opentag")
    var opentag_Original: OpenTagHandler[O]
    
    def opentagstart(tag: StartTagForOptions[O]): Unit
    @JSName("opentagstart")
    var opentagstart_Original: OpenTagStartHandler[O]
    
    def processinginstruction(data: Body): Unit
    @JSName("processinginstruction")
    var processinginstruction_Original: PIHandler
    
    def ready(): Unit
    @JSName("ready")
    var ready_Original: ReadyHandler
    
    def text(text: String): Unit
    @JSName("text")
    var text_Original: TextHandler
    
    def xmldecl(decl: XMLDecl): Unit
    @JSName("xmldecl")
    var xmldecl_Original: XMLDeclHandler
  }
  object Attribute {
    
    inline def apply[O](
      attribute: /* attribute */ AttributeEventForOptions[O] => Callback,
      cdata: /* cdata */ String => Callback,
      closetag: /* tag */ TagForOptions[O] => Callback,
      comment: /* comment */ String => Callback,
      doctype: /* doctype */ String => Callback,
      end: Callback,
      error: /* err */ js.Error => Callback,
      opentag: /* tag */ TagForOptions[O] => Callback,
      opentagstart: /* tag */ StartTagForOptions[O] => Callback,
      processinginstruction: /* data */ Body => Callback,
      ready: Callback,
      text: /* text */ String => Callback,
      xmldecl: /* decl */ XMLDecl => Callback
    ): Attribute[O] = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction1((t0: /* attribute */ AttributeEventForOptions[O]) => attribute(t0).runNow()), cdata = js.Any.fromFunction1((t0: /* cdata */ String) => cdata(t0).runNow()), closetag = js.Any.fromFunction1((t0: /* tag */ TagForOptions[O]) => closetag(t0).runNow()), comment = js.Any.fromFunction1((t0: /* comment */ String) => comment(t0).runNow()), doctype = js.Any.fromFunction1((t0: /* doctype */ String) => doctype(t0).runNow()), end = end.toJsFn, error = js.Any.fromFunction1((t0: /* err */ js.Error) => error(t0).runNow()), opentag = js.Any.fromFunction1((t0: /* tag */ TagForOptions[O]) => opentag(t0).runNow()), opentagstart = js.Any.fromFunction1((t0: /* tag */ StartTagForOptions[O]) => opentagstart(t0).runNow()), processinginstruction = js.Any.fromFunction1((t0: /* data */ Body) => processinginstruction(t0).runNow()), ready = ready.toJsFn, text = js.Any.fromFunction1((t0: /* text */ String) => text(t0).runNow()), xmldecl = js.Any.fromFunction1((t0: /* decl */ XMLDecl) => xmldecl(t0).runNow()))
      __obj.asInstanceOf[Attribute[O]]
    }
    
    extension [Self <: Attribute[?], O](x: Self & Attribute[O]) {
      
      inline def setAttribute(value: /* attribute */ AttributeEventForOptions[O] => Callback): Self = StObject.set(x, "attribute", js.Any.fromFunction1((t0: /* attribute */ AttributeEventForOptions[O]) => value(t0).runNow()))
      
      inline def setCdata(value: /* cdata */ String => Callback): Self = StObject.set(x, "cdata", js.Any.fromFunction1((t0: /* cdata */ String) => value(t0).runNow()))
      
      inline def setClosetag(value: /* tag */ TagForOptions[O] => Callback): Self = StObject.set(x, "closetag", js.Any.fromFunction1((t0: /* tag */ TagForOptions[O]) => value(t0).runNow()))
      
      inline def setComment(value: /* comment */ String => Callback): Self = StObject.set(x, "comment", js.Any.fromFunction1((t0: /* comment */ String) => value(t0).runNow()))
      
      inline def setDoctype(value: /* doctype */ String => Callback): Self = StObject.set(x, "doctype", js.Any.fromFunction1((t0: /* doctype */ String) => value(t0).runNow()))
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setOpentag(value: /* tag */ TagForOptions[O] => Callback): Self = StObject.set(x, "opentag", js.Any.fromFunction1((t0: /* tag */ TagForOptions[O]) => value(t0).runNow()))
      
      inline def setOpentagstart(value: /* tag */ StartTagForOptions[O] => Callback): Self = StObject.set(x, "opentagstart", js.Any.fromFunction1((t0: /* tag */ StartTagForOptions[O]) => value(t0).runNow()))
      
      inline def setProcessinginstruction(value: /* data */ Body => Callback): Self = StObject.set(x, "processinginstruction", js.Any.fromFunction1((t0: /* data */ Body) => value(t0).runNow()))
      
      inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
      
      inline def setText(value: /* text */ String => Callback): Self = StObject.set(x, "text", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
      
      inline def setXmldecl(value: /* decl */ XMLDecl => Callback): Self = StObject.set(x, "xmldecl", js.Any.fromFunction1((t0: /* decl */ XMLDecl) => value(t0).runNow()))
    }
  }
  
  trait Body extends StObject {
    
    var body: String
    
    var target: String
  }
  object Body {
    
    inline def apply(body: String, target: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
