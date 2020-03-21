package typingsJapgolly.behavior3.b3

import typingsJapgolly.behavior3.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action is the base class for all action nodes. Thus, if you want to create
  * new custom action nodes, you need to inherit from this class. For example,
  * take a look at the Runner action:
  *
  *     class Runner extends b3.Action {
  *       constructor(){
  *         super({name: 'Runner'});
  *       }
  *       tick(tick) {
  *         return b3.RUNNING;
  *       }
  *     };
  *
  */
@JSGlobal("b3.Action")
@js.native
/**
  * Creates an instance of Action.
  */
class Action () extends BaseNode {
  def this(hasNameTitleProperties: AnonName) = this()
}

