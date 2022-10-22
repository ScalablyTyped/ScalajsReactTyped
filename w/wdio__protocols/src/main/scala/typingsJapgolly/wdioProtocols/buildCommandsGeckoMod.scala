package typingsJapgolly.wdioProtocols

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGeckoMod {
  
  trait GeckoCommands extends StObject {
    
    /**
      * Gecko Protocol Command
      *
      * Captures a screenshot of the entire page.
      * @ref https://phabricator.services.mozilla.com/source/mozilla-central/browse/default/testing/geckodriver/src/command.rs$43-46
      *
      */
    def fullPageScreenshot(): String
    
    /**
      * Gecko Protocol Command
      *
      * Get the context that is currently in effect, e.g. `CHROME` or `CONTENT`.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L615-L622
      *
      * @example
      * ```js
      * console.log(await browser.getMozContext()); // outputs: 'CHROME'
      * ```
      */
    def getMozContext(): String
    
    /**
      * Gecko Protocol Command
      *
      * Installs a new addon with the current session. This function will return an ID that may later be used to uninstall the addon using `uninstallAddon`.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L647-L668
      *
      * @example
      * ```js
      * // Create a buffer of the add on .zip file
      * const extension = await fs.promises.readFile('/path/to/extension.zip')
      * // Load extension in Firefox
      * const id = await browser.installAddOn(extension.toString('base64'), false);
      * ```
      */
    def installAddOn(addon: String, temporary: Boolean): String
    
    /**
      * Gecko Protocol Command
      *
      * Changes target context for commands between chrome- and content.<br /><br />Changing the current context has a stateful impact on all subsequent commands. The `CONTENT` context has normal web platform document permissions, as if you would evaluate arbitrary JavaScript. The `CHROME` context gets elevated permissions that lets you manipulate the browser chrome itself, with full access to the XUL toolkit.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L615-L645
      *
      * @example
      * ```js
      * console.log(await browser.getMozContext()); // outputs: 'CHROME'
      * browser.setMozContext('CONTENT');
      * console.log(await browser.getMozContext()); // outputs: 'CONTENT'
      * ```
      */
    def setMozContext(context: String): Unit
    
    /**
      * Gecko Protocol Command
      *
      * Uninstalls an addon from the current browser session's profile.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L670-L687
      *
      * @example
      * ```js
      * // Create a buffer of the add on .zip file
      * const extension = await fs.promises.readFile('/path/to/extension.zip')
      * // Load extension in Firefox
      * const id = await browser.installAddOn(extension.toString('base64'), false);
      * // ...
      * await browser.uninstallAddOn(id)
      * ```
      */
    def uninstallAddOn(id: String): Unit
  }
  object GeckoCommands {
    
    inline def apply(
      fullPageScreenshot: CallbackTo[String],
      getMozContext: CallbackTo[String],
      installAddOn: (String, Boolean) => String,
      setMozContext: String => Callback,
      uninstallAddOn: String => Callback
    ): GeckoCommands = {
      val __obj = js.Dynamic.literal(fullPageScreenshot = fullPageScreenshot.toJsFn, getMozContext = getMozContext.toJsFn, installAddOn = js.Any.fromFunction2(installAddOn), setMozContext = js.Any.fromFunction1((t0: String) => setMozContext(t0).runNow()), uninstallAddOn = js.Any.fromFunction1((t0: String) => uninstallAddOn(t0).runNow()))
      __obj.asInstanceOf[GeckoCommands]
    }
    
    extension [Self <: GeckoCommands](x: Self) {
      
      inline def setFullPageScreenshot(value: CallbackTo[String]): Self = StObject.set(x, "fullPageScreenshot", value.toJsFn)
      
      inline def setGetMozContext(value: CallbackTo[String]): Self = StObject.set(x, "getMozContext", value.toJsFn)
      
      inline def setInstallAddOn(value: (String, Boolean) => String): Self = StObject.set(x, "installAddOn", js.Any.fromFunction2(value))
      
      inline def setSetMozContext(value: String => Callback): Self = StObject.set(x, "setMozContext", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUninstallAddOn(value: String => Callback): Self = StObject.set(x, "uninstallAddOn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
