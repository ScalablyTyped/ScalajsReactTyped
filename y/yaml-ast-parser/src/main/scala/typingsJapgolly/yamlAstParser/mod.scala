package typingsJapgolly.yamlAstParser

import typingsJapgolly.yamlAstParser.distSrcLoaderMod.LoadOptions
import typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YAMLAnchorReference
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YAMLMapping
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YAMLNode
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YAMLScalar
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YAMLSequence
import typingsJapgolly.yamlAstParser.distSrcYamlASTMod.YamlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaml-ast-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml-ast-parser", "Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind & Double] = js.native
    
    /* 4 */ val ANCHOR_REF: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.ANCHOR_REF & Double = js.native
    
    /* 5 */ val INCLUDE_REF: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.INCLUDE_REF & Double = js.native
    
    /* 2 */ val MAP: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.MAP & Double = js.native
    
    /* 1 */ val MAPPING: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.MAPPING & Double = js.native
    
    /* 0 */ val SCALAR: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.SCALAR & Double = js.native
    
    /* 3 */ val SEQ: typingsJapgolly.yamlAstParser.distSrcYamlASTMod.Kind.SEQ & Double = js.native
  }
  
  @JSImport("yaml-ast-parser", "ScalarType")
  @js.native
  object ScalarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType & Double] = js.native
    
    /* 1 */ val bool: typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType.bool & Double = js.native
    
    /* 3 */ val float: typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType.float & Double = js.native
    
    /* 2 */ val int: typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType.int & Double = js.native
    
    /* 0 */ val `null`: typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType.`null` & Double = js.native
    
    /* 4 */ val string: typingsJapgolly.yamlAstParser.distSrcScalarInferenceMod.ScalarType.string & Double = js.native
  }
  
  @JSImport("yaml-ast-parser", "YAMLException")
  @js.native
  open class YAMLException protected ()
    extends typingsJapgolly.yamlAstParser.distSrcExceptionMod.^ {
    def this(reason: String) = this()
    def this(reason: String, mark: typingsJapgolly.yamlAstParser.distSrcMarkMod.^) = this()
    def this(reason: String, mark: Unit, isWarning: Boolean) = this()
    def this(reason: String, mark: typingsJapgolly.yamlAstParser.distSrcMarkMod.^, isWarning: Boolean) = this()
  }
  object YAMLException {
    
    @JSImport("yaml-ast-parser", "YAMLException")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("yaml-ast-parser", "YAMLException.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isInstance(instance: Any): /* is yaml-ast-parser.yaml-ast-parser/dist/src/exception.YAMLException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is yaml-ast-parser.yaml-ast-parser/dist/src/exception.YAMLException */ Boolean]
  }
  
  inline def determineScalarType(node: YAMLScalar): ScalarType = ^.asInstanceOf[js.Dynamic].applyDynamic("determineScalarType")(node.asInstanceOf[js.Any]).asInstanceOf[ScalarType]
  
  inline def dump(input: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def load(input: String): YAMLNode = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(input.asInstanceOf[js.Any]).asInstanceOf[YAMLNode]
  inline def load(input: String, options: LoadOptions): YAMLNode = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YAMLNode]
  
  inline def loadAll(input: String, iterator: js.Function1[/* document */ YAMLNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadAll(input: String, iterator: js.Function1[/* document */ YAMLNode, Unit], options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def newAnchorRef(key: String, start: Double, end: Double, value: YAMLNode): YAMLAnchorReference = (^.asInstanceOf[js.Dynamic].applyDynamic("newAnchorRef")(key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[YAMLAnchorReference]
  
  inline def newItems(): YAMLSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("newItems")().asInstanceOf[YAMLSequence]
  
  inline def newMap(): YamlMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newMap")().asInstanceOf[YamlMap]
  inline def newMap(mappings: js.Array[YAMLMapping]): YamlMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newMap")(mappings.asInstanceOf[js.Any]).asInstanceOf[YamlMap]
  
  inline def newMapping(key: YAMLScalar, value: YAMLNode): YAMLMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("newMapping")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[YAMLMapping]
  
  inline def newScalar(): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")().asInstanceOf[YAMLScalar]
  inline def newScalar(v: String): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  inline def newScalar(v: Boolean): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  inline def newScalar(v: Double): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  
  inline def newSeq(): YAMLSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("newSeq")().asInstanceOf[YAMLSequence]
  
  inline def parseYamlBoolean(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlBoolean")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseYamlFloat(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlFloat")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseYamlInteger(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlInteger")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def safeDump(input: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def safeLoad(input: String): YAMLNode = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(input.asInstanceOf[js.Any]).asInstanceOf[YAMLNode]
  inline def safeLoad(input: String, options: LoadOptions): YAMLNode = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YAMLNode]
  
  inline def safeLoadAll(input: String, output: js.Function1[/* document */ YAMLNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def safeLoadAll(input: String, output: js.Function1[/* document */ YAMLNode, Unit], options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Error = YAMLException
}
