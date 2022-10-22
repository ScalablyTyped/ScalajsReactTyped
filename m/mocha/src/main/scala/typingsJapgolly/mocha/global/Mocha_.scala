package typingsJapgolly.mocha.global

import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.mocha.Mocha
import typingsJapgolly.mocha.Mocha.AsyncFunc
import typingsJapgolly.mocha.Mocha.Func
import typingsJapgolly.mocha.Mocha.HookFunction
import typingsJapgolly.mocha.Mocha.MochaOptions
import typingsJapgolly.mocha.Mocha.PendingSuiteFunction
import typingsJapgolly.mocha.Mocha.PendingTestFunction
import typingsJapgolly.mocha.Mocha.RunnerConstants
import typingsJapgolly.mocha.Mocha.RunnerOptions
import typingsJapgolly.mocha.Mocha.Stats
import typingsJapgolly.mocha.Mocha.Suite
import typingsJapgolly.mocha.Mocha.SuiteConstants
import typingsJapgolly.mocha.Mocha.SuiteFunction
import typingsJapgolly.mocha.Mocha.Test
import typingsJapgolly.mocha.Mocha.TestFunction
import typingsJapgolly.mocha.Mocha.reporters.Base_.ColorMap
import typingsJapgolly.mocha.Mocha.reporters.Base_.SymbolMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mocha")
@js.native
open class Mocha_ ()
  extends StObject
     with Mocha {
  def this(options: MochaOptions) = this()
}
object Mocha_ {
  
  @JSGlobal("Mocha")
  @js.native
  val ^ : js.Any = js.native
  
  // #endregion Runnable untyped events
  /**
    * Test context
    *
    * @see https://mochajs.org/api/module-Context.html#~Context
    */
  @JSGlobal("Mocha.Context")
  @js.native
  open class Context ()
    extends StObject
       with typingsJapgolly.mocha.Mocha.Context
  
  // #endregion Runner untyped events
  /**
    * Initialize a new `Hook` with the given `title` and callback `fn`
    *
    * @see https://mochajs.org/api/Hook.html
    */
  @JSGlobal("Mocha.Hook")
  @js.native
  open class Hook ()
    extends StObject
       with typingsJapgolly.mocha.Mocha.Hook
  
  // #endregion Runnable "error" event
  // #region Runnable untyped events
  // #region Runnable "error" event
  /**
    * Initialize a new `Runnable` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Runnable.html
    */
  @JSGlobal("Mocha.Runnable")
  @js.native
  open class Runnable protected ()
    extends StObject
       with typingsJapgolly.mocha.Mocha.Runnable {
    def this(title: String) = this()
    def this(title: String, fn: AsyncFunc) = this()
    def this(title: String, fn: Func) = this()
  }
  
  // #endregion Runner "pending" event
  // #region Runner untyped events
  // #endregion Runner "fail" event
  // #region Runner "pending" event
  // #endregion Runner "pass" event
  // #region Runner "fail" event
  // #endregion Runner "hook end" event
  // #region Runner "pass" event
  // #endregion Runner "hook" event
  // #region Runner "hook end" event
  // #endregion Runner "test end" event
  // #region Runner "hook" event
  // #endregion Runner "test" event
  // #region Runner "test end" event
  // #endregion Runner "suite end" event
  // #region Runner "test" event
  // #endregion Runner "suite" event
  // #region Runner "suite end" event
  // #endregion Runner "end" event
  // #region Runner "suite" event
  // #endregion Runner "start" event
  // #region Runner "end" event
  // #endregion Runner "waiting" event
  // #region Runner "start" event
  // #region Runner "waiting" event
  /**
    * Initialize a `Runner` for the given `suite`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html
    */
  @JSGlobal("Mocha.Runner")
  @js.native
  open class Runner protected ()
    extends StObject
       with typingsJapgolly.mocha.Mocha.Runner {
    /**
      * Initialize a `Runner` at the Root Suite, which represents a hierarchy of Suites and Tests.
      *
      * @param suite Root suite
      * @param optionsOrDelay Options. If boolean (deprecated), whether or not to delay execution of root suite until ready.
      */
    def this(suite: Suite) = this()
    def this(suite: Suite, optionsOrDelay: Boolean) = this()
    def this(suite: Suite, optionsOrDelay: RunnerOptions) = this()
  }
  object Runner {
    
