package typingsJapgolly.reactNativeSensorManager.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNative.mod.TabBarIOSProps
import typingsJapgolly.reactNativeSensorManager.anon.ReadonlyTabBarIOSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-sensor-manager", "TabBarIOS")
@js.native
open class TabBarIOS protected ()
  extends typingsJapgolly.reactNative.mod.TabBarIOS {
  def this(props: TabBarIOSProps) = this()
  def this(props: ReadonlyTabBarIOSProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabBarIOSProps, context: Any) = this()
}
/* static members */
object TabBarIOS {
  
  @JSImport("react-native-sensor-manager", "TabBarIOS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-sensor-manager", "TabBarIOS.Item")
  @js.native
  def Item: Instantiable0[typingsJapgolly.reactNative.mod.TabBarIOSItem] = js.native
  inline def Item_=(x: Instantiable0[typingsJapgolly.reactNative.mod.TabBarIOSItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
