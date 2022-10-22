package typingsJapgolly.stropheJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import typingsJapgolly.stropheJs.stropheJsStrings.alt
import typingsJapgolly.stropheJs.stropheJsStrings.height
import typingsJapgolly.stropheJs.stropheJsStrings.href
import typingsJapgolly.stropheJs.stropheJsStrings.src
import typingsJapgolly.stropheJs.stropheJsStrings.style
import typingsJapgolly.stropheJs.stropheJsStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var a: js.Array[href]
    
    var blockquote: js.Array[style]
    
    var body: js.Array[Any]
    
    var br: js.Array[Any]
    
    var cite: js.Array[style]
    
    var em: js.Array[Any]
    
    var img: js.Tuple5[src, alt, style, height, width]
    
    var li: js.Array[style]
    
    var ol: js.Array[style]
    
    var p: js.Array[style]
    
    var span: js.Array[style]
    
    var strong: js.Array[Any]
    
    var ul: js.Array[style]
  }
  object A {
    
    inline def apply(
      a: js.Array[href],
      blockquote: js.Array[style],
      body: js.Array[Any],
      br: js.Array[Any],
      cite: js.Array[style],
      em: js.Array[Any],
      img: js.Tuple5[src, alt, style, height, width],
      li: js.Array[style],
      ol: js.Array[style],
      p: js.Array[style],
      span: js.Array[style],
      strong: js.Array[Any],
      ul: js.Array[style]
    ): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: js.Array[href]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAVarargs(value: href*): Self = StObject.set(x, "a", js.Array(value*))
      
      inline def setBlockquote(value: js.Array[style]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteVarargs(value: style*): Self = StObject.set(x, "blockquote", js.Array(value*))
      
      inline def setBody(value: js.Array[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: Any*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setBr(value: js.Array[Any]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrVarargs(value: Any*): Self = StObject.set(x, "br", js.Array(value*))
      
      inline def setCite(value: js.Array[style]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteVarargs(value: style*): Self = StObject.set(x, "cite", js.Array(value*))
      
      inline def setEm(value: js.Array[Any]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmVarargs(value: Any*): Self = StObject.set(x, "em", js.Array(value*))
      
      inline def setImg(value: js.Tuple5[src, alt, style, height, width]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setLi(value: js.Array[style]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiVarargs(value: style*): Self = StObject.set(x, "li", js.Array(value*))
      
      inline def setOl(value: js.Array[style]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlVarargs(value: style*): Self = StObject.set(x, "ol", js.Array(value*))
      
      inline def setP(value: js.Array[style]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: style*): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setSpan(value: js.Array[style]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanVarargs(value: style*): Self = StObject.set(x, "span", js.Array(value*))
      
      inline def setStrong(value: js.Array[Any]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongVarargs(value: Any*): Self = StObject.set(x, "strong", js.Array(value*))
      
      inline def setUl(value: js.Array[style]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlVarargs(value: style*): Self = StObject.set(x, "ul", js.Array(value*))
    }
  }
  
  trait HTTP extends StObject {
    
    var HTTP: Record[Double, js.Function1[/* status */ Double, Any]]
    
    var websocket: Record[Double, js.Function1[/* status */ Double, Any]]
  }
  object HTTP {
    
    inline def apply(
      HTTP: Record[Double, js.Function1[/* status */ Double, Any]],
      websocket: Record[Double, js.Function1[/* status */ Double, Any]]
    ): HTTP = {
      val __obj = js.Dynamic.literal(HTTP = HTTP.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTP]
    }
    
    extension [Self <: HTTP](x: Self) {
      
      inline def setHTTP(value: Record[Double, js.Function1[/* status */ Double, Any]]): Self = StObject.set(x, "HTTP", value.asInstanceOf[js.Any])
      
      inline def setWebsocket(value: Record[Double, js.Function1[/* status */ Double, Any]]): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreNamespaceFragment extends StObject {
    
    var ignoreNamespaceFragment: Boolean
    
    var matchBareFromJid: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreNamespaceFragment {
    
    inline def apply(ignoreNamespaceFragment: Boolean): IgnoreNamespaceFragment = {
      val __obj = js.Dynamic.literal(ignoreNamespaceFragment = ignoreNamespaceFragment.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreNamespaceFragment]
    }
    
    extension [Self <: IgnoreNamespaceFragment](x: Self) {
      
      inline def setIgnoreNamespaceFragment(value: Boolean): Self = StObject.set(x, "ignoreNamespaceFragment", value.asInstanceOf[js.Any])
      
      inline def setMatchBareFromJid(value: Boolean): Self = StObject.set(x, "matchBareFromJid", value.asInstanceOf[js.Any])
      
      inline def setMatchBareFromJidUndefined: Self = StObject.set(x, "matchBareFromJid", js.undefined)
    }
  }
  
  trait MatchBareFromJid extends StObject {
    
    var ignoreNamespaceFragment: Boolean
    
    var matchBareFromJid: Boolean
  }
  object MatchBareFromJid {
    
    inline def apply(ignoreNamespaceFragment: Boolean, matchBareFromJid: Boolean): MatchBareFromJid = {
      val __obj = js.Dynamic.literal(ignoreNamespaceFragment = ignoreNamespaceFragment.asInstanceOf[js.Any], matchBareFromJid = matchBareFromJid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchBareFromJid]
    }
    
    extension [Self <: MatchBareFromJid](x: Self) {
      
      inline def setIgnoreNamespaceFragment(value: Boolean): Self = StObject.set(x, "ignoreNamespaceFragment", value.asInstanceOf[js.Any])
      
      inline def setMatchBareFromJid(value: Boolean): Self = StObject.set(x, "matchBareFromJid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tree extends StObject {
    
    def tree(): Element
  }
  object Tree {
    
    inline def apply(tree: CallbackTo[Element]): Tree = {
      val __obj = js.Dynamic.literal(tree = tree.toJsFn)
      __obj.asInstanceOf[Tree]
    }
    
    extension [Self <: Tree](x: Self) {
      
      inline def setTree(value: CallbackTo[Element]): Self = StObject.set(x, "tree", value.toJsFn)
    }
  }
}
