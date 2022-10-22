package typingsJapgolly.firemonkeyBrowser

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLElement
import typingsJapgolly.firemonkeyBrowser.GM.BrowserInfo
import typingsJapgolly.firemonkeyBrowser.GM.PlatformInfo
import typingsJapgolly.firemonkeyBrowser.GM.ScriptInfo
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-bottom`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-left`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-right`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`panel-top`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-bottom`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-left`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-right`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.`slide-top`
import typingsJapgolly.firemonkeyBrowser.firemonkeyBrowserStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddStyle extends StObject {
    
    /** Can be used to add style to the popup */
    def addStyle(css: String): Unit
    
    /** Can be used to add multiple HTML element(s) to the popup */
    def append(data: HTMLElement*): Unit
    
    var close: HTMLElement
    
    var content: HTMLElement
    
    def hide(): Unit
    
    var host: HTMLElement
    
    def remove(): Unit
    
    def show(): Unit
    
    var style: HTMLElement
  }
  object AddStyle {
    
    inline def apply(
      addStyle: String => Callback,
      append: /* repeated */ HTMLElement => Callback,
      close: HTMLElement,
      content: HTMLElement,
      hide: Callback,
      host: HTMLElement,
      remove: Callback,
      show: Callback,
      style: HTMLElement
    ): AddStyle = {
      val __obj = js.Dynamic.literal(addStyle = js.Any.fromFunction1((t0: String) => addStyle(t0).runNow()), append = js.Any.fromFunction1((t0: /* repeated */ HTMLElement) => append(t0).runNow()), close = close.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hide = hide.toJsFn, host = host.asInstanceOf[js.Any], remove = remove.toJsFn, show = show.toJsFn, style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddStyle]
    }
    
    extension [Self <: AddStyle](x: Self) {
      
      inline def setAddStyle(value: String => Callback): Self = StObject.set(x, "addStyle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAppend(value: /* repeated */ HTMLElement => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: /* repeated */ HTMLElement) => value(t0).runNow()))
      
      inline def setClose(value: HTMLElement): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setStyle(value: HTMLElement): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    /** An object containing data about the currently running browser */
    var browser: BrowserInfo
    
    /** An object containing data about the currently running platform */
    var platform: PlatformInfo
    
    /** An object containing data about the currently running script */
    var script: ScriptInfo
    
    /**
      * The name of the user script engine handling this script's execution.
      * The string `FireMonkey`
      */
    var scriptHandler: String
    
    /**
      * A string, the entire literal Metadata Block (without the delimiters)
      * for the currently running script
      * In FireMonkey it's always null
      */
    var scriptMetaStr: String | Null
    
    /** The version of FireMonkey, a string e.g. `2.60` */
    var version: String
  }
  object Browser {
    
    inline def apply(
      browser: BrowserInfo,
      platform: PlatformInfo,
      script: ScriptInfo,
      scriptHandler: String,
      version: String
    ): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], scriptMetaStr = null)
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: BrowserInfo): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: PlatformInfo): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setScript(value: ScriptInfo): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptHandler(value: String): Self = StObject.set(x, "scriptHandler", value.asInstanceOf[js.Any])
      
      inline def setScriptMetaStr(value: String): Self = StObject.set(x, "scriptMetaStr", value.asInstanceOf[js.Any])
      
      inline def setScriptMetaStrNull: Self = StObject.set(x, "scriptMetaStr", null)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: js.UndefOr[Blob | String] = js.undefined
    
    var text: String
  }
  object Image {
    
    inline def apply(text: String): Image = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setImage(value: Blob | String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait Modal extends StObject {
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[
        center | `slide-left` | `slide-right` | `slide-top` | `slide-bottom` | `panel-left` | `panel-right` | `panel-top` | `panel-bottom`
      ] = js.undefined
  }
  object Modal {
    
    inline def apply(): Modal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modal]
    }
    
    extension [Self <: Modal](x: Self) {
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setType(
        value: center | `slide-left` | `slide-right` | `slide-top` | `slide-bottom` | `panel-left` | `panel-right` | `panel-top` | `panel-bottom`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
