package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.anon.Info
import typingsJapgolly.webpack.anon.ReadonlyrenderManifesttapAfterStartup
import typingsJapgolly.webpack.webpackStrings.__webpack_require__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MainTemplate extends StObject {
  
  def getAssetPath(): String = js.native
  def getAssetPath(path: Any): String = js.native
  def getAssetPath(path: Any, options: Any): String = js.native
  def getAssetPath(path: Unit, options: Any): String = js.native
  
  def getAssetPathWithInfo(): Info = js.native
  def getAssetPathWithInfo(path: Any): Info = js.native
  def getAssetPathWithInfo(path: Any, options: Any): Info = js.native
  def getAssetPathWithInfo(path: Unit, options: Any): Info = js.native
  
  def getPublicPath(options: js.Object): String = js.native
  
  var hooks: ReadonlyrenderManifesttapAfterStartup = js.native
  
  val outputOptions: Output = js.native
  
  def renderCurrentHashCode(hash: String): String = js.native
  def renderCurrentHashCode(hash: String, length: Double): String = js.native
  
  val requireFn: __webpack_require__ = js.native
}
