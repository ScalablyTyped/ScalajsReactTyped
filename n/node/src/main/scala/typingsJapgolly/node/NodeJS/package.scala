package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  type ArrayBufferView = typingsJapgolly.node.NodeJS.TypedArray | scala.scalajs.js.typedarray.DataView
  type BeforeExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type DisconnectListener = js.Function0[scala.Unit]
  type ExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type HRTime = js.Function1[
    /* time */ js.UndefOr[js.Tuple2[scala.Double, scala.Double]], 
    js.Tuple2[scala.Double, scala.Double]
  ]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, scala.Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ typingsJapgolly.node.NodeJS.MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type NodeRequireCache = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.node.NodeModule]
  type ProcessEnv = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], scala.Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type SignalsListener = js.Function1[/* signal */ typingsJapgolly.node.NodeJS.Signals, scala.Unit]
  type TypedArray = scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ js.Error, scala.Unit]
  type UnhandledRejectionListener = js.Function2[
    /* reason */ js.UndefOr[js.Object | scala.Null], 
    /* promise */ js.Promise[js.Any], 
    scala.Unit
  ]
  type WarningListener = js.Function1[/* warning */ js.Error, scala.Unit]
}
