package typingsJapgolly.antDesignReactNative

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioGroupContextProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioContextMod extends Shortcut {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioContext", JSImport.Default)
  @js.native
  val default: Context[RadioGroupContextProps | Null] = js.native
  
  @JSImport("@ant-design/react-native/lib/radio/RadioContext", "RadioGroupContextProvider")
  @js.native
  val RadioGroupContextProvider: Provider[RadioGroupContextProps | Null] = js.native
  
  type _To = Context[RadioGroupContextProps | Null]
  
  /* This means you don't have to write `default`, but can instead just say `libRadioRadioContextMod.foo` */
  override def _to: Context[RadioGroupContextProps | Null] = default
}
