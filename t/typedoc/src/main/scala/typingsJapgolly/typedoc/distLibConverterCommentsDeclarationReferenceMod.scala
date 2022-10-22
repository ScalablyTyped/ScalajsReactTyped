package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.typedocStrings.Dot
import typingsJapgolly.typedoc.typedocStrings.Numbersign
import typingsJapgolly.typedoc.typedocStrings.Tilde
import typingsJapgolly.typedoc.typedocStrings.`class`
import typingsJapgolly.typedoc.typedocStrings.`enum`
import typingsJapgolly.typedoc.typedocStrings.`new`
import typingsJapgolly.typedoc.typedocStrings.`type`
import typingsJapgolly.typedoc.typedocStrings.`var`
import typingsJapgolly.typedoc.typedocStrings.call
import typingsJapgolly.typedoc.typedocStrings.complex
import typingsJapgolly.typedoc.typedocStrings.constructor
import typingsJapgolly.typedoc.typedocStrings.event
import typingsJapgolly.typedoc.typedocStrings.function_
import typingsJapgolly.typedoc.typedocStrings.getter
import typingsJapgolly.typedoc.typedocStrings.global
import typingsJapgolly.typedoc.typedocStrings.index
import typingsJapgolly.typedoc.typedocStrings.interface
import typingsJapgolly.typedoc.typedocStrings.local
import typingsJapgolly.typedoc.typedocStrings.member
import typingsJapgolly.typedoc.typedocStrings.namespace
import typingsJapgolly.typedoc.typedocStrings.setter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsDeclarationReferenceMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/declarationReference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/converter/comments/declarationReference", "MeaningKeywords")
  @js.native
  val MeaningKeywords: js.Tuple16[
    `class`, 
    interface, 
    `type`, 
    `enum`, 
    namespace, 
    function_, 
    `var`, 
    constructor, 
    member, 
    event, 
    call, 
    `new`, 
    index, 
    complex, 
    getter, 
    setter
  ] = js.native
  
  inline def parseComponent(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseComponentPath(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[js.Array[ComponentPath], Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentPath")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[js.Array[ComponentPath], Double]]]
  
  inline def parseDeclarationReference(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[DeclarationReference, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDeclarationReference")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[DeclarationReference, Double]]]
  
  inline def parseMeaning(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[Meaning, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMeaning")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[Meaning, Double]]]
  
  inline def parseModuleSource(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModuleSource")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseString(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, Double]]]
  
  inline def parseSymbolReference(source: String, pos: Double, end: Double): js.UndefOr[js.Tuple2[SymbolReference, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSymbolReference")(source.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SymbolReference, Double]]]
  
  trait ComponentPath extends StObject {
    
    /**
      * How to resolve the `path`
      * - `.` - Navigate via `exports` of symbol
      * - `#` - Navigate via `members` of symbol
      * - `~` - Navigate via `locals` of symbol
      */
    var navigation: Dot | Numbersign | Tilde
    
    var path: String
  }
  object ComponentPath {
    
    inline def apply(navigation: Dot | Numbersign | Tilde, path: String): ComponentPath = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentPath]
    }
    
    extension [Self <: ComponentPath](x: Self) {
      
      inline def setNavigation(value: Dot | Numbersign | Tilde): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeclarationReference extends StObject {
    
    var moduleSource: js.UndefOr[String] = js.undefined
    
    var resolutionStart: global | local
    
    var symbolReference: js.UndefOr[SymbolReference] = js.undefined
  }
  object DeclarationReference {
    
    inline def apply(resolutionStart: global | local): DeclarationReference = {
      val __obj = js.Dynamic.literal(resolutionStart = resolutionStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationReference]
    }
    
    extension [Self <: DeclarationReference](x: Self) {
      
      inline def setModuleSource(value: String): Self = StObject.set(x, "moduleSource", value.asInstanceOf[js.Any])
      
      inline def setModuleSourceUndefined: Self = StObject.set(x, "moduleSource", js.undefined)
      
      inline def setResolutionStart(value: global | local): Self = StObject.set(x, "resolutionStart", value.asInstanceOf[js.Any])
      
      inline def setSymbolReference(value: SymbolReference): Self = StObject.set(x, "symbolReference", value.asInstanceOf[js.Any])
      
      inline def setSymbolReferenceUndefined: Self = StObject.set(x, "symbolReference", js.undefined)
    }
  }
  
  trait Meaning extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var keyword: js.UndefOr[MeaningKeyword] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object Meaning {
    
    inline def apply(): Meaning = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Meaning]
    }
    
    extension [Self <: Meaning](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKeyword(value: MeaningKeyword): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedoc.typedocStrings.`class`
    - typingsJapgolly.typedoc.typedocStrings.interface
    - typingsJapgolly.typedoc.typedocStrings.`type`
    - typingsJapgolly.typedoc.typedocStrings.`enum`
    - typingsJapgolly.typedoc.typedocStrings.namespace
    - typingsJapgolly.typedoc.typedocStrings.function_
    - typingsJapgolly.typedoc.typedocStrings.`var`
    - typingsJapgolly.typedoc.typedocStrings.constructor
    - typingsJapgolly.typedoc.typedocStrings.member
    - typingsJapgolly.typedoc.typedocStrings.event
    - typingsJapgolly.typedoc.typedocStrings.call
    - typingsJapgolly.typedoc.typedocStrings.`new`
    - typingsJapgolly.typedoc.typedocStrings.index
    - typingsJapgolly.typedoc.typedocStrings.complex
    - typingsJapgolly.typedoc.typedocStrings.getter
    - typingsJapgolly.typedoc.typedocStrings.setter
  */
  trait MeaningKeyword extends StObject
  
  trait SymbolReference extends StObject {
    
    var meaning: js.UndefOr[Meaning] = js.undefined
    
    var path: js.UndefOr[js.Array[ComponentPath]] = js.undefined
  }
  object SymbolReference {
    
    inline def apply(): SymbolReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolReference]
    }
    
    extension [Self <: SymbolReference](x: Self) {
      
      inline def setMeaning(value: Meaning): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
      
      inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
      
      inline def setPath(value: js.Array[ComponentPath]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: ComponentPath*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
