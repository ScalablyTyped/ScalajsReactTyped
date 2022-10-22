package typingsJapgolly.reactNativeSafeAreaContext.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.InsetChangedEvent
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.NativeSafeAreaProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompatNativeSafeAreaProvider {
  
  inline def apply(onInsetsChange: /* event */ InsetChangedEvent => Callback): SharedBuilder_NativeSafeAreaProviderProps_246535483 = {
    val __props = js.Dynamic.literal(onInsetsChange = js.Any.fromFunction1((t0: /* event */ InsetChangedEvent) => onInsetsChange(t0).runNow()))
    new SharedBuilder_NativeSafeAreaProviderProps_246535483(js.Array(this.component, __props.asInstanceOf[NativeSafeAreaProviderProps]))
  }
  
  @JSImport("react-native-safe-area-context/lib/typescript/CompatNativeSafeAreaProvider", "CompatNativeSafeAreaProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NativeSafeAreaProviderProps): SharedBuilder_NativeSafeAreaProviderProps_246535483 = new SharedBuilder_NativeSafeAreaProviderProps_246535483(js.Array(this.component, p.asInstanceOf[js.Any]))
}
