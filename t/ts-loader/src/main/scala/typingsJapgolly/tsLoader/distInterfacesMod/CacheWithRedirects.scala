package typingsJapgolly.tsLoader.distInterfacesMod

import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Path
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheWithRedirects[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def getOrCreateMapOfCacheRedirects(): Map[String, T] = js.native
  def getOrCreateMapOfCacheRedirects(redirectedReference: ResolvedProjectReference): Map[String, T] = js.native
  
  var ownMap: Map[String, T] = js.native
  
  var redirectsMap: Map[Path, Map[String, T]] = js.native
  
  def setOwnMap(newOwnMap: Map[String, T]): Unit = js.native
  
  def setOwnOptions(newOptions: CompilerOptions): Unit = js.native
}
