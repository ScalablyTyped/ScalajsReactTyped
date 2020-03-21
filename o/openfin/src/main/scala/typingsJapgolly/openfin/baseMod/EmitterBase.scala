package typingsJapgolly.openfin.baseMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.openfin.emitterMapMod.EmitterAccessor
import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.transportMod.default
import typingsJapgolly.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/base", "EmitterBase")
@js.native
class EmitterBase[EventTypes /* <: BaseEventMap */] protected () extends Base {
  def this(wire: default, emitterAccessor: EmitterAccessor) = this()
  var emitterAccessor: js.Any = js.native
  var getEmitter: js.Any = js.native
  var hasEmitter: js.Any = js.native
  var identity: Identity = js.native
  def addListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def addListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def addListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def addListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def addListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def addListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  /* protected */ def deregisterAllListeners(eventType: (Extract[String, String]) | String): js.Promise[Unit | EventEmitter] = js.native
  /* protected */ def deregisterAllListeners(eventType: js.Symbol): js.Promise[Unit | EventEmitter] = js.native
  /* protected */ def deregisterEventListener(eventType: (Extract[String, String]) | String): js.Promise[Unit | EventEmitter] = js.native
  /* protected */ def deregisterEventListener(eventType: (Extract[String, String]) | String, options: SubOptions): js.Promise[Unit | EventEmitter] = js.native
  /* protected */ def deregisterEventListener(eventType: js.Symbol): js.Promise[Unit | EventEmitter] = js.native
  /* protected */ def deregisterEventListener(eventType: js.Symbol, options: SubOptions): js.Promise[Unit | EventEmitter] = js.native
  def emit(
    eventName: String,
    payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ js.Any,
    args: js.Any*
  ): Boolean = js.native
  def emit(
    eventName: js.Symbol,
    payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ js.Any,
    args: js.Any*
  ): Boolean = js.native
  def emit[E /* <: String */](
    eventName: E,
    payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ js.Any,
    args: js.Any*
  ): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(`type`: String): js.Array[js.Function] = js.native
  def listeners(`type`: js.Symbol): js.Array[js.Function] = js.native
  def on(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def on(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def on(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def on(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def on[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def on[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def once(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def once(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def once(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def once(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def once[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def once[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependOnceListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependOnceListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependOnceListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependOnceListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def prependOnceListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def prependOnceListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  /* protected */ def registerEventListener(eventType: (Extract[String, String]) | String): js.Promise[EventEmitter] = js.native
  /* protected */ def registerEventListener(eventType: (Extract[String, String]) | String, options: SubOptions): js.Promise[EventEmitter] = js.native
  /* protected */ def registerEventListener(eventType: js.Symbol): js.Promise[EventEmitter] = js.native
  /* protected */ def registerEventListener(eventType: js.Symbol, options: SubOptions): js.Promise[EventEmitter] = js.native
  def removeAllListeners(): js.Promise[this.type] = js.native
  def removeAllListeners(eventType: (Extract[String, String]) | String): js.Promise[this.type] = js.native
  def removeAllListeners(eventType: js.Symbol): js.Promise[this.type] = js.native
  def removeListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def removeListener(
    eventType: String,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def removeListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def removeListener(
    eventType: js.Symbol,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
  def removeListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ]
  ): js.Promise[this.type] = js.native
  def removeListener[E /* <: String */](
    eventType: E,
    listener: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
      /* repeated */ js.Any, 
      Unit
    ],
    options: SubOptions
  ): js.Promise[this.type] = js.native
}

