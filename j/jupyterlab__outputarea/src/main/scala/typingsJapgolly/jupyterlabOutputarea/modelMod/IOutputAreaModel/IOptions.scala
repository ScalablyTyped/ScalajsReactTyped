package typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a output area model.
  */
trait IOptions extends js.Object {
  /**
    * The output content factory used by the model.
    *
    * If not given, a default factory will be used.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * Whether the output is trusted.  The default is false.
    */
  var trusted: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial values for the model.
    */
  var values: js.UndefOr[js.Array[IOutput]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory = null,
    trusted: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[IOutput] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

