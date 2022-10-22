package typingsJapgolly.webpackSources

import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.webpackSources.libMod.MapOptions
import typingsJapgolly.webpackSources.libMod.Replacement
import typingsJapgolly.webpackSources.libMod.SourceAndMapMixin
import typingsJapgolly.webpackSources.libMod.SourceAndMapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReplaceSourceMod {
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @JSImport("webpack-sources/lib/ReplaceSource", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ReplaceSource {
    /**
      * The ReplaceSource supports "identity" mappings for child source.
      * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
      */
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^) = this()
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^, name: String) = this()
  }
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @js.native
  trait ReplaceSource
    extends typingsJapgolly.webpackSources.libSourceMod.^
       with SourceAndMapMixin {
    
    /**
      * Inserts the insertion before char pos (0-indexed).
      */
    def insert(pos: Double, newValue: String): Unit = js.native
    def insert(pos: Double, newValue: String, name: String): Unit = js.native
    
    /**
      * Returns the SourceMap of the represented source code as JSON.
      * May return `null` if no SourceMap is available.
      */
    /* InferMemberOverrides */
    override def map(): RawSourceMap | Null = js.native
    /* InferMemberOverrides */
    override def map(options: MapOptions): RawSourceMap | Null = js.native
    
    /**
      * Get decorated Source.
      */
    def original(): typingsJapgolly.webpackSources.libSourceMod.^ = js.native
    
    /**
      * Replaces chars from start (0-indexed, inclusive) to end (0-indexed, inclusive) with replacement.
      */
    def replace(start: Double, end: Double, newValue: String): Unit = js.native
    def replace(start: Double, end: Double, newValue: String, name: String): Unit = js.native
    
    var replacements: js.Array[Replacement] = js.native
    
    /**
      * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
      * This method could have better performance than calling `source()` and `map()` separately.
      */
    /* InferMemberOverrides */
    override def sourceAndMap(): SourceAndMapResult = js.native
    /* InferMemberOverrides */
    override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
  }
}
