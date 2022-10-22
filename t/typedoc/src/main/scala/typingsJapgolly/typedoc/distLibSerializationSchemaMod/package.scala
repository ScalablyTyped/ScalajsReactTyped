package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BoolKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends boolean? K : never}[keyof T] */ js.Any

type Primitive = js.UndefOr[String | Double | Null | Boolean]

type ProjectReflection = ContainerReflection

type ReflectionFlags = Partial[
S[
  typingsJapgolly.typedoc.distLibModelsMod.ReflectionFlags, 
  BoolKeys[typingsJapgolly.typedoc.distLibModelsMod.ReflectionFlags]
]]

type SomeType = ModelToObject[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
