package typingsJapgolly.cssFontLoadingModule.mod._Global_

import typingsJapgolly.cssFontLoadingModule.mod.FontFaceSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var fonts: FontFaceSet
}

object Document {
  @scala.inline
  def apply(fonts: FontFaceSet): Document = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Document]
  }
}

