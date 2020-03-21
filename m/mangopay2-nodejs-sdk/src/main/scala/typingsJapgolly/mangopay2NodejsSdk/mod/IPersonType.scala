package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonType extends js.Object {
  var Legal: LEGAL
  var Natural: NATURAL
  var NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
}

object IPersonType {
  @scala.inline
  def apply(Legal: LEGAL, Natural: NATURAL, NotSpecified: NotSpecified): IPersonType = {
    val __obj = js.Dynamic.literal(Legal = Legal.asInstanceOf[js.Any], Natural = Natural.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPersonType]
  }
}

