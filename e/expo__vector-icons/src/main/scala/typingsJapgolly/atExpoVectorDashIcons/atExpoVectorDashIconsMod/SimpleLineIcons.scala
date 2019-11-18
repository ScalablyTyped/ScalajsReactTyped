package typingsJapgolly.atExpoVectorDashIcons.atExpoVectorDashIconsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.TabBarItemIOSProps
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.ToolbarAndroidProps
import typingsJapgolly.reactDashNativeDashVectorDashIcons.simpleLineIconsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "SimpleLineIcons")
@js.native
class SimpleLineIcons () extends default

/* static members */
@JSImport("@expo/vector-icons", "SimpleLineIcons")
@js.native
object SimpleLineIcons extends js.Object {
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

