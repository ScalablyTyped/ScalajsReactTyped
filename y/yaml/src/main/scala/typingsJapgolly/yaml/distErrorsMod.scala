package typingsJapgolly.yaml

import typingsJapgolly.std.Error
import typingsJapgolly.yaml.distParseLineCounterMod.LineCounter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("yaml/dist/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/errors", "YAMLError")
  @js.native
  open class YAMLError protected ()
    extends StObject
       with Error {
    def this(
      name: typingsJapgolly.yaml.yamlStrings.YAMLParseError | typingsJapgolly.yaml.yamlStrings.YAMLWarning,
      pos: js.Tuple2[Double, Double],
      code: ErrorCode,
      message: String
    ) = this()
    
    var code: ErrorCode = js.native
    
    var linePos: js.UndefOr[js.Array[LinePos] | (js.Tuple2[LinePos, LinePos])] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_YAMLError: typingsJapgolly.yaml.yamlStrings.YAMLParseError | typingsJapgolly.yaml.yamlStrings.YAMLWarning = js.native
    
    var pos: js.Tuple2[Double, Double] = js.native
  }
  
  @JSImport("yaml/dist/errors", "YAMLParseError")
  @js.native
  open class YAMLParseError protected () extends YAMLError {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  @JSImport("yaml/dist/errors", "YAMLWarning")
  @js.native
  open class YAMLWarning protected () extends YAMLError {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  inline def prettifyError(src: String, lc: LineCounter): js.Function1[/* error */ YAMLError, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("prettifyError")(src.asInstanceOf[js.Any], lc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* error */ YAMLError, Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.yaml.yamlStrings.ALIAS_PROPS
    - typingsJapgolly.yaml.yamlStrings.BAD_ALIAS
    - typingsJapgolly.yaml.yamlStrings.BAD_DIRECTIVE
    - typingsJapgolly.yaml.yamlStrings.BAD_DQ_ESCAPE
    - typingsJapgolly.yaml.yamlStrings.BAD_INDENT
    - typingsJapgolly.yaml.yamlStrings.BAD_PROP_ORDER
    - typingsJapgolly.yaml.yamlStrings.BAD_SCALAR_START
    - typingsJapgolly.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY
    - typingsJapgolly.yaml.yamlStrings.BLOCK_IN_FLOW
    - typingsJapgolly.yaml.yamlStrings.DUPLICATE_KEY
    - typingsJapgolly.yaml.yamlStrings.IMPOSSIBLE
    - typingsJapgolly.yaml.yamlStrings.KEY_OVER_1024_CHARS
    - typingsJapgolly.yaml.yamlStrings.MISSING_CHAR
    - typingsJapgolly.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY
    - typingsJapgolly.yaml.yamlStrings.MULTIPLE_ANCHORS
    - typingsJapgolly.yaml.yamlStrings.MULTIPLE_DOCS
    - typingsJapgolly.yaml.yamlStrings.MULTIPLE_TAGS
    - typingsJapgolly.yaml.yamlStrings.TAB_AS_INDENT
    - typingsJapgolly.yaml.yamlStrings.TAG_RESOLVE_FAILED
    - typingsJapgolly.yaml.yamlStrings.UNEXPECTED_TOKEN
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def ALIAS_PROPS: typingsJapgolly.yaml.yamlStrings.ALIAS_PROPS = "ALIAS_PROPS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.ALIAS_PROPS]
    
    inline def BAD_ALIAS: typingsJapgolly.yaml.yamlStrings.BAD_ALIAS = "BAD_ALIAS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_ALIAS]
    
    inline def BAD_DIRECTIVE: typingsJapgolly.yaml.yamlStrings.BAD_DIRECTIVE = "BAD_DIRECTIVE".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_DIRECTIVE]
    
    inline def BAD_DQ_ESCAPE: typingsJapgolly.yaml.yamlStrings.BAD_DQ_ESCAPE = "BAD_DQ_ESCAPE".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_DQ_ESCAPE]
    
    inline def BAD_INDENT: typingsJapgolly.yaml.yamlStrings.BAD_INDENT = "BAD_INDENT".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_INDENT]
    
    inline def BAD_PROP_ORDER: typingsJapgolly.yaml.yamlStrings.BAD_PROP_ORDER = "BAD_PROP_ORDER".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_PROP_ORDER]
    
    inline def BAD_SCALAR_START: typingsJapgolly.yaml.yamlStrings.BAD_SCALAR_START = "BAD_SCALAR_START".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BAD_SCALAR_START]
    
    inline def BLOCK_AS_IMPLICIT_KEY: typingsJapgolly.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY = "BLOCK_AS_IMPLICIT_KEY".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY]
    
    inline def BLOCK_IN_FLOW: typingsJapgolly.yaml.yamlStrings.BLOCK_IN_FLOW = "BLOCK_IN_FLOW".asInstanceOf[typingsJapgolly.yaml.yamlStrings.BLOCK_IN_FLOW]
    
    inline def DUPLICATE_KEY: typingsJapgolly.yaml.yamlStrings.DUPLICATE_KEY = "DUPLICATE_KEY".asInstanceOf[typingsJapgolly.yaml.yamlStrings.DUPLICATE_KEY]
    
    inline def IMPOSSIBLE: typingsJapgolly.yaml.yamlStrings.IMPOSSIBLE = "IMPOSSIBLE".asInstanceOf[typingsJapgolly.yaml.yamlStrings.IMPOSSIBLE]
    
    inline def KEY_OVER_1024_CHARS: typingsJapgolly.yaml.yamlStrings.KEY_OVER_1024_CHARS = "KEY_OVER_1024_CHARS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.KEY_OVER_1024_CHARS]
    
    inline def MISSING_CHAR: typingsJapgolly.yaml.yamlStrings.MISSING_CHAR = "MISSING_CHAR".asInstanceOf[typingsJapgolly.yaml.yamlStrings.MISSING_CHAR]
    
    inline def MULTILINE_IMPLICIT_KEY: typingsJapgolly.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY = "MULTILINE_IMPLICIT_KEY".asInstanceOf[typingsJapgolly.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY]
    
    inline def MULTIPLE_ANCHORS: typingsJapgolly.yaml.yamlStrings.MULTIPLE_ANCHORS = "MULTIPLE_ANCHORS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.MULTIPLE_ANCHORS]
    
    inline def MULTIPLE_DOCS: typingsJapgolly.yaml.yamlStrings.MULTIPLE_DOCS = "MULTIPLE_DOCS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.MULTIPLE_DOCS]
    
    inline def MULTIPLE_TAGS: typingsJapgolly.yaml.yamlStrings.MULTIPLE_TAGS = "MULTIPLE_TAGS".asInstanceOf[typingsJapgolly.yaml.yamlStrings.MULTIPLE_TAGS]
    
    inline def TAB_AS_INDENT: typingsJapgolly.yaml.yamlStrings.TAB_AS_INDENT = "TAB_AS_INDENT".asInstanceOf[typingsJapgolly.yaml.yamlStrings.TAB_AS_INDENT]
    
    inline def TAG_RESOLVE_FAILED: typingsJapgolly.yaml.yamlStrings.TAG_RESOLVE_FAILED = "TAG_RESOLVE_FAILED".asInstanceOf[typingsJapgolly.yaml.yamlStrings.TAG_RESOLVE_FAILED]
    
    inline def UNEXPECTED_TOKEN: typingsJapgolly.yaml.yamlStrings.UNEXPECTED_TOKEN = "UNEXPECTED_TOKEN".asInstanceOf[typingsJapgolly.yaml.yamlStrings.UNEXPECTED_TOKEN]
  }
  
  trait LinePos extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object LinePos {
    
    inline def apply(col: Double, line: Double): LinePos = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePos]
    }
    
    extension [Self <: LinePos](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
