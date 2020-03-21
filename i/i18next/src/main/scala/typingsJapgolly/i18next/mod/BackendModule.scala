package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to load data for i18next.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'backend'` For a prototype constructor set static property.
  */
trait BackendModule[TOptions] extends Module {
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ ReadCallback, 
      Unit
    ]
  ] = js.undefined
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.undefined
  @JSName("type")
  var type_BackendModule: backend
  /** Save the missing translation */
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit
  def read(language: String, namespace: String, callback: ReadCallback): Unit
}

object BackendModule {
  @scala.inline
  def apply[TOptions](
    create: (js.Array[String], String, String, String) => japgolly.scalajs.react.Callback,
    init: (Services, TOptions, InitOptions) => japgolly.scalajs.react.Callback,
    read: (String, String, ReadCallback) => japgolly.scalajs.react.Callback,
    `type`: backend,
    readMulti: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ ReadCallback) => japgolly.scalajs.react.Callback = null,
    save: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => japgolly.scalajs.react.Callback = null
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction4((t0: js.Array[java.lang.String], t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => create(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction3((t0: typingsJapgolly.i18next.mod.Services, t1: TOptions, t2: typingsJapgolly.i18next.mod.InitOptions) => init(t0, t1, t2).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.i18next.mod.ReadCallback) => read(t0, t1, t2).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (readMulti != null) __obj.updateDynamic("readMulti")(js.Any.fromFunction3((t0: /* languages */ js.Array[java.lang.String], t1: /* namespaces */ js.Array[java.lang.String], t2: /* callback */ typingsJapgolly.i18next.mod.ReadCallback) => readMulti(t0, t1, t2).runNow()))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction3((t0: /* language */ java.lang.String, t1: /* namespace */ java.lang.String, t2: /* data */ typingsJapgolly.i18next.mod.ResourceLanguage) => save(t0, t1, t2).runNow()))
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
}

