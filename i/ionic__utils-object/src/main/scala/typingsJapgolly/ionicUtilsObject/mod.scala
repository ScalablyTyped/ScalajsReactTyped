package typingsJapgolly.ionicUtilsObject

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import typingsJapgolly.std.ProxyHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-object", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AliasedMap[K, V] () extends Map[AliasedMapKey | K, AliasedMapKey | V] {
    def getAliases(): Map[AliasedMapKey, js.Array[AliasedMapKey]] = js.native
    def keysWithoutAliases(): js.Array[K] = js.native
    def resolveAlias(key: K): js.UndefOr[V] = js.native
    def resolveAlias(key: AliasedMapKey): js.UndefOr[V] = js.native
  }
  
  val CaseInsensitiveProxyHandler: ProxyHandler[js.Any] = js.native
  def createCaseInsensitiveObject[T](): StringDictionary[T] = js.native
  type AliasedMapKey = String | js.Symbol
}

