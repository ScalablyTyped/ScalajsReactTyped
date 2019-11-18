package typingsJapgolly.styledDashComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.Image
import typingsJapgolly.reactDashNative.reactDashNativeMod.ImageResolvedAssetSource
import typingsJapgolly.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typingsJapgolly.styledDashComponents.styledDashComponentsStrings.`disk/memory`
import typingsJapgolly.styledDashComponents.styledDashComponentsStrings.disk
import typingsJapgolly.styledDashComponents.styledDashComponentsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassImage extends Instantiable0[Image] {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | `disk/memory`]]
    ]
  ] = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): js.Any = js.native
  def prefetch(url: String): js.Any = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/image.html#resolveassetsource
    */
  def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
}

