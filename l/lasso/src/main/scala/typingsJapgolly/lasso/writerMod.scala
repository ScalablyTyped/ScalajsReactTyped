package typingsJapgolly.lasso

import typingsJapgolly.lasso.dependenciesMod.Bundle
import typingsJapgolly.lasso.lassoMod.LassoConfig
import typingsJapgolly.lasso.lassoMod.default
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib/writers/Writer", JSImport.Namespace)
@js.native
object writerMod extends js.Object {
  @js.native
  trait Writer extends EventEmitter {
    var config: LassoConfig = js.native
    var impl: js.Any = js.native
    var lasso: default = js.native
    def apply(impl: js.Any): Writer = js.native
    def buildResourceCacheKey(cacheKey: String, lassoContext: typingsJapgolly.lasso.lassoContextMod.default): String = js.native
    def checkBundleUpToDate(bundle: Bundle, lassoContext: typingsJapgolly.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
    def checkResourceUpToDate(path: String, lassoContext: typingsJapgolly.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
    def getInPlaceUrlForBundle(bundle: Bundle, lassoContext: typingsJapgolly.lasso.lassoContextMod.default): String = js.native
    def getInPlaceUrlForFile(path: String, lassoContext: typingsJapgolly.lasso.lassoContextMod.default): String | Null = js.native
    def getLasso(): default = js.native
    def setLasso(lasso: default): Unit = js.native
    def writeBundle(
      bundle: Bundle,
      onBundleWrittenCallback: js.Any,
      lassoContext: typingsJapgolly.lasso.lassoContextMod.default,
      callback: js.Any
    ): js.Any = js.native
    def writeBundles(
      iteratorFunc: js.Any,
      onBundleWrittenCallback: js.Any,
      lassoContext: typingsJapgolly.lasso.lassoContextMod.default,
      callback: js.Any
    ): Unit = js.native
    def writeResource(path: String, lassoContext: typingsJapgolly.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
  }
  
}

