package typingsJapgolly.sinclairTypebox

import typingsJapgolly.sinclairTypebox.errorsErrorsMod.ValueError
import typingsJapgolly.sinclairTypebox.mod.Static
import typingsJapgolly.sinclairTypebox.mod.TSchema
import typingsJapgolly.sinclairTypebox.valueDeltaMod.Edit
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueValueMod {
  
  object Value {
    
    @JSImport("@sinclair/typebox/value/value", "Value")
    @js.native
    val ^ : js.Any = js.native
    
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number and boolean values if a reasonable conversion is possible. */
    inline def Cast[T /* <: TSchema */](schema: T, value: Any): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number and boolean values if a reasonable conversion is possible. */
    inline def Cast[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Returns true if the value matches the given type. */
    inline def Check[T /* <: TSchema */](schema: T, value: Any): /* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean]
    /** Returns true if the value matches the given type. */
    inline def Check[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): /* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean]
    
    /** Returns a structural clone of the given value */
    inline def Clone[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */](schema: T): Static[T, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any]).asInstanceOf[Static[T, js.Array[Any]]]
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R]
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Returns edits to transform the current value into the next value */
    inline def Diff[T](current: T, next: T): js.Array[Edit[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Diff")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Array[Edit[T]]]
    
    /** Returns true if left and right values are structurally equal */
    inline def Equal[T](left: T, right: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
    
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */](schema: T, value: Any): IterableIterator[ValueError] = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[ValueError]]
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): IterableIterator[ValueError] = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[ValueError]]
    
    /** Returns a new value with edits applied to the given value */
    inline def Patch[T](current: T, edits: js.Array[Edit[T]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(current.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
