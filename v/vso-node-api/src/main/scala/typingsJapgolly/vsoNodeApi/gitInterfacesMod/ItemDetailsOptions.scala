package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDetailsOptions extends js.Object {
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder items
    */
  var recursionLevel: VersionControlRecursionType
}

object ItemDetailsOptions {
  @scala.inline
  def apply(includeContentMetadata: Boolean, recursionLevel: VersionControlRecursionType): ItemDetailsOptions = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemDetailsOptions]
  }
}

