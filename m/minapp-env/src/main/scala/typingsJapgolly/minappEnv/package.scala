package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minappEnv {
  type AnyArray = typingsJapgolly.minappEnv.Array[js.Any]
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ArrayBufferLike = typingsJapgolly.minappEnv.ArrayBuffer
  type ClassDecorator = js.Function1[
    /* target */ typingsJapgolly.minappEnv.Function, 
    typingsJapgolly.minappEnv.Function | scala.Unit
  ]
  type Exclude[T, U] = T
  type IAPIFunction[T, P /* <: typingsJapgolly.minappEnv.IAPIParam[T] */] = js.Function1[/* param */ P, typingsJapgolly.minappEnv.Promise[T] | js.Any]
  type IAnyObject = typingsJapgolly.minappEnv.Record[java.lang.String, js.Any]
  type ICloudServices = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.minappEnv.ICloudService]
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.KVInfer with T
  type MethodDecorator = js.Function3[
    /* target */ typingsJapgolly.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsJapgolly.minappEnv.TypedPropertyDescriptor[js.Any], 
    typingsJapgolly.minappEnv.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  type OQ[T /* <: typingsJapgolly.minappEnv.OptionalRecordcompletesuc */] = (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[T, typingsJapgolly.minappEnv.minappEnvStrings.success]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[T, typingsJapgolly.minappEnv.minappEnvStrings.fail]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[T, typingsJapgolly.minappEnv.minappEnvStrings.complete]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[
      T, 
      typingsJapgolly.minappEnv.minappEnvStrings.success | typingsJapgolly.minappEnv.minappEnvStrings.fail
    ]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[
      T, 
      typingsJapgolly.minappEnv.minappEnvStrings.success | typingsJapgolly.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[
      T, 
      typingsJapgolly.minappEnv.minappEnvStrings.fail | typingsJapgolly.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typingsJapgolly.minappEnv.RQ[T] with (typingsJapgolly.minappEnv.Required[
    typingsJapgolly.minappEnv.Pick[
      T, 
      typingsJapgolly.minappEnv.minappEnvStrings.fail | typingsJapgolly.minappEnv.minappEnvStrings.complete | typingsJapgolly.minappEnv.minappEnvStrings.success
    ]
  ]))
  type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Optional with T
  type ParameterDecorator = js.Function3[
    /* target */ typingsJapgolly.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Partial with T
  type PartialOptional[T, K /* <: java.lang.String */] = (typingsJapgolly.minappEnv.Partial[typingsJapgolly.minappEnv.Pick[T, K]]) with (typingsJapgolly.minappEnv.Pick[T, typingsJapgolly.minappEnv.Exclude[java.lang.String, K]])
  /**
    * From T pick a set of properties K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Pick with T
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[js.Object | typingsJapgolly.minappEnv.PromiseLike[js.Object]], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    typingsJapgolly.minappEnv.PromiseLike[js.Object]
  ]
  type PropertyDecorator = js.Function2[
    /* target */ typingsJapgolly.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    scala.Unit
  ]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.minappEnv.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type RQ[T /* <: typingsJapgolly.minappEnv.OptionalRecordcompletesuc */] = typingsJapgolly.minappEnv.Pick[
    T, 
    typingsJapgolly.minappEnv.Exclude[
      java.lang.String, 
      typingsJapgolly.minappEnv.minappEnvStrings.complete | typingsJapgolly.minappEnv.minappEnvStrings.success | typingsJapgolly.minappEnv.minappEnvStrings.fail
    ]
  ]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Record with js.Any
  /**
    * Utils
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typingsJapgolly.minappEnv.minappEnvStrings.Required with T
  type Void[T] = js.UndefOr[T | scala.Null]
}
