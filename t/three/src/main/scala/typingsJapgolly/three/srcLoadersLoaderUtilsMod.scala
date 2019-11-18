package typingsJapgolly.three

import typingsJapgolly.three.srcPolyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/LoaderUtils", JSImport.Namespace)
@js.native
object srcLoadersLoaderUtilsMod extends js.Object {
  @js.native
  class LoaderUtils () extends js.Object
  
  /* static members */
  @js.native
  object LoaderUtils extends js.Object {
    def decodeText(array: TypedArray): String = js.native
    def extractUrlBase(url: String): String = js.native
  }
  
}

