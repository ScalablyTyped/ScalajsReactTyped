package typingsJapgolly.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object smtpConnectionMod {
  type CustomAuthenticationHandlers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* ctx */ typingsJapgolly.nodemailer.smtpConnectionMod.CustomAuthenticationContext, 
      js.Promise[scala.Boolean] | js.Any
    ]
  ]
  type OAuth2 = typingsJapgolly.nodemailer.xoauth2Mod.Options
  type ms = scala.Double
}
