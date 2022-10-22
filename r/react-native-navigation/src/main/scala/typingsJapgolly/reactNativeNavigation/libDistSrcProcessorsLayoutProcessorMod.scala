package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import typingsJapgolly.reactNativeNavigation.libDistSrcProcessorsLayoutProcessorsStoreMod.LayoutProcessorsStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcProcessorsLayoutProcessorMod {
  
  @JSImport("react-native-navigation/lib/dist/src/processors/LayoutProcessor", "LayoutProcessor")
  @js.native
  open class LayoutProcessor protected () extends StObject {
    def this(layoutProcessorsStore: LayoutProcessorsStore) = this()
    
    /* private */ var layoutProcessorsStore: Any = js.native
    
    def process(layout: Layout[js.Object], commandName: CommandName): Layout[js.Object] = js.native
  }
}
