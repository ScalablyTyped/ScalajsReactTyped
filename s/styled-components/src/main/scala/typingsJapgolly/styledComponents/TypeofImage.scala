package typingsJapgolly.styledComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNative.mod.ImageResolvedAssetSource
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.styledComponents.styledComponentsStrings.disk
import typingsJapgolly.styledComponents.styledComponentsStrings.diskSlashmemory
import typingsJapgolly.styledComponents.styledComponentsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofImage extends Instantiable0[Image] {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
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

