package typingsJapgolly.marko

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.marko.anon.AttributeGroups
import typingsJapgolly.marko.anon.Name
import typingsJapgolly.marko.srcCompilerTaglibLoaderTagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibLookupTaglibLookupMod {
  
  @JSImport("marko/src/compiler/taglib-lookup/TaglibLookup", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TaglibLookup
  
  trait Element extends StObject {
    
    var tagName: String
  }
  object Element {
    
    inline def apply(tagName: String): Element = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaglibLookup extends StObject {
    
    def addTaglib(taglib: typingsJapgolly.marko.srcCompilerTaglibLoaderTaglibMod.default): Unit = js.native
    
    def forEachAttribute(
      tagName: String,
      callback: js.Function2[
          /* attrDef */ typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default, 
          /* tag */ ^, 
          Unit
        ]
    ): Unit = js.native
    
    def forEachNodeTransformer(
      node: Any,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ]
    ): Unit = js.native
    def forEachNodeTransformer(
      node: Any,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ],
      thisObj: Any
    ): Unit = js.native
    
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit | Boolean]): Unit = js.native
    
    def forEachTagTransformer(
      element: String,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ]
    ): Unit = js.native
    def forEachTagTransformer(
      element: String,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ],
      thisObj: Any
    ): Unit = js.native
    def forEachTagTransformer(
      element: Element,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ]
    ): Unit = js.native
    def forEachTagTransformer(
      element: Element,
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ],
      thisObj: Any
    ): Unit = js.native
    
    def forEachTemplateTransformer(
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ]
    ): Unit = js.native
    def forEachTemplateTransformer(
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ],
      thisObj: Any
    ): Unit = js.native
    
    def forEachTextTransformer(
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ]
    ): Unit = js.native
    def forEachTextTransformer(
      callback: js.Function1[
          /* trans */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Any
        ],
      thisObj: Any
    ): Unit = js.native
    
    def getAttribute(element: String, attr: String): js.UndefOr[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    def getAttribute(element: String, attr: Name): js.UndefOr[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    def getAttribute(element: Element, attr: String): js.UndefOr[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    def getAttribute(element: Element, attr: Name): js.UndefOr[typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default] = js.native
    
    def getInputFiles(): js.Array[String] = js.native
    
    def getTag(element: String): js.UndefOr[^] = js.native
    def getTag(element: Element): js.UndefOr[^] = js.native
    
    def getTagsSorted(): js.Array[^] = js.native
    
    def hasTaglib(taglib: typingsJapgolly.marko.srcCompilerTaglibLoaderTaglibMod.default): Boolean = js.native
    
    var merged: AttributeGroups = js.native
    
    var taglibsById: StringDictionary[typingsJapgolly.marko.srcCompilerTaglibLoaderTaglibMod.default] = js.native
  }
}
