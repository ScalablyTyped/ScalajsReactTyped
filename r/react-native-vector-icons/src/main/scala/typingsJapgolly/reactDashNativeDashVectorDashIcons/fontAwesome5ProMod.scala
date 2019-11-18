package typingsJapgolly.reactDashNativeDashVectorDashIcons

import typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.ValueOf
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import typingsJapgolly.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`0`
import typingsJapgolly.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`1`
import typingsJapgolly.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`2`
import typingsJapgolly.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/FontAwesome5Pro", JSImport.Namespace)
@js.native
object fontAwesome5ProMod extends js.Object {
  @js.native
  class default ()
    extends typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.default
  
  @js.native
  object FA5Style extends js.Object {
    var brand: `3` = js.native
    var light: `1` = js.native
    var regular: `0` = js.native
    var solid: `2` = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[Anon_0]): js.Promise[ImageSource] = js.native
    def hasIcon(name: String): Boolean = js.native
    def loadFont(): js.Promise[Unit] = js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
  
  type FontAwesome5ProIconProps = FontAwesome5IconProps
}

