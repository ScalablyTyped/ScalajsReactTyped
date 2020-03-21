package typingsJapgolly.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // 所有JS接口列表
  type jsApiList = js.Array[typingsJapgolly.jweixin.mod.ApiMethod]
  type menuList = js.Array[
    typingsJapgolly.jweixin.mod.menuBase | typingsJapgolly.jweixin.mod.menuProtected | typingsJapgolly.jweixin.mod.menuShare
  ]
}
