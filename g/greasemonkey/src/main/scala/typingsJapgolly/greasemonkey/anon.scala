package typingsJapgolly.greasemonkey

import japgolly.scalajs.react.Callback
import typingsJapgolly.greasemonkey.GM.ProgressResponse
import typingsJapgolly.greasemonkey.GM.Response
import typingsJapgolly.greasemonkey.GM.ScriptInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mimetype extends StObject {
    
    var mimetype: String
    
    var name: String
    
    var url: String
  }
  object Mimetype {
    
    inline def apply(mimetype: String, name: String, url: String): Mimetype = {
      val __obj = js.Dynamic.literal(mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mimetype]
    }
    
    extension [Self <: Mimetype](x: Self) {
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Onabort[TContext] extends StObject {
    
    var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
  }
  object Onabort {
    
    inline def apply[TContext](): Onabort[TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Onabort[TContext]]
    }
    
    extension [Self <: Onabort[?], TContext](x: Self & Onabort[TContext]) {
      
      inline def setOnabort(value: /* response */ Response[TContext] => Callback): Self = StObject.set(x, "onabort", js.Any.fromFunction1((t0: /* response */ Response[TContext]) => value(t0).runNow()))
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnerror(value: /* response */ Response[TContext] => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* response */ Response[TContext]) => value(t0).runNow()))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnload(value: /* response */ Response[TContext] => Callback): Self = StObject.set(x, "onload", js.Any.fromFunction1((t0: /* response */ Response[TContext]) => value(t0).runNow()))
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnprogress(value: /* response */ ProgressResponse[TContext] => Callback): Self = StObject.set(x, "onprogress", js.Any.fromFunction1((t0: /* response */ ProgressResponse[TContext]) => value(t0).runNow()))
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    }
  }
  
  trait Script extends StObject {
    
    /** An object containing data about the currently running script */
    var script: ScriptInfo
    
    /**
      * The name of the user script engine handling this script's execution.
      * The string `Greasemonkey`
      */
    var scriptHandler: String
    
    /**
      * A string, the entire literal Metadata Block (without the delimiters)
      * for the currently running script
      */
    var scriptMetaStr: String
    
    /** The version of Greasemonkey, a string e.g. `4.0` */
    var version: String
  }
  object Script {
    
    inline def apply(script: ScriptInfo, scriptHandler: String, scriptMetaStr: String, version: String): Script = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptMetaStr = scriptMetaStr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Script]
    }
    
    extension [Self <: Script](x: Self) {
      
      inline def setScript(value: ScriptInfo): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptHandler(value: String): Self = StObject.set(x, "scriptHandler", value.asInstanceOf[js.Any])
      
      inline def setScriptMetaStr(value: String): Self = StObject.set(x, "scriptMetaStr", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
