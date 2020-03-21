package typingsJapgolly.zetapushJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncMacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[typingsJapgolly.zetapushJs.mod.PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    js.Promise[js.Any]
  ]
  type AuthenticationCallback = js.Function0[typingsJapgolly.zetapushJs.mod.AbstractHandshake]
  type ConnectionStatusHandler = scala.Double
  type MacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[typingsJapgolly.zetapushJs.mod.PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type PublishParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ServicePublisher = js.Function2[/* method */ java.lang.String, /* parameters */ js.Any, scala.Unit]
}
