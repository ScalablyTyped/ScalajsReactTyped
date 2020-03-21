package typingsJapgolly.ioTs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyC = typingsJapgolly.ioTs.mod.AnyType
  type AnyProps = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ioTs.mod.Any_]
  type Any_ = typingsJapgolly.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type ArrayC[C /* <: typingsJapgolly.ioTs.mod.Mixed_ */] = typingsJapgolly.ioTs.mod.ArrayType[
    C, 
    js.Array[typingsJapgolly.ioTs.mod.TypeOf[C]], 
    js.Array[typingsJapgolly.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type BigIntC = typingsJapgolly.ioTs.mod.BigIntType
  type BooleanC = typingsJapgolly.ioTs.mod.BooleanType
  type BrandC[C /* <: typingsJapgolly.ioTs.mod.Any_ */, B] = typingsJapgolly.ioTs.mod.RefinementType[
    C, 
    typingsJapgolly.ioTs.mod.Branded[typingsJapgolly.ioTs.mod.TypeOf[C], B], 
    typingsJapgolly.ioTs.mod.OutputOf[C], 
    typingsJapgolly.ioTs.mod.InputOf[C]
  ]
  type Branded[A, B] = A with typingsJapgolly.ioTs.mod.Brand_[B]
  type Compact[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typingsJapgolly.ioTs.ioTsStrings.Compact with A
  type Context = js.Array[typingsJapgolly.ioTs.mod.ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, typingsJapgolly.ioTs.mod.Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = js.Array[typingsJapgolly.ioTs.mod.ValidationError]
  type ExactC[C /* <: typingsJapgolly.ioTs.mod.HasProps */] = typingsJapgolly.ioTs.mod.ExactType[
    C, 
    typingsJapgolly.ioTs.mod.TypeOf[C], 
    typingsJapgolly.ioTs.mod.OutputOf[C], 
    typingsJapgolly.ioTs.mod.InputOf[C]
  ]
  type Exact_[T, X /* <: T */] = T with typingsJapgolly.ioTs.ioTsStrings.Exact with js.Any
  type FunctionC = typingsJapgolly.ioTs.mod.FunctionType
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ioTs.mod.HasPropsRefinement
    - typingsJapgolly.ioTs.mod.HasPropsReadonly
    - typingsJapgolly.ioTs.mod.HasPropsIntersection
    - typingsJapgolly.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]
    - typingsJapgolly.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]
    - typingsJapgolly.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any]
  */
  type HasProps = typingsJapgolly.ioTs.mod._HasProps | (typingsJapgolly.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (typingsJapgolly.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]) | (typingsJapgolly.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any])
  type InputOf[C /* <: typingsJapgolly.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_I'] */ js.Any
  type Int = typingsJapgolly.ioTs.mod.Branded[scala.Double, typingsJapgolly.ioTs.mod.IntBrand]
  type IntersectionC[CS /* <: Array[typingsJapgolly.ioTs.mod.Mixed_] */] = typingsJapgolly.ioTs.mod.IntersectionType[
    CS, 
    js.Any | (typingsJapgolly.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any | (typingsJapgolly.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any
  ]
  type Is[A] = js.Function1[/* u */ js.Any, /* is A */ scala.Boolean]
  type KeyofC[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = typingsJapgolly.ioTs.mod.KeyofType[D]
  type LiteralC[V /* <: typingsJapgolly.ioTs.mod.LiteralValue */] = typingsJapgolly.ioTs.mod.LiteralType[V]
  type LiteralValue = java.lang.String | scala.Double | scala.Boolean
  type Mixed_ = typingsJapgolly.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type NeverC = typingsJapgolly.ioTs.mod.NeverType
  type NullC = typingsJapgolly.ioTs.mod.NullType_
  type NumberC = typingsJapgolly.ioTs.mod.NumberType
  type ObjectC = typingsJapgolly.ioTs.mod.ObjectType
  type OutputOf[C /* <: typingsJapgolly.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_O'] */ js.Any
  type OutputOfDictionary[D /* <: typingsJapgolly.ioTs.mod.Any_ */, C /* <: typingsJapgolly.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typingsJapgolly.ioTs.ioTsStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: typingsJapgolly.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: typingsJapgolly.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.OutputOfProps with P
  type PartialC[P /* <: typingsJapgolly.ioTs.mod.Props */] = typingsJapgolly.ioTs.mod.PartialType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.PartialC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.PartialC with P, 
    js.Any
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ioTs.mod.Mixed_]
  type PropsOf[T /* <: typingsJapgolly.ioTs.AnonProps */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any
  type ReadonlyArrayC[C /* <: typingsJapgolly.ioTs.mod.Mixed_ */] = typingsJapgolly.ioTs.mod.ReadonlyArrayType[
    C, 
    js.Array[typingsJapgolly.ioTs.mod.TypeOf[C]], 
    js.Array[typingsJapgolly.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type ReadonlyC[C /* <: typingsJapgolly.ioTs.mod.Mixed_ */] = typingsJapgolly.ioTs.mod.ReadonlyType[
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.TypeOf<C> ]: io-ts.io-ts.TypeOf<C>[K]}
    */ typingsJapgolly.ioTs.ioTsStrings.ReadonlyC with typingsJapgolly.ioTs.mod.TypeOf[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.OutputOf<C> ]: io-ts.io-ts.OutputOf<C>[K]}
    */ typingsJapgolly.ioTs.ioTsStrings.ReadonlyC with typingsJapgolly.ioTs.mod.OutputOf[C], 
    js.Any
  ]
  type RecordC[D /* <: typingsJapgolly.ioTs.mod.Mixed_ */, C /* <: typingsJapgolly.ioTs.mod.Mixed_ */] = typingsJapgolly.ioTs.mod.DictionaryType[
    D, 
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typingsJapgolly.ioTs.ioTsStrings.RecordC with js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typingsJapgolly.ioTs.ioTsStrings.RecordC with js.Any, 
    js.Any
  ]
  type RefinementC[C /* <: typingsJapgolly.ioTs.mod.Any_ */] = typingsJapgolly.ioTs.mod.RefinementType[
    C, 
    typingsJapgolly.ioTs.mod.TypeOf[C], 
    typingsJapgolly.ioTs.mod.OutputOf[C], 
    typingsJapgolly.ioTs.mod.InputOf[C]
  ]
  type StrictC[P /* <: typingsJapgolly.ioTs.mod.Props */] = typingsJapgolly.ioTs.mod.StrictType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.StrictC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.StrictC with P, 
    js.Any
  ]
  type StringC = typingsJapgolly.ioTs.mod.StringType
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ioTs.mod.InterfaceType[typingsJapgolly.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typingsJapgolly.ioTs.mod.StrictType[typingsJapgolly.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typingsJapgolly.ioTs.mod.TaggedRefinement[Tag, A, O]
    - typingsJapgolly.ioTs.mod.TaggedUnion_[Tag, A, O]
    - typingsJapgolly.ioTs.mod.TaggedIntersection[Tag, A, O]
    - typingsJapgolly.ioTs.mod.TaggedExact[Tag, A, O]
    - typingsJapgolly.ioTs.mod.RecursiveType[js.Any, A, O, js.Any]
  */
  type Tagged[Tag /* <: java.lang.String */, A, O] = (typingsJapgolly.ioTs.mod._Tagged[Tag, A, O]) | (typingsJapgolly.ioTs.mod.InterfaceType[typingsJapgolly.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typingsJapgolly.ioTs.mod.StrictType[typingsJapgolly.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typingsJapgolly.ioTs.mod.RecursiveType[js.Any, A, O, js.Any])
  type TaggedIntersectionArgument[Tag /* <: java.lang.String */] = (js.Array[typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple3[
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple4[
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple5[
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsJapgolly.ioTs.mod.Mixed_ | (typingsJapgolly.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ])
  type TaggedProps[Tag /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Tag ]: io-ts.io-ts.LiteralType<any>}
    */ typingsJapgolly.ioTs.ioTsStrings.TaggedProps with js.Any
  type TaggedUnionC[Tag /* <: java.lang.String */, CS /* <: Array[typingsJapgolly.ioTs.mod.Mixed_] */] = typingsJapgolly.ioTs.mod.TaggedUnionType[
    Tag, 
    CS, 
    typingsJapgolly.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typingsJapgolly.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type TupleC[CS /* <: Array[typingsJapgolly.ioTs.mod.Mixed_] */] = typingsJapgolly.ioTs.mod.TupleType[
    CS, 
    js.Any | (js.Tuple5[
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typingsJapgolly.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any | (js.Tuple5[
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typingsJapgolly.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any
  ]
  type TypeC[P /* <: typingsJapgolly.ioTs.mod.Props */] = typingsJapgolly.ioTs.mod.InterfaceType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.TypeC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.TypeC with P, 
    js.Any
  ]
  type TypeOf[C /* <: typingsJapgolly.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any
  type TypeOfDictionary[D /* <: typingsJapgolly.ioTs.mod.Any_ */, C /* <: typingsJapgolly.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typingsJapgolly.ioTs.ioTsStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: typingsJapgolly.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: typingsJapgolly.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsJapgolly.ioTs.ioTsStrings.TypeOfProps with P
  type UndefinedC = typingsJapgolly.ioTs.mod.UndefinedType
  type UnionC[CS /* <: Array[typingsJapgolly.ioTs.mod.Mixed_] */] = typingsJapgolly.ioTs.mod.UnionType[
    CS, 
    typingsJapgolly.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typingsJapgolly.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type UnknownArrayC = typingsJapgolly.ioTs.mod.AnyArrayType
  type UnknownC = typingsJapgolly.ioTs.mod.UnknownType
  type UnknownRecordC = typingsJapgolly.ioTs.mod.AnyDictionaryType
  type Validate[I, A] = js.Function2[
    /* i */ I, 
    /* context */ typingsJapgolly.ioTs.mod.Context, 
    typingsJapgolly.ioTs.mod.Validation[A]
  ]
  type Validation[A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Either<Errors, A> */ js.Any
  type VoidC = typingsJapgolly.ioTs.mod.VoidType_
  type mixed = js.Any
}
