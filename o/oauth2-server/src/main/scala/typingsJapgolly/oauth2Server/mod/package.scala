package typingsJapgolly.oauth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  /**
    * For returning falsey parameters in cases of failure
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.oauth2Server.oauth2ServerStrings._empty
    - typingsJapgolly.oauth2Server.oauth2ServerNumbers.`0`
    - typingsJapgolly.oauth2Server.oauth2ServerBooleans.`false`
    - scala.Null
    - `js.undefined`
  */
  type Falsey = js.UndefOr[typingsJapgolly.oauth2Server.mod._Falsey | scala.Null]
  /**
    * An interface representing the user.
    * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
    */
  type User = org.scalablytyped.runtime.StringDictionary[js.Any]
}
