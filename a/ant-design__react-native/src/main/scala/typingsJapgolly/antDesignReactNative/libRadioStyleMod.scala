package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.Checkbox
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioStyleMod {
  
  @JSImport("@ant-design/react-native/lib/radio/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): Checkbox = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[Checkbox]
}
