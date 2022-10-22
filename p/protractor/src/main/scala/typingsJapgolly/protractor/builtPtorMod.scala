package typingsJapgolly.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.protractor.anon.Chrome
import typingsJapgolly.protractor.anon.TypeofCapabilities
import typingsJapgolly.protractor.anon.TypeofWebDriver
import typingsJapgolly.protractor.anon.TypeofWebElement
import typingsJapgolly.protractor.anon.Typeoferror
import typingsJapgolly.protractor.anon.Typeoflogging
import typingsJapgolly.protractor.anon.Typeofpromise
import typingsJapgolly.protractor.anon.Typeofuntil
import typingsJapgolly.protractor.builtBrowserMod.ElementHelper
import typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser
import typingsJapgolly.protractor.builtElementMod.ElementArrayFinder
import typingsJapgolly.protractor.builtElementMod.ElementFinder
import typingsJapgolly.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions
import typingsJapgolly.protractor.builtLocatorsMod.Locator
import typingsJapgolly.protractor.builtLocatorsMod.ProtractorBy
import typingsJapgolly.seleniumWebdriver.httpMod.Executor
import typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtPtorMod {
  
  @JSImport("protractor/built/ptor", "Ptor")
  @js.native
  open class Ptor () extends StObject {
    
    @JSName("$")
    def $(search: String): ElementFinder = js.native
    
    var ActionSequence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webdriver.ActionSequence */ Any = js.native
    
    var Browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IBrowser */ Any = js.native
    
    var Builder: Instantiable0[typingsJapgolly.seleniumWebdriver.mod.Builder] = js.native
    
    var Button: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IButton */ Any = js.native
    
    var By: ProtractorBy = js.native
    
    var Capabilities: TypeofCapabilities = js.native
    
    var Capability: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.ICapability */ Any = js.native
    
    var Command: Any = js.native
    
    var CommandName: Any = js.native
    
    @JSName("$$")
    def DollarDollar(search: String): ElementArrayFinder = js.native
    
    var ElementArrayFinder: Any = js.native
    
    var ElementFinder: Any = js.native
    
    var EventEmitter: Instantiable0[typingsJapgolly.seleniumWebdriver.mod.EventEmitter] = js.native
    
    var ExpectedConditions: ProtractorExpectedConditions = js.native
    
    var FileDetector: Instantiable0[typingsJapgolly.seleniumWebdriver.mod.FileDetector] = js.native
    
    var Key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IKey */ Any = js.native
    
    var ProtractorBrowser: Any = js.native
    
    var ProtractorBy: Any = js.native
    
    var ProtractorExpectedConditions: Any = js.native
    
    var Session: Instantiable2[
        /* id */ String, 
        /* capabilities */ Capabilities, 
        typingsJapgolly.seleniumWebdriver.mod.Session
      ] = js.native
    
    var WebDriver: TypeofWebDriver = js.native
    
    var WebElement: TypeofWebElement = js.native
    
    var WebElementPromise: Instantiable2[
        /* driver */ WebDriver, 
        /* el */ js.Promise[WebElement], 
        typingsJapgolly.seleniumWebdriver.mod.WebElementPromise
      ] = js.native
    
    var browser: ProtractorBrowser = js.native
    
    var by: ProtractorBy = js.native
    
    def element(locator: Locator): ElementFinder = js.native
    @JSName("element")
    var element_Original: ElementHelper = js.native
    
    var error: Typeoferror = js.native
    
    var logging: Typeoflogging = js.native
    
    var promise: Typeofpromise = js.native
    
    var until: Typeofuntil = js.native
    
    var utils: Chrome = js.native
    
    def wrapDriver(webdriver: WebDriver): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: Unit, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: Unit, rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: Unit, rootElement: String, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: Unit, rootElement: Unit, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
  }
  
  object protractor extends Shortcut {
    
    @JSImport("protractor/built/ptor", "protractor")
    @js.native
    val ^ : Ptor = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Builder")
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    open class Builder ()
      extends typingsJapgolly.seleniumWebdriver.mod.Builder
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Capabilities")
    @js.native
    // region Constructors
    /**
      * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
      *     capabilities to initialize this instance from.
      */
    open class Capabilities ()
      extends typingsJapgolly.seleniumWebdriver.mod.Capabilities
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.EventEmitter")
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    open class EventEmitter ()
      extends typingsJapgolly.seleniumWebdriver.mod.EventEmitter
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.FileDetector")
    @js.native
    /** @constructor */
    open class FileDetector ()
      extends typingsJapgolly.seleniumWebdriver.mod.FileDetector
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Session")
    @js.native
    open class Session protected ()
      extends typingsJapgolly.seleniumWebdriver.mod.Session {
      // region Constructors
      /**
        * @param {string} id The session ID.
        * @param {!(Object|Capabilities)} capabilities The session
        *     capabilities.
        * @constructor
        */
      def this(id: String, capabilities: typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebDriver")
    @js.native
    open class WebDriver protected ()
      extends typingsJapgolly.seleniumWebdriver.mod.WebDriver {
      // region Constructors
      /**
        * @param {!(Session|Promise<!Session>)} session Either a
        *     known session or a promise that will be resolved to a session.
        * @param {!command.Executor} executor The executor to use when sending
        *     commands to the browser.
        */
      def this(session: typingsJapgolly.seleniumWebdriver.mod.Session, executor: Executor) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebElement")
    @js.native
    open class WebElement protected ()
      extends typingsJapgolly.seleniumWebdriver.mod.WebElement {
      /**
        * @param {!WebDriver} driver the parent WebDriver instance for this element.
        * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
        *     the underlying DOM element.
        */
      def this(driver: typingsJapgolly.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebElementPromise")
    @js.native
    open class WebElementPromise protected ()
      extends typingsJapgolly.seleniumWebdriver.mod.WebElementPromise {
      /**
        * @param {!WebDriver} driver The parent WebDriver instance for this
        *     element.
        * @param {!Promise<!WebElement>} el A promise
        *     that will resolve to the promised element.
        */
      def this(
        driver: typingsJapgolly.seleniumWebdriver.mod.WebDriver,
        el: js.Promise[typingsJapgolly.seleniumWebdriver.mod.WebElement]
      ) = this()
    }
    
    type _To = Ptor
    
    /* This means you don't have to write `^`, but can instead just say `protractor.foo` */
    override def _to: Ptor = ^
  }
}
