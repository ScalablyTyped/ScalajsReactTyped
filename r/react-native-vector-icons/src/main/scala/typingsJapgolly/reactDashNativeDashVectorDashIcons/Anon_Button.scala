package typingsJapgolly.reactDashNativeDashVectorDashIcons

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.Icon
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Button extends Instantiable0[Icon] {
  var Button: Instantiable0[typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.Icon.Button] = js.native
  var TabBarItem: Instantiable0[typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.Icon.TabBarItem] = js.native
  var TabBarItemIOS: Instantiable0[typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.Icon.TabBarItemIOS] = js.native
  var ToolbarAndroid: Instantiable0[typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.Icon.ToolbarAndroid] = js.native
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

