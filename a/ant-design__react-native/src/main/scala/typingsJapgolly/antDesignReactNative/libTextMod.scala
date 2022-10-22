package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("@ant-design/react-native/lib/text", JSImport.Default)
  @js.native
  open class default protected () extends Text {
    def this(props: TextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextProps, context: Any) = this()
  }
}
