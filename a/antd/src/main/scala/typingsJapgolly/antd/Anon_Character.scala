package typingsJapgolly.antd

import typingsJapgolly.propDashTypes.propDashTypesMod.ReactNodeLike
import typingsJapgolly.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Character extends js.Object {
  var character: Requireable[ReactNodeLike]
  var prefixCls: Requireable[String]
}

object Anon_Character {
  @scala.inline
  def apply(character: Requireable[ReactNodeLike], prefixCls: Requireable[String]): Anon_Character = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Character]
  }
}

