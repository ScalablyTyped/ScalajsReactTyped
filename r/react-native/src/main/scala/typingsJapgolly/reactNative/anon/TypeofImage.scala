package typingsJapgolly.reactNative.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageResolvedAssetSource
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod._Image
import typingsJapgolly.reactNative.reactNativeStrings.disk
import typingsJapgolly.reactNative.reactNativeStrings.diskSlashmemory
import typingsJapgolly.reactNative.reactNativeStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImage
  extends StObject
     with Instantiable0[_Image] {
  
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  
  def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): Any = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = js.native
  
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit]
  ): Any = js.native
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = js.native
  
  def prefetch(url: String): js.Promise[Boolean] = js.native
  
  def prefetchWithMetadata(url: String, queryRootName: String): js.Promise[Boolean] = js.native
  def prefetchWithMetadata(url: String, queryRootName: String, rootTag: Double): js.Promise[Boolean] = js.native
  
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  
  /**
    * @see https://reactnative.dev/docs/image#resolveassetsource
    */
  def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
}
