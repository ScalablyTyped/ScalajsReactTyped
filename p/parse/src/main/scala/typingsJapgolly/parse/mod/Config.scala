package typingsJapgolly.parse.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Config")
@js.native
class Config ()
  extends typingsJapgolly.parse.mod._Global_.Parse.Config

/* static members */
@JSImport("parse", "Config")
@js.native
object Config extends js.Object {
  def current(): typingsJapgolly.parse.mod._Global_.Parse.Config = js.native
  def get(): js.Promise[typingsJapgolly.parse.mod._Global_.Parse.Config] = js.native
  def get(options: UseMasterKeyOption): js.Promise[typingsJapgolly.parse.mod._Global_.Parse.Config] = js.native
  def save(attr: js.Any): js.Promise[typingsJapgolly.parse.mod._Global_.Parse.Config] = js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typingsJapgolly.parse.mod._Global_.Parse.Config] = js.native
}

