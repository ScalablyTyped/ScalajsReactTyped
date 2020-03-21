package typingsJapgolly.apolloEnv

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEnv.arrayMod._Global_.Array
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  @js.native
  class URL protected () extends URL_ {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsJapgolly.node.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typingsJapgolly.node.urlMod.URLSearchParams) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  }
  
  type URLSearchParamsInit = typingsJapgolly.node.urlMod.URLSearchParams | String | (StringDictionary[js.UndefOr[js.Object | Array[js.Object]]]) | (js.Iterable[js.Tuple2[String, js.Object]]) | (Array[js.Tuple2[String, js.Object]])
}

