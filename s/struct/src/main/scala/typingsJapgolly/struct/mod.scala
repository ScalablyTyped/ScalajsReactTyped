package typingsJapgolly.struct

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.struct.structStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Struct[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Struct[T]]
  
  @JSImport("struct", "Struct")
  @js.native
  open class Struct[T] () extends StObject {
    
    def allocate(): Struct[T] = js.native
    
    def array(name: String, length: Double, `type`: StructTypes, args: (String | Double | Struct[Any])*): Struct[T] = js.native
    def array(name: String, length: Double, `type`: Struct[Any], args: (String | Double | Struct[Any])*): Struct[T] = js.native
    
    def buffer(): Buffer = js.native
    
    def chars(name: String, length: Double): Struct[T] = js.native
    def chars(name: String, length: Double, encoding: String): Struct[T] = js.native
    
    def charsnt(name: String, length: Double): Struct[T] = js.native
    def charsnt(name: String, length: Double, encoding: String): Struct[T] = js.native
    
    def doublebe(name: String): Struct[T] = js.native
    
    def doublele(name: String): Struct[T] = js.native
    
    var fields: T = js.native
    
    def floatbe(name: String): Struct[T] = js.native
    
    def floatle(name: String): Struct[T] = js.native
    
    def get(fieldName: String): Any = js.native
    
    def set(fieldName: String, value: Any): Unit = js.native
    
    def setBuffer(buffer: Buffer): Unit = js.native
    def setBuffer(buffer: Buffer, buffLength: Double): Unit = js.native
    
    def struct(name: String, struct: Struct[Any]): Struct[T] = js.native
    
    def word16Sbe(name: String): Struct[T] = js.native
    
    def word16Sle(name: String): Struct[T] = js.native
    
    def word16Ube(name: String): Struct[T] = js.native
    
    def word16Ule(name: String): Struct[T] = js.native
    
    def word32Sbe(name: String): Struct[T] = js.native
    
    def word32Sle(name: String): Struct[T] = js.native
    
    def word32Ube(name: String): Struct[T] = js.native
    
    def word32Ule(name: String): Struct[T] = js.native
    
    def word64Sbe(name: String): Struct[T] = js.native
    
    def word64Sle(name: String): Struct[T] = js.native
    
    def word64Ube(name: String): Struct[T] = js.native
    
    def word64Ule(name: String): Struct[T] = js.native
    
    def word8(name: String): Struct[T] = js.native
    
    def word8Sbe(name: String): Struct[T] = js.native
    
    def word8Sle(name: String): Struct[T] = js.native
  }
  
  type StructArrayType = array
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.struct.structStrings.word8
    - typingsJapgolly.struct.structStrings.word8Sle
    - typingsJapgolly.struct.structStrings.word8Sbe
    - typingsJapgolly.struct.structStrings.word16Sle
    - typingsJapgolly.struct.structStrings.word16Sbe
    - typingsJapgolly.struct.structStrings.word16Ule
    - typingsJapgolly.struct.structStrings.word16Ube
    - typingsJapgolly.struct.structStrings.word32Sle
    - typingsJapgolly.struct.structStrings.word32Sbe
    - typingsJapgolly.struct.structStrings.word32Ule
    - typingsJapgolly.struct.structStrings.word32Ube
    - typingsJapgolly.struct.structStrings.word64Sle
    - typingsJapgolly.struct.structStrings.word64Sbe
    - typingsJapgolly.struct.structStrings.word64Ule
    - typingsJapgolly.struct.structStrings.word64Ube
    - typingsJapgolly.struct.structStrings.floatle
    - typingsJapgolly.struct.structStrings.floatbe
    - typingsJapgolly.struct.structStrings.doublele
    - typingsJapgolly.struct.structStrings.doublebe
  */
  trait StructBaseTypes
    extends StObject
       with _StructTypes
  object StructBaseTypes {
    
    inline def doublebe: typingsJapgolly.struct.structStrings.doublebe = "doublebe".asInstanceOf[typingsJapgolly.struct.structStrings.doublebe]
    
    inline def doublele: typingsJapgolly.struct.structStrings.doublele = "doublele".asInstanceOf[typingsJapgolly.struct.structStrings.doublele]
    
    inline def floatbe: typingsJapgolly.struct.structStrings.floatbe = "floatbe".asInstanceOf[typingsJapgolly.struct.structStrings.floatbe]
    
    inline def floatle: typingsJapgolly.struct.structStrings.floatle = "floatle".asInstanceOf[typingsJapgolly.struct.structStrings.floatle]
    
    inline def word16Sbe: typingsJapgolly.struct.structStrings.word16Sbe = "word16Sbe".asInstanceOf[typingsJapgolly.struct.structStrings.word16Sbe]
    
    inline def word16Sle: typingsJapgolly.struct.structStrings.word16Sle = "word16Sle".asInstanceOf[typingsJapgolly.struct.structStrings.word16Sle]
    
    inline def word16Ube: typingsJapgolly.struct.structStrings.word16Ube = "word16Ube".asInstanceOf[typingsJapgolly.struct.structStrings.word16Ube]
    
    inline def word16Ule: typingsJapgolly.struct.structStrings.word16Ule = "word16Ule".asInstanceOf[typingsJapgolly.struct.structStrings.word16Ule]
    
    inline def word32Sbe: typingsJapgolly.struct.structStrings.word32Sbe = "word32Sbe".asInstanceOf[typingsJapgolly.struct.structStrings.word32Sbe]
    
    inline def word32Sle: typingsJapgolly.struct.structStrings.word32Sle = "word32Sle".asInstanceOf[typingsJapgolly.struct.structStrings.word32Sle]
    
    inline def word32Ube: typingsJapgolly.struct.structStrings.word32Ube = "word32Ube".asInstanceOf[typingsJapgolly.struct.structStrings.word32Ube]
    
    inline def word32Ule: typingsJapgolly.struct.structStrings.word32Ule = "word32Ule".asInstanceOf[typingsJapgolly.struct.structStrings.word32Ule]
    
    inline def word64Sbe: typingsJapgolly.struct.structStrings.word64Sbe = "word64Sbe".asInstanceOf[typingsJapgolly.struct.structStrings.word64Sbe]
    
    inline def word64Sle: typingsJapgolly.struct.structStrings.word64Sle = "word64Sle".asInstanceOf[typingsJapgolly.struct.structStrings.word64Sle]
    
    inline def word64Ube: typingsJapgolly.struct.structStrings.word64Ube = "word64Ube".asInstanceOf[typingsJapgolly.struct.structStrings.word64Ube]
    
    inline def word64Ule: typingsJapgolly.struct.structStrings.word64Ule = "word64Ule".asInstanceOf[typingsJapgolly.struct.structStrings.word64Ule]
    
    inline def word8: typingsJapgolly.struct.structStrings.word8 = "word8".asInstanceOf[typingsJapgolly.struct.structStrings.word8]
    
    inline def word8Sbe: typingsJapgolly.struct.structStrings.word8Sbe = "word8Sbe".asInstanceOf[typingsJapgolly.struct.structStrings.word8Sbe]
    
    inline def word8Sle: typingsJapgolly.struct.structStrings.word8Sle = "word8Sle".asInstanceOf[typingsJapgolly.struct.structStrings.word8Sle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.struct.structStrings.chars
    - typingsJapgolly.struct.structStrings.charsnt
  */
  trait StructCharsTypes
    extends StObject
       with _StructTypes
  object StructCharsTypes {
    
    inline def chars: typingsJapgolly.struct.structStrings.chars = "chars".asInstanceOf[typingsJapgolly.struct.structStrings.chars]
    
    inline def charsnt: typingsJapgolly.struct.structStrings.charsnt = "charsnt".asInstanceOf[typingsJapgolly.struct.structStrings.charsnt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.struct.mod.StructBaseTypes
    - typingsJapgolly.struct.mod.StructCharsTypes
    - typingsJapgolly.struct.mod.StructArrayType
  */
  type StructTypes = _StructTypes | StructArrayType
  
  trait _StructTypes extends StObject
}
