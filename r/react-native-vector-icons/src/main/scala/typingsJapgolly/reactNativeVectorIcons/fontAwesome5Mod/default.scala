package typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeVectorIcons.AnonBrand
import typingsJapgolly.reactNativeVectorIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
@js.native
class default ()
  extends Component[FontAwesome5IconProps, js.Any, js.Any]

/* static members */
@JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
@js.native
object default extends js.Object {
  var Button: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
  var TabBarItem: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
  var TabBarItemIOS: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
  var ToolbarAndroid: Instantiable0[typingsJapgolly.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[AnonBrand]): js.Promise[ImageSource] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

