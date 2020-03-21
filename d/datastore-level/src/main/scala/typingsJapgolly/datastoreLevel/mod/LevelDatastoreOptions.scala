package typingsJapgolly.datastoreLevel.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastoreOptions
  extends /* key */ StringDictionary[js.Any] {
  var db: js.UndefOr[
    js.Function2[
      /* location */ String, 
      /* options */ js.UndefOr[js.Any], 
      LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
    ]
  ] = js.undefined
}

object LevelDatastoreOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    db: (/* location */ String, /* options */ js.UndefOr[js.Any]) => CallbackTo[LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]] = null
  ): LevelDatastoreOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (db != null) __obj.updateDynamic("db")(js.Any.fromFunction2((t0: /* location */ java.lang.String, t1: /* options */ js.UndefOr[js.Any]) => db(t0, t1).runNow()))
    __obj.asInstanceOf[LevelDatastoreOptions]
  }
}

