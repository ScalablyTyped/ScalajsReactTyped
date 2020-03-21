package typingsJapgolly.pulumiAws

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pulumiAws.lambdaMixinsMod.Context
import typingsJapgolly.pulumiAws.serverlessFunctionMod.Handler
import typingsJapgolly.pulumiAws.serverlessFunctionMod.HandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludePackages extends js.Object {
  /**
    * The packages relative to the program folder to not include the Lambda upload. This can be
    * used to override the default serialization logic that includes all packages referenced by
    * project.json (except @pulumi packages).  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var excludePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated use [callbackFactory] instead.
    */
  var factoryFunc: js.UndefOr[HandlerFactory] = js.native
  /**
    * @deprecated use [callback] instead.
    */
  var func: js.UndefOr[Handler] = js.native
  /**
    * The packages relative to the program folder to include in the Lambda upload.  The version of
    * the package installed in the program folder and it's dependencies will all be included.
    * Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.native
}

object AnonExcludePackages {
  @scala.inline
  def apply(
    excludePackages: js.Array[String] = null,
    factoryFunc: js.UndefOr[CallbackTo[Handler]] = js.undefined,
    func: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => CallbackTo[js.Promise[js.Any] | Unit] = null,
    includePackages: js.Array[String] = null,
    includePaths: js.Array[String] = null
  ): AnonExcludePackages = {
    val __obj = js.Dynamic.literal()
    if (excludePackages != null) __obj.updateDynamic("excludePackages")(excludePackages.asInstanceOf[js.Any])
    factoryFunc.foreach(p => __obj.updateDynamic("factoryFunc")(p.toJsFn))
    if (func != null) __obj.updateDynamic("func")(js.Any.fromFunction3((t0: js.Any, t1: /* context */ typingsJapgolly.pulumiAws.lambdaMixinsMod.Context, t2: /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]) => func(t0, t1, t2).runNow()))
    if (includePackages != null) __obj.updateDynamic("includePackages")(includePackages.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludePackages]
  }
}

