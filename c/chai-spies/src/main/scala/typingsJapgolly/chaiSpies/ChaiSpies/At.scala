package typingsJapgolly.chaiSpies.ChaiSpies

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chaiSpies.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait At extends js.Object {
  /**
    * ####.min(n) / .at.least(n)
    * Assert that a spy has been called minimum of ```n``` times.
    * ```ts
    * expect(spy).to.have.been.called.min(3);
    * expect(spy).to.not.have.been.called.at.least(3);
    * spy.should.have.been.called.at.least(3);
    * spy.should.not.have.been.called.min(3);
    * ```
    */
  def least(n: Double): Assertion
  /**
    * ####.max(n) / .at.most(n)
    * Assert that a spy has been called maximum of ```n``` times.
    * ```ts
    * expect(spy).to.have.been.called.max(3);
    * expect(spy).to.not.have.been.called.at.most(3);
    * spy.should.have.been.called.at.most(3);
    * spy.should.not.have.been.called.max(3);
    * ```
    */
  def most(n: Double): Assertion
}

object At {
  @scala.inline
  def apply(least: Double => CallbackTo[Assertion], most: Double => CallbackTo[Assertion]): At = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("least")(js.Any.fromFunction1((t0: scala.Double) => least(t0).runNow()))
    __obj.updateDynamic("most")(js.Any.fromFunction1((t0: scala.Double) => most(t0).runNow()))
    __obj.asInstanceOf[At]
  }
}

