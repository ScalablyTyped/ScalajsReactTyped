package typingsJapgolly.reactNativeCommunityMaskedView

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/masked-view", JSImport.Default)
  @js.native
  open class default () extends MaskedView
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  trait MaskedView
    extends Component[MaskedViewProps, js.Object, Any]
  
  /**
    * @see https://github.com/react-native-community/react-native-masked-view
    */
  type MaskedViewComponent = japgolly.scalajs.react.facade.React.Component[MaskedViewProps & js.Object, js.Object]
  
  trait MaskedViewProps
    extends StObject
       with ViewProps {
    
    var maskElement: Element
  }
  object MaskedViewProps {
    
    inline def apply(maskElement: VdomElement): MaskedViewProps = {
      val __obj = js.Dynamic.literal(maskElement = maskElement.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskedViewProps]
    }
    
    extension [Self <: MaskedViewProps](x: Self) {
      
      inline def setMaskElement(value: VdomElement): Self = StObject.set(x, "maskElement", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
