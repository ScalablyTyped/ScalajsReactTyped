package typingsJapgolly.cypress.mochaMod

import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.cypress.Mocha.MochaOptions
import typingsJapgolly.cypress.Mocha.Stats
import typingsJapgolly.cypress.Mocha.Suite
import typingsJapgolly.cypress.Mocha.Test
import typingsJapgolly.cypress.Mocha.reporters.Base_.ColorMap
import typingsJapgolly.cypress.Mocha.reporters.Base_.SymbolMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSImport("mocha", "reporters.Base")
  @js.native
  open class Base_ protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(runner: typingsJapgolly.cypress.Mocha.Runner, options: MochaOptions) = this()
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
    /**
      * Test run statistics
      */
    /* CompleteClass */
    var stats: Stats = js.native
  }
  object Base_ {
    
    @JSImport("mocha", "reporters.Base")
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
    @JSImport("mocha", "reporters.Base.colors")
    @js.native
    val colors: ColorMap = js.native
    
    /**
      * ANSI TTY control sequences common among reporters.
      *
      * @see https://mochajs.org/api/module-base#.cursor
      */
    object cursor {
      
      @JSImport("mocha", "reporters.Base.cursor")
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
    @JSImport("mocha", "reporters.Base.inlineDiffs")
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
    @JSImport("mocha", "reporters.Base.symbols")
    @js.native
    val symbols: SymbolMap = js.native
    
    /**
      * Enables coloring by default
      *
      * @see https://mochajs.org/api/module-base#.useColors
      */
    @JSImport("mocha", "reporters.Base.useColors")
    @js.native
    def useColors: Boolean = js.native
    inline def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
    
    /**
      * Expose terminal window size
      *
      * @see https://mochajs.org/api/module-base#.window
      */
    object window {
      
      @JSImport("mocha", "reporters.Base.window")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mocha", "reporters.Base.window.width")
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
  @JSImport("mocha", "reporters.Doc")
  @js.native
  open class Doc_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Dot")
  @js.native
  open class Dot_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.HTML")
  @js.native
  open class HTML_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.HTML_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.JSONStream")
  @js.native
  open class JSONStream ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.JSON")
  @js.native
  open class JSON_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Landing")
  @js.native
  open class Landing_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.List")
  @js.native
  open class List_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Markdown")
  @js.native
  open class Markdown_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Min")
  @js.native
  open class Min ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Nyan")
  @js.native
  open class Nyan_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Nyan_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Progress")
  @js.native
  open class Progress_ protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(
      runner: typingsJapgolly.cypress.Mocha.Runner,
      options: typingsJapgolly.cypress.Mocha.reporters.Progress_.MochaOptions
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.Spec")
  @js.native
  open class Spec_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.TAP")
  @js.native
  open class TAP_ ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.XUnit")
  @js.native
  open class XUnit_ protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.XUnit_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(
      runner: typingsJapgolly.cypress.Mocha.Runner,
      options: typingsJapgolly.cypress.Mocha.reporters.XUnit_.MochaOptions
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.base")
  @js.native
  open class base protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(runner: typingsJapgolly.cypress.Mocha.Runner, options: MochaOptions) = this()
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
    /**
      * Test run statistics
      */
    /* CompleteClass */
    var stats: Stats = js.native
  }
  /* was `typeof Base` */
  object base {
    
    @JSImport("mocha", "reporters.base")
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
    @JSImport("mocha", "reporters.base.colors")
    @js.native
    val colors: ColorMap = js.native
    
    /**
      * ANSI TTY control sequences common among reporters.
      *
      * @see https://mochajs.org/api/module-base#.cursor
      */
    object cursor {
      
      @JSImport("mocha", "reporters.base.cursor")
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
    @JSImport("mocha", "reporters.base.inlineDiffs")
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
    @JSImport("mocha", "reporters.base.symbols")
    @js.native
    val symbols: SymbolMap = js.native
    
    /**
      * Enables coloring by default
      *
      * @see https://mochajs.org/api/module-base#.useColors
      */
    @JSImport("mocha", "reporters.base.useColors")
    @js.native
    def useColors: Boolean = js.native
    inline def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
    
    /**
      * Expose terminal window size
      *
      * @see https://mochajs.org/api/module-base#.window
      */
    object window {
      
      @JSImport("mocha", "reporters.base.window")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mocha", "reporters.base.window.width")
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
  @JSImport("mocha", "reporters.doc")
  @js.native
  open class doc ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.dot")
  @js.native
  open class dot ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.html")
  @js.native
  open class html ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.HTML_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.json")
  @js.native
  open class json ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.landing")
  @js.native
  open class landing ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.list")
  @js.native
  open class list ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.markdown")
  @js.native
  open class markdown ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.nyan")
  @js.native
  open class nyan ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Nyan_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.progress")
  @js.native
  open class progress protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(
      runner: typingsJapgolly.cypress.Mocha.Runner,
      options: typingsJapgolly.cypress.Mocha.reporters.Progress_.MochaOptions
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.spec")
  @js.native
  open class spec ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.tap")
  @js.native
  open class tap ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.Base_ {
    
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
  @JSImport("mocha", "reporters.xunit")
  @js.native
  open class xunit protected ()
    extends StObject
       with typingsJapgolly.cypress.Mocha.reporters.XUnit_ {
    def this(runner: typingsJapgolly.cypress.Mocha.Runner) = this()
    def this(
      runner: typingsJapgolly.cypress.Mocha.Runner,
      options: typingsJapgolly.cypress.Mocha.reporters.XUnit_.MochaOptions
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
    var runner: typingsJapgolly.cypress.Mocha.Runner = js.native
    
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
