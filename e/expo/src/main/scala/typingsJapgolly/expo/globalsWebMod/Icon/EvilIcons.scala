package typingsJapgolly.expo.globalsWebMod.Icon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.ImageSource
import typingsJapgolly.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsJapgolly.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/globals.web", "Icon.EvilIcons")
@js.native
class EvilIcons ()
  extends typingsJapgolly.expoVectorIcons.mod.EvilIcons

/* static members */
@JSImport("expo/build/globals.web", "Icon.EvilIcons")
@js.native
object EvilIcons extends js.Object {
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

