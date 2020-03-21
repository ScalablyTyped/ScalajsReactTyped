package typingsJapgolly.nodeSass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncImporter = js.ThisFunction3[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ typingsJapgolly.nodeSass.mod.ImporterReturnType, scala.Unit], 
    scala.Unit
  ]
  type AsyncSassFn0 = js.ThisFunction1[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn1 = js.ThisFunction2[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn2 = js.ThisFunction3[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn3 = js.ThisFunction4[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn4 = js.ThisFunction5[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn5 = js.ThisFunction6[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn6 = js.ThisFunction7[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg6 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFunction = typingsJapgolly.nodeSass.mod.AsyncSassFn0 | typingsJapgolly.nodeSass.mod.AsyncSassFn1 | typingsJapgolly.nodeSass.mod.AsyncSassFn2 | typingsJapgolly.nodeSass.mod.AsyncSassFn3 | typingsJapgolly.nodeSass.mod.AsyncSassFn4 | typingsJapgolly.nodeSass.mod.AsyncSassFn5 | typingsJapgolly.nodeSass.mod.AsyncSassFn6 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn1 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn2 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn3 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn4 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn5 | typingsJapgolly.nodeSass.mod.AsyncSassVarArgFn6
  type AsyncSassVarArgFn1 = js.ThisFunction2[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn2 = js.ThisFunction3[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn3 = js.ThisFunction4[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn4 = js.ThisFunction5[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn5 = js.ThisFunction6[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn6 = js.ThisFunction7[
    /* this */ typingsJapgolly.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg6 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    /* cb */ typingsJapgolly.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type FunctionDeclarations[FunctionType /* <: typingsJapgolly.nodeSass.mod.SassFunction */] = typingsJapgolly.std.Record[java.lang.String, FunctionType]
  type Importer = typingsJapgolly.nodeSass.mod.AsyncImporter | typingsJapgolly.nodeSass.mod.SyncImporter
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeSass.AnonFile
    - typingsJapgolly.nodeSass.AnonContents
    - typingsJapgolly.std.Error
    - scala.Null
    - typingsJapgolly.nodeSass.mod.types.Null
    - typingsJapgolly.nodeSass.mod.types.Error
  */
  type ImporterReturnType = typingsJapgolly.nodeSass.mod._ImporterReturnType | js.Error | scala.Null
  type SassFunction = typingsJapgolly.nodeSass.mod.SyncSassFunction | typingsJapgolly.nodeSass.mod.AsyncSassFunction
  type SassFunctionCallback = js.Function1[/* $result */ typingsJapgolly.nodeSass.mod.types.ReturnValue, scala.Unit]
  type SassRenderCallback = js.Function2[
    /* err */ typingsJapgolly.nodeSass.mod.SassError, 
    /* result */ typingsJapgolly.nodeSass.mod.Result, 
    js.Any
  ]
  type SyncImporter = js.ThisFunction2[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    typingsJapgolly.nodeSass.mod.ImporterReturnType
  ]
  type SyncSassFn = js.ThisFunction1[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* repeated */ typingsJapgolly.nodeSass.mod.types.Value, 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassFunction = typingsJapgolly.nodeSass.mod.SyncSassFn | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn1 | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn2 | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn3 | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn4 | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn5 | typingsJapgolly.nodeSass.mod.SyncSassVarArgFn6
  type SyncSassVarArgFn1 = js.ThisFunction1[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn2 = js.ThisFunction2[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn3 = js.ThisFunction3[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn4 = js.ThisFunction4[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn5 = js.ThisFunction5[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn6 = js.ThisFunction6[
    /* this */ typingsJapgolly.nodeSass.mod.SyncContext, 
    /* $arg1 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg2 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg3 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg4 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg5 */ typingsJapgolly.nodeSass.mod.types.Value, 
    /* $arg6 */ js.Array[typingsJapgolly.nodeSass.mod.types.Value], 
    typingsJapgolly.nodeSass.mod.types.ReturnValue
  ]
}
