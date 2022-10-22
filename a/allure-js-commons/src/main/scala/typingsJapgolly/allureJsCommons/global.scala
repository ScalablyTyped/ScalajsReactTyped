package typingsJapgolly.allureJsCommons

import typingsJapgolly.allureJsCommons.mod.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Allure {
    
    @JSGlobal("Allure")
    @js.native
    open class ^ ()
      extends typingsJapgolly.allureJsCommons.mod.^
    
    @JSGlobal("Allure.Attachment")
    @js.native
    open class Attachment protected ()
      extends typingsJapgolly.allureJsCommons.mod.Attachment {
      def this(title: String, source: Any, size: Double, mime: String) = this()
    }
    
    @JSGlobal("Allure.Description")
    @js.native
    open class Description protected ()
      extends typingsJapgolly.allureJsCommons.mod.Description {
      def this(value: String, `type`: TYPE) = this()
    }
    
    @JSGlobal("Allure.Step")
    @js.native
    open class Step protected ()
      extends typingsJapgolly.allureJsCommons.mod.Step {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
    
    @JSGlobal("Allure.Suite")
    @js.native
    open class Suite protected ()
      extends typingsJapgolly.allureJsCommons.mod.Suite {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
    
    @JSGlobal("Allure.TYPE")
    @js.native
    object TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.allureJsCommons.mod.TYPE & String] = js.native
      
      /* "html" */ val HTML: typingsJapgolly.allureJsCommons.mod.TYPE.HTML & String = js.native
      
      /* "markdown" */ val MARKDOWN: typingsJapgolly.allureJsCommons.mod.TYPE.MARKDOWN & String = js.native
      
      /* "text" */ val TEXT: typingsJapgolly.allureJsCommons.mod.TYPE.TEXT & String = js.native
    }
    
    @JSGlobal("Allure.Test")
    @js.native
    open class Test protected ()
      extends typingsJapgolly.allureJsCommons.mod.Test {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
  }
}
