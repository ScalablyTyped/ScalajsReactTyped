package typingsJapgolly.apostrophe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules as first argument
// second argument is additional custom options e.g. restApi exposed by apostrophe-headless
trait AposConstructor[M, O] extends js.Object {
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typingsJapgolly.apostrophe.apostropheStrings.AposConstructor with js.Any
  var prefix: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var rootDir: js.UndefOr[String] = js.undefined
  var shortName: String
}

object AposConstructor {
  @scala.inline
  def apply[M, O](
    modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typingsJapgolly.apostrophe.apostropheStrings.AposConstructor with js.Any,
    shortName: String,
    afterInit: js.UndefOr[Callback] = js.undefined,
    afterListen: js.UndefOr[Callback] = js.undefined,
    baseUrl: String = null,
    initFailed: /* error */ js.Any => Callback = null,
    prefix: String = null,
    root: String = null,
    rootDir: String = null
  ): AposConstructor[M, O] = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    afterInit.foreach(p => __obj.updateDynamic("afterInit")(p.toJsFn))
    afterListen.foreach(p => __obj.updateDynamic("afterListen")(p.toJsFn))
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (initFailed != null) __obj.updateDynamic("initFailed")(js.Any.fromFunction1((t0: /* error */ js.Any) => initFailed(t0).runNow()))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposConstructor[M, O]]
  }
}

