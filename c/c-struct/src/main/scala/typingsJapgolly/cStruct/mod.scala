package typingsJapgolly.cStruct

import typingsJapgolly.cStruct.cStructStrings.b
import typingsJapgolly.cStruct.cStructStrings.l
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("c-struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("c-struct", "Schema")
  @js.native
  open class Schema protected () extends StObject {
    def this(schemaDefinition: SchemaDefinition[Any]) = this()
  }
  
  inline def packSync(name: String, `object`: js.Object): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("packSync")(name.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def packSync(name: String, `object`: js.Object, options: PackOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("packSync")(name.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def register(name: String, schema: Schema): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  @JSImport("c-struct", "type")
  @js.native
  val `type`: DataTypes = js.native
  
  inline def unpackSync(name: String, buffer: Buffer): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackSync")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def unpackSync(name: String, buffer: Buffer, options: UnpackOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackSync")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @js.native
  trait DataTypes extends StObject {
    
    var be: b = js.native
    
    var boolean: typingsJapgolly.cStruct.cStructStrings.boolean = js.native
    
    var double: typingsJapgolly.cStruct.cStructStrings.double = js.native
    
    var float: typingsJapgolly.cStruct.cStructStrings.float = js.native
    
    var int16: typingsJapgolly.cStruct.cStructStrings.int16 = js.native
    
    var int24: typingsJapgolly.cStruct.cStructStrings.int24 = js.native
    
    var int32: typingsJapgolly.cStruct.cStructStrings.int32 = js.native
    
    var int40: typingsJapgolly.cStruct.cStructStrings.int40 = js.native
    
    var int48: typingsJapgolly.cStruct.cStructStrings.int48 = js.native
    
    var int8: typingsJapgolly.cStruct.cStructStrings.int8 = js.native
    
    var le: l = js.native
    
    var nibble: typingsJapgolly.cStruct.cStructStrings.nibble = js.native
    
    def string(): String = js.native
    def string(size: Double): String = js.native
    
    def u16(size: Double): String = js.native
    
    def u24(size: Double): String = js.native
    
    def u32(size: Double): String = js.native
    
    def u40(size: Double): String = js.native
    
    def u48(size: Double): String = js.native
    
    def u8(size: Double): String = js.native
    
    var uint16: typingsJapgolly.cStruct.cStructStrings.uint16 = js.native
    
    var uint24: typingsJapgolly.cStruct.cStructStrings.uint24 = js.native
    
    var uint32: typingsJapgolly.cStruct.cStructStrings.uint32 = js.native
    
    var uint40: typingsJapgolly.cStruct.cStructStrings.uint40 = js.native
    
    var uint48: typingsJapgolly.cStruct.cStructStrings.uint48 = js.native
    
    var uint8: typingsJapgolly.cStruct.cStructStrings.uint8 = js.native
  }
  
  trait PackOptions extends StObject {
    
    var endian: l | b
  }
  object PackOptions {
    
    inline def apply(endian: l | b): PackOptions = {
      val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackOptions]
    }
    
    extension [Self <: PackOptions](x: Self) {
      
      inline def setEndian(value: l | b): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ _ in keyof TObject ]: string}
    }}}
    */
  @js.native
  trait SchemaDefinition[TObject] extends StObject
  
  trait UnpackOptions extends StObject {
    
    var endian: l | b
  }
  object UnpackOptions {
    
    inline def apply(endian: l | b): UnpackOptions = {
      val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnpackOptions]
    }
    
    extension [Self <: UnpackOptions](x: Self) {
      
      inline def setEndian(value: l | b): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
    }
  }
}
