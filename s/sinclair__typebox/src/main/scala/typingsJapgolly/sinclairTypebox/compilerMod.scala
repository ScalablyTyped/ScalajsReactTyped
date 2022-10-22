package typingsJapgolly.sinclairTypebox

import typingsJapgolly.sinclairTypebox.compilerCompilerMod.CheckFunction
import typingsJapgolly.sinclairTypebox.mod.TSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  object Property {
    
    @JSImport("@sinclair/typebox/compiler", "Property")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Check(propertyName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Check")(propertyName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@sinclair/typebox/compiler", "TypeCheck")
  @js.native
  open class TypeCheck[T /* <: TSchema */] protected ()
    extends typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCheck[T] {
    def this(schema: T, references: js.Array[TSchema], checkFunc: CheckFunction, code: String) = this()
  }
  
  object TypeCompiler {
    
    @JSImport("@sinclair/typebox/compiler", "TypeCompiler")
    @js.native
    val ^ : js.Any = js.native
    
    /** Compiles the given type for runtime type checking. This compiler only accepts known TypeBox types non-inclusive of unsafe types. */
    inline def Compile[T /* <: TSchema */](schema: T): typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCheck[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(schema.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCheck[T]]
    inline def Compile[T /* <: TSchema */](schema: T, references: js.Array[TSchema]): typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCheck[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCheck[T]]
  }
  
  @JSImport("@sinclair/typebox/compiler", "TypeCompilerUnknownTypeError")
  @js.native
  open class TypeCompilerUnknownTypeError protected ()
    extends typingsJapgolly.sinclairTypebox.compilerCompilerMod.TypeCompilerUnknownTypeError {
    def this(schema: TSchema) = this()
  }
  
  @JSImport("@sinclair/typebox/compiler", "ValueErrorType")
  @js.native
  object ValueErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType & Double] = js.native
    
    /* 0 */ val Array: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Array & Double = js.native
    
    /* 2 */ val ArrayMaxItems: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayMaxItems & Double = js.native
    
    /* 1 */ val ArrayMinItems: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayMinItems & Double = js.native
    
    /* 3 */ val ArrayUniqueItems: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayUniqueItems & Double = js.native
    
    /* 4 */ val Boolean: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Boolean & Double = js.native
    
    /* 5 */ val Function: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Function & Double = js.native
    
    /* 6 */ val Integer: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Integer & Double = js.native
    
    /* 9 */ val IntegerExclusiveMaximum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMaximum & Double = js.native
    
    /* 8 */ val IntegerExclusiveMinimum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMinimum & Double = js.native
    
    /* 11 */ val IntegerMaximum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMaximum & Double = js.native
    
    /* 10 */ val IntegerMinimum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMinimum & Double = js.native
    
    /* 7 */ val IntegerMultipleOf: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMultipleOf & Double = js.native
    
    /* 12 */ val Literal: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Literal & Double = js.native
    
    /* 13 */ val Never: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Never & Double = js.native
    
    /* 14 */ val Null: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Null & Double = js.native
    
    /* 15 */ val Number: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Number & Double = js.native
    
    /* 18 */ val NumberExclusiveMaximum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMaximum & Double = js.native
    
    /* 17 */ val NumberExclusiveMinimum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMinimum & Double = js.native
    
    /* 20 */ val NumberMaximum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMaximum & Double = js.native
    
    /* 19 */ val NumberMinumum: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMinumum & Double = js.native
    
    /* 16 */ val NumberMultipleOf: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMultipleOf & Double = js.native
    
    /* 21 */ val Object: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Object & Double = js.native
    
    /* 24 */ val ObjectAdditionalProperties: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectAdditionalProperties & Double = js.native
    
    /* 23 */ val ObjectMaxProperties: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMaxProperties & Double = js.native
    
    /* 22 */ val ObjectMinProperties: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMinProperties & Double = js.native
    
    /* 25 */ val Promise: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Promise & Double = js.native
    
    /* 26 */ val RecordKeyNumeric: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyNumeric & Double = js.native
    
    /* 27 */ val RecordKeyString: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyString & Double = js.native
    
    /* 28 */ val String: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.String & Double = js.native
    
    /* 33 */ val StringFormat: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormat & Double = js.native
    
    /* 32 */ val StringFormatUnknown: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormatUnknown & Double = js.native
    
    /* 30 */ val StringMaxLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMaxLength & Double = js.native
    
    /* 29 */ val StringMinLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMinLength & Double = js.native
    
    /* 31 */ val StringPattern: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringPattern & Double = js.native
    
    /* 35 */ val TupleLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleLength & Double = js.native
    
    /* 34 */ val TupleZeroLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleZeroLength & Double = js.native
    
    /* 38 */ val Uint8Array: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8Array & Double = js.native
    
    /* 40 */ val Uint8ArrayMaxByteLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMaxByteLength & Double = js.native
    
    /* 39 */ val Uint8ArrayMinByteLength: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMinByteLength & Double = js.native
    
    /* 36 */ val Undefined: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Undefined & Double = js.native
    
    /* 37 */ val Union: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Union & Double = js.native
    
    /* 41 */ val Void: typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueErrorType.Void & Double = js.native
  }
}
