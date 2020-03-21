package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object miniprogramWxs {
  type ClassDecorator = js.Function1[
    /* target */ typingsJapgolly.miniprogramWxs.Function, 
    typingsJapgolly.miniprogramWxs.Function | scala.Unit
  ]
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type MethodDecorator = js.Function3[
    /* target */ typingsJapgolly.miniprogramWxs.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsJapgolly.miniprogramWxs.TypedPropertyDescriptor[js.Any], 
    typingsJapgolly.miniprogramWxs.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.miniprogramWxs.Pick[T, typingsJapgolly.miniprogramWxs.Exclude[java.lang.String, K]]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type ParameterDecorator = js.Function3[
    /* target */ typingsJapgolly.miniprogramWxs.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsJapgolly.miniprogramWxs.miniprogramWxsStrings.Partial with T
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typingsJapgolly.miniprogramWxs.miniprogramWxsStrings.Pick with T
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[js.Object | typingsJapgolly.miniprogramWxs.PromiseLike[js.Object]], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    typingsJapgolly.miniprogramWxs.PromiseLike[js.Object]
  ]
  type PropertyDecorator = js.Function2[
    /* target */ typingsJapgolly.miniprogramWxs.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    scala.Unit
  ]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.miniprogramWxs.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsJapgolly.miniprogramWxs.miniprogramWxsStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T}
    */ typingsJapgolly.miniprogramWxs.miniprogramWxsStrings.Record with js.Any
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typingsJapgolly.miniprogramWxs.miniprogramWxsStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  // declare var Function: FunctionConstructor;
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
}
