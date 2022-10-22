package typingsJapgolly.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def OAuth2Server_=(x: Instantiable1[/* options */ ServerOptions, OAuth2Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OAuth2Server")(x.asInstanceOf[js.Any])

/**
  * Represents a generic callback structure for model callbacks
  */
type Callback[T] = js.Function2[/* err */ js.UndefOr[Any], /* result */ js.UndefOr[T], Unit]

/**
  * For returning falsey parameters in cases of failure
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oauth2Server.oauth2ServerStrings._empty
  - typingsJapgolly.oauth2Server.oauth2ServerInts.`0`
  - typingsJapgolly.oauth2Server.oauth2ServerBooleans.`false`
  - scala.Null
  - scala.Unit
*/
type Falsey = js.UndefOr[_Falsey | Null]

/**
  * An interface representing the user.
  * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
  */
type User = StringDictionary[Any]