    @JSGlobal("Mocha.Runner")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Mocha.Runner.constants")
    @js.native
    val constants: RunnerConstants = js.native
    
    /**
      * Wrapper for setImmediate, process.nextTick, or browser polyfill.
      */
    /* static member */
    inline def immediately(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("immediately")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  // #endregion Suite "post-require" event
  // #region Suite untyped events
  // #endregion Suite "require" event
  // #region Suite "post-require" event
  // #endregion Suite "pre-require" event
  // #region Suite "require" event
  // #endregion Suite "run" event
  // #region Suite "pre-require" event
  // #endregion Suite "test" event
  // #region Suite "run" event
  // #endregion Suite "suite" event
  // #region Suite "test" event
  // #endregion Suite "afterEach" event
  // #region Suite "suite" event
  // #endregion Suite "beforeEach" event
  // #region Suite "afterEach" event
  // #endregion Suite "afterAll" event
  // #region Suite "beforeEach" event
  // #endregion Suite "beforeAll" event
  // #region Suite "afterAll" event
  // #region Suite "beforeAll" event
  /**
    * Initialize a new `Suite` with the given `title` and `ctx`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html
    */
  @JSGlobal("Mocha.Suite")
  @js.native
  open class Suite_ protected ()
    extends StObject
       with Suite {
    def this(title: String) = this()
    def this(title: String, parentContext: typingsJapgolly.mocha.Mocha.Context) = this()
  }
  object Suite_ {
    
    @JSGlobal("Mocha.Suite")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Mocha.Suite.constants")
    @js.native
    val constants: SuiteConstants = js.native
    
    /**
      * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
      * with the same title is already present, that suite is returned to provide
      * nicer reporter and more flexible meta-testing.
      *
      * @see https://mochajs.org/api/mocha#.exports.create
      */
    /* static member */
    inline def create(parent: Suite, title: String): Suite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Suite]
  }
  
