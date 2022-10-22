package typingsJapgolly.webpackSources

import typingsJapgolly.webpackSources.libMod.CachedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCachedSourceMod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources/lib/CachedSource", JSImport.Namespace)
  @js.native
  open class ^ protected () extends CachedSource {
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^) = this()
    def this(source: js.Function0[typingsJapgolly.webpackSources.libSourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @js.native
  trait CachedSource
    extends typingsJapgolly.webpackSources.libSourceMod.^ {
    
    def getCachedData(): CachedData = js.native
    
    def original(): typingsJapgolly.webpackSources.libSourceMod.^ = js.native
  }
}
