package typingsJapgolly.expoVectorIcons.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.ImageSource
import typingsJapgolly.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import typingsJapgolly.reactNativeVectorIcons.ioniconsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "Ionicons")
@js.native
class Ionicons () extends default

/* static members */
@JSImport("@expo/vector-icons", "Ionicons")
@js.native
object Ionicons extends js.Object {
  @js.native
  class Button ()
    extends Component[IconButtonProps, js.Any, js.Any]
  
  @js.native
  class TabBarItem ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class TabBarItemIOS ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class ToolbarAndroid ()
    extends Component[ToolbarAndroidProps, js.Any, js.Any]
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