  /**
    * Initialize a new `Test` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Test.html
    */
  @JSGlobal("Mocha.Test")
  @js.native
  open class Test_ ()
    extends StObject
       with Test
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSGlobal("Mocha.after")
  @js.native
  def after: HookFunction = js.native
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSGlobal("Mocha.afterEach")
  @js.native
  def afterEach: HookFunction = js.native
  inline def afterEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  inline def after_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSGlobal("Mocha.before")
  @js.native
  def before: HookFunction = js.native
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSGlobal("Mocha.beforeEach")
  @js.native
  def beforeEach: HookFunction = js.native
  inline def beforeEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  inline def before_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.describe")
  @js.native
  def describe: SuiteFunction = js.native
  inline def describe_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  object interfaces {
    
    @JSGlobal("Mocha.interfaces")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bdd(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bdd")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def exports(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def qunit(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("qunit")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def tdd(suite: Suite): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tdd")(suite.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.it")
  @js.native
  def it: TestFunction = js.native
  inline def it_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
  
  // #endregion Test interface augmentations
  object reporters {
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    @JSGlobal("Mocha.reporters.Base")
    @js.native
    open class Base_ protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(runner: typingsJapgolly.mocha.Mocha.Runner, options: MochaOptions) = this()
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    object Base_ {
      
      @JSGlobal("Mocha.reporters.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Color `str` with the given `type` (from `colors`)
        *
        * @see https://mochajs.org/api/module-base#.color
        */
      inline def color(`type`: String, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(`type`.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * Default color map
        *
        * @see https://mochajs.org/api/module-base#.colors
        */
      @JSGlobal("Mocha.reporters.Base.colors")
      @js.native
      val colors: ColorMap = js.native
      
      /**
        * ANSI TTY control sequences common among reporters.
        *
        * @see https://mochajs.org/api/module-base#.cursor
        */
      object cursor {
        
        @JSGlobal("Mocha.reporters.Base.cursor")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Clears the line and moves to the beginning of the line.
          */
        inline def CR(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CR")().asInstanceOf[Unit]
        
        /**
          * Moves to the beginning of the line
          */
        inline def beginningOfLine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beginningOfLine")().asInstanceOf[Unit]
        
        /**
          * Deletes the current line
          */
        inline def deleteLine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLine")().asInstanceOf[Unit]
        
        /**
          * Hides the cursor
          */
        inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
        
        /**
          * Shows the cursor
          */
        inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
      }
      
      /**
        * Returns a diff between two strings with colored ANSI output.
        *
        * @see https://mochajs.org/api/module-base#.generateDiff
        */
      inline def generateDiff(actual: String, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDiff")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * Inline diffs instead of +/-
        *
        * @see https://mochajs.org/api/module-base#.inlineDiffs
        */
      @JSGlobal("Mocha.reporters.Base.inlineDiffs")
      @js.native
      def inlineDiffs: Boolean = js.native
      inline def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
      
      /**
        * Output the given `failures` as a list.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
        */
      inline def list(failures: js.Array[Test]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(failures.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Default symbol map
        *
        * @see https://mochajs.org/api/module-base#.symbols
        */
      @JSGlobal("Mocha.reporters.Base.symbols")
      @js.native
      val symbols: SymbolMap = js.native
      
      /**
        * Enables coloring by default
        *
        * @see https://mochajs.org/api/module-base#.useColors
        */
      @JSGlobal("Mocha.reporters.Base.useColors")
      @js.native
      def useColors: Boolean = js.native
      inline def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
      
      /**
        * Expose terminal window size
        *
        * @see https://mochajs.org/api/module-base#.window
        */
      object window {
        
        @JSGlobal("Mocha.reporters.Base.window")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Mocha.reporters.Base.window.width")
        @js.native
        def width: Double = js.native
        inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    @JSGlobal("Mocha.reporters.Doc")
    @js.native
    open class Doc_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    @JSGlobal("Mocha.reporters.Dot")
    @js.native
    open class Dot_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    @JSGlobal("Mocha.reporters.HTML")
    @js.native
    open class HTML_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.HTML_ {
      
      /**
        * Adds code toggle functionality for the provided test's list element.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
        */
      /* CompleteClass */
      override def addCodeToggle(el: HTMLLIElement, contents: String): Unit = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /**
        * Provide suite URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
        */
      /* CompleteClass */
      override def suiteURL(suite: Suite): String = js.native
      
      /**
        * Provide test URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
        */
      /* CompleteClass */
      override def testURL(test: Test): String = js.native
    }
    
    /**
      * Initialize a new `JSONStream` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
      */
    @JSGlobal("Mocha.reporters.JSONStream")
    @js.native
    open class JSONStream ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    @JSGlobal("Mocha.reporters.JSON")
    @js.native
    open class JSON_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    @JSGlobal("Mocha.reporters.Landing")
    @js.native
    open class Landing_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    @JSGlobal("Mocha.reporters.List")
    @js.native
    open class List_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    @JSGlobal("Mocha.reporters.Markdown")
    @js.native
    open class Markdown_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Min` minimal test reporter (best used with --watch).
      *
      * @see https://mochajs.org/api/Mocha.reporters.Min.html
      */
    @JSGlobal("Mocha.reporters.Min")
    @js.native
    open class Min ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    @JSGlobal("Mocha.reporters.Nyan")
    @js.native
    open class Nyan_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Nyan_ {
      
      /* private */ /* CompleteClass */
      var appendRainbow: Any = js.native
      
      /* private */ /* CompleteClass */
      var colorIndex: Any = js.native
      
      /* private */ /* CompleteClass */
      var cursorDown: Any = js.native
      
      /* private */ /* CompleteClass */
      var cursorUp: Any = js.native
      
      /* private */ /* CompleteClass */
      var draw: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawNyanCat: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawRainbow: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawScoreboard: Any = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /* private */ /* CompleteClass */
      var face: Any = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /* private */ /* CompleteClass */
      var generateColors: Any = js.native
      
      /* private */ /* CompleteClass */
      var numberOfLines: Any = js.native
      
      /* private */ /* CompleteClass */
      var rainbowColors: Any = js.native
      
      /* private */ /* CompleteClass */
      var rainbowify: Any = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /* private */ /* CompleteClass */
      var scoreboardWidth: Any = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /* private */ /* CompleteClass */
      var tick: Any = js.native
      
      /* private */ /* CompleteClass */
      var trajectories: Any = js.native
      
      /* private */ /* CompleteClass */
      var trajectoryWidthMax: Any = js.native
    }
    
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    @JSGlobal("Mocha.reporters.Progress")
    @js.native
    open class Progress_ protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsJapgolly.mocha.Mocha.Runner,
        options: typingsJapgolly.mocha.Mocha.reporters.Progress_.MochaOptions
      ) = this()
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    @JSGlobal("Mocha.reporters.Spec")
    @js.native
    open class Spec_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    @JSGlobal("Mocha.reporters.TAP")
    @js.native
    open class TAP_ ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    @JSGlobal("Mocha.reporters.XUnit")
    @js.native
    open class XUnit_ protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.XUnit_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsJapgolly.mocha.Mocha.Runner,
        options: typingsJapgolly.mocha.Mocha.reporters.XUnit_.MochaOptions
      ) = this()
      
      /**
        * Override done to close the stream (if it's a file).
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
        */
      /* CompleteClass */
      @JSName("done")
      override def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /**
        * Output tag for the given `test.`
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
        */
      /* CompleteClass */
      override def test(test: Test): Unit = js.native
      
      /**
        * Write out the given line.
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
        */
      /* CompleteClass */
      override def write(line: String): Unit = js.native
    }
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    /* was `typeof Base` */
    @JSGlobal("Mocha.reporters.base")
    @js.native
    open class base protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(runner: typingsJapgolly.mocha.Mocha.Runner, options: MochaOptions) = this()
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    /* was `typeof Base` */
    object base {
      
      @JSGlobal("Mocha.reporters.base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Color `str` with the given `type` (from `colors`)
        *
        * @see https://mochajs.org/api/module-base#.color
        */
      inline def color(`type`: String, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(`type`.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * Default color map
        *
        * @see https://mochajs.org/api/module-base#.colors
        */
      @JSGlobal("Mocha.reporters.base.colors")
      @js.native
      val colors: ColorMap = js.native
      
      /**
        * ANSI TTY control sequences common among reporters.
        *
        * @see https://mochajs.org/api/module-base#.cursor
        */
      object cursor {
        
        @JSGlobal("Mocha.reporters.base.cursor")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Clears the line and moves to the beginning of the line.
          */
        inline def CR(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CR")().asInstanceOf[Unit]
        
        /**
          * Moves to the beginning of the line
          */
        inline def beginningOfLine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beginningOfLine")().asInstanceOf[Unit]
        
        /**
          * Deletes the current line
          */
        inline def deleteLine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLine")().asInstanceOf[Unit]
        
        /**
          * Hides the cursor
          */
        inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
        
        /**
          * Shows the cursor
          */
        inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
      }
      
      /**
        * Returns a diff between two strings with colored ANSI output.
        *
        * @see https://mochajs.org/api/module-base#.generateDiff
        */
      inline def generateDiff(actual: String, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDiff")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * Inline diffs instead of +/-
        *
        * @see https://mochajs.org/api/module-base#.inlineDiffs
        */
      @JSGlobal("Mocha.reporters.base.inlineDiffs")
      @js.native
      def inlineDiffs: Boolean = js.native
      inline def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
      
      /**
        * Output the given `failures` as a list.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
        */
      inline def list(failures: js.Array[Test]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(failures.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Default symbol map
        *
        * @see https://mochajs.org/api/module-base#.symbols
        */
      @JSGlobal("Mocha.reporters.base.symbols")
      @js.native
      val symbols: SymbolMap = js.native
      
      /**
        * Enables coloring by default
        *
        * @see https://mochajs.org/api/module-base#.useColors
        */
      @JSGlobal("Mocha.reporters.base.useColors")
      @js.native
      def useColors: Boolean = js.native
      inline def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
      
      /**
        * Expose terminal window size
        *
        * @see https://mochajs.org/api/module-base#.window
        */
      object window {
        
        @JSGlobal("Mocha.reporters.base.window")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Mocha.reporters.base.window.width")
        @js.native
        def width: Double = js.native
        inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    /* was `typeof Doc` */
    @JSGlobal("Mocha.reporters.doc")
    @js.native
    open class doc ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    /* was `typeof Dot` */
    @JSGlobal("Mocha.reporters.dot")
    @js.native
    open class dot ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    /* was `typeof HTML` */
    @JSGlobal("Mocha.reporters.html")
    @js.native
    open class html ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.HTML_ {
      
      /**
        * Adds code toggle functionality for the provided test's list element.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
        */
      /* CompleteClass */
      override def addCodeToggle(el: HTMLLIElement, contents: String): Unit = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /**
        * Provide suite URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
        */
      /* CompleteClass */
      override def suiteURL(suite: Suite): String = js.native
      
      /**
        * Provide test URL.
        *
        * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
        */
      /* CompleteClass */
      override def testURL(test: Test): String = js.native
    }
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    /* was `typeof JSON` */
    @JSGlobal("Mocha.reporters.json")
    @js.native
    open class json ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    /* was `typeof Landing` */
    @JSGlobal("Mocha.reporters.landing")
    @js.native
    open class landing ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    /* was `typeof List` */
    @JSGlobal("Mocha.reporters.list")
    @js.native
    open class list ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    /* was `typeof Markdown` */
    @JSGlobal("Mocha.reporters.markdown")
    @js.native
    open class markdown ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    /* was `typeof Nyan` */
    @JSGlobal("Mocha.reporters.nyan")
    @js.native
    open class nyan ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Nyan_ {
      
      /* private */ /* CompleteClass */
      var appendRainbow: Any = js.native
      
      /* private */ /* CompleteClass */
      var colorIndex: Any = js.native
      
      /* private */ /* CompleteClass */
      var cursorDown: Any = js.native
      
      /* private */ /* CompleteClass */
      var cursorUp: Any = js.native
      
      /* private */ /* CompleteClass */
      var draw: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawNyanCat: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawRainbow: Any = js.native
      
      /* private */ /* CompleteClass */
      var drawScoreboard: Any = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /* private */ /* CompleteClass */
      var face: Any = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /* private */ /* CompleteClass */
      var generateColors: Any = js.native
      
      /* private */ /* CompleteClass */
      var numberOfLines: Any = js.native
      
      /* private */ /* CompleteClass */
      var rainbowColors: Any = js.native
      
      /* private */ /* CompleteClass */
      var rainbowify: Any = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /* private */ /* CompleteClass */
      var scoreboardWidth: Any = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /* private */ /* CompleteClass */
      var tick: Any = js.native
      
      /* private */ /* CompleteClass */
      var trajectories: Any = js.native
      
      /* private */ /* CompleteClass */
      var trajectoryWidthMax: Any = js.native
    }
    
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    /* was `typeof Progress` */
    @JSGlobal("Mocha.reporters.progress")
    @js.native
    open class progress protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsJapgolly.mocha.Mocha.Runner,
        options: typingsJapgolly.mocha.Mocha.reporters.Progress_.MochaOptions
      ) = this()
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    /* was `typeof Spec` */
    @JSGlobal("Mocha.reporters.spec")
    @js.native
    open class spec ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    /* was `typeof TAP` */
    @JSGlobal("Mocha.reporters.tap")
    @js.native
    open class tap ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.Base_ {
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
    }
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    /* was `typeof XUnit` */
    @JSGlobal("Mocha.reporters.xunit")
    @js.native
    open class xunit protected ()
      extends StObject
         with typingsJapgolly.mocha.Mocha.reporters.XUnit_ {
      def this(runner: typingsJapgolly.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsJapgolly.mocha.Mocha.Runner,
        options: typingsJapgolly.mocha.Mocha.reporters.XUnit_.MochaOptions
      ) = this()
      
      /**
        * Override done to close the stream (if it's a file).
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
        */
      /* CompleteClass */
      @JSName("done")
      override def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit = js.native
      
      /**
        * Output common epilogue used by many of the bundled reporters.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
        */
      /* CompleteClass */
      override def epilogue(): Unit = js.native
      
      /**
        * Test failures
        */
      /* CompleteClass */
      var failures: js.Array[Test] = js.native
      
      /**
        * The configured runner
        */
      /* CompleteClass */
      var runner: typingsJapgolly.mocha.Mocha.Runner = js.native
      
      /**
        * Test run statistics
        */
      /* CompleteClass */
      var stats: Stats = js.native
      
      /**
        * Output tag for the given `test.`
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
        */
      /* CompleteClass */
      override def test(test: Test): Unit = js.native
      
      /**
        * Write out the given line.
        *
        * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
        */
      /* CompleteClass */
      override def write(line: String): Unit = js.native
    }
  }
  
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  inline def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSGlobal("Mocha.setup")
  @js.native
  def setup: HookFunction = js.native
  inline def setup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.suite")
  @js.native
  def suite: SuiteFunction = js.native
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSGlobal("Mocha.suiteSetup")
  @js.native
  def suiteSetup: HookFunction = js.native
  inline def suiteSetup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSGlobal("Mocha.suiteTeardown")
  @js.native
  def suiteTeardown: HookFunction = js.native
  inline def suiteTeardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  inline def suite_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSGlobal("Mocha.teardown")
  @js.native
  def teardown: HookFunction = js.native
  inline def teardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.test")
  @js.native
  def test: TestFunction = js.native
  inline def test_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  
  object utils {
    
    @JSGlobal("Mocha.utils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return a new Thing that has the keys in sorted order. Recursive.
      *
      * If the Thing...
      * - has already been seen, return string `'[Circular]'`
      * - is `undefined`, return string `'[undefined]'`
      * - is `null`, return value `null`
      * - is some other primitive, return the value
      * - is not a primitive or an `Array`, `Object`, or `Function`, return the value of the Thing's `toString()` method
      * - is a non-empty `Array`, `Object`, or `Function`, return the result of calling this function again.
      * - is an empty `Array`, `Object`, or `Function`, returns `'[]'`, `'{}'`, or `'[Function]'` respectively.
      *
      * @see https://mochajs.org/api/module-utils.html#.canonicalize
      */
    inline def canonicalize(value: Any, stack: js.Array[Any], typeHint: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("canonicalize")(value.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], typeHint.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Strip the function definition from `str`, and re-indent for pre whitespace.
      *
      * @see https://mochajs.org/api/module-utils.html#.clean
      */
    inline def clean(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate an undefined error if `err` is not defined.
      *
      * @see https://mochajs.org/api/module-utils.html#.getError
      */
    inline def getError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")().asInstanceOf[js.Error]
    inline def getError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    /**
      * Highlight the given string of `js`.
      */
    inline def highlight(js_ : String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(js_.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Compute a slug from the given `str`.
      *
      * @see https://mochajs.org/api/module-utils.html#.slug
      */
    inline def slug(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slug")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * When invoking this function you get a filter function that get the Error.stack as an
      * input, and return a prettify output. (i.e: strip Mocha and internal node functions from
      * stack trace).
      *
      * @see https://mochajs.org/api/module-utils.html#.stackTraceFilter
      */
    inline def stackTraceFilter(): js.Function1[/* stack */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTraceFilter")().asInstanceOf[js.Function1[/* stack */ String, String]]
    
    /**
      * Stringify `value`. Different behavior depending on type of value:
      *
      * - If `value` is undefined or null, return `'[undefined]'` or `'[null]'`, respectively.
      * - If `value` is not an object, function or array, return result of `value.toString()` wrapped in double-quotes.
      * - If `value` is an *empty* object, function, or array, returns `'{}'`, `'[Function]'`, or `'[]'` respectively.
      * - If `value` has properties, call canonicalize} on it, then return result of `JSON.stringify()`
      *
      * @see https://mochajs.org/api/module-utils.html#.stringify
      */
    inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Takes some variable and asks `Object.prototype.toString()` what it thinks it is.
      */
    inline def `type`(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate an undefined error with a message warning the user.
      *
      * @see https://mochajs.org/api/module-utils.html#.undefinedError
      */
    inline def undefinedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("undefinedError")().asInstanceOf[js.Error]
  }
  
  /**
    * Describe a pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.xdescribe")
  @js.native
  def xdescribe: PendingSuiteFunction = js.native
  inline def xdescribe_=(x: PendingSuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.xit")
  @js.native
  def xit: PendingTestFunction = js.native
  inline def xit_=(x: PendingTestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
}
