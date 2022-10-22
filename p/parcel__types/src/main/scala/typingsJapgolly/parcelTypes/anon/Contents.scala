package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelSourceMap.mod.default
import typingsJapgolly.parcelTypes.mod.Async
import typingsJapgolly.parcelTypes.mod.Blob
import typingsJapgolly.parcelTypes.mod.NamedBundle
import typingsJapgolly.parcelTypes.mod.PluginLogger
import typingsJapgolly.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents[ConfigType] extends StObject {
  
  var bundle: NamedBundle = js.native
  
  var bundleGraph: typingsJapgolly.parcelTypes.mod.BundleGraph[NamedBundle] = js.native
  
  var config: ConfigType = js.native
  
  var contents: Blob = js.native
  
  def getSourceMapReference(): Async[js.UndefOr[String | Null]] = js.native
  def getSourceMapReference(map: default): Async[js.UndefOr[String | Null]] = js.native
  
  var logger: PluginLogger = js.native
  
  var map: js.UndefOr[default | Null] = js.native
  
  var options: PluginOptions = js.native
}
