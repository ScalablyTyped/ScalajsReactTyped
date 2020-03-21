package typingsJapgolly.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComputedPropertyCallback[T] = typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterFunction[T] | typingsJapgolly.emberObject.typesMod.ComputedPropertyObj[T]
  type ComputedPropertyGetter[T] = typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterFunction[T] | typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterObj[T]
  type ComputedPropertyGetterFunction[T] = js.ThisFunction1[/* this */ js.Any, /* key */ java.lang.String, T]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterObj[T]
    - typingsJapgolly.emberObject.typesMod.ComputedPropertySetterObj[T]
    - typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterObj[T] with typingsJapgolly.emberObject.typesMod.ComputedPropertySetterObj[T]
  */
  type ComputedPropertyObj[T] = typingsJapgolly.emberObject.typesMod._ComputedPropertyObj[T] | (typingsJapgolly.emberObject.typesMod.ComputedPropertyGetterObj[T] with typingsJapgolly.emberObject.typesMod.ComputedPropertySetterObj[T])
  type ComputedPropertySetter[T] = typingsJapgolly.emberObject.typesMod.ComputedPropertySetterFunction[T] | typingsJapgolly.emberObject.typesMod.ComputedPropertySetterObj[T]
  type ComputedPropertySetterFunction[T] = js.ThisFunction3[/* this */ js.Any, /* key */ java.lang.String, /* newVal */ T, /* oldVal */ T, T]
  type EmberClassArguments = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EmberClassConstructor[T] = (org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* properties */ js.Object], T]) with (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T])
  type EmberInstanceArguments[T] = typingsJapgolly.std.Partial[T] with org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractPropertyNamesOfType[T, S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends S? K : never}[keyof T] */ js.Any
  type Fix[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsJapgolly.emberObject.emberObjectStrings.Fix with T
  type MixinOrLiteral[T, Base] = (typingsJapgolly.emberObject.mixinMod.default[T, Base]) | T
  type Objectify[T] = T
  type ObserverMethod[Target, Sender] = java.lang.String | (js.ThisFunction4[
    /* this */ Target, 
    /* sender */ Sender, 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* rev */ scala.Double, 
    scala.Unit
  ])
  type UnwrapComputedPropertyGetter[T] = T
  type UnwrapComputedPropertyGetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertyGetter<T[P]>}
    */ typingsJapgolly.emberObject.emberObjectStrings.UnwrapComputedPropertyGetters with T
  type UnwrapComputedPropertySetter[T] = T
  type UnwrapComputedPropertySetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertySetter<T[P]>}
    */ typingsJapgolly.emberObject.emberObjectStrings.UnwrapComputedPropertySetters with T
}
