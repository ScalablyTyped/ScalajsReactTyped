package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryAjaxfile.Mocha.IRunner
import typingsJapgolly.jqueryAjaxfile.anon.Failures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mocha extends StObject {
  
  def addFile(file: String): Mocha = js.native
  
  def asyncOnly(value: Boolean): Mocha = js.native
  
  def bail(): Mocha = js.native
  def bail(value: Boolean): Mocha = js.native
  
  def checkLeaks(): Mocha = js.native
  
  def enableTimeouts(value: Boolean): Mocha = js.native
  
  def globals(value: String): Mocha = js.native
  def globals(values: js.Array[String]): Mocha = js.native
  
  def grep(value: String): Mocha = js.native
  def grep(value: js.RegExp): Mocha = js.native
  
  /** Enables growl support. */
  def growl(): Mocha = js.native
  
  def ignoreLeaks(value: Boolean): Mocha = js.native
  
  def invert(): Mocha = js.native
  
  def noHighlighting(value: Boolean): Mocha = js.native
  
  /** Sets reporter by name, defaults to "spec". */
  def reporter(name: String): Mocha = js.native
  /** Sets reporter constructor, defaults to mocha.reporters.Spec. */
  def reporter(reporter: js.Function2[/* runner */ IRunner, /* options */ Any, Any]): Mocha = js.native
  
  /** Runs tests and invokes `onComplete()` when finished. */
  def run(): IRunner = js.native
  def run(onComplete: js.Function1[/* failures */ Double, Unit]): IRunner = js.native
  
  /** Setup mocha with the given options. */
  def setup(options: MochaSetupOptions): Mocha = js.native
  
  def slow(value: Double): Mocha = js.native
  
  def timeout(value: Double): Mocha = js.native
  
  def ui(value: String): Mocha = js.native
  
  def useColors(value: Boolean): Mocha = js.native
  
  def useInlineDiffs(value: Boolean): Mocha = js.native
}
// merge the Mocha class declaration with a module
object Mocha {
  
  @js.native
  trait IContextDefinition extends StObject {
    
    def apply(description: String, spec: js.Function0[Unit]): ISuite = js.native
    
    def only(description: String, spec: js.Function0[Unit]): ISuite = js.native
    
    def skip(description: String, spec: js.Function0[Unit]): Unit = js.native
    
    def timeout(ms: Double): Unit = js.native
  }
  
  /** Partial interface for Mocha's `Runnable` class. */
  trait IRunnable extends StObject {
    
    var async: Boolean
    
    var fn: js.Function
    
    var sync: Boolean
    
    var timedOut: Boolean
    
    var title: String
  }
  object IRunnable {
    
    inline def apply(async: Boolean, fn: js.Function, sync: Boolean, timedOut: Boolean, title: String): IRunnable = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRunnable]
    }
    
    extension [Self <: IRunnable](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** Partial interface for Mocha's `Runner` class. */
  trait IRunner extends StObject
  
  /** Partial interface for Mocha's `Suite` class. */
  trait ISuite extends StObject {
    
    def fullTitle(): String
    
    var parent: ISuite
    
    var title: String
  }
  object ISuite {
    
    inline def apply(fullTitle: CallbackTo[String], parent: ISuite, title: String): ISuite = {
      val __obj = js.Dynamic.literal(fullTitle = fullTitle.toJsFn, parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuite]
    }
    
    extension [Self <: ISuite](x: Self) {
      
      inline def setFullTitle(value: CallbackTo[String]): Self = StObject.set(x, "fullTitle", value.toJsFn)
      
      inline def setParent(value: ISuite): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** Partial interface for Mocha's `Test` class. */
  trait ITest
    extends StObject
       with IRunnable {
    
    def fullTitle(): String
    
    var parent: ISuite
    
    var pending: Boolean
  }
  object ITest {
    
    inline def apply(
      async: Boolean,
      fn: js.Function,
      fullTitle: CallbackTo[String],
      parent: ISuite,
      pending: Boolean,
      sync: Boolean,
      timedOut: Boolean,
      title: String
    ): ITest = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], fullTitle = fullTitle.toJsFn, parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITest]
    }
    
    extension [Self <: ITest](x: Self) {
      
      inline def setFullTitle(value: CallbackTo[String]): Self = StObject.set(x, "fullTitle", value.toJsFn)
      
      inline def setParent(value: ISuite): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITestDefinition extends StObject {
    
    def apply(expectation: String): ITest = js.native
    def apply(expectation: String, assertion: js.Function0[Unit]): ITest = js.native
    def apply(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): ITest = js.native
    
    def only(expectation: String): ITest = js.native
    def only(expectation: String, assertion: js.Function0[Unit]): ITest = js.native
    def only(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): ITest = js.native
    
    def skip(expectation: String): Unit = js.native
    def skip(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
    def skip(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
    
    def timeout(ms: Double): Unit = js.native
  }
  
  object reporters {
    
    trait Base extends StObject {
      
      var stats: Failures
    }
    object Base {
      
      inline def apply(stats: Failures): Base = {
        val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
        __obj.asInstanceOf[Base]
      }
      
      extension [Self <: Base](x: Self) {
        
        inline def setStats(value: Failures): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      }
    }
    
    type Doc = Base
    
    type Dot = Base
    
    type HTML = Base
    
    type HTMLCov = Base
    
    type JSON = Base
    
    type JSONCov = Base
    
    type JSONStream = Base
    
    type Landing = Base
    
    type List = Base
    
    type Markdown = Base
    
    type Min = Base
    
    type Nyan = Base
    
    type Progress = Base
    
    type Spec = Base
    
    type TAP = Base
    
    type XUnit = Base
  }
}
