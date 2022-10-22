package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.ValueString
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchBarDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/search-bar/demo/basic", JSImport.Default)
  @js.native
  open class default () extends SearchBarDemo
  
  @js.native
  trait SearchBarDemo extends Component[Any, Any, Any] {
    
    def clear(): Unit = js.native
    
    def onChange(value: Any): Unit = js.native
    
    @JSName("state")
    var state_SearchBarDemo: ValueString = js.native
  }
}
