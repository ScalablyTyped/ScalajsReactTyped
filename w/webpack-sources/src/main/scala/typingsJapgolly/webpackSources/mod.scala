package typingsJapgolly.webpackSources

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.sourceMap.mod.SourceMapGenerator
import typingsJapgolly.webpackSources.libCachedSourceMod.^
import typingsJapgolly.webpackSources.libMod.CachedData
import typingsJapgolly.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources", "CachedSource")
  @js.native
  open class CachedSource protected () extends ^ {
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^) = this()
    def this(source: js.Function0[typingsJapgolly.webpackSources.libSourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  @JSImport("webpack-sources", "CompatSource")
  @js.native
  open class CompatSource protected ()
    extends typingsJapgolly.webpackSources.libCompatSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  object CompatSource {
    
    @JSImport("webpack-sources", "CompatSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def from(sourceLike: SourceLike): typingsJapgolly.webpackSources.libSourceMod.^ | typingsJapgolly.webpackSources.libCompatSourceMod.CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.webpackSources.libSourceMod.^ | typingsJapgolly.webpackSources.libCompatSourceMod.CompatSource]
  }
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @JSImport("webpack-sources", "ConcatSource")
  @js.native
  open class ConcatSource protected ()
    extends typingsJapgolly.webpackSources.libConcatSourceMod.^ {
    def this(args: (String | typingsJapgolly.webpackSources.libSourceMod.^)*) = this()
  }
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @JSImport("webpack-sources", "OriginalSource")
  @js.native
  open class OriginalSource protected ()
    extends typingsJapgolly.webpackSources.libOriginalSourceMod.^ {
    /**
      * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
      */
    def this(sourceCode: String, name: String) = this()
    def this(sourceCode: Buffer, name: String) = this()
  }
  
  /**
    * Prefix every line of the decorated Source with a provided string.
    */
  @JSImport("webpack-sources", "PrefixSource")
  @js.native
  open class PrefixSource protected ()
    extends typingsJapgolly.webpackSources.libPrefixSourceMod.^ {
    def this(prefix: String, source: String) = this()
    def this(prefix: String, source: typingsJapgolly.webpackSources.libSourceMod.^) = this()
    def this(prefix: typingsJapgolly.webpackSources.libSourceMod.^, source: String) = this()
    def this(
      prefix: typingsJapgolly.webpackSources.libSourceMod.^,
      source: typingsJapgolly.webpackSources.libSourceMod.^
    ) = this()
  }
  
  /**
    * Represents source code without SourceMap
    */
  @JSImport("webpack-sources", "RawSource")
  @js.native
  open class RawSource protected ()
    extends typingsJapgolly.webpackSources.libRawSourceMod.^ {
    def this(value: String) = this()
  }
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @JSImport("webpack-sources", "ReplaceSource")
  @js.native
  open class ReplaceSource protected ()
    extends typingsJapgolly.webpackSources.libReplaceSourceMod.^ {
    /**
      * The ReplaceSource supports "identity" mappings for child source.
      * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
      */
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^) = this()
    def this(source: typingsJapgolly.webpackSources.libSourceMod.^, name: String) = this()
  }
  
  @JSImport("webpack-sources", "SizeOnlySource")
  @js.native
  open class SizeOnlySource protected ()
    extends typingsJapgolly.webpackSources.libSizeOnlySourceMod.^ {
    def this(size: Double) = this()
  }
  
  /**
    * Base class for all sources.
    * A Source can be asked for source code, size, source map and hash.
    */
  /* note: abstract class */ @JSImport("webpack-sources", "Source")
  @js.native
  open class Source ()
    extends typingsJapgolly.webpackSources.libSourceMod.^
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @JSImport("webpack-sources", "SourceMapSource")
  @js.native
  open class SourceMapSource protected ()
    extends typingsJapgolly.webpackSources.libSourceMapSourceMod.^ {
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator) = this()
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap, originalSource: String) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator, originalSource: String) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: RawSourceMap
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: String,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: String,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
  }
}
