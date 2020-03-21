package typingsJapgolly.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footer.
  */
@js.native
trait SchemaFooter extends js.Object {
  /**
    * The contents of the footer.  The indexes for a footer&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the footer.
    */
  var footerId: js.UndefOr[String] = js.native
}

object SchemaFooter {
  @scala.inline
  def apply(content: js.Array[SchemaStructuralElement] = null, footerId: String = null): SchemaFooter = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footerId != null) __obj.updateDynamic("footerId")(footerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFooter]
  }
}

