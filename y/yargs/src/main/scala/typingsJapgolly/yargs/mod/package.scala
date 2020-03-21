package typingsJapgolly.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arguments[T] = T with typingsJapgolly.yargs.AnonDictargName
  type AsyncCompletionFunction = js.Function3[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    /* done */ js.Function1[/* completion */ js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  type BuilderCallback[T, R] = js.Function1[
    /* args */ typingsJapgolly.yargs.mod.Argv[T], 
    typingsJapgolly.yargs.mod.Argv[R] | js.Thenable[typingsJapgolly.yargs.mod.Argv[R]] | scala.Unit
  ]
  type Choices = js.Array[
    js.UndefOr[java.lang.String | scala.Double | typingsJapgolly.yargs.yargsBooleans.`true`]
  ]
  type CommandBuilder[T, U] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.yargs.mod.Options] | (js.Function1[
    /* args */ typingsJapgolly.yargs.mod.Argv[T], 
    typingsJapgolly.yargs.mod.Argv[U] | js.Thenable[typingsJapgolly.yargs.mod.Argv[U]]
  ])
  /** Remove undefined as a possible value for keys K in T */
  type Defined[T, K /* <: java.lang.String */] = (typingsJapgolly.yargs.mod.Omit[T, K]) with typingsJapgolly.yargs.yargsStrings.Defined with T
  type InferredOptionType[O /* <: typingsJapgolly.yargs.mod.Options | typingsJapgolly.yargs.mod.PositionalOptions */] = js.UndefOr[typingsJapgolly.yargs.mod.RequiredOptionType[O] | scala.Double]
  type InferredOptionTypes[O /* <: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.yargs.mod.Options] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof O ]: yargs.yargs.InferredOptionType<O[key]>}
    */ typingsJapgolly.yargs.yargsStrings.InferredOptionTypes with O
  type MiddlewareFunction[T] = js.Function1[/* args */ typingsJapgolly.yargs.mod.Arguments[T], scala.Unit]
  /** Remove keys K in T */
  type Omit[T, K] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof T, K> ]: T[key]}
    */ typingsJapgolly.yargs.yargsStrings.Omit with T
  type ParseCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* argv */ typingsJapgolly.yargs.mod.Arguments[T], 
    /* output */ java.lang.String, 
    scala.Unit
  ]
  type PromiseCompletionFunction = js.Function2[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    js.Promise[js.Array[java.lang.String]]
  ]
  type RequiredOptionType[O /* <: typingsJapgolly.yargs.mod.Options | typingsJapgolly.yargs.mod.PositionalOptions */] = js.Any | java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String])
  type SyncCompletionFunction = js.Function2[/* current */ java.lang.String, /* argv */ js.Any, js.Array[java.lang.String]]
  /** Convert T to T[] and T | undefined to T[] | undefined */
  type ToArray[T] = (js.Array[typingsJapgolly.std.Exclude[T, js.UndefOr[scala.Nothing]]]) | (typingsJapgolly.std.Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives number[] if T is an array type, otherwise number. Preserves | undefined. */
  type ToNumber[T] = scala.Double | js.Array[scala.Double] | (typingsJapgolly.std.Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives string[] if T is an array type, otherwise string. Preserves | undefined. */
  type ToString[T] = java.lang.String | js.Array[java.lang.String] | (typingsJapgolly.std.Extract[T, js.UndefOr[scala.Nothing]])
}
