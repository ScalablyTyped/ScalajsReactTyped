package typingsJapgolly.cavy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.cavy.anon.GenerateTestHook
import typingsJapgolly.cavy.cavyBooleans.`true`
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cavy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cavy", "TestHookStore")
  @js.native
  open class TestHookStore () extends StObject
  
  @JSImport("cavy", "TestScope")
  @js.native
  open class TestScope () extends StObject {
    
    def beforeEach(fn: js.Function0[Unit]): Unit = js.native
    
    var component: Tester = js.native
    
    def containsText(identifier: String, text: String): js.Promise[Unit] = js.native
    
    def describe(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def exists(identifier: String): js.Promise[`true`] = js.native
    
    def fillIn(identifier: String, str: String): js.Promise[Unit] = js.native
    
    def findComponent(identifier: String): js.Promise[Component[js.Object, js.Object]] = js.native
    
    def focus(identifier: String): js.Promise[Unit] = js.native
    
    def it(label: String, fn: js.Function0[Unit]): Unit = js.native
    
    def notExists(identifier: String): js.Promise[`true`] = js.native
    
    def pause(time: Double): js.Promise[Unit] = js.native
    
    def press(identifier: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("cavy", "Tester")
  @js.native
  open class Tester protected ()
    extends typingsJapgolly.react.mod.Component[TesterProps, js.Object, Any] {
    def this(props: TesterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TesterProps, context: Any) = this()
    
    def clearAsync(): js.Promise[Unit] = js.native
    
    def reRender(): Unit = js.native
  }
  
  inline def hook[P /* <: js.Object */](WrappedComponent: ComponentClassP[WithTestHook[P] & js.Object]): ComponentClassP[P & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("hook")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & js.Object]]
  
  inline def useCavy(): TestHookGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useCavy")().asInstanceOf[TestHookGenerator]
  
  inline def wrap[P /* <: js.Object */](WrappedComponent: ComponentClassP[P & js.Object]): ComponentClassP[P & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & js.Object]]
  inline def wrap[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ComponentClassP[P & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & js.Object]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typingsJapgolly.cavy.mod.TestHookGeneratorWithRefObject because Already inherited */ @js.native
  trait TestHookGenerator extends TestHookGeneratorWithRefCallback
  
  type TestHookGeneratorWithRefCallback = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefFn[Any]], RefFn[Any]]
  
  type TestHookGeneratorWithRefObject = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefHandle[Any]], RefHandle[Any]]
  
  trait TestReport extends StObject {
    
    var duration: Double
    
    var errorCount: Double
    
    var results: js.Array[TestResult]
  }
  object TestReport {
    
    inline def apply(duration: Double, errorCount: Double, results: js.Array[TestResult]): TestReport = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestReport]
    }
    
    extension [Self <: TestReport](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[TestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: TestResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait TestResult extends StObject {
    
    var message: String
    
    var passed: Boolean
  }
  object TestResult {
    
    inline def apply(message: String, passed: Boolean): TestResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    extension [Self <: TestResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    }
  }
  
  trait TesterProps extends StObject {
    
    var children: Element
    
    var clearAsyncStorage: js.UndefOr[Boolean] = js.undefined
    
    var reporter: js.UndefOr[js.Function1[/* report */ TestReport, Unit]] = js.undefined
    
    // Deprecated
    var sendReport: js.UndefOr[Boolean] = js.undefined
    
    var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]]
    
    var startDelay: js.UndefOr[Double] = js.undefined
    
    var store: TestHookStore
    
    var waitTime: js.UndefOr[Double] = js.undefined
  }
  object TesterProps {
    
    inline def apply(
      children: VdomElement,
      specs: js.Array[js.Function1[/* spec */ TestScope, Unit]],
      store: TestHookStore
    ): TesterProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[TesterProps]
    }
    
    extension [Self <: TesterProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClearAsyncStorage(value: Boolean): Self = StObject.set(x, "clearAsyncStorage", value.asInstanceOf[js.Any])
      
      inline def setClearAsyncStorageUndefined: Self = StObject.set(x, "clearAsyncStorage", js.undefined)
      
      inline def setReporter(value: /* report */ TestReport => Callback): Self = StObject.set(x, "reporter", js.Any.fromFunction1((t0: /* report */ TestReport) => value(t0).runNow()))
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setSendReport(value: Boolean): Self = StObject.set(x, "sendReport", value.asInstanceOf[js.Any])
      
      inline def setSendReportUndefined: Self = StObject.set(x, "sendReport", js.undefined)
      
      inline def setSpecs(value: js.Array[js.Function1[/* spec */ TestScope, Unit]]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: (js.Function1[/* spec */ TestScope, Unit])*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      inline def setStore(value: TestHookStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setWaitTime(value: Double): Self = StObject.set(x, "waitTime", value.asInstanceOf[js.Any])
      
      inline def setWaitTimeUndefined: Self = StObject.set(x, "waitTime", js.undefined)
    }
  }
  
  type WithTestHook[P /* <: js.Object */] = P & GenerateTestHook
}
