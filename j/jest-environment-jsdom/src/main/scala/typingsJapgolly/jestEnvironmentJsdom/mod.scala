package typingsJapgolly.jestEnvironmentJsdom

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.jestEnvironment.mod.EnvironmentContext
import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestEnvironment.mod.JestEnvironmentConfig
import typingsJapgolly.jestEnvironmentJsdom.anon.StackTraceLimit
import typingsJapgolly.jsdom.mod.JSDOM
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-jsdom", JSImport.Default)
  @js.native
  open class default protected () extends JSDOMEnvironment {
    def this(config: JestEnvironmentConfig, context: EnvironmentContext) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-environment-jsdom", "TestEnvironment")
  @js.native
  open class TestEnvironment protected () extends JSDOMEnvironment {
    def this(config: JestEnvironmentConfig, context: EnvironmentContext) = this()
  }
  @JSImport("jest-environment-jsdom", "TestEnvironment")
  @js.native
  val TestEnvironment: Instantiable2[
    /* config */ JestEnvironmentConfig, 
    /* context */ EnvironmentContext, 
    JSDOMEnvironment
  ] = js.native
  
  @js.native
  trait JSDOMEnvironment extends JestEnvironment[Double] {
    
    var customExportConditions: js.Array[String] = js.native
    
    var dom: JSDOM | Null = js.native
    
    /* private */ var errorEventListener: Any = js.native
    
    @JSName("exportConditions")
    def exportConditions_MJSDOMEnvironment(): js.Array[String] = js.native
    
    @JSName("global")
    var global_JSDOMEnvironment: Win = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global * / any */ @js.native
  trait Win
    extends StObject
       with Window {
    
    var Error: StackTraceLimit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
