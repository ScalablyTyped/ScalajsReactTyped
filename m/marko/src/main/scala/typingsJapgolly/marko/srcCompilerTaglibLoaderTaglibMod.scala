package typingsJapgolly.marko

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.marko.srcCompilerTaglibLoaderTagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibLoaderTaglibMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Taglib", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Taglib {
    def this(filePath: String) = this()
  }
  
  @js.native
  trait Taglib extends StObject {
    
    def addAttribute(attribute: typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default): Unit = js.native
    
    def addImport(path: String): Unit = js.native
    
    def addTag(tag: ^): Unit = js.native
    
    def addTextTransformer(transformer: typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default): Unit = js.native
    
    def addTransformer(transformer: typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default): Unit = js.native
    
    var attributeGroups: StringDictionary[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    
    var attributes: StringDictionary[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    
    var dirname: String = js.native
    
    var filePath: String = js.native
    
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit]): Unit = js.native
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit], thisObj: Any): Unit = js.native
    
    def getAttribute(name: String): js.UndefOr[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    
    var id: String = js.native
    
    var imports: Any = js.native
    
    var importsLookup: Any = js.native
    
    var inputFilesLookup: Any = js.native
    
    /** @deprecated */
    var path: String = js.native
    
    var patternAttributes: js.Array[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    
    var tags: StringDictionary[^] = js.native
    
    var textTransformers: js.Array[typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default] = js.native
    
    def toJSON(): Any = js.native
    
    var transformers: js.Array[typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default] = js.native
  }
}
