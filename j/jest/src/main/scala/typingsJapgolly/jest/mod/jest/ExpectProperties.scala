package typingsJapgolly.jest.mod.jest

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof jest.jest.jest.Expect ]: jest.jest.jest.Expect[K]} */
trait ExpectProperties extends js.Object {
  var addSnapshotSerializer: js.Function1[/* serializer */ SnapshotSerializerPlugin, Unit]
  var any: js.Function1[/* classType */ js.Any, _]
  var anything: js.Function0[_]
  var arrayContaining: js.Function1[/* arr */ js.Array[_], _]
  var assertions: js.Function1[/* num */ Double, Unit]
  var extend: js.Function1[/* obj */ ExpectExtendMap, Unit]
  var getState: js.Function0[MatcherState with (Record[String, _])]
  var hasAssertions: js.Function0[Unit]
  var not: InverseAsymmetricMatchers
  var objectContaining: js.Function1[/* obj */ js.Object, _]
  var setState: js.Function1[/* state */ js.Object, Unit]
  var stringContaining: js.Function1[/* str */ String, _]
  var stringMatching: js.Function1[/* str */ String | js.RegExp, _]
}

object ExpectProperties {
  @scala.inline
  def apply(
    addSnapshotSerializer: /* serializer */ SnapshotSerializerPlugin => Callback,
    any: /* classType */ js.Any => CallbackTo[js.Any],
    anything: CallbackTo[js.Any],
    arrayContaining: /* arr */ js.Array[js.Any] => CallbackTo[js.Any],
    assertions: /* num */ Double => Callback,
    extend: /* obj */ ExpectExtendMap => Callback,
    getState: CallbackTo[MatcherState with (Record[String, js.Any])],
    hasAssertions: Callback,
    not: InverseAsymmetricMatchers,
    objectContaining: /* obj */ js.Object => CallbackTo[js.Any],
    setState: /* state */ js.Object => Callback,
    stringContaining: /* str */ String => CallbackTo[js.Any],
    stringMatching: /* str */ String | js.RegExp => CallbackTo[js.Any]
  ): ExpectProperties = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.updateDynamic("addSnapshotSerializer")(js.Any.fromFunction1((t0: /* serializer */ typingsJapgolly.jest.mod.jest.SnapshotSerializerPlugin) => addSnapshotSerializer(t0).runNow()))
    __obj.updateDynamic("any")(js.Any.fromFunction1((t0: /* classType */ js.Any) => any(t0).runNow()))
    __obj.updateDynamic("anything")(anything.toJsFn)
    __obj.updateDynamic("arrayContaining")(js.Any.fromFunction1((t0: /* arr */ js.Array[js.Any]) => arrayContaining(t0).runNow()))
    __obj.updateDynamic("assertions")(js.Any.fromFunction1((t0: /* num */ scala.Double) => assertions(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.jest.mod.jest.ExpectExtendMap) => extend(t0).runNow()))
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("hasAssertions")(hasAssertions.toJsFn)
    __obj.updateDynamic("objectContaining")(js.Any.fromFunction1((t0: /* obj */ js.Object) => objectContaining(t0).runNow()))
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: /* state */ js.Object) => setState(t0).runNow()))
    __obj.updateDynamic("stringContaining")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => stringContaining(t0).runNow()))
    __obj.updateDynamic("stringMatching")(js.Any.fromFunction1((t0: /* str */ java.lang.String | js.RegExp) => stringMatching(t0).runNow()))
    __obj.asInstanceOf[ExpectProperties]
  }
}

