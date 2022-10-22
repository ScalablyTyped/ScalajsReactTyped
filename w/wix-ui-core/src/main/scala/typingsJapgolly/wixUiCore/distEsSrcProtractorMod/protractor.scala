package typingsJapgolly.wixUiCore.distEsSrcProtractorMod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.seleniumWebdriver.httpMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protractor extends Shortcut {
  
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor")
  @js.native
  val ^ : typingsJapgolly.protractor.builtPtorMod.Ptor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.Builder")
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  open class BuilderCls ()
    extends typingsJapgolly.seleniumWebdriver.mod.Builder
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.Capabilities")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  open class CapabilitiesCls ()
    extends typingsJapgolly.seleniumWebdriver.mod.Capabilities
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.EventEmitter")
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  open class EventEmitterCls ()
    extends typingsJapgolly.seleniumWebdriver.mod.EventEmitter
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.FileDetector")
  @js.native
  /** @constructor */
  open class FileDetectorCls ()
    extends typingsJapgolly.seleniumWebdriver.mod.FileDetector
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.Session")
  @js.native
  open class SessionCls protected ()
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.WebDriver")
  @js.native
  open class WebDriverCls protected ()
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.WebElement")
  @js.native
  open class WebElementCls protected ()
    extends typingsJapgolly.seleniumWebdriver.mod.WebElement {
    /**
      * @param {!WebDriver} driver the parent WebDriver instance for this element.
      * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
      *     the underlying DOM element.
      */
    def this(driver: typingsJapgolly.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("wix-ui-core/dist/es/src/protractor", "protractor.WebElementPromise")
  @js.native
  open class WebElementPromiseCls protected ()
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
  
  type _To = typingsJapgolly.protractor.builtPtorMod.Ptor
  
  /* This means you don't have to write `^`, but can instead just say `protractor.foo` */
  override def _to: typingsJapgolly.protractor.builtPtorMod.Ptor = ^
}
